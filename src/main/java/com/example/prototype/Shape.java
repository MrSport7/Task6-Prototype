package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape implements Cloneable {
    protected Color color;
    protected Color borderColor;
    protected double lineWidth;
    protected double x;
    protected double y;

    public abstract void draw(GraphicsContext gc, double x, double y);
    public abstract String toString();

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public void setLineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
