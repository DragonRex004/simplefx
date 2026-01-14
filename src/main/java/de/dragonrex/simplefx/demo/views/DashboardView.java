package de.dragonrex.simplefx.demo.views;

import de.dragonrex.simplefx.core.UI;
import de.dragonrex.simplefx.core.layout.Align;
import de.dragonrex.simplefx.core.node.FXNode;
import de.dragonrex.simplefx.demo.AppState;

public class DashboardView implements DemoView {

    @Override
    public String title() {
        return "Dashboard";
    }

    @Override
    public FXNode view() {

        return UI.vbox(
                        UI.card(
                                UI.label(AppState.username.map(u -> "Welcome, " + u + "!"))
                                        .css("card-title"),
                                UI.label("This is your dashboard.")
                        ),
                        UI.card(
                                UI.label("Actions").css("card-title"),
                                UI.button("Logout")
                                        .danger()
                                        .onClick(() -> {
                                            AppState.username.set("");
                                            AppState.loggedIn.set(false);
                                            AppState.view.set(AppState.View.LOGIN);
                                        })
                        )
                )
                .spacing(16)
                .padding(24)
                .align(Align.TOP);
    }
}
