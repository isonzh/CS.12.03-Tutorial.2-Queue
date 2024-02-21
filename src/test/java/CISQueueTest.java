import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CISQueueTest<T> {

    private CISQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new CISQueue<>(80);
    }

    @AfterEach
    void tearDown() {
        queue = null;
    }

    @Test
    void isEmpty() {

        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());

    }

    @Test
    void size() {

        assertEquals(1, queue.size());
        queue.dequeue();
        assertEquals(0, queue.size());
        queue.enqueue(80);
        assertEquals(1, queue.size());

    }

    @Test
    void dequeue() {

        assertEquals(1, queue.size());
        assertEquals("80 -> null", queue.toString());
        queue.dequeue();
        assertEquals(0, queue.size());
        assertEquals(" -> null", queue.toString());

    }

    @Test
    void enqueue() {

        assertEquals(1, queue.size());
        assertEquals("80 -> null", queue.toString());
        queue.enqueue(90);
        assertEquals(2, queue.size());
        assertEquals("80 -> 90 -> null", queue.toString());
        queue.enqueue(100);
        assertEquals(3, queue.size());
        assertEquals("80 -> 90 -> 100 -> null", queue.toString());

    }

}