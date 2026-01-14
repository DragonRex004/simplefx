package de.dragonrex.simplefx.core;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class App extends Application {

    @Override
    public final void start(Stage stage) {
        Scene scene = new Scene(create(), 900, 600);
        for (String css : SimpleFX.stylesheets()) {
            var res = App.class.getResource(css);
            if (res == null) {
                throw new IllegalStateException("CSS not found: " + css);
            }
            scene.getStylesheets().add(res.toExternalForm());
        }
        stage.setScene(scene);
        stage.show();
    }

    protected abstract Parent create();
}
