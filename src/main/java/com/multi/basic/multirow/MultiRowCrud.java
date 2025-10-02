package com.multi.basic.multirow;

public class MultiRowCrud {
    int [][]m=new int [2][3];//
    int row=0,col=-1;//현재위치의 row와 col을 초기화
    public void add(int data){
        if(isFull()){//행이끝이고 열이 끝이니?
            increment();//열은 그대로 두고 행만 증가해서 생성하고 오리지널 복사하고 imsi 배열을 m에 전달
        }
        if(col<m[0].length-1){//열의 끝보다 작은가
            col++;
        }else{//열이 가득 차 있다
            col=0;
            row++;
        }
        m[row][col]=data;
    }
    //공간을 늘려준다...
    public void increment(){
        int [][]imsi=new int[m.length+2][m[0].length];
        System.arraycopy(m, 0, imsi, 0, m.length);
        m=imsi;
    }
    //isFull row==m.length-1&&col==m[0].length-1
    public boolean isFull(){
        return row==m.length-1&&col==m[0].length-1;
    }
    //row==0&& col==-1
    public boolean isEmpty(){
        return row==0&&col==0;
    }
    public void disp(){
        for(int i=0;i< m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]==0){continue;}
                System.out.print(m[i][j]+"\t");
            }//for
            System.out.println();
        }//for
        System.out.println();
    }

    public static void main(String[] args) {
        MultiRowCrud mr=new MultiRowCrud();
        mr.add(10);
        mr.add(20);
        mr.add(30);
        mr.add(40);
        mr.add(50);
        mr.add(60);
        mr.disp();


    }

}
