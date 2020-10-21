import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class CodeupCryptTest {

    @Test
    public void testIfVersionWorks(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.0;
        assertEquals(1.0, CodeupCrypt.version, 0);
        assertNotEquals(0.0, CodeupCrypt.version, 0);
    }

    @Test
    public void testIfHashPasswordWorks(){
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
        assertEquals("123", CodeupCrypt.hashPassword("123"));
        assertEquals("124", CodeupCrypt.hashPassword("12a"));
    }

    @Test
    public void testIfCheckPasswordWorks(){
        assertTrue(CodeupCrypt.checkPassword("asv", "4sv"));
        assertFalse(CodeupCrypt.checkPassword("aev", "4sv"));
        assertFalse(CodeupCrypt.checkPassword("auv", "4sv"));
    }
}
