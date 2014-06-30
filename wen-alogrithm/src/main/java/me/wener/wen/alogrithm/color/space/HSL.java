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
public class HSL implements Serializable
{
    private final double hue;
    private final double saturation;
    private final double lightness;

    public HSL(double hue, double saturation, double lightness)
    {
        Checks.checkArgument(0 <= hue && hue < 360, "0 <= Hue < 360");
        Checks.checkArgument(0 <= saturation && saturation <= 1, "0<= Saturation <= 100%");
        Checks.checkArgument(0 <= lightness && lightness <= 1, "0<= Lightness <= 100%");

        this.hue = hue;
        this.saturation = saturation;
        this.lightness = lightness;
    }


    /**
     * Same as Lightness
     */
    public double getBrightness()
    {
        return getLightness();
    }
}
