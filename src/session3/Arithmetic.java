package session3;

import java.util.ArrayList;
import java.util.Collections;

public class Arithmetic {
    public static void main(String[] args) {
//        int result = 1 + 2 * 3  ;
//        System.out.println("result" + result);

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("LIT FULLSTACK");
        shoppingList.add("Mathilda");
        shoppingList.add("Product Kopi : 10.000");
        shoppingList.add("Matilda");
        shoppingList.add("Kelly");
        shoppingList.add("Sandra");
        shoppingList.add("Total Jumlah : ");
        shoppingList.add("become  fullstack & QA developer ") ;
        shoppingList.add(1, "Amara");
        shoppingList.remove("Sandra");
//        shoppingList.addLast("Mas Ragil");


        ;
//        Collections.sort(shoppingList);

        System.out.println(shoppingList.getLast());


//        boolean isActive = true;
//        boolean isHuman = true;
//        boolean canLogin = true;
//
//        if (isActive && isHuman || !canLogin ) {
//            System.out.println("Terpenuhi");
//        } else {
//            System.out.println("Tidak terpenuhi");
//        }
    }
}
