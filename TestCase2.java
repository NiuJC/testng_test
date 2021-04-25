import org.testng.annotations.*;

public class TestCase2 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class for TestCase2");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case for TestCase2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class for TestCase2");
    }
}