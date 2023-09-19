
class Operators {
    public static void main(String[] args) {
        int a = 8, b = 2, c = 4, d = 1;
        System.out.println("c + a / b++ - a * ++d = " + (c + a / b++ - a * ++d));
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
 */