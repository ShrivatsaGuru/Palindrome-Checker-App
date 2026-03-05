/**
 * ===============================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 *  - Uses a palindrome strategy implementation
 *  - Captures execution start and end time
 *  - Calculates total execution duration
 *  - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
import java.util.Scanner;

public class PalindromeMain {

    // Measure elapsed time in nanoseconds for a single check
    private static long timeCheck(PalindromeService service, String text) {
        long start = System.nanoTime();
        boolean result = service.check(text);
        long end = System.nanoTime();
        // Ensure the result is used (could print if you like)
        // System.out.println("Result: " + result);
        return end - start;
    }

    // Optional normalization so both strategies behave logically equal
    private static String normalize(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter text to check (blank line to exit):");

            while (true) {
                System.out.print("> ");
                String raw = sc.nextLine();
                if (raw == null || raw.trim().isEmpty()) break;

                String text = normalize(raw); // comment this line if you want exact matching

                // Prepare services with each strategy
                PalindromeService stackSvc = new PalindromeService(new StackStrategy());
                PalindromeService dequeSvc = new PalindromeService(new DequeStrategy());

                // Warm-up to reduce JIT noise
                for (int i = 0; i < 5; i++) {
                    stackSvc.check(text);
                    dequeSvc.check(text);
                }

                // Timed checks
                long tStack = timeCheck(stackSvc, text);
                long tDeque = timeCheck(dequeSvc, text);

                // Compute results to display correctness (optional but helpful)
                boolean resStack = new StackStrategy().isPalindrome(text);
                boolean resDeque = new DequeStrategy().isPalindrome(text);

                System.out.println("\nInput : \"" + raw + "\"");
                System.out.println("Normalized: \"" + text + "\"");
                System.out.println("Result (Stack) : " + resStack + " | Time: " + tStack + " ns");
                System.out.println("Result (Deque) : " + resDeque + " | Time: " + tDeque + " ns");
                System.out.println("Faster: " + (tStack < tDeque ? "StackStrategy" :
                                                 tDeque < tStack ? "DequeStrategy" : "Tie"));
            }
        }
    }
}