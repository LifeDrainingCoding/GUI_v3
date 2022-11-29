package com.example.gui_v3;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class tabRadioButtons {private HBox radioButtonExample() {
    HBox root = new HBox();
    GridPane pane1 = new GridPane();
    pane1.setHgap(40);
    pane1.setVgap(110);
    pane1.setPadding(new Insets(20, 20, 20, 20));
    Label labelImage1 = new Label();
    labelImage1.setPrefSize(210, 270);
    pane1.add(labelImage1, 1, 0, 1, 3);
    ToggleGroup group1 = new ToggleGroup();
    RadioButton buttonDog1 = new RadioButton("dog");
    buttonDog1.setToggleGroup(group1);
    buttonDog1.setFont(Font.font(20));
    buttonDog1.setOnAction((event) -> {
        Image imageDog = new Image(getClass().getResourceAsStream("images/dog.jpeg"));
        ImageView imvDog = new ImageView(imageDog);
        labelImage1.setGraphic(imvDog);
    });
    pane1.add(buttonDog1, 0, 0);
    RadioButton buttonHouse1 = new RadioButton("house");
    buttonHouse1.setToggleGroup(group1);
    buttonHouse1.setFont(Font.font(20));
    buttonHouse1.setOnAction(( event) -> {
        Image imageHouse = new Image(getClass().getResourceAsStream("images/house.jpeg"));
        ImageView imvHouse = new ImageView(imageHouse);
        labelImage1.setGraphic(imvHouse);
    });
    pane1.add(buttonHouse1, 0, 1);
    RadioButton buttonTree1 = new RadioButton("tree");
    buttonTree1.setToggleGroup(group1);
    buttonTree1.setFont(Font.font(20));
    buttonTree1.setOnAction((event) -> {
        Image imageTree = new Image(getClass().getResourceAsStream("images/tree.jpeg"));
        ImageView imvTree = new ImageView(imageTree);
        labelImage1.setGraphic(imvTree);
    });
    pane1.add(buttonTree1, 0, 2);
    root.getChildren().add(pane1);
    Separator separator = new Separator();
    separator.setOrientation(Orientation.VERTICAL);
    root.getChildren().add(separator);
    GridPane pane2 = new GridPane();
    pane2.setHgap(40);
    pane2.setVgap(110);
    pane2.setPadding(new Insets(20, 20, 20, 20));
    Label labelImage2 = new Label();
    labelImage2.setPrefSize(210, 270);
    pane2.add(labelImage2, 1, 0, 1, 3);
    ToggleGroup group2 = new ToggleGroup();
    RadioButton buttonDog2 = new RadioButton("dog");
    buttonDog2.setToggleGroup(group2);
    buttonDog2.setFont(Font.font(20));
    pane2.add(buttonDog2, 0, 0);
    RadioButton buttonHouse2 = new RadioButton("house");
    buttonHouse2.setToggleGroup(group2);
    buttonHouse2.setFont(Font.font(20));
    pane2.add(buttonHouse2, 0, 1);
    RadioButton buttonTree2 = new RadioButton("tree");
    buttonTree2.setToggleGroup(group2);
    buttonTree2.setFont(Font.font(20));
    pane2.add(buttonTree2, 0, 2);

    Button btn = new Button("Ok");
    btn.setFont(Font.font(20));
    btn.setOnAction(( event) -> {
        if (buttonDog2.isSelected()) {
            Image imageDog = new Image(getClass().getResourceAsStream("images/dog.jpeg"));
            ImageView imvDog = new ImageView(imageDog);
            labelImage2.setGraphic(imvDog);  }
        if (buttonHouse2.isSelected()) {
            Image imageHouse = new Image(getClass().getResourceAsStream("images/house.jpeg"));
            ImageView imvHouse = new ImageView(imageHouse);
            labelImage2.setGraphic(imvHouse);  }
        if (buttonTree2.isSelected()) {
            Image imageTree = new Image(getClass().getResourceAsStream("images/tree.jpeg"));
            ImageView imvTree = new ImageView(imageTree);
            labelImage2.setGraphic(imvTree);  }
    });
    pane2.add(btn, 0, 3, 2, 1);
    root.getChildren().add(pane2);
    return root;}

}