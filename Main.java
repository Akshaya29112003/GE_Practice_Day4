import Line_Comparison_Problem.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
//        Wage_Computation wc = new Wage_Computation();
//        wc.uc1();
//        wc.uc2();
//        wc.uc3();
//        wc.uc4();
//        wc.uc5();



        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        UC1 one = new UC1();
        UC2 two = new UC2();
        UC3 three = new UC3();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double length1 = one.cartesian_System(x1, y1, x2, y2);
        System.out.println(length1);

        System.out.println("Enter coordinates for Line 2:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        double length2 = one.cartesian_System(x3, y3, x4, y4);
        System.out.println(length2);

        two.equality_Of_Two_Lines(length1, length2);
        three.comparision_Of_Two_Lines(length1, length2);
    }
}