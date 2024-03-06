package ui;
import collections.*;

public class Main {

    public static void main(String[] args) {

        LinkList<Integer> l = new LinkList<>();

        l.add(1);
        l.add(2);

        System.out.println(l.contains(2));
        System.out.println(l.contains(5));

        System.out.println(l.toString());
        System.out.println(l.delete(2));
        System.out.println(l.delete(5));
        System.out.println(l.toString());

    }


    
}
