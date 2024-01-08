public class Exception {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int result = 5 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int element = arr[5]; // Accessing an index beyond the array size
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        // NullPointerException
        try {
            String str = null;
            int length = str.length(); // Attempting to invoke a method on a null object
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        // NumberFormatException
        try {
            String strNumber = "abc";
            int parsedNumber = Integer.parseInt(strNumber); // Parsing a non-numeric string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}