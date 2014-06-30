package me.wener.wen.alogrithm.color.space;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.wener.wen.alogrithm.Checks;

/**
 * <h2>XYZ (Tristimulus) Reference values of a perfect reflecting diffuser</h2>
 * <table border="1" width="100%" bordercolordark="white" bordercolorlight="black" cellspacing="0">
 * <tbody><tr>
 * <td nowrap="">
 * <p align="right"><i>Observer</i></p>
 * </td>
 * <td colspan="3">
 * <p align="center">2° (CIE 1931)</p>
 * </td>
 * <td colspan="3">
 * <p align="center">10° (CIE 1964)</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><i>&nbsp;Illuminant</i></p>
 * </td>
 * <td>
 * <p align="center"><b>X</b><sub><b>2</b></sub></p>
 * </td>
 * <td>
 * <p align="center"><b>Y</b><sub><b>2</b></sub></p>
 * </td>
 * <td>
 * <p align="center"><b>Z</b><sub><b>2</b></sub></p>
 * </td>
 * <td>
 * <p align="center"><b>X</b><sub><b>10</b></sub></p>
 * </td>
 * <td>
 * <p align="center"><b>Y</b><sub><b>10</b></sub></p>
 * </td>
 * <td>
 * <p align="center"><b>Z</b><sub><b>10</b></sub></p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;A</b> (Incandescent)</p>
 * </td>
 * <td>
 * <p align="center">109.850</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">35.585</p>
 * </td>
 * <td>
 * <p align="center">111.144</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">35.200</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;C</b></p>
 * </td>
 * <td>
 * <p align="center">98.074</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">118.232</p>
 * </td>
 * <td>
 * <p align="center">97.285</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">116.145</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;D50</b></p>
 * </td>
 * <td>
 * <p align="center">96.422</p>
 * <iframe id="tmp_downloadhelper_iframe" style="display: none;"></iframe></td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">82.521</p>
 * </td>
 * <td>
 * <p align="center">96.720</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">81.427</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;D55</b></p>
 * </td>
 * <td>
 * <p align="center">95.682</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">92.149</p>
 * </td>
 * <td>
 * <p align="center">95.799</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">90.926</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;D65</b> (Daylight)</p>
 * </td>
 * <td>
 * <p align="center">95.047</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">108.883</p>
 * </td>
 * <td>
 * <p align="center">94.811</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">107.304</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;D75</b></p>
 * </td>
 * <td>
 * <p align="center">94.972</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">122.638</p>
 * </td>
 * <td>
 * <p align="center">&nbsp;94.416</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">120.641</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;F2</b> (Fluorescent)</p>
 * </td>
 * <td>
 * <p align="center">99.187</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">67.395</p>
 * </td>
 * <td>
 * <p align="center">103.280</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">69.026</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;F7</b></p>
 * </td>
 * <td>
 * <p align="center">95.044</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">108.755</p>
 * </td>
 * <td>
 * <p align="center">95.792</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">107.687</p>
 * </td>
 * </tr>
 * <tr>
 * <td nowrap="">
 * <p><b>&nbsp;F11</b></p>
 * </td>
 * <td>
 * <p align="center">100.966</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">64.370</p>
 * </td>
 * <td>
 * <p align="center">103.866</p>
 * </td>
 * <td>
 * <p align="center">100</p>
 * </td>
 * <td>
 * <p align="center">65.627</p>
 * </td>
 * </tr>
 * </tbody></table>
 */
@Getter
@EqualsAndHashCode
@ToString
public class XYZ implements Serializable
{
    private final double x;
    private final double y;
    private final double z;

    public XYZ(double x, double y, double z)
    {
        Checks.checkArgument(0 <= x && x <= 1, "0 <= X <= 100%");
        Checks.checkArgument(0 <= y && y <= 1, "0 <= Y <= 100%");
        Checks.checkArgument(0 <= z && z <= 1, "0 <= Z <= 100%");

        this.x = x;
        this.y = y;
        this.z = z;
    }

}
