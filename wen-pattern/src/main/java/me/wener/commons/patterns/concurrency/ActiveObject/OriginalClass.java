package me.wener.commons.patterns.concurrency.ActiveObject;

class OriginalClass
{
    private double val = 0.0;

    //
    void doSomething()
    {
        val = 1.0;
    }

    //
    void doSomethingElse()
    {
        val = 2.0;
    }
}
