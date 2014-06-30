package me.wener.commons.patterns.structural.Proxy;

//on System B
class ProxyImage implements Image
{

    private RealImage image = null;
    private String filename = null;

    /**
     * Constructor
     */
    public ProxyImage(final String filename)
    {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage()
    {
        if (image == null)
        {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

}
