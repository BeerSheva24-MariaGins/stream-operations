package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StreamTasksTest {
    @Test
    void shuffleTest() {
        int[] original = {1, 11, 8, 4, 5, 9};
        int[] shuffled = StreamTasks.shuffle(original.clone());
        
        System.out.println(Arrays.toString(shuffled));        
        
        assertEquals(original.length, shuffled.length);
       
        Arrays.sort(original);
        Arrays.sort(shuffled);
        assertArrayEquals(original, shuffled);
    }
}