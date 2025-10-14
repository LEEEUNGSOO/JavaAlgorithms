package com.multi.basic.search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
   //static InnerClass
    static class PhyscData{
         private String name;//내부 클래스의 instance변수
        private int height; // 키
        private double vision; // 시력
       //--- 생성자: 이름, 키, 시력을 초기화 ---//
       public PhyscData(String name, int height, double vision) {
           this.name = name; // 이름 초기화
           this.height = height; // 키 초기화
           this.vision = vision; // 시력 초기화
       }
       //--- 객체 정보를 문자열로 변환하여 반환 ---//
       public String toString() {
           return name + " " + height + " " + vision; // "이름 키 시력" 형식의 문자열 반환
       }
       //--- 키의 오름차순으로 정렬하기 위한 Comparator 정의 ---//
       public static final Comparator<PhyscData> HEIGHT_ORDER =new HeightOrderComparator();
       private static class HeightOrderComparator implements Comparator<PhyscData> {
           @Override
           public int compare(PhyscData o1, PhyscData o2) {
               return Integer.compare(o1.height, o2.height);
           }
       }

   }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        //--- 신체검사 데이터 배열 초기화 ---//
        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3), // 이름, 키, 시력을 가진 객체 생성
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("박준서", 175, 2.0),
        };

        //--- 배열을 키(height) 기준으로 오름차순 정렬 ---//
        Arrays.sort(x, PhyscData.HEIGHT_ORDER); // Comparator를 사용하여 정렬

        //--- 검색 가능한 키의 범위를 출력 ---//
        System.out.println("검색 가능한 키의 범위는 " +
                x[0].height + "cm ~ " + x[x.length - 1].height + "cm 입니다.");

        System.out.print("키가 몇 cm인 사람을 찾고 있나요?: "); // 사용자로부터 키 입력 요청

        try {
            int height = stdIn.nextInt(); // 사용자로부터 입력받은 키 값을 정수로 저장

            //--- binarySearch를 사용하여 키 값이 일치하는 데이터를 검색 ---//
            int idx = Arrays.binarySearch(
                    x, // 검색 대상 배열
                    new PhyscData("", height, 0.0), // 검색 키를 가진 임시 객체 (이름과 시력은 무관)
                    PhyscData.HEIGHT_ORDER // 키 비교를 위한 Comparator
            );

            //--- 검색 결과에 따른 출력 ---//
            if (idx < 0) // 검색 실패: 결과가 음수면 해당 키를 가진 데이터가 없음
                System.out.println("그 값의 요소가 없습니다.");
            else { // 검색 성공: 해당 위치와 데이터 출력
                System.out.println("그 값은 x[" + idx + "]에 있습니다."); // 배열 인덱스 출력
                System.out.println("찾은 데이터: " + x[idx]); // 검색된 데이터 출력
            }
        } catch (Exception e) { // 예외 처리: 입력 오류 등 발생 시 실행
            System.out.println("유효하지 않은 입력입니다. 숫자를 입력해주세요."); // 오류 메시지 출력
        } finally {
            stdIn.close(); // Scanner 객체를 닫아 리소스 해제
        }
    }
}
