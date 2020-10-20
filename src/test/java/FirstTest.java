import org.junit.Test;
import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Hello";
        String actual = "Hello";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Device phone = new Device();
        Device laptop = null;

        assertNull(laptop);
        assertNotNull(phone);
    }

    @Test
    public void testIfTheDeviceNameIsPossible(){
        Device myPhone = new Device("Galaxy 10");

        assertEquals("Galaxy 10", myPhone.getName());
    }
}
