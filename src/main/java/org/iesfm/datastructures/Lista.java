package org.iesfm.datastructures;

public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public int getAt(int index) {
        return 0;
    }

    public Integer last() {
        return null;
    }

    public void removeAtIndex(int index) {

    }

    public boolean contains(int number) {
        return false;
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
        if (head == null) {
            return 0;
        } else {
            int size = 0;
            Nodo nodo = head;
            while (nodo != null) {
                size++;
                nodo = nodo.getNext();
            }
            return size;
        }
    }
}
