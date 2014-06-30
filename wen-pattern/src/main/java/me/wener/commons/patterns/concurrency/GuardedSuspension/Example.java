package me.wener.commons.patterns.concurrency.GuardedSuspension;

public class Example
{
    synchronized void guardedMethod()
    {
        while (!preCondition())
        {
            try
            {
                //Continue to wait
                wait();
                //…
            } catch (InterruptedException e)
            {
                //…
            }
        }
        //Actual task implementation
    }

    private boolean preCondition()
    {
        return false;
    }

    synchronized void alterObjectStateMethod()
    {
        //Change the object state
        //…..
        //Inform waiting threads
        notify();
    }
}