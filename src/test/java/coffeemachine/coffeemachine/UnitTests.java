package coffeemachine.coffeemachine;

import coffeemachine.coffeemachine.model.Drink;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class UnitTests
        extends TestCase
{
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private Drink drink;



    @Test
    public void testGetNumberDrink(){
        when(drink.getNumber()).thenReturn(5);

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
