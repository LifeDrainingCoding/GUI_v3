package com.example.gui_v3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class tabSpinners {
    public VBox spinnerExample() {
        Spinner<Integer> spInt = new Spinner(-100, 100, 0);
        spInt.setStyle("-fx-font-size: 30px");
        spInt.setPrefWidth(170);

        Spinner<Double> spDouble = new Spinner(-100.0, 100.0, 1.0, 0.1);
        spDouble.setEditable(true);
        spDouble.setStyle("-fx-font-size: 30px");
        spDouble.setPrefWidth(170);

        Label label = new Label();
        label.setFont(Font.font(30));
        label.setPrefSize(400, 100);

        Button btn = new Button();
        btn.setText("Ok");
        btn.setFont(Font.font(30));
        btn.setOnAction((event) -> {
            label.setText("integer spinner: "+spInt.getValue()+"\ndouble spinner: "+spDouble.getValue());
        });

        VBox vBox = new VBox(20);
        vBox.setPadding(new Insets(50, 100, 50, 100));
        vBox.getChildren().addAll(spInt, spDouble, btn, label);
        return vBox;}


}
