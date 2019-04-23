import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * @author Howie Lu
 * @version Created at 2019/04/18
 */
public class TestBackPack {

    @Test
    public void testBackPack(){
        int m= 10;
        int n = 3;
        int c[][] = BackPack.BackPack_Solution(m, n, new int[]{3, 4, 5}, new int[]{4, 5, 6});
        assertEquals(11, c[n][m]);
    }
}
