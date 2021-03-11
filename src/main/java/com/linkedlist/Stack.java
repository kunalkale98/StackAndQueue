package com.linkedlist;

public class Stack {
    public Node peak;

    public Stack(){
        this.peak = null;
    }

    public void add(Node newNode){
        if(this.peak == null){
            this.peak = newNode;
        }
        else{
            newNode.next = this.peak;
            this.peak = newNode;
        }
    }

    public void toPrint(){
        if(this.peak == null){
            System.out.println("Stack is empty");
        }
        else {
            Node current = peak;
            while (current != null) {
                System.out.println("->" + current.key);
                current = current.next;
            }
        }
    }

    public static <T> void main(String args[]){
        Node<Integer> first = new Node<>(70);
        Node<Integer> second = new Node<>(30);
        Node<Integer> third = new Node<>(56);
        Stack stack = new Stack();
        stack.add(first);
        stack.add(second);
        stack.add(third);
        stack.toPrint();
    }
}
