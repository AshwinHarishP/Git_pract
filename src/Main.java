import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ourGenericList<Integer> list = new ourGenericList<>();
        list.add(5);
        list.add(6);
        list.add(7);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}