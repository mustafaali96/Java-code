class box
  {
   double width;
   double height;
   double depth;
  }
class demobox
  {
   public static void main(String ns[])
  {
   box mybox=new box( );
   double vol;
   mybox.width=10;
   mybox.height=20;
   mybox.depth=15;
   vol=mybox.width*mybox.height*mybox.depth;
   System.out.println("volume is"+vol);
  } 
  }