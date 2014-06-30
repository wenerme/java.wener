package me.wener.commons.patterns.behavioral.Mediator;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague
class BtnBook extends JButton implements Command
{

    IMediator med;

    BtnBook(ActionListener al, IMediator m)
    {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }

    public void execute()
    {
        med.book();
    }

}
