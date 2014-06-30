package me.wener.wen.alogrithm.color;

import me.wener.wen.alogrithm.color.space.ARGB;
import org.junit.Test;

public class TestConvert
{
    public void test()
    {

    }

    @Test
    public void testEquals()
    {
        assert !new ARGB(4, 1, 2, 3).equals(new ARGB(4, 3, 2, 1));
        assert new ARGB(4, 1, 2, 3).equals(new ARGB(4, 1, 2, 3));
    }
}
