import java.util.Iterator;

public class ourGenericList<T> implements Iterable<T>{
    public T[] items;
    public int size;
    //constructor
    public ourGenericList(){
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
        /*
        returns a new instance of the OurGenericListIterator class. Here’s what happens in detail:
this refers to the current instance of the OurGenericList class.
new OurGenericListIterator(this) creates a new iterator object (OurGenericListIterator)
that is initialized with a reference to the current list (this).
In summary, this line of code returns an iterator that is capable
of iterating over the elements stored in the OurGenericList instance
from the beginning (index = 0).
This iterator can then be used to sequentially access each element in the list.*/
    }



    private class OurGenericListIterator implements Iterator<T>{
        private ourGenericList<T> list;
        private int index = 0;

        //constructor for OurGenericListIterator

        public OurGenericListIterator(ourGenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;

        }

        @Override
        public T next() {
            //int item = list.items[index];
            //index++;
            //return item;
            return list.items[index++];
        }
    }

}
