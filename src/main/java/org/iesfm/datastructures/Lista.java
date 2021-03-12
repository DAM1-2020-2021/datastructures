package org.iesfm.datastructures;

public class Lista {

    // Nodo(1, Nodo(2, Nodo(3, Nodo(4, null))))

    private Nodo head;

    public Lista() {
        head = null;
    }

    /**
     * Elimina todos los elementos de la lista
     */
    public void clear() {
        head = null;
    }

    public int getAt(int index) {
        return 0;
    }

    public Integer last() {
        return head.last();
    }

    public void removeAtIndex(int index) {

    }

    public boolean contains(int number) {
        return false;
    }

    public void add(int value) {
        if(head == null) {
            head = new Nodo(value);
        } else {
            head.add(value);
        }

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
