package de.dragonrex.controls;

import de.dragonrex.core.FX;
import javafx.scene.layout.Region;

public class Spacer extends FX<Region> {

    public Spacer() {
        super(new javafx.scene.layout.Region());
        grow();
    }
}
