package me.wener.wen.alogrithm.color.space;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import me.wener.wen.alogrithm.Checks;

@Value
@EqualsAndHashCode(callSuper = true)
public class ARGB extends RGB implements Serializable
{

    private final int alpha;

    public ARGB(int alpha, int red, int green, int blue)
    {
        super(red, blue, green);
        Checks.checkArgument(0 <= alpha && alpha <= 255, "0 <= Alpha <= 255");
        this.alpha = alpha;
    }

    public ARGB(long a, long r, long g, long b)
    {
        this((int) a, (int) r, (int) g, (int) b);
    }
}
