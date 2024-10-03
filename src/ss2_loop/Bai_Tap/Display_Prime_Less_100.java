package ss2_loop.Bai_Tap;


public class Display_Prime_Less_100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int j = 2;
            boolean isPrime = true;
            while(j < i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
