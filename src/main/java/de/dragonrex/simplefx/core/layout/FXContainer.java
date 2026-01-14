package de.dragonrex.simplefx.core.layout;

import de.dragonrex.simplefx.core.FX;
import de.dragonrex.simplefx.core.node.FXNode;
import javafx.scene.layout.Pane;

import java.util.Arrays;

public abstract class FXContainer<T extends Pane> extends FX<T> {

    protected FXContainer(T pane, FXNode... children) {
        super(pane);
        add(children);
    }

    public FXContainer<T> add(FXNode... children) {
        Arrays.stream(children)
                .map(FXNode::node)
                .forEach(node.getChildren()::add);
        return this;
    }

    public FXContainer<T> clear() {
        node.getChildren().clear();
        return this;
    }

    public FXContainer<T> padding(double all) {
        node.setPadding(new javafx.geometry.Insets(all));
        return this;
    }

    public FXContainer<T> padding(double top, double right, double bottom, double left) {
        node.setPadding(new javafx.geometry.Insets(top, right, bottom, left));
        return this;
    }

    public FXContainer<T> align(Align align) {
        if (node instanceof javafx.scene.layout.VBox v) {
            v.setAlignment(align.pos);
        }
        if (node instanceof javafx.scene.layout.HBox h) {
            h.setAlignment(align.pos);
        }
        if (node instanceof javafx.scene.layout.StackPane s) {
            s.setAlignment(align.pos);
        }
        return this;
    }

    public FXContainer<T> fillWidth(boolean fill) {
        if (node instanceof javafx.scene.layout.VBox v) {
            v.setFillWidth(fill);
        }
        return this;
    }
}

