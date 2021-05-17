import static java.lang.Math.sqrt;
  public class LineComp {

  private final int x1;
  private final int x2;
  private final int y1;
  private final int y2;
  private final int x3;
  private final int x4;
  private final int y3;
  private final int y4;

  public LineComp(int x1, int x2, int y1, int y2, int x3, int y3, int x4, int y4) {
  this.x1 = x1;
  this.x2 = x2;
  this.y1 = y1;
  this.y2 = y2;
  this.x3 = x3;
  this.x4 = x4;
  this.y3 = y3;
  this.y4 = y4;
 }
 public void comparision(){
 double l1 =Math.round( sqrt( ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)) ));
  System.out.println("l1:" +l1);

 double l2 =Math.round( sqrt( ((x4-x3) * (x4-x3)) + ((y4-y3) * (y4-y3)) ));
  System.out.println("l2:" +l2);

   if ( l1 == l2) {
      System.out.println("l1 is equal to l2");
   }
   else if( l1 > l2) {      System.out.println("l1 is greater to l2");
   }
   else{
      System.out.println("l1 is less than l2");
   }
 }

 public static void main (String[] args){
   LineComp firstvalue = new LineComp(3,4,5,6,7,8,9,10);
   firstvalue.comparision();
   System.out.println(firstvalue);
 }
 }
