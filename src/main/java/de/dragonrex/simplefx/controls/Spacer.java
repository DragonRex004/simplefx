package de.dragonrex.simplefx.controls;

import de.dragonrex.simplefx.core.FX;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class Spacer extends FX<Region> {

    public Spacer() {
        super(new javafx.scene.layout.Region());
        grow();
    }
}
