package me.wener.wen.alogrithm.color.space;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import me.wener.wen.alogrithm.Checks;

@EqualsAndHashCode(callSuper = true)
@Value
public class ARGBD extends RGBD implements Serializable
{

    private final double alpha;

    public ARGBD(double alpha, double red, double green, double blue)
    {
        super(red, blue, green);
        Checks.checkArgument(0 <= alpha && alpha <= 1, "0 <= Alpha <= 1");
        this.alpha = alpha;
    }

}
