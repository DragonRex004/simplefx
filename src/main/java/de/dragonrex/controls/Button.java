package de.dragonrex.controls;

import de.dragonrex.core.FX;

public class Button extends FX<javafx.scene.control.Button> {

    public Button(String text) {
        super(new javafx.scene.control.Button(text));
        node.getStyleClass().add("fx-button");
    }

    public Button onClick(Runnable r) {
        node.setOnAction(e -> r.run());
        return this;
    }

    public Button primary() {
        return (Button) css("primary");
    }

    public Button danger() {
        return (Button) css("danger");
    }
}

