package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * Created by bigbilii on 17-3-9.
 */
public class MyQueue {
    List queue;
    /* Initialize your data structure here. */
    public MyQueue() {
        queue = new ArrayList();
    }

    /* Push element x to the back of queue. */
    public void push(int x) {
        queue.add(x);
    }

    /* Removes the element from in front of queue and returns that element. */
    public int pop() {
        int a = (int)queue.get(0);
        queue.remove(0);
        return a;
    }

    /* Get the front element. */
    public int peek() {
        return (int)queue.get(0);
    }

    /* Returns whether the queue is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }


}
