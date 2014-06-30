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
public class RGB implements Serializable
{
    private final int red;
    private final int green;
    private final int blue;

    public RGB(int red, int green, int blue)
    {
        Checks.checkArgument(0 <= red && red <= 255, "0 <= Red <= 255");
        Checks.checkArgument(0 <= green && green <= 255, "0 <= Green <= 255");
        Checks.checkArgument(0 <= blue && blue <= 255, "0 <= Blue <= 255");
        
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

}
