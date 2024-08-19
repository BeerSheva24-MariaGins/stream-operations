package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StreamTasksTest {
    @Test
    void shuffleTest() {
        int[] original = {1, 2, 8, 4, 5, 9};
        int[] shuffled = StreamTasks.shuffle(original.clone());
        
        // Вывод массива shuffled на консоль
        System.out.println(Arrays.toString(shuffled));
        
        // Проверка, что длина массивов совпадает
        assertEquals(original.length, shuffled.length);
        
        // Проверка, что массивы содержат одни и те же элементы
        Arrays.sort(original);
        Arrays.sort(shuffled);
        assertArrayEquals(original, shuffled);
    }
}