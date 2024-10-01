package ss2_Loop.Bai_Tap;

public class Display_Geometry {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < i + 4 && j > 2 - i) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
