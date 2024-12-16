package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Shape {
    private double size = 30;

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        double[] xPoints = { x, x - size, x + size };
        double[] yPoints = { y - size, y + size, y + size };
        gc.fillPolygon(xPoints, yPoints, 3);

        gc.setStroke(borderColor);
        gc.setLineWidth(lineWidth);
        gc.strokePolygon(xPoints, yPoints, 3);
    }

    @Override
    public String toString() {
        return "Треугольник";
    }
}
