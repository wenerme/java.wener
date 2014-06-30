package me.wener.commons.patterns.creational.FactoryMethod;


import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
public class PersonInfo
{
    private PersonInfo()
    {
    }

    @Getter
    private int age;
    @Getter
    private String name;
    @Getter
    private String sex;

    public static PersonInfo of(String name, int age, String sex)
    {
        PersonInfo info = new PersonInfo();
        info.sex = sex;
        info.name = name;
        info.age = age;
        return info;
    }
    public static PersonInfo withName(PersonInfo info,String name)
    {
        return of(name, info.getAge(), info.getSex());
    }
}
