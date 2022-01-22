package coffeemachine.coffeemachine;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.MockitoAnnotations;

public class IntegrationTests
        extends TestCase
{
	@Before
	public void setUp() {
	    MockitoAnnotations.initMocks(this);
	}
    
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
    @Tag("DEV")
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , 2+2);
    }
     
    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , 2+4);
    }
     
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
