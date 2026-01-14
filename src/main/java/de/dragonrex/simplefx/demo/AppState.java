package de.dragonrex.simplefx.demo;

import de.dragonrex.simplefx.core.state.State;

public final class ViewRouter {

    public enum View {
        HOME,
        COUNTER,
        FORM
    }

    public static final State<View> current = State.of(View.HOME);

    private ViewRouter() {}
}

