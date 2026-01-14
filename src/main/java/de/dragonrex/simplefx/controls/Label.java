package de.dragonrex.simplefx.controls;

import de.dragonrex.simplefx.core.state.State;
import de.dragonrex.simplefx.core.FX;

public class Label extends FX<javafx.scene.control.Label> {

    public Label(String text) {
        super(new javafx.scene.control.Label(text));
    }

    public Label(State<String> text) {
        super(new javafx.scene.control.Label());
        css("fx-label");
        text.onChange(node::setText);
    }
}
