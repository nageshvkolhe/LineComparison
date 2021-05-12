import static java.lang.Math.sqrt;
public class LineComp {

public static final int x1=3;
public static final int x2=5;
public static final int y1=3;
public static final int y2=5;
public static final int x3=3;
public static final int x4=5;
public static final int y3=3;
public static final int y4=5;

public static void main(String[] args) {

double l1 =Math.round( sqrt( ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)) ));
 System.out.println("l1:" +l1);

double l2 =Math.round( sqrt( ((x4-x3) * (x4-x3)) + ((y4-y3) * (y4-y3)) ));
 System.out.println("l2:" +l2);

   }
}
