package me.wener.wen.alogrithm.color.space;

import java.io.Serializable;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import me.wener.wen.alogrithm.Checks;

/**
 * HSL or HSB
 */
@Value
public class HSV implements Serializable
{
    private final double hue;
    private final double saturation;
    private final double value;

    public HSV(double hue, double saturation, double value)
    {
        Checks.checkArgument(0 <= hue && hue < 360, "0 <= Hue < 360");
        Checks.checkArgument(0 <= saturation && saturation <= 1, "0<= Saturation <= 100%");
        Checks.checkArgument(0 <= value && value <= 1, "0<= Value <= 100%");

        this.hue = hue;
        this.saturation = saturation;
        this.value = value;
    }
}
