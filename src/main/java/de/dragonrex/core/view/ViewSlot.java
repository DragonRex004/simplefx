package de.dragonrex.core.view;

import de.dragonrex.core.FX;
import de.dragonrex.core.node.FXNode;
import de.dragonrex.core.state.State;
import javafx.scene.layout.StackPane;

public class ViewSlot extends FX<StackPane> {

    public ViewSlot(State<? extends FXNode> state) {
        super(new StackPane());

        state.onChange(fx -> {
            node.getChildren().setAll(fx.node());
        });
    }
}

