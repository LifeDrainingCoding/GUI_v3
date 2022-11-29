package com.example.gui_v3;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.scene.text.FontWeight;
import javafx.application.Application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class tabComboBox extends Application {
     VBox comboBoxExample() {
         ObservableList<String> options
                 = FXCollections.observableArrayList(
                 "Monday",
                 "Tuesday",
                 "Wednesday",
                 "Thursday",
                 "Friday",
                 "Saturday",
                 "Sunday"
         );
         ComboBox comboBox = new ComboBox(options);
         comboBox.setValue("Friday");
         comboBox.setEditable(true);

         Label label = new Label();
         label.setFont(Font.font(30));
         label.setPrefSize(400, 50);
         comboBox.setPrefSize(300, 50);
         comboBox.setStyle("-fx-font-size: 30px");

         Button btn = new Button();
         btn.setPrefSize(300, 50);
         btn.setFont(Font.font(30));
         btn.setText("Read comboBox");
         btn.setOnAction((event) -> {
             if (comboBox.getValue() != null && !comboBox.getValue().toString().isEmpty()) {
                 label.setText("selected: " + comboBox.getValue());
             } else label.setText(" no selected item");
         });

         VBox vBox = new VBox();
         vBox.setPadding(new Insets(50, 100, 50, 100));
         vBox.setSpacing(15);
         vBox.getChildren().addAll(comboBox, btn, label);
         Stage primaryStage = new Stage();
         primaryStage.setTitle("тайтл");
         primaryStage.setScene(new Scene(vBox));
         primaryStage.show();
         return vBox;

    }
}