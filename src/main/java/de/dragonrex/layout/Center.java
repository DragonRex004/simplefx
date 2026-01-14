package de.dragonrex.layout;

import de.dragonrex.core.layout.FXContainer;
import de.dragonrex.core.node.FXNode;
import javafx.scene.layout.StackPane;

public class Center extends FXContainer<StackPane> {

    public Center(FXNode... children) {
        super(new javafx.scene.layout.StackPane(), children);
        css("fx-center");
    }
}
