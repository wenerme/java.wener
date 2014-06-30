package me.wener.wen.alogrithm.color;

import me.wener.wen.alogrithm.Calc;
import me.wener.wen.alogrithm.color.space.ARGB;
import me.wener.wen.alogrithm.color.space.CMY;
import me.wener.wen.alogrithm.color.space.CMYK;
import me.wener.wen.alogrithm.color.space.HSL;
import me.wener.wen.alogrithm.color.space.HSV;
import me.wener.wen.alogrithm.color.space.RGB;
import me.wener.wen.alogrithm.color.space.RGBD;

/**
 * 转换主要参考 http://easyrgb.com/
 */
@SuppressWarnings("unused")
public class ColorConverts
{
    public static HSL toHSL(RGBD rgb)
    {
        double red = rgb.getRed();
        double blue = rgb.getBlue();
        double green = rgb.getGreen();

        double max = Calc.max(red, blue, green);
        double min = Calc.min(red, blue, green);
        double deltaMax = max - min;

        double H = 0;
        double L;
        double S = 0;
        L = (max + min) / 2;

        if (deltaMax != 0) //If deltaMax == 0 a gray, no chroma...
        {
            //Chromatic data...
            if (L < 0.5)
                S = deltaMax / (max + min);
            else
                S = deltaMax / (2 - max - min);

            double deltaR = (((max - red) / 6) + (deltaMax / 2)) / deltaMax;
            double deltaG = (((max - green) / 6) + (deltaMax / 2)) / deltaMax;
            double deltaB = (((max - blue) / 6) + (deltaMax / 2)) / deltaMax;

            if (red == max) H = deltaB - deltaG;
            else if (green == max) H = (1 / 3.0) + deltaR - deltaB;
            else if (blue == max) H = (2 / 3.0) + deltaG - deltaR;

            if (H < 0) H += 1;
            if (H > 0) H -= 1;
        }

        return new HSL(H, S, L);
    }

    public RGB toRGB(int val)
    {
        return new RGB(val & 0XFF0000, val & 0XFF00, val & 0XFF);
    }

    public ARGB toARGB(long value)
    {
        return new ARGB(value & 0XFF000000, value & 0XFF0000, value & 0XFF00, value & 0XFF);
    }

    public RGB toRGB(RGBD rgbd)
    {
        return new RGB((int) (rgbd.getRed() * 255), (int) (rgbd.getGreen() * 255), (int) (rgbd.getBlue() * 255));
    }

    public RGBD toRGBD(RGB rgb)
    {
        return new RGBD(rgb.getRed() / 255.0, rgb.getGreen() / 255.0, rgb.getGreen() / 255.0);
    }

    public RGBD toRGBD(HSL hsl)
    {
        double H = hsl.getHue();
        double S = hsl.getSaturation();
        double L = hsl.getLightness();
        double R, G, B;

        if (S == 0)// Gray
        {
            R = G = B = L;
        } else
        {
            double tmpA, tmpB;
            if (L < 0.5)
                tmpB = L * (1 + S);
            else
                tmpB = (L + S) - (S * L);

            tmpA = 2 * L - tmpB;

            R = Hue2RGB(tmpA, tmpB, H + (1 / 3.0));
            G = Hue2RGB(tmpA, tmpB, H);
            B = Hue2RGB(tmpA, tmpB, H - (1 / 3.0));
        }


        return new RGBD(R, G, B);
    }

    public RGBD toRGBD(HSV hsv)
    {
        final double H = hsv.getHue();
        final double S = hsv.getSaturation();
        final double V = hsv.getValue();
        double R, G, B;

        if (S == 0)// Gray
        {
            R = G = B = V;
        } else
        {
            double varH = H * 6;

            if (varH == 6) //H must be < 1
                varH = 0;

            int varI = (int) varH;
            double varA = V * (1 - S);
            double varB = V * (1 - S * (varH - varI));
            double varC = V * (1 - S * (1 - (varH - varI)));

            switch (varI)
            {
                case 0:
                    R = V;
                    G = varC;
                    B = varA;
                    break;
                case 1:
                    R = varB;
                    G = V;
                    B = varA;
                    break;
                case 2:
                    R = varA;
                    G = V;
                    B = varC;
                    break;
                case 3:
                    R = varA;
                    G = varB;
                    B = V;
                    break;
                case 4:
                    R = varC;
                    G = varA;
                    B = V;
                    break;
                default:
                    R = V;
                    G = varA;
                    B = varB;
            }

        }

        return new RGBD(R, G, B);
    }

    public int toInt(RGB rgb)
    {
        return rgb.getRed() << 16 | rgb.getGreen() << 8 | rgb.getBlue();
    }

    public int toLong(ARGB argb)
    {
        return argb.getAlpha() << 24 | toInt(argb);
    }

    public HSV toHSV(RGBD rgb)
    {
        double red = rgb.getRed();
        double blue = rgb.getBlue();
        double green = rgb.getGreen();

        double max = Calc.max(red, blue, green);
        double min = Calc.min(red, blue, green);
        double deltaMax = max - min;


        double H = 0, V, S = 0;
        V = max;// Different from hsl

        if (deltaMax != 0) //If deltaMax == 0 a gray, no chroma...
        {
            //Chromatic data...
            S = deltaMax / max;// Different from hsl

            double deltaR = (((max - red) / 6) + (deltaMax / 2)) / deltaMax;
            double deltaG = (((max - green) / 6) + (deltaMax / 2)) / deltaMax;
            double deltaB = (((max - blue) / 6) + (deltaMax / 2)) / deltaMax;

            if (red == max) H = deltaB - deltaG;
            else if (green == max) H = (1 / 3.0) + deltaR - deltaB;
            else if (blue == max) H = (2 / 3.0) + deltaG - deltaR;

            if (H < 0) H += 1;
            if (H > 0) H -= 1;
        }

        return new HSV(H, S, V);
    }

    public CMY toCMY(RGBD rgb)
    {
        return new CMY(1 - rgb.getRed(), 1 - rgb.getGreen(), 1 - rgb.getBlue());
    }

    public RGBD toRGBD(CMY cmy)
    {
        return new RGBD(1 - cmy.getCyan(), 1 - cmy.getMagenta(), 1 - cmy.getYellow());
    }

    public CMY toCMY(CMYK cmyk)
    {
        double K = cmyk.getBlack();
        return new CMY(cmyk.getCyan() * (1 - K) + K, cmyk.getMagenta() * (1 - K) + K, cmyk.getYellow() * (1 - K) + K);
    }

    public CMYK toCMYK(CMY cmy)
    {
        double C = cmy.getCyan();
        double M = cmy.getMagenta();
        double Y = cmy.getYellow();
        double K = Calc.min(C, M, Y, 1);

        if (K == 1)// Black
        {
            C = M = Y = 0;
        } else
        {
            C = (C - K) / (1 - K);
            M = (M - K) / (1 - K);
            Y = (Y - K) / (1 - K);
        }

        return new CMYK(C, M, Y, K);
    }

    protected double Hue2RGB(double a, double b, double hue)
    {
        if (hue < 0) hue += 1;
        if (hue > 1) hue -= 1;
        if ((6 * hue) < 1) return a + (b - a) * 6 * hue;
        if ((2 * hue) < 1) return b;
        if ((3 * hue) < 1) return a + (b - a) * ((2 / 3.0) - hue) * 6;

        return a;
    }
}
