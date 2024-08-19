package telran.stream;

// import java.util.Arrays;
// import java.util.Random;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println();
        
//         new Random().ints(6, 1, 50).distinct().limit(6).forEach(n -> System.out.print(n + " "));
//     }
// }
public class Main {
    public static void main(String[] args) {
        int message = 560;
        int maska = 67;
        int codedMessage = message ^ maska;
        int receivedMesssage = codedMessage ^ maska;
        System.out.println("message = " + message);
        System.out.println("message = " + Integer.toBinaryString(message));
        System.out.println("codedMessage = " + codedMessage);
        System.out.println("codedMessage = " + Integer.toBinaryString(codedMessage));
        System.out.println("receivedMesssage = " + receivedMesssage);
        System.out.println("receivedMesssage = " + Integer.toBinaryString(receivedMesssage));
    }
}