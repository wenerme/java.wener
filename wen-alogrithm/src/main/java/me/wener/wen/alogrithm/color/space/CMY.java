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
public class CMY implements Serializable
{
    private final double cyan;
    private final double magenta;
    private final double yellow;

    public CMY(double cyan, double magenta, double yellow)
    {
        Checks.checkArgument(0 <= cyan && cyan <= 1, "0 <= Cyan <= 100%");
        Checks.checkArgument(0 <= magenta && magenta <= 1, "0 <= Magenta <= 100%");
        Checks.checkArgument(0 <= yellow && yellow <= 1, "0 <= Yellow <= 100%");
        
        this.cyan = cyan;
        this.magenta = magenta;
        this.yellow = yellow;
    }

}
