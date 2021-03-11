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

    public boolean isEmpty(){
        return this.peak == null;
    }

    public <T> T peak(){
        if(!isEmpty()){
            return (T) this.peak.key;
        }
        else{
            System.out.println("Stack is empty");
            return null;
        }
    }

    public <T> void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            T pop = peak();
            System.out.println("Popped "+pop);
            peak = peak.next;
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
        T top = stack.peak();
        System.out.println("Top is "+top);
        stack.pop();
        stack.toPrint();
    }
}
