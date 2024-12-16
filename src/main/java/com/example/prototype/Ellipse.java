package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Ellipse extends Shape {
    private double radiusX = 40;
    private double radiusY = 20;

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillOval(x - radiusX, y - radiusY, radiusX * 2, radiusY * 2);
        gc.setStroke(borderColor);
        gc.setLineWidth(lineWidth);
        gc.strokeOval(x - radiusX, y - radiusY, radiusX * 2, radiusY * 2);
    }

    @Override
    public String toString() {
        return "Эллипс";
    }
}
