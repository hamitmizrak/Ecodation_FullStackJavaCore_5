package com.hamitmizrak;

import java.util.Arrays;

public class _11_Array_3 {

    // Array: eleman sayısını bilmek zorundayız
    // 0'dan saymaya başlar
    static void main() {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        for (int i =0; i<matrix.length; i++){ // satır
            for (int y =0; y<matrix[i].length; y++){ // sutun
                System.out.print(matrix[i][y]+" ");
            }
            System.out.println();
        }

    }
}
