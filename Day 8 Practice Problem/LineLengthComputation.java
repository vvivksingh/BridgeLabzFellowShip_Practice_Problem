import java.util.Scanner;

public class LineLengthComputation{
        static int x1, x2, y1, y2, x3, x4, y3, y4;
        static Double length1, length2;

    public void getcoordinates() {
        Scanner sc = new Scanner(System.in);
        //for line 1
        System.out.println("Enter co-ordinates for point 1(x1,y1) of line 1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinates for point 2(x2,y2) of line 1");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        // for line 2
        System.out.println("Enter co-ordinates for point 1(x3,y3) of line 2");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter co-ordinates for point 2(x4,y4) of line 2");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
    }





    public void lengthCalculation() {
        length1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("Length of first line = " + length1 + " units");
        length2 = Math.sqrt((x4 - x3)^2 + (y4 - y3)^2);
        System.out.println("Length of second line = " + length2 + " units");
    }


        public static void main(String[] args) {
                LineLengthComputation line = new LineLengthComputation();
                line.getcoordinates();
                line.lengthCalculation();
    }
}
