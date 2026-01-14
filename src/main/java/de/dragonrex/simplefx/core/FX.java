package de.dragonrex.simplefx.core;

import de.dragonrex.simplefx.core.layout.Align;
import de.dragonrex.simplefx.core.node.FXNode;
import de.dragonrex.simplefx.core.state.State;
import javafx.scene.Node;
import javafx.scene.layout.Priority;

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

    public FX<T> alignSelf(Align align) {

        if (node.getParent() instanceof javafx.scene.layout.StackPane sp) {
            javafx.scene.layout.StackPane.setAlignment(node, align.pos);
        }

        if (node.getParent() instanceof javafx.scene.layout.VBox) {
            javafx.scene.layout.VBox.setVgrow(node, javafx.scene.layout.Priority.NEVER);
        }

        if (node.getParent() instanceof javafx.scene.layout.HBox) {
            javafx.scene.layout.HBox.setHgrow(node, javafx.scene.layout.Priority.NEVER);
        }

        return this;
    }

    public FX<T> grow() {
        if (node.getParent() instanceof javafx.scene.layout.HBox) {
            javafx.scene.layout.HBox.setHgrow(node, Priority.ALWAYS);
        }
        if (node.getParent() instanceof javafx.scene.layout.VBox) {
            javafx.scene.layout.VBox.setVgrow(node, Priority.ALWAYS);
        }
        return this;
    }

    public FX<T> maxWidth(double width) {
        node.maxWidth(width);
        return this;
    }

    public FX<T> width(double width) {
        node.prefWidth(width);
        return this;
    }

    public FX<T> minWidth(double width) {
        node.minWidth(width);
        return this;
    }

    public FX<T> maxHeight(double height) {
        node.maxHeight(height);
        return this;
    }

    public FX<T> height(double height) {
        node.prefHeight(height);
        return this;
    }

    public FX<T> minHeight(double height) {
        node.minHeight(height);
        return this;
    }

    public FX<T> visible(State<Boolean> state) {
        state.onChange(node::setVisible);
        return this;
    }
}

