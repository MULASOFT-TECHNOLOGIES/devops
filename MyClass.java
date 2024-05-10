 class demo_outer{
      public class testing{
          public void print(){
            System.out.println("This is inner classs.....");
          }  
       }
    
     public void display_innerclass(){
        testing t = new testing();
        t.print();
     } 
}

public class MyClass { 
  public static void main(String[] args){
         demo_outer outer  = new demo_outer();
         outer.display_innerclass();
    }
}