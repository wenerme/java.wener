package me.wener.commons.patterns.behavioral.Mediator;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague
class BtnSearch extends JButton implements Command
{

    IMediator med;

    BtnSearch(ActionListener al, IMediator m)
    {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }

    public void execute()
    {
        med.search();
    }

}
