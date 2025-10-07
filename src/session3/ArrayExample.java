package session3;

public class ArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] scores = {88, 92, 75, 100, 95};

//        // Accessing elements
//        System.out.println("The first score is: " +
//                scores[0]);
//        System.out.println("The last score is: " +
//                scores[scores.length - 1]);

        // Modifying an element
        scores[2] = 80; // Update the third score
        System.out.println("The updated third score is: " +
                scores[2]);

//         Iterating through an array
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        System.out.println("The average score is: " +
                average);
    }
}
