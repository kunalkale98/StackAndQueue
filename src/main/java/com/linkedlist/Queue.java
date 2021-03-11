package com.linkedlist;

public class Queue {
    public Node front;
    public Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Node newNode){
        if(this.front == null && this.rear == null){
            this.front = newNode;
            this.rear = newNode;
        }
        else{
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    public boolean isEmpty(){
        return this.front == null;
    }

    public void top(){
        if(!isEmpty()){
            System.out.println("Top is "+this.front.key);
        }
    }

    public void dequeue(){
        if(this.front ==  null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Removed "+this.front.key);
            this.front = this.front.next;
        }
    }

    public void toPrint(){
        if(this.front == null){
            System.out.println("Stack is empty");
        }
        else {
            Node current = this.front;
            while (current != null) {
                System.out.println("->" + current.key);
                current = current.next;
            }
        }
    }

    public static <T> void main(String args[]){
        Node<Integer> first = new Node<>(56);
        Node<Integer> second = new Node<>(30);
        Node<Integer> third = new Node<>(70);
        Queue queue = new Queue();
        queue.enqueue(first);
        queue.enqueue(second);
        queue.enqueue(third);
        queue.toPrint();
        queue.top();
        queue.dequeue();
        queue.toPrint();
    }
}
