package org.iesfm.datastructures;

public class Main {

    public static void main(String[] args) {
        Lista l = new Lista();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        int res = l.last();
        System.out.println(res);
    }
}
