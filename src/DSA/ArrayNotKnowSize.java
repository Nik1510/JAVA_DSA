package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNotKnowSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
    ArrayList<Integer> list = new ArrayList<>(5);
//    list.add(57);
//    list.add(234);
//    list.add(654);
//    list.add(43);
//    list.add(87654);
//        System.out.println(list);
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here , list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
