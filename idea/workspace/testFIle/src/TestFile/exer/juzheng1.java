package TestFile.exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author gjx
 * @create 2021-12-25 20:24
 */
public class juzheng1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int in = scanner.nextInt();
        int[][] arr = new int[in][in];


        /**
         * k=1右，k=2下，k=3左，k=4上
         */
        int i = 0, j = 0;
        //i，j坐标

        int k = 1;
        for (int m = 1; m <= in * in; m++) {
            if (k == 1) {
                if (j < in && arr[i][j] == 0) {
                    arr[i][j] = m;
                    j++;

                } else {
                    k = 2;
                    i++;
                    j--;
                }
            }
            if (k == 2) {
                if (i < in && arr[i][j] == 0) {
                    arr[i][j] = m;

                    i++;

                } else {
                    k = 3;
                    j--;
                    i--;
                }
            }
            if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j] = m;

                    j--;
                } else {
                    k = 4;
                    i--;
                    j++;
                }
            }
            if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i][j] = m;
                    i--;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }
        for (int l = 0; l < in; l++) {
            for (int m = 0; m < arr[l].length; m++) {
//                System.out.print(arr[l][m] + " \t");
                System.out.print(String.format("%-5s", arr[l][m]));
            }
            System.out.println();
        }






    }


    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        /**
         * k=1右，k=2下，k=3左，k=4上
         */
        //i，j坐标
        int i = 0, j = 0;
        //a表示y的长度，b表示x轴的长度
        int a = matrix.length;
        int b = matrix[i].length;

        int k = 1;
        for (int m = 1; m <= a * b; m++) {
            if (k == 1) {
                if (j < b) {
                    list.add(matrix[i][j]);
                    j++;

                } else {
                    k = 2;
                    i++;
                    j--;
                }
            }
            if (k == 2) {
                if (i < a) {
                    list.add(matrix[i][j]);
                    i++;

                } else {
                    k = 3;
                    j--;
                    i--;
                }
            }
            if (k == 3) {
                if (j >= 0) {
                    list.add(matrix[i][j]);
                    j--;
                } else {
                    k = 4;
                    i--;
                    j++;
                }
            }
            if (k == 4) {
                if (i >= 0) {
                    list.add(matrix[i][j]);
                    i--;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }
        return list;

    }
}