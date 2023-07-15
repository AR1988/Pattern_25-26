package irerator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class Main {

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection(10);

        myCollection.add(0, 72);
        myCollection.add(3, 7);
        myCollection.add(6, 6);
        myCollection.add(8, 8);

        while (myCollection.hasNext()) {
            Integer element = myCollection.next();
            System.out.println(element);
        }

        List<Integer> integers = List.of(1, 2, 3);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
