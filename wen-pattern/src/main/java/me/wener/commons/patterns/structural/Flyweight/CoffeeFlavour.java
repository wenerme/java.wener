package me.wener.commons.patterns.structural.Flyweight;

// Instances of CoffeeFlavour will be the Flyweights
class CoffeeFlavour
{
    private final String name;

    CoffeeFlavour(String newFlavor)
    {
        this.name = newFlavor;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
