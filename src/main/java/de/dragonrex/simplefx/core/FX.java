package de.dragonrex.simplefx.layout;

import de.dragonrex.simplefx.core.node.FXNode;
import javafx.scene.Node;

public abstract class FX<T extends Node> implements FXNode {

    protected final T node;

    protected FX(T node) {
        this.node = node;
        node.getStyleClass().add("fx");
    }

    @Override
    public T node() {
        return node;
    }

    public T get() {
        return node;
    }

    public FX<T> css(String... classes) {
        node.getStyleClass().addAll(classes);
        return this;
    }
}

