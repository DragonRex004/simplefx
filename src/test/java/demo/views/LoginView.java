package demo.views;

import de.dragonrex.core.UI;
import de.dragonrex.core.layout.Align;
import de.dragonrex.core.node.FXNode;
import de.dragonrex.core.state.State;
import demo.AppState;

public class LoginView implements DemoView {

    private final State<String> user = State.of("");
    private final State<String> password = State.of("");

    @Override
    public String title() {
        return "Login";
    }

    @Override
    public FXNode view() {

        return UI.center(
                UI.card(
                        UI.label("Login").css("card-title").alignSelf(Align.CENTER),
                        UI.textField(user)
                                .maxWidth(280)
                                .css("input"),
                        UI.passwordField(password)
                                .maxWidth(280)
                                .css("input"),
                        UI.label("Invalid credentials")
                                .css("error-text")
                                .visible(AppState.error),
                        UI.button("Login")
                                .primary()
                                .onClick(() -> {
                                    if(!validateUser(user.get(), password.get())) {
                                        AppState.error.set(true);
                                        return;
                                    }
                                    AppState.username.set(user.get());
                                    AppState.loggedIn.set(true);
                                    AppState.error.set(false);
                                    AppState.view.set(AppState.View.DASHBOARD);
                                })
                                .alignSelf(Align.END)
                )
        );
    }

    private boolean validateUser(String user, String password) {
        return !password.isEmpty() &&
                !user.isEmpty() &&
                password.equalsIgnoreCase("admin") &&
                user.equalsIgnoreCase("admin");
    }
}

