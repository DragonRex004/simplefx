package de.dragonrex.layout;

import de.dragonrex.core.FX;
import de.dragonrex.core.node.FXNode;
import javafx.scene.layout.BorderPane;

public class BorderLayout extends FX<BorderPane> {

    public BorderLayout() {
        super(new BorderPane());
    }

    public BorderLayout top(FXNode node) {
        this.node.setTop(node.node());
        return this;
    }

    public BorderLayout center(FXNode node) {
        this.node.setCenter(node.node());
        return this;
    }

    public BorderLayout bottom(FXNode node) {
        this.node.setBottom(node.node());
        return this;
    }

}
