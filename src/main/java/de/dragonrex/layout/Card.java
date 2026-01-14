package de.dragonrex.layout;

import de.dragonrex.core.layout.FXContainer;
import de.dragonrex.core.node.FXNode;

public class Card extends FXContainer<javafx.scene.layout.VBox> {

    public Card(FXNode... children) {
        super(new javafx.scene.layout.VBox(), children);
        node.setSpacing(12);
        node.setPadding(new javafx.geometry.Insets(16));
        css("fx-card");
    }
}
