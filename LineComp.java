import static java.lang.Math.sqrt;
public class LineComp {

public static final int x1=10;
public static final int x2=20;
public static final int y1=5;
public static final int y2=15;
public static final int x3=17;
public static final int x4=20;
public static final int y3=25;
public static final int y4=30;

public static void main(String[] args) {

double l1 =Math.round( sqrt( ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)) ));
 System.out.println("l1:" +l1);

double l2 =Math.round( sqrt( ((x4-x3) * (x4-x3)) + ((y4-y3) * (y4-y3)) ));
 System.out.println("l2:" +l2);

  if ( l1 == l2) {
     System.out.println("l1 is equal to l2");
  }
  else if( l1 > l2) {
     System.out.println("l1 is greater to l2");
  }
  else{
     System.out.println("l1 is less than l2");
  }
 }
}
