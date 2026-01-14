package de.dragonrex.layout;

import de.dragonrex.core.layout.FXContainer;
import javafx.geometry.Pos;
import javafx.scene.Node;

public class HBox extends FXContainer<javafx.scene.layout.HBox> {

    public HBox(Node... children) {
        super(new javafx.scene.layout.HBox(children));
        node.setSpacing(12);
        css("fx-hbox");
    }

    public HBox align(Pos pos) {
        node.setAlignment(pos);
        return this;
    }

    public HBox spacing(double h) {
        node.setSpacing(h);
        return this;
    }
}

