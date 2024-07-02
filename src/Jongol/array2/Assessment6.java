package Jongol.array2;

public class Assessment6 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                arr[0][i] = 1;
            }else arr[0][i] = 0;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j-1<0){
                    arr[i][j] = arr[i-1][j+1];
                } else if (j+1==arr[i].length) {
                    arr[i][j] = arr[i-1][j-1];
                }else arr[i][j] = arr[i-1][j-1]+arr[i-1][j+1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
