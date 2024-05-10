public class RectangleOrSquare{
    // main method
     public static void main(String[] args){
       int x1=5 , x2 = 7 ,x3 = 5 , x4 = 8 ;
        
       String res = findShape(x1, x2, x3, x4);

    //    testing

       System.out.println(res);
     }
    
    // to determine shape data :  int x1=5 , x2 = 6 ,x3 = 5 ,x4 = 6 
    
    public static String findShape(int x1 ,int x2 , int x3  ,int x4){
        
        if(x1 == x2 && x2 == x3 && x3 == x4){
            return "It is a square";
        }
        else if((x1 == x3 && x2 == x4) || (x1 == x2 && x3 == x4) || (x1 == x4 && x2 == x3) ){
            return "This is rectangle";
        }else{
            return "This is nor rectangle or Square";
        }
    }

     


}