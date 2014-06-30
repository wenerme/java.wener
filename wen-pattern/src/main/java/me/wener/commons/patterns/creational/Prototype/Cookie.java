package me.wener.commons.patterns.creational.Prototype;

/**
 * Prototype Class *
 */
public class Cookie implements Cloneable
{

    public Object clone() throws CloneNotSupportedException
    {
        //In an actual implementation of this pattern you would now attach references to
        //the expensive to produce parts from the copies that are held inside the prototype.
        return (Cookie) super.clone();
    }
}

