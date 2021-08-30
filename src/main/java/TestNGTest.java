import org.testng.annotations.Test;

public class TestNGTest {

    @Test
    public static void  method1(){
        System.out.println("Test1 modified");
    }

    @Test
    public static void  method3(){
        System.out.println("Test3 added");
    }
}
