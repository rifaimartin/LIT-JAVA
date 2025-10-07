package session2;

public class WhileLoopExample {
    public static void main(String[] args) {

        int doWhileCount = 6;
        System.out.println("\nDo-while loop:");
        do {
            System.out.println("Do-while count is: " + doWhileCount);
            doWhileCount++;
        } while (doWhileCount <= 10); // Condition is false, but loop runs once
    }
}
