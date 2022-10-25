package Java09;

class CCircle        
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)     
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class Class16
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[5];
      for(int i =0;i<cir.length;i++) {
    	  cir[i] = new CCircle(i);
    	  System.out.print("cir["+i+"] ");
    	  cir[i].show();
      }
   }
}
