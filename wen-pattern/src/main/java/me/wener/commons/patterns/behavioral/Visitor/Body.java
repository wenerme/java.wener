package me.wener.commons.patterns.behavioral.Visitor;

class Body implements ICarElement
{
    public void accept(ICarElementVisitor visitor)
    {
        visitor.visit(this);
    }
}
