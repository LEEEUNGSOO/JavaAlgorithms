package com.multi.basic;

public class ArrayStack {
    private int[] stack; // 스택 저장소
    private int top; // 스택의 가장 위를 나타내는 인덱스
    private int capacity; // 스택 용량

    //생성자로 배열의 크기와 top포인터를 -1로 설정합니다
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int value) {
      if(top==capacity-1){//Full
          System.out.println("Stack is full");
          return;
      } //if
      stack[++top]=value;//
    }
    // Pop 연산
    public int pop() {
        if (isEmpty()) { // 스택이 비어 있는 경우
            System.out.println("Stack underflow");
            return -1; // 에러 값 반환
        }
        return stack[top--]; // 값을 반환한 후 top 감소
    }
    public boolean isEmpty() {
        return top==-1;
    }
    //현재 currentPoint 값 만 반환...
    public int peek() {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top];//현재 top값을 반환
    }



    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);//[][][][][]
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        System.out.println("peek="+stack.peek());
//        System.out.println("peek="+stack.peek());
//        System.out.println("pop="+stack.pop());
//        System.out.println("peek="+stack.peek());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Pop on empty stack: " + stack.pop()); // 스택 비었을 때



    }

}
