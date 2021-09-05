import org.testng.annotations.Test;

public class TestNGTest {

    @Test
    public static void  method1(){
        System.out.println("Test1 modified. Appended 3");
    }

    @Test
    public static void  method3(){
        System.out.println("Test3 rebasing  123");
    }

    @Test
    public static void  method2(){
        System.out.println("Test2");
    }
}
