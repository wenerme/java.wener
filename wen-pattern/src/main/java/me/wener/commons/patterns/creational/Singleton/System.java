package me.wener.commons.patterns.creational.Singleton;

import lombok.Getter;

public class System
{
    @Getter
    private double version = 1.0;
    @Getter
    private static System instance = new System();

    private System()
    {
    }
}
