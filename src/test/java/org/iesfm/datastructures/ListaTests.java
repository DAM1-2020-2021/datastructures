package org.iesfm.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class ListaTests {

    @Test
    public void addTest() {
        Lista lista = new Lista();
        lista.add(3);
        lista.add(4);

        Assert.assertEquals(4, (int) lista.head());
    }
}
