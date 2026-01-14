package de.dragonrex.core;

import de.dragonrex.controls.*;
import de.dragonrex.layout.*;
import de.dragonrex.core.node.FXNode;
import de.dragonrex.core.state.State;
import de.dragonrex.core.view.ViewSlot;
import javafx.scene.Node;

import java.util.Arrays;

public final class UI {

    public static Button button(String text) {
        return new Button(text);
    }

    public static Label label(State<String> text) {
        return new Label(text);
    }
    public static Label label(String text) {
        return new Label(text);
    }

    public static TextField textField(State<String> state) {
        return new TextField(state);
    }
    public static PasswordField passwordField(State<String> state) {
        return new PasswordField(state);
    }

    public static VBox vbox(FXNode... children) {
        return new VBox(
                Arrays.stream(children)
                        .map(FXNode::node)
                        .toArray(Node[]::new)
        );
    }

    public static HBox hbox(FXNode... children) {
        return new HBox(
                Arrays.stream(children)
                        .map(FXNode::node)
                        .toArray(Node[]::new)
        );
    }

    public static Card card(FXNode... children) {
        return new Card(children);
    }

    public static Center center(FXNode... children) {
        return new Center(children);
    }

    public static Scroll scroll(FXNode content) {
        return new Scroll(content);
    }

    public static Spacer spacer() {
        return new Spacer();
    }

    public static ViewSlot view(State<? extends FXNode> state) {
        return new ViewSlot(state);
    }

    public static BorderLayout border() {
        return new BorderLayout();
    }
}
