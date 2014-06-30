package me.wener.wen.alogrithm.color.space;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import me.wener.wen.alogrithm.Checks;

@Getter
@EqualsAndHashCode
@ToString
public class RGBD implements Serializable
{
    private final double red;
    private final double green;
    private final double blue;

    public RGBD(double red, double green, double blue)
    {
        Checks.checkArgument(0 <= red && red <= 1, "0 <= Red <= 1");
        Checks.checkArgument(0 <= green && green <= 1, "0 <= Green <= 1");
        Checks.checkArgument(0 <= blue && blue <= 1, "0 <= Blue <= 1");
        
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

}
