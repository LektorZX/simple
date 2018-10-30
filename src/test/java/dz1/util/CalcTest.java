package dz1.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    private Calc calc=new Calc();

    @Test
    public void add() {
        int a=5;
        int b=7;
        int res=calc.add(5,7 );
        int respectres=12;
        Assert.assertEquals(respectres,res );

    }
}