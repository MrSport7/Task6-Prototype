package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Polygon extends Shape {
    private double size = 30;
    private int numberOfSides = 5;

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        double[] xPoints = new double[numberOfSides];
        double[] yPoints = new double[numberOfSides];

        for (int i = 0; i < numberOfSides; i++) {
            xPoints[i] = x + size * Math.cos(2 * Math.PI * i / numberOfSides);
            yPoints[i] = y + size * Math.sin(2 * Math.PI * i / numberOfSides);
        }

        gc.fillPolygon(xPoints, yPoints, numberOfSides);
        gc.setStroke(borderColor);
        gc.setLineWidth(lineWidth);
        gc.strokePolygon(xPoints, yPoints, numberOfSides);
    }

    @Override
    public String toString() {
        return "Пятиугольник";
    }
}
