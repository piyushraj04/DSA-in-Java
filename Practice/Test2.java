public class Test2 {

    public static int test(){
        System.out.println("int typed 0 args");
        return 0;
    }
    public static String test(String arg){
        System.out.println("String typed String args");
        return "Hi";
    }
    public static double test(double a){
        System.out.println("double typed double args");
        return 1.0;
    }
    
    public static void main(String[] args) {
        System.out.println("Check:---->>>>");
        test();
        test(2);
        test("Hi");
    }
}
