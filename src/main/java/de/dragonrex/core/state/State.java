package de.dragonrex.core.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class State <T> {
    private T value;
    private List<Consumer<T>> listeners = new ArrayList<>();

    public State(T init) {
        this.value = init;
    }

    public static <T> State<T> of(T init) {
        return new State<>(init);
    }

    public T get() {
        return this.value;
    }

    public void set(T newValue) {
        if(Objects.equals(this.value, newValue)) return;
        this.value = newValue;
        notifyListeners();
    }

    public void onChange(Consumer<T> listener) {
        listeners.add(listener);
        listener.accept(value);
    }

    private void notifyListeners() {
        for (Consumer<T> l : listeners) {
            l.accept(value);
        }
    }

    public <R> State<R> map(Function<T, R> mapper) {
        State<R> mapped = State.of(mapper.apply(value));
        onChange(v -> mapped.set(mapper.apply(v)));
        return mapped;
    }
}
