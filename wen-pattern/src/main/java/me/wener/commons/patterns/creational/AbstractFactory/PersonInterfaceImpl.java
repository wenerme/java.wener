package me.wener.commons.patterns.creational.AbstractFactory;

import java.util.Calendar;

public abstract class PersonInterfaceImpl implements PersonInterface
{

    private String id = null;

    private String name = null;

    private Calendar birthday = null;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Calendar getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Calendar birthday)
    {
        this.birthday = birthday;
    }

}
