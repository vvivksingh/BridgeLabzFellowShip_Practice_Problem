import java.util.*;

public class lineLengthComparisonUC2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        Double len1 = Math.sqrt((x2 - x1)^2  +  (y2 - y1)^2);
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        int x4 = in.nextInt();
        int y4 = in.nextInt();
        Double len2 = Math.sqrt((x4 - x3)^2  +  (y4 - y3)^2);
        System.out.println("Length of the first Line is : " + len1 + " units" );
        System.out.println("Length of the second Line is : " + len2 + " units" );
		  System.out.println();
         if(len1.equals(len2))
            System.out.println("Both Lines are EQUAL ");
         else
            System.out.println("NOT EQUAL lines");


    }
}
