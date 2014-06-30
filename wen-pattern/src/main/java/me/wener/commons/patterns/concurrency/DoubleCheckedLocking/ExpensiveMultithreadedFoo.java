package me.wener.commons.patterns.concurrency.DoubleCheckedLocking;

// Correct but possibly expensive multithreaded version
class ExpensiveMultithreadedFoo
{
    private Helper helper;

    public synchronized Helper getHelper()
    {
        if (helper == null)
        {
            helper = new Helper();
        }
        return helper;
    }

    // other functions and members...
}
