package me.wener.commons.patterns.behavioral.Mediator;

import java.awt.Font;
import javax.swing.JLabel;

class LblDisplay extends JLabel
{

    IMediator med;

    LblDisplay(IMediator m)
    {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }

}
