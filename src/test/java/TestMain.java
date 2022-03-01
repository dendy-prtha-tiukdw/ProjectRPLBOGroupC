import org.groupa.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testFindMax() {
        int[] arr = {1, 3, 4, 2};
        assertEquals(4, Main.findMax(arr));
    }

}
