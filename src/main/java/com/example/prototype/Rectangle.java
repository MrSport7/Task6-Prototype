package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Shape {
    private double width = 60;
    private double height = 40;

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillRect(x - width / 2, y - height / 2, width, height);
        gc.setStroke(borderColor);
        gc.setLineWidth(lineWidth);
        gc.strokeRect(x - width / 2, y - height / 2, width, height);
    }

    @Override
    public String toString() {
        return "Прямоугольник";
    }
}
