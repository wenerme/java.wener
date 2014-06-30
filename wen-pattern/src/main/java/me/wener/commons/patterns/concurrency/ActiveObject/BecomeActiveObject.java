package me.wener.commons.patterns.concurrency.ActiveObject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class BecomeActiveObject
{
    private double val = 0.0;
    private BlockingQueue<Runnable> dispatchQueue
            = new LinkedBlockingQueue<Runnable>();

    //
    public BecomeActiveObject()
    {
        new Thread(
                new Runnable()
                {
                    @Override
                    public void run()
                    {
                        while (true)
                        {
                            try
                            {
                                dispatchQueue.take().run();
                            } catch (InterruptedException e)
                            {   // okay, just terminate the dispatcher
                            }
                        }
                    }
                }
        ).start();
    }

    //
    void doSomething() throws InterruptedException
    {
        dispatchQueue.put(
                new Runnable()
                {
                    public void run() { val = 1.0; }
                }
        );
    }

    //
    void doSomethingElse() throws InterruptedException
    {
        dispatchQueue.put(
                new Runnable()
                {
                    public void run() { val = 2.0; }
                }
        );
    }
}
