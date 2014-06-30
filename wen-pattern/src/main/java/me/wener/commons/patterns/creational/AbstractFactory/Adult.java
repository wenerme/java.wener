package me.wener.commons.patterns.creational.AbstractFactory;

public class Adult extends PersonInterfaceImpl
{

    private int income = 0;

    public int getIncome()
    {
        return income;
    }

    public void setIncome(int income)
    {
        this.income = income;
    }

}
