package demo;

import de.dragonrex.core.App;
import de.dragonrex.core.UI;
import de.dragonrex.core.layout.Align;
import de.dragonrex.core.node.FXNode;
import demo.views.DashboardView;
import demo.views.DemoView;
import demo.views.LoginView;
import javafx.scene.Parent;

public class DemoApp extends App {

    @Override
    protected Parent create() {

        var content = AppState.view.map(view -> switch (view) {
            case LOGIN -> new LoginView();
            case DASHBOARD -> new DashboardView();
        });

        return UI.border()
                .top(
                        header()
                )
                .center(
                        UI.view(
                                content.map(DemoView::view)
                        ).grow()
                )
                .bottom(
                        footer()
                )
                .get();
    }

    private FXNode header() {
        return UI.hbox(
                        UI.label("SimpleFX Demo").css("app-title"),
                        UI.spacer(),
                        UI.label(AppState.username.map(u ->
                                u.isEmpty() ? "" : "User: " + u
                        ))
                )
                .padding(12,0, 16, 0)
                .align(Align.CENTER)
                .css("app-header");
    }

    private FXNode footer() {
        return UI.hbox(
                        UI.label("SimpleFX • Demo"),
                        UI.spacer(),
                        UI.label("v0.1")
                )
                .padding(8,0, 16, 0)
                .align(Align.CENTER)
                .css("app-footer");
    }

    public static void main(String[] args) {
        launch(args);
    }
}


