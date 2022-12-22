/* Если необходимо, исправьте данный код: 
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */

public class exceptask2 {
    public static void main(String[] args) {        
        int[] intArray = {12, 45, 34, 7, 19, 235, 14, 87, 455, 76, 94}; 
        // int[] intArray = {20, 3, 55, 34, 53};
        try {
            //int d = 0;
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Catching exception: " + e1);
        }catch (ArithmeticException e2) {
            System.out.println("Catching exception: " + e2);
        
    }
}
}