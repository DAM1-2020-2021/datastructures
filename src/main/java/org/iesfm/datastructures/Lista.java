package org.iesfm.datastructures;

public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public void add(int value) {
        Nodo nodo = new Nodo(head, value);
        head = nodo;
    }

    public Integer head() {
        if (head != null) {
            return head.getValue();
        } else {
            return null;
        }
    }

    public int size() {
        if(head == null) {
            return 0;
        } else {
            int size = 0;
            Nodo nodo = head;
            while(nodo !=  null) {
                size++;
                nodo = nodo.getNext();
            }
            return size;
        }
    }
}
