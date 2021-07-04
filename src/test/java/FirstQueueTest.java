import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FirstQueueTest {

    @Test
    public void testIsEmpty(){
        FirstQueue queue = new FirstQueue();
        assertTrue(queue.isEmpty());
        queue.add("Arne");
        assertFalse(queue.isEmpty());
        queue.showFirst();
        assertFalse(queue.isEmpty());
        queue.showLast();
        assertFalse(queue.isEmpty());
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testAdd(){
        FirstQueue queue = new FirstQueue();
        FirstQueue queue1 = new FirstQueue();
        queue1.add("A");
        queue.add("A");
        assertFalse(queue.isEmpty());
        assertTrue(queue.showFirst().equals(queue1.showFirst()));
        //Exceptions implementieren und test 3-4 Stück z.B. nullPointer Exception bei add-Versuch


    }



    @Test
    public void testShowFirst(){
        FirstQueue queue = new FirstQueue();
        String s = "Hallo";
        queue.add("Hallo");
        assertEquals(queue.showFirst(),s);

    }
    @Test
    public void testNullPointer(){
        FirstQueue queue = new FirstQueue();
        assertThrows(IllegalArgumentException.class, () -> queue.add(null));
    }

    @Test
    public void testShowFirstEmpty(){
        FirstQueue queue = new FirstQueue();
        assertThrows(IllegalArgumentException.class,() -> queue.showFirst());
        }

    @Test
    public void testShowLastEmpty(){
        FirstQueue queue = new FirstQueue();
        assertThrows(IllegalArgumentException.class,() -> queue.showLast());
    }
    @Test
    public void testRemove () {
        FirstQueue queue = new FirstQueue();
        queue.add(null);
        queue.remove();

        assertThrows(IllegalArgumentException.class,() -> queue.remove());
    }

    }




