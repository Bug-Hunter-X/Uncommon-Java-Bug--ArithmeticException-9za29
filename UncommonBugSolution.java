public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 5 / x; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            //Log or handle the error appropriately
            y = 0; //or use a default value
        }
        System.out.println(y); 
    }
}