package me.wener.wen.alogrithm.color.space;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import me.wener.wen.alogrithm.Checks;

@EqualsAndHashCode(callSuper = true)
@Value
public class CMYK extends CMY
{
    private final double black;

    public CMYK(double cyan, double magenta, double yellow, double black)
    {
        super(cyan,magenta,yellow);
        Checks.checkArgument(0 <= black && black <= 1, "0 <= Black <= 100%");
        this.black = black;
    }

}
