package test.moneyTest;

import main.money.MoneyCalculateUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MoneyCalculateUtilTest {
    private MoneyCalculateUtil mcu = null;
    private int givenMoney;
    private Boolean expected;

    public MoneyCalculateUtilTest(int givenMoney , Boolean expected){
        this.givenMoney = givenMoney;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        mcu = new MoneyCalculateUtil();
        mcu.setPocket();
        mcu.initAccessable();
        mcu.setAccessable();

    }
    @Parameterized.Parameters
    public static Collection<Object[]>getData(){
        return Arrays.asList(new Object[][]{
                {1,true},
                {16,false},
                {13,true},
                {14,false},
                {35,false},
                {41,false},
                {53,true},
                {57,true},
                {75,true},
                {91,false},
                {103,false}
        });
    }
    @Test
    public void testMoneyCalculate(){
        assertEquals(this.expected , mcu.canTakeOut(givenMoney));
    }


}
