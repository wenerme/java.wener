package me.wener.commons.patterns.concurrency.DoubleCheckedLocking;

// Single-threaded version
class SingleThreadedFoo
{
    private Helper helper;

    public Helper getHelper()
    {
        if (helper == null)
        {
            helper = new Helper();
        }
        return helper;
    }

    // other functions and members...
}
