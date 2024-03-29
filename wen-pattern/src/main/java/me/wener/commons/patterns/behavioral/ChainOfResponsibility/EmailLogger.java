package me.wener.commons.patterns.behavioral.ChainOfResponsibility;

class EmailLogger extends Logger
{
    public EmailLogger(int mask)
    {
        this.mask = mask;
    }

    protected void writeMessage(String msg)
    {
        System.out.println("Sending via e-mail: " + msg);
    }
}
