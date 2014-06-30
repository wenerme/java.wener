package me.wener.commons.patterns.behavioral.Mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MediatorDemo extends JFrame implements ActionListener
{

    IMediator med = new Mediator();

    MediatorDemo()
    {
        JPanel p = new JPanel();
        p.add(new BtnView(this, med));
        p.add(new BtnBook(this, med));
        p.add(new BtnSearch(this, med));
        getContentPane().add(new LblDisplay(med), "North");
        getContentPane().add(p, "South");
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new MediatorDemo();
    }

    public void actionPerformed(ActionEvent ae)
    {
        Command comd = (Command) ae.getSource();
        comd.execute();
    }

}
