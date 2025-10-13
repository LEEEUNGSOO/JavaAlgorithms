package com.multi.basic.multirow;

import java.util.Random;

//8방탐색
public class OmokAlgorithm {
    public static void main(String[] args) {
        int[][] deltas = {
                { -1, 0 },  // 상: 행 -1, 열 변화 없음
                { 1, 0 },   // 하: 행 +1, 열 변화 없음
                { 0, -1 },  // 좌: 행 변화 없음, 열 -1
                { 0, 1 },   // 우: 행 변화 없음, 열 +1
                { -1, -1 }, // 좌상 대각선: 행 -1, 열 -1
                { -1, 1 },  // 우상 대각선: 행 -1, 열 +1
                { 1, -1 },  // 좌하 대각선: 행 +1, 열 -1
                { 1, 1 }    // 우하 대각선: 행 +1, 열 +1
        };//deltas
        //15행15열
        final int ROW=5,COL=5;
        char[][] grid =new char[ROW][COL];
        Random random=new Random();

        // 오목판을 랜덤으로 흑돌('O'), 백돌('X'), 빈칸(' ')으로 채우기
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int rnadomValue=random.nextInt(3);//0 , 1, 2
                if(rnadomValue==0) {
                    grid[r][c]='O';//흑돌
                }else if(rnadomValue==1) {
                    grid[r][c]='X';//백돌
                }else {
                    grid[r][c]=' ';
                }//else
            }//내부For
        }//외부 For
        boolean win=false;
        //오목판의 모든 위치를 순회 (15*15)
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                //현재 위치가 흑돌 또는 백돌 일때
                if(grid[r][c]=='O'||grid[r][c]=='X') {
                    char stone=grid[r][c];// X 또는 O
                    //stone값을 가지고 8방탐색 진행합니다
                    for(int d=0;d<deltas.length;d++){
                        int count=1;
                        int nr=r+deltas[d][0];//다음 행
                        int nc=c+deltas[d][1];//다음 열
                        while(nr>=0&& nr<grid.length&& nc>=0 && nc<grid[0].length&& grid[nr][nc]==stone ){
                            count++;
                            if(count==5){
                                win=true;
                                System.out.println("이긴 돌 "+ stone);
                                break;
                            }//if
                            nr+=deltas[d][0];
                            nc+=deltas[d][1];
                        }//while End
                        if(win)break;
                    }//델타 For End

                }
                if(win)break;
            }//내주 for
            if(win)break;
        }//외부 for
        // 결과 출력
        if(win) {
            System.out.println("5 stones connected! Omok victory!"); // 승리 조건 충족 메시지 출력
        } else {
            System.out.println("No winning condition found."); // 승리 조건 미충족 메시지 출력
        }


        //오목판을 출력
        System.out.println("OmokBoard");
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }

    }//main
}
