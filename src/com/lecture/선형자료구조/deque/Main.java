package com.lecture.선형자료구조.deque;

import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);


        System.out.println(deque.pollLast());
        deque.remove();
        deque.remove();
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.removeLast());
    }
}
