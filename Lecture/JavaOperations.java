package Lecture;

class Operators {
    public static void main(String[] args) {
        int a = 8, b = 2, c = 4, d = 1;
        int result = c + a / b++ - a * ++d;

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("Number is " + a + b); // Number is 83


    }
}


/**
 * Unary Operators
 *      Sign Operators (+, -)
 *      Increment/Decrement Operators (++, --)
 * 
 * Binary Operators
 *      Arithmetic Operators (+, -, *, /, %)
 *      
 * 
 * Operation precedence
 *     1. ()  
 *     2. ++, -- //Prexif first
 *     3. *, /, %
 *      
 * Example
 * a = 8, b=2, c=4, d=1
 * c + a / b++ - a * ++d
 * c + (a /b++) - (a * (++d))
 * 4 + (8 / 2) - (8 * (++1))
 * 4 + 4 - 16
 * -16
 * 
 * Bitwise Operators
 *      Bitwise AND (&)
 *      Bitwise OR (|)
 *      Bitwise XOR (^)
 *      Bitwise Complement (~)
 * 
 * Examples
 * 8 = 0000 1000
 * 2 = 0000 0010
 * 
 * 2 & 8 = 0000 0000
 * 
 * shift operators
 *     Left shift (<<)
 *    Right shift (>>)
 * 
 * How they work
 * 8 = 0000 1000
 * 8 << 2 = 0010 0000
 * 8 >> 2 = 0000 0010
 */