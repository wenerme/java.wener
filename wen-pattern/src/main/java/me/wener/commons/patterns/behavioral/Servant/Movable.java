package me.wener.commons.patterns.behavioral.Servant;

// Interface specifying what serviced classes needs to implement, to be
// serviced by servant.
public interface Movable
{
    public Position getPosition();

    public void setPosition(Position p);
}
