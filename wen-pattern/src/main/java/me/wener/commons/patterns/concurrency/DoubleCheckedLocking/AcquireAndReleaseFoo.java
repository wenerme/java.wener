package me.wener.commons.patterns.concurrency.DoubleCheckedLocking;

// Works with acquire/release semantics for volatile
// Broken under Java 1.4 and earlier semantics for volatile
class AcquireAndReleaseFoo
{
    private volatile Helper helper;

    public Helper getHelper()
    {
        Helper result = helper;
        if (result == null)
        {
            synchronized (this)
            {
                result = helper;
                if (result == null)
                {
                    helper = result = new Helper();
                }
            }
        }
        return result;
    }

    // other functions and members...
}
