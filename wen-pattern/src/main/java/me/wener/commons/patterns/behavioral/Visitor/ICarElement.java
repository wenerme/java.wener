package me.wener.commons.patterns.behavioral.Visitor;

interface ICarElement
{
    void accept(ICarElementVisitor visitor); // CarElements have to provide accept().
}
