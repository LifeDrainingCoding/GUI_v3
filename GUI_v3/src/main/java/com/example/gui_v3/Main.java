package com.example.gui_v3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ObservableList<String> option = FXCollections.observableArrayList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );
        ComboBox comboBox = new ComboBox(option);
        comboBox.setValue("Friday");
        comboBox.setEditable(true);
        Label label = new Label();
        label.setFont(Font.font(30));
        label.setPrefSize(400, 50);
        comboBox.setStyle("-fx-font-size:30px");

        Button butt = new Button();
        butt.setPrefSize(300, 50);
        butt.setFont(Font.font(30));
        butt.setText("Read comboBox");
        butt.setOnAction((event) -> {
            if (comboBox.getValue() !=null&&
                    !comboBox.getValue().toString().isEmpty()) {
                label.setText("selected:"+comboBox.getValue());
            }
            else label.setText("no selected item");
        });
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(50, 100, 50, 100));
        vBox.setSpacing(15);
        vBox.getChildren().addAll(comboBox, butt, label);

        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
