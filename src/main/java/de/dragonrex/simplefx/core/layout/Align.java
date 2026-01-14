package de.dragonrex.simplefx.core.layout;

import javafx.geometry.Pos;

public enum Align {

    START(Pos.TOP_LEFT),
    CENTER(Pos.CENTER),
    END(Pos.BOTTOM_RIGHT),

    TOP(Pos.TOP_CENTER),
    BOTTOM(Pos.BOTTOM_CENTER),

    LEFT(Pos.CENTER_LEFT),
    RIGHT(Pos.CENTER_RIGHT),

    CENTER_LEFT(Pos.CENTER_LEFT),
    CENTER_RIGHT(Pos.CENTER_RIGHT),
    TOP_CENTER(Pos.TOP_CENTER),
    BOTTOM_CENTER(Pos.BOTTOM_CENTER);

    public final Pos pos;

    Align(Pos pos) {
        this.pos = pos;
    }
}

