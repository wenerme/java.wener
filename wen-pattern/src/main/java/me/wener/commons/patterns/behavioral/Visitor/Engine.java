package me.wener.commons.patterns.behavioral.Visitor;

class Engine implements ICarElement
{
    public void accept(ICarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}
