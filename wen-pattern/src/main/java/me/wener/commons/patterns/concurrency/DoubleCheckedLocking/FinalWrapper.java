package me.wener.commons.patterns.concurrency.DoubleCheckedLocking;

public class FinalWrapper<T>
{
    public final T value;

    public FinalWrapper(T value)
    {
        this.value = value;
    }
}

