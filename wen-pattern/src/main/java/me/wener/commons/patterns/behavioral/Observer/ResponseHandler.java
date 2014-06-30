package me.wener.commons.patterns.behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer
{

    public void update(Observable obj, Object arg)
    {
        if (arg instanceof String)
        {
            String resp = (String) arg;
            System.out.println("\nReceived Response: " + resp);
        }
    }
}
