package me.wener.commons.patterns.creational.AbstractFactory;


import java.util.Calendar;

public interface PersonInterface
{

    public static final String ROLE = PersonInterface.class.getName();

    public abstract String getId() throws Exception;

    public abstract void setId(String id) throws Exception;

    public abstract String getName() throws Exception;

    public abstract void setName(String name) throws Exception;

    public abstract Calendar getBirthday() throws Exception;

    public abstract void setBirthday(Calendar birthday) throws Exception;

}
