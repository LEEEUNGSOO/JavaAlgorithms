package com.multi.basic.linkedlist;

public class DoubleLinkedList {
    class Node{
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }//constructor
    }//innerClass Node
    private Node head;//리스트의 시작노드
    private Node tail;//리스트의 마지막노드

    //생성자
    public DoubleLinkedList() {
        head = null;
        tail = null;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail= newNode;// head가 null이란 첫번째노드이며 첫번째 노드란 (head|taile)동시발생
        }else{//두번째 노드부터
            tail.next = newNode;//newNode는 tailNode안에 next에 다음 노드로 들어간다
            newNode.prev = tail;
            tail = newNode;

        }//else
    }//addLast

    public void printList(){
        Node current = head;
        System.out.println("LIST");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
    // 4. 삭제(Delete) - 특정 값 제거
    public void delete(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                if (current == head) { // 삭제할 노드가 head인 경우
                    head = current.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) { // 삭제할 노드가 tail인 경우
                    tail = current.prev;
                    if (tail != null) tail.next = null;
                } else { // 중간 노드인 경우
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("노드 " + value + "가 삭제되었습니다.");
                return;
            }
            current = current.next;
        }
        System.out.println("노드 " + value + "를 찾을 수 없습니다.");
    }
    public void update(int oldValue, int newValue) {
        Node current = head;
        while (current != null) {
            if(current.data == oldValue){//10 ,10
                current.data = newValue;
                System.out.println("oldValue="+oldValue +"로 "+ newValue+"변경되었습니다");
                return;
            }//if
            current = current.next;
        }//while
        System.out.println("노드 " + oldValue + "를 찾을 수 없습니다.");
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.printList();
        list.delete(20);
        list.printList();
        list.update(40,300);
        list.printList();
    }





}
