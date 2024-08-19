package telran.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamTasks {
    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(arr.length))
                        .distinct()
                        .limit(arr.length)
                        .map(i -> arr[i])
                        .toArray();
    }
}