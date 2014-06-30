package me.wener.commons.patterns.structural.Composite;

import lombok.Getter;

/**
 * "Leaf"
 */
class Ellipse implements Graphic
{

    @Getter
    private double radius;

    public Ellipse(double radius)
    {
        this.radius = radius;
    }

    //Prints the graphic.
    public void print()
    {
        System.out.println("Ellipse r(" + radius + ")");
    }
}
