package de.dragonrex.layout;

import de.dragonrex.core.layout.FXContainer;
import javafx.scene.Node;

public class VBox extends FXContainer<javafx.scene.layout.VBox> {

    public VBox(Node... children) {
        super(new javafx.scene.layout.VBox(children));
        node.setSpacing(12);
        css("fx-vbox");
    }

    public VBox spacing(double v) {
        node.setSpacing(v);
        return this;
    }
}

