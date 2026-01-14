package de.dragonrex.simplefx.controls;

import de.dragonrex.simplefx.core.FX;
import de.dragonrex.simplefx.core.node.FXNode;
import javafx.scene.control.ScrollPane;

public class Scroll extends FX<ScrollPane> {

    public Scroll(FXNode content) {
        super(new javafx.scene.control.ScrollPane(content.node()));
        node.setFitToWidth(true);
        css("fx-scroll");
    }
}
