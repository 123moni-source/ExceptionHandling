public class JavaExceptionExample {
    static void f1(int a)throws NumberFormatException{
        System.out.println(10/a);
    }
    public static void main(String[] args) {
try{
    f1(10);
    f1(0);
}
catch(Exception e)
        {
            System.out.println("can't divide by zero");
        }
    }
}
