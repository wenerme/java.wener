package me.wener.commons.patterns.creational.Builder;


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

    public static void main(String[] args)
    {
        Builder builder = new Builder();
        PersonInfo info = builder
                .name("wener")
                .age(20)
                .sex("male")
                .build();
        System.out.printf(info.toString());
    }

    @Data
    @Accessors(fluent = true, chain = true)
    public static class Builder
    {
        private int age;
        private String name;
        private String sex;

        public PersonInfo build()
        {
            PersonInfo info = new PersonInfo();
            info.age = age;
            info.name = name;
            info.sex = sex;
            return info;
        }

    }
}
