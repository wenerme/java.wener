package me.wener.commons.patterns.behavioral.Servant;

// One of geometric classes
public class Triangle implements Movable
{
    // Position of the geometric object on some canvas
    private Position p;

    // Method, which returns position of geometric object
    public Position getPosition()
    {
        return this.p;
    }

    // Method, which sets position of geometric object
    public void setPosition(Position p)
    {
        this.p = p;
    }
}
