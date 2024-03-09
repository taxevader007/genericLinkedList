package ui;
import model.*;

public class Main {


    public static void main(String[] args) {
        Set<Integer> set1 = new Set<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new Set<>();
        set2.add(2);
        set2.add(3);
        Set<Integer> unionSet = set1.union(set2);
        System.out.println(unionSet.contains(1)); // true
        System.out.println(unionSet.contains(2)); // true
        System.out.println(unionSet.contains(3)); // true

        Set<Integer> set3 = new Set<>();
        System.out.println(set3.contains(1)); // false
        set3.add(1);
        System.out.println(set3.contains(1)); // true
        set3.remove(1);
        System.out.println(set3.contains(1)); // false


    }


    
}
