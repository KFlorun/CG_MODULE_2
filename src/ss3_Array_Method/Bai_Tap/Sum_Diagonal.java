package ss3_Array_Method.Bai_Tap;

public class Sum_Diagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 2 - i; j < 3 - i; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
