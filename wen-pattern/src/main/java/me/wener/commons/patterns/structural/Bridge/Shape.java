package me.wener.commons.patterns.structural.Bridge;

/**
 * "Abstraction"
 */
abstract class Shape
{
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI)
    {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();                             // low-level

    public abstract void resizeByPercentage(double pct);     // high-level
}
