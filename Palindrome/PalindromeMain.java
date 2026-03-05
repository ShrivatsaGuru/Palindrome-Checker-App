
/**
 * ===============================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 *  - Defines a common PalindromeStrategy interface
 *  - Implements a concrete Stack based strategy
 *  - Injects the strategy at runtime
 *  - Executes the selected algorithm
 *
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 *
 * The goal is to teach extensible algorithm design.
 *
 * @author Developer
 * @version 12.0
 */
import java.util.*;
public class PalindromeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        // Choose strategy at runtime: pass "stack" or "deque"
        PalindromeStrategy strategy = (args.length > 0 && args[0].equalsIgnoreCase("stack"))
                ? new StackStrategy()
                : new DequeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        System.out.println("Using: " + strategy.getClass().getSimpleName());
        System.out.println(service.check(text) ? "Palindrome" : "Not Palindrome");

        // Demonstrate hot-swapping the strategy at runtime
        service.setStrategy(new DequeStrategy());
        System.out.println("Switched to Deque -> " + (service.check(text) ? "Palindrome" : "Not Palindrome"));
    }
}