package me.wener.commons.patterns.concurrency.DoubleCheckedLocking;

// Broken multithreaded version
// "Double-Checked Locking" idiom
class DCLFoo
{
    private Helper helper;

    public Helper getHelper()
    {
        if (helper == null)
        {
            synchronized (this)
            {
                if (helper == null)
                {
                    helper = new Helper();
                }
            }
        }
        return helper;
    }

    // other functions and members...
}
