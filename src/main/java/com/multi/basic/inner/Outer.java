package com.multi.basic.inner;

import java.awt.*;

//innerClass
//innerClass의 목적은 접근 제한자와 무관하게 접근하게 
public class Outer {
    private String outerFiled;
    private static  int outerStatic;
     public Outer(){
         System.out.println("  public Outer() 외부생성자");
     }
      static class Inner{
        static int show;
         //Inner
         public Inner(){
             System.out.println(" Inner() 내부생성자");
             //outerFiled="hi"; 내부에서 외부로 접근가능
             //outerFiled (staticInnerClass인 경우는  외부클래스 생성없이 만들어지는 class가 staticInnerClass
             outerStatic++;//staticInnerClass는 외부의 static속성만 접근가능
         }
    }

    public static void main(String[] args) {
        // Outer outer = new Outer();//외부
        //Inner inner=new Inner();
        //Outer.Inner inner=new Outer().new Inner();
         Outer.Inner inner=new Outer.Inner();

    }
}
