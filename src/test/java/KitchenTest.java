import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;


public class KitchenTest extends TestCase {
    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        //concept is to have 3 variables, an empty one, single input, and many inputs (more than 2)
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("flour");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("flour");
        kitchenWithMany.add("corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty(){
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
    }

    @Test
    public void testAdd() {
        //checking its empty
        assertTrue(emptyKitchen.isEmpty());
        //adding one
        emptyKitchen.add("white corn");
        //checking that it is added
        assertFalse(emptyKitchen.isEmpty());
        assertEquals(1, emptyKitchen.size());
    }

    @Test
    public void testPop() {
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());
        assertTrue(kitchenWithOne.isEmpty());

        kitchenWithMany.pop();
        kitchenWithMany.pop();
        assertEquals(1, kitchenWithMany.size());

        kitchenWithMany.printAll();
    }

    @Test
    public void testContains() {
        assertFalse(emptyKitchen.contains("blue corn"));
        assertTrue(kitchenWithOne.contains("flour"));
        assertTrue(kitchenWithMany.contains("flour"));
    }
}