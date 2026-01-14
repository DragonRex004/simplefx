package de.dragonrex.controls;

import de.dragonrex.core.FX;
import de.dragonrex.core.state.State;

public class PasswordField extends FX<javafx.scene.control.PasswordField> {
    public PasswordField(State<String> state) {
        super(new javafx.scene.control.PasswordField());

        state.onChange(s -> {
            if (!node.getText().equals(s)) {
                node.setText(s);
            }
        });

        node.textProperty().addListener((_, _, v) -> state.set(v));
    }
}
