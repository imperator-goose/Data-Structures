package net.ruslan.data_structures.Stack;

public class Stack<T>{
    Node<T> head;
    public T peek(){
        return head.value;
    }
    public T pop(){
        T value = head.value;
        head = head.next;
        return value;
    }
    public void push(T t){
        Node<T> node = new Node<>(t);
        node.next = head;
        head = node;
    }


    public static class Node<T>{
        private final T value;
        private Node<T> next;
        public Node(T value) {
            this.value = value;
        }
    }
}
