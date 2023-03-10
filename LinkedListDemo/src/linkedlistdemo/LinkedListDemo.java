
package linkedlistdemo;

import java.util.LinkedList;

/**
 *
 * @author Ashi
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        //create new linked list instance with integer type elements
        LinkedList<Integer> ll = new LinkedList<>();
// add elements
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);
//create another new linked list elements.
        LinkedList<Integer> ll1 = new LinkedList<>();
//descending iterator to reverse the order.
//adds each elements to new linked list instance
        ll.descendingIterator().forEachRemaining(ll1::add);

        System.out.println(ll1);
    }
}