package com.example.prototype;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView<Shape> listView;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private ColorPicker borderColorPicker;
    @FXML
    private TextField lineWidthField;
    @FXML
    private Label shapeNameLabel;
    @FXML
    private Canvas canvas;

    private ObservableList<Shape> content;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Создаем экземпляры фигур
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Ellipse ellipse = new Ellipse();
        Polygon polygon = new Polygon();

        // Инициализируем список фигур
        content = FXCollections.observableArrayList(circle, square, rectangle, triangle, ellipse, polygon);
        listView.setItems(content);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                shapeNameLabel.setText(newSelection.toString());
            }
        });
    }

    @FXML
    public void drawShape(MouseEvent mouseEvent) {
        int index = listView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Shape shape = (Shape) content.get(index).clone();
            shape.setColor(colorPicker.getValue());
            shape.setBorderColor(borderColorPicker.getValue());
            shape.setLineWidth(Double.parseDouble(lineWidthField.getText()));
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setEffect(new javafx.scene.effect.DropShadow(10, 5, 5, javafx.scene.paint.Color.GRAY));
            shape.draw(gc, mouseEvent.getX(), mouseEvent.getY());
        }
    }

    @FXML
    public void clearCanvas() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setEffect(null);
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setEffect(new javafx.scene.effect.DropShadow(10, 5, 5, javafx.scene.paint.Color.GRAY));
    }
}