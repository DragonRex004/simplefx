package de.dragonrex.controls;

import de.dragonrex.core.state.State;
import de.dragonrex.core.FX;

public class TextField extends FX<javafx.scene.control.TextField> {

    public TextField(State<String> state) {
        super(new javafx.scene.control.TextField());

        state.onChange(s -> {
            if (!node.getText().equals(s)) {
                node.setText(s);
            }
        });

        node.textProperty().addListener((_, _, v) -> state.set(v));
    }
}