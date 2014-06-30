package me.wener.commons.patterns.concurrency.DoubleCheckedLocking;

// Correct lazy initialization in Java
// Initialization-on-demand holder idiom
//@ThreadSafe
class InitializationOnDemandFoo
{
    public static Helper getHelper()
    {
        return HelperHolder.helper;
    }

    private static class HelperHolder
    {
        public static Helper helper = new Helper();
    }
}