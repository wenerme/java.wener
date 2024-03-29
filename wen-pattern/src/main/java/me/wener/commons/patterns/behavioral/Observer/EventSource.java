package me.wener.commons.patterns.behavioral.Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while (true)
            {
                String response = br.readLine();
                setChanged();
                notifyObservers(response);
                if (response.toLowerCase().equals("exit"))
                    break;
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


