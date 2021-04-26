import org.testng.annotations.*;

public class Testcase3 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class for TestCase3");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case for TestCase3");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class for TestCase3");
    }
}
