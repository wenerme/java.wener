package me.wener.commons.patterns.structural.Decorator.window;

// Extension of a simple Window without any scrollbars
class SimpleWindow implements Window
{
    public void draw()
    {
        // Draw window
    }

    public String getDescription()
    {
        return "simple window";
    }
}
