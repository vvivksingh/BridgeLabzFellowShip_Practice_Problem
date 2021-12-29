import java.util.*;

public class lineLengthComputationUC1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		  System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double len = Math.sqrt((x2 - x1)^2  +  (y2 - y1)^2);
        System.out.println("Length of the given Line is : " + len + " units" );
    }
}
