/**
 * ===============================================================
 * SERVICE CLASS – PalindromeService
 * ===============================================================
 *
 * Description:
 * This class acts as a service layer that delegates palindrome
 * validation to a chosen PalindromeStrategy implementation.
 *
 * The service uses the Strategy Design Pattern:
 *  - A PalindromeStrategy is injected at runtime.
 *  - The strategy can be swapped dynamically using setStrategy().
 *  - The check() method simply forwards the request to the
 *    currently active strategy.
 *
 * Key OOP Concepts:
 *  - Encapsulation: The service hides the algorithm details and
 *    exposes only a clean check() method.
 *  - Strategy Pattern: Different palindrome algorithms can be
 *    plugged in without modifying this class.
 *  - Single Responsibility Principle (SRP): This class manages
 *    strategy delegation only, not the algorithm itself.
 *
 * Usage:
 *  PalindromeService service = new PalindromeService(new StackStrategy());
 *  boolean result = service.check("racecar");
 *
 * @author Developer
 * @version 12.0
 */
public class PalindromeService {
    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy; // inject at runtime
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy; // swap at runtime
    }

    public boolean check(String s) {
        return strategy != null && strategy.isPalindrome(s);
    }
}