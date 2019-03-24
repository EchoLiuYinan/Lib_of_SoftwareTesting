package test;

import main.PrintPrimes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrintPrimesTest {
    private int inputNum;
    private String expected;
    private PrintPrimes pp = null;
    private PrintStream console = null;
    private ByteArrayOutputStream bytes = null;

    public PrintPrimesTest(int input , String expected)
    {
        this.inputNum = input;
        this.expected = expected;
    }

    @Before
    public void setUp()
    {
        pp = new PrintPrimes();
        bytes = new ByteArrayOutputStream();
        console = System.out;

        System.setOut(new PrintStream(bytes));
    }

    @Parameters
    public static Collection<Object[]>getData()
    {
        return Arrays.asList(new Object[][]
        {
            {1 , "Prime: 2\r\n"},
            {3 , "Prime: 2\r\nPrime: 3\r\nPrime: 5\r\n"},
            {5 , "Prime: 2\r\nPrime: 3\r\nPrime: 5\r\n"+"Prime: 7\r\nPrime: 11\r\n"}
        });
    }
    @After
    public void tearDown()
    {
        System.setOut(console);
    }

    @Test
    public void testResult()
    {
        pp.printPrimes(this.inputNum);
        assertEquals(this.expected , bytes.toString() );
    }



}
