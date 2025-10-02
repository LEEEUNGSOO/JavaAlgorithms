package com.multi.basic.multirow;

import java.util.Arrays;

public class FourWaySearch {


    public static void main(String[] args) {
        //델타 배열정의 상 하 좌 우
        int [][]deltas={
                {-1,0},// 위로이동 좌우 변화없음
                {1,0},// 아래로이동 좌우 변화없음
                {0,-1},//상하 변화없음 , 좌로이동
                {0,1}//상하 변화없음 ,오른쪽으로 이동
        };
        // 4x4 문자형 이차원 배열 grid 정의
        char[][] grid = {
                { '2', '3', '1', '4' },
                { '1', 'X', '3', '2' },
                { '3', '4', 'X', 'X' },
                { 'X', '4', '1', '5' }
        };
        int sum=0;
        for(char[] c:grid){
            System.out.println(Arrays.toString(c));
        }//4*4행 원본 배열 출력
        //4행 4열을 순회해서 x츨 찾고 x에 4방에 숫자를 더하고 x를 0으로 치환

//        int [][]deltas={
//                {-1,0},// 위로이동 좌우 변화없음
//                {1,0},// 아래로이동 좌우 변화없음
//                {0,-1},//상하 변화없음 , 좌로이동
//                {0,1}//상하 변화없음 ,오른쪽으로 이동
//        };

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c <grid[r].length ; c++) {
                if(grid[r][c]=='X'){// x를 1행 1열 기준으로
                    //x를 찾았으면 x를 기준으로 변화량을 체크
                    for (int d = 0; d <deltas.length ; d++) {//deltas배령의 행 길이만큼
                        int nr=r+deltas[d][0];//nr==0,nc=1 (3),
                        int nc=c+deltas[d][1];
                        if(nr>=0&& nr<grid.length&& nc>=0&&nc< grid.length&& grid[nr][nc]!='X'){
                            sum+=grid[nr][nc]-'0';
                            grid[nr][nc]='0';
                        }
                    }//deltasFor
                }//if
            }//for
        }//for

        System.out.println("---------------------------------------------");
        for(char c[]:grid) {
            System.out.println(Arrays.toString(c));
        }
        System.out.println(sum);

    }
}
