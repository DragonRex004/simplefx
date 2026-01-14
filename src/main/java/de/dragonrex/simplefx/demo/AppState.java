package de.dragonrex.simplefx.demo;

import de.dragonrex.simplefx.core.state.State;

public class AppState {

    public enum View {
        LOGIN,
        DASHBOARD
    }

    public static State<View> view = State.of(View.LOGIN);
    public static State<Boolean> loggedIn = State.of(false);
    public static State<String> username = State.of("");
    public static State<Boolean> error = State.of(false);

    private AppState() {}
}


