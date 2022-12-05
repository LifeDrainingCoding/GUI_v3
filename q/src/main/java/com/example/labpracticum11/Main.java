package com.example.labpracticum11;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Main extends Application {
    public Main() {
    }

    public void start(Stage stage) throws IOException {
        Label label = new Label("LABEL");
        label.setFont(Font.font(20));
        label.setPrefSize(400, 50);
        label.setAlignment(Pos.CENTER);

        ToggleButton btn = new ToggleButton();
        btn.setFont(Font.font(20));
        btn.setPrefSize(400, 50);
        btn.setText("Push!");

        btn.setOnAction((event) -> {
            if (btn.isSelected()) {
                label.setText("ON");
                label.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
                label.setBackground(new Background(new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY)));
            } else {
                label.setText("OFF");
                label.setFont(Font.font("Tahoma", FontWeight.MEDIUM, 20));
                label.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            }
        });
        VBox vBox = new VBox(20);
        vBox.setPadding(new Insets(50, 100, 50, 100));
        vBox.getChildren().addAll(btn, label);
        Scene scene = new Scene(vBox);
        stage.setTitle("title");
        stage.setScene(scene);
        stage.show();
    }

}
