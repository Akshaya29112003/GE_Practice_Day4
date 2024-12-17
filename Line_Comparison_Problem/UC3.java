package Line_Comparison_Problem;

public class UC3 {
    public static void comparision_Of_Two_Lines(double length1, double length2){
        Double num1 = length1;
        Double num2 = length2;
        int compare = num1.compareTo(num2);
        if(compare == 0)    System.out.println("Both lines are equal");
        else if(compare > 1)   System.out.println("First length is longer");
        else   System.out.println("Second length is longer");

    }
}
