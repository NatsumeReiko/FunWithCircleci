package amy.com.funwithcircleci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class UnitTestTargetTest {
    @Test
    public void return10_001() throws Exception {
        assertEquals("10", UnitTestTarget.return10(""));
    }
    @Test
    public void return10_002_fail() throws Exception {
        assertEquals("5", UnitTestTarget.return10(""));
    }

    @Test
    public void return10_003() throws Exception {
        assertEquals("10", UnitTestTarget.return10("10"));
    }
}