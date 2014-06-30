package me.wener.commons.patterns.behavioral.Visitor;

interface ICarElementVisitor
{
    void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);
}

