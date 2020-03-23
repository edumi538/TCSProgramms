/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass;

import java.util.Iterator;

/**
 *
 * @author Eduardo
 */
public class Collection implements Iterator {

    Piloto[] array = null;
    int pos = 0;

    public Collection(Piloto[] array) throws Exception {
        if(array == null) throw new Exception("Coleção não enviada");
        this.array = array;
        pos=0;
    }
    @Override
    public boolean hasNext() {
        if(pos == array.length) return false;
        return true;
    }
    @Override
    public Object next() {
        return array[pos++];
    }

}
