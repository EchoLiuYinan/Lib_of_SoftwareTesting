import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBackPack {

    @Test
    public void testBackPack(){
        int m= 10;
        int n = 3;
        int c[][] = BackPack.BackPack_Solution(m, n, new int[]{3, 4, 5}, new int[]{4, 5, 6});
        assertEquals(11, c[n][m]);
    }
}
