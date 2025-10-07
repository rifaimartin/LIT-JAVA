package session3;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 82);
        studentGrades.put("Charlie", 88);
        studentGrades.clear();

        HashMap<String, Integer> studentGrades2 = new HashMap<>();
        studentGrades.put("Alice2", 95);
        studentGrades.put("Bob3", 82);
        studentGrades.put("Charlie4", 88);

        System.out.println(studentGrades.clone());

//        studentGrades.merge("Bob","88",studentGrades2.get("Alice2") );

//        // Iterate over the map
//        System.out.println("\nAll student grades:");
//        for (String name : studentGrades.keySet()) {
//            System.out.println(name + ": " +
//                    studentGrades.get(name));
//        }
    }
}
