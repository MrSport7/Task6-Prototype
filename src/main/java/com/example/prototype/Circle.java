package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
    private double radius = 20;

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        gc.setStroke(borderColor);
        gc.setLineWidth(lineWidth);
        gc.strokeOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public String toString() {
        return "Круг";
    }
}
