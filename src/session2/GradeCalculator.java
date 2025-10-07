package session2;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        char grade;

        if (score > 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else {
            grade = 'c';
        }

        System.out.println("your score is" + score + "and you grade is" + grade);
    }
}
