package Jongol.array2;

import java.util.Scanner;

public class Assessment10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    char alp = 'A';

    char[][] matrix = new char[row][col];

    for(int i=0; i<row; i++){
      for (int j=0; j<col; j++){
        matrix[i][j] = alp;
        alp++;
      }
    }

    for(int i=0; i<row; i++){
      for (int j=0; j<col; j++){
        System.out.print(Character.toLowerCase(matrix[i][j])+" ");
      }
      System.out.println();
    }

  }//main end

}
