package me.wener.commons.patterns.concurrency.DoubleCheckedLocking;

public class FinalWrapperFoo
{
    private FinalWrapper<Helper> helperWrapper;

    public Helper getHelper()
    {
        FinalWrapper<Helper> wrapper = helperWrapper;

        if (wrapper == null)
        {
            synchronized (this)
            {
                if (helperWrapper == null)
                {
                    helperWrapper = new FinalWrapper<Helper>(new Helper());
                }
                wrapper = helperWrapper;
            }
        }
        return wrapper.value;
    }
}
