package ss1_Introduction_Java.Thuc_Hanh;

import java.util.Scanner;

public class Bmi_Index {
    public static void main(String[] args) {
        boolean yesNo = true;
        while (yesNo) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter weight: ");
            float weight = Float.parseFloat(sc.nextLine());
            System.out.print("Enter height: ");
            float height = Float.parseFloat(sc.nextLine());
            float bmi = weight / (height * height);
            if (bmi >= 30.0) {
                System.out.println("Obese");
            } else if (bmi >= 25.0) {
                System.out.println("Overweight");
            } else if (bmi >= 18.5) {
                System.out.println("Normal");
            } else {
                System.out.println("Underweight");
            }
            System.out.println("Do you want to play again ?");
            String ans = sc.nextLine();
            if (ans.equals("no")) {
                yesNo = false;
            }
        }
    }
}
