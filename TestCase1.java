import org.testng.annotations.*;

public class TestCase1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class for TestCase1");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case for TestCase1");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class for TestCase1");
    }
}
