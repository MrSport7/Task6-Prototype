package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Square extends Shape {
    private double size = 50;

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillRect(x - size / 2, y - size / 2, size, size);
        gc.setStroke(borderColor);
        gc.setLineWidth(lineWidth);
        gc.strokeRect(x - size / 2, y - size / 2, size, size);
    }

    @Override
    public String toString() {
        return "Квадрат";
    }
}
