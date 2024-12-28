public class UncommonBug {
    public static void main(String[] args) {
        int x = 0;
        int y = 5 / x; //Potential ArithmeticException
        System.out.println(y); 
    }
}