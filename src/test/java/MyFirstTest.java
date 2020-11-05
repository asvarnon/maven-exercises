import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyFirstTest {

    private ArrayList<Device> devices;

    @Before
    public void setUp(){
        this.devices = new ArrayList<>();
        this.devices.add(new Device("Galaxy 10"));
        this.devices.add(new Device("Pixel 5"));
        this.devices.add(null);
    }

    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Codeup";
        String actual = "Codeup";

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
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        int[] reverseNumbers = {3, 2, 1};
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
//        char[] expected = {'J','u','n','i','t'};
//        char[] actual = "Junit".toCharArray();

        assertArrayEquals(numbers, otherNumbers);
        assertFalse(Arrays.equals(numbers, reverseNumbers));
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertTrue("4 is greater than 3", 3 < 4);
        assertFalse("5 is not greater than 6", 5 > 6);
        assertFalse("5 is not greater than 5", 5 > 5);
    }

    @Test
    public void testIfInstanceIsNull() {
        Device laptop = null;

        assertNull(this.devices.get(2));
        assertNotNull(this.devices.get(0));
    }

    @Test
    public void testIfTheDeviceNameIsPossible(){
        assertEquals("Galaxy 10", this.devices.get(0).getName());
        assertNull(this.devices.get(2));
    }

    @Test
    public void testIfArraySame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfStringContainsLetter(){
        String language = "PHP";

        assertTrue("Languages contains this letter",language.contains("H"));
        assertFalse("Language does not contain this letter",language.contains("J"));
    }

}
