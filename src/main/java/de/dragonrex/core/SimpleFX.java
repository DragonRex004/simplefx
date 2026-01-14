package de.dragonrex.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleFX {

    private static final List<String> stylesheets = new ArrayList<>();

    static {
        // Default CSS der Library
        stylesheets.add("/simplefx.css");
    }

    private SimpleFX() {}

    public static void setCss(String... cssFiles) {
        stylesheets.clear();
        addCss(cssFiles);
    }

    public static void addCss(String... cssFiles) {
        stylesheets.addAll(Arrays.asList(cssFiles));
    }

    static List<String> stylesheets() {
        return stylesheets;
    }
}

