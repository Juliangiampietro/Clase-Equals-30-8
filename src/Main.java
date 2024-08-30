import model.TestClass;
import interfac.TestInterface;

public class Main {
    public static void main(String[] args) {
        TestClass t1 = new TestClass(1, "Juan");
        TestClass t2 = new TestClass(2, "Juan");
        System.out.println(t1.equals(t2));

        //System.out.println(t1.helloWorld("test"));
    }


}