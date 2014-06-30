package me.wener.wen.alogrithm;

public class Calc
{
    // max
    public static int max(int a, int b)
    {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c)
    {
        return Math.max(Math.max(a, b), c);
    }

    public static int max(int a, int b, int c, int d)
    {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static double max(double a, double b)
    {
        return Math.max(a, b);
    }

    public static double max(double a, double b, double c)
    {
        return Math.max(Math.max(a, b), c);
    }

    public static double max(double a, double b, double c, double d)
    {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }
    // min
    public static int min(int a, int b)
    {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c)
    {
        return Math.min(Math.min(a, b), c);
    }

    public static int min(int a, int b, int c, int d)
    {
        return Math.min(Math.min(Math.min(a, b), c), d);
    }

    public static double min(double a, double b)
    {
        return Math.min(a, b);
    }

    public static double min(double a, double b, double c)
    {
        return Math.min(Math.min(a, b), c);
    }

    public static double min(double a, double b, double c, double d)
    {
        return Math.min(Math.min(Math.min(a, b), c), d);
    }
    
}
