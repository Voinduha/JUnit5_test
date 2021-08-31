import org.junit.jupiter.api.*;

public class JUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is before all method!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("This is before each method!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("This is after each method!");
    }

    @Test
    void firstTest() {
        System.out.println("This is the first @test!");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("This is the second @test!");
        Assertions.assertTrue(true);
    }
}