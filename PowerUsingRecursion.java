public class PowerUsingRecursion {
    public static void main(String[] args) {
        int a = 2; // Base
        int b = 12; // Exponent
        long result = power(a, b);
        System.out.println(a + "^" + b + " = " + result);
    }

    public static long power(int a, int b) {
        if (b == 0) {
            return 1; // Any number raised to the power of 0 is 1
        } else {
            return a * power(a, b - 1); // Recursive call: a^(b-1)
        }
    }
}




// annother method
// if(b==0) //Base Condition
//     return 1;
//   if(b%2==0){
//       int result = func(a,b/2);
//       return result*result;
//   }
//   else{
//       int result = func(a,(b-1)/2);
//       return a*result*result; 
//   }
