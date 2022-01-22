package coffeemachine.coffeemachine;

import coffeemachine.coffeemachine.model.PaperCup;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaperCupTest
        extends TestCase
{

    /* ****************************************************************
     ************************** UNIT TESTS ****************************
     ****************************************************************** */

    /* ****************************************************************
     *********************** GETTERS UNIT TESTS ***********************
     ****************************************************************** */

    @Test
    public void testGetSize() throws NoSuchFieldException, IllegalAccessException {
        final PaperCup papercup = new PaperCup();
        final Field field = papercup.getClass().getDeclaredField("size");
        field.setAccessible(true);
        field.set(papercup, 1);
        final double result = papercup.getSize();
        assertEquals(1, result);
    }

    @Test
    public void testGetPrice() throws NoSuchFieldException, IllegalAccessException {
        final PaperCup papercup = new PaperCup();
        final Field field = papercup.getClass().getDeclaredField("price");
        field.setAccessible(true);
        field.set(papercup, 1);
        final double result = papercup.getPrice();
        assertEquals(1, result);
    }

    @Test
    public void testGetQuantity() throws NoSuchFieldException, IllegalAccessException {
        final PaperCup papercup = new PaperCup();
        final Field field = papercup.getClass().getDeclaredField("quantity");
        field.setAccessible(true);
        field.set(papercup, 1);
        final int result = papercup.getQuantity();
        assertEquals(1, result);
    }

    /* ****************************************************************
     *********************** SETTERS UNIT TESTS ***********************
     ****************************************************************** */

    @Test
    public void testSetSize() throws NoSuchFieldException, IllegalAccessException {
        final PaperCup papercup = new PaperCup();
        papercup.setSize(1);
        final Field field = papercup.getClass().getDeclaredField("size");
        field.setAccessible(true);
        assertEquals(1.0, field.get(papercup));
    }

    @Test
    public void testSetPrice() throws NoSuchFieldException, IllegalAccessException {
        final PaperCup papercup = new PaperCup();
        papercup.setPrice(1);
        final Field field = papercup.getClass().getDeclaredField("price");
        field.setAccessible(true);
        assertEquals(1.0, field.get(papercup));
    }

    @Test
    public void testSetQuantity() throws NoSuchFieldException, IllegalAccessException {
        final PaperCup papercup = new PaperCup();
        papercup.setQuantity(1);
        final Field field = papercup.getClass().getDeclaredField("quantity");
        field.setAccessible(true);
        assertEquals(1, field.get(papercup));
    }

    /* ****************************************************************
     ************************ INTEGRATION TESTS ***********************
     ****************************************************************** */

    @Test
    public void testSizeAccessorsPaperCup() {
        double size = 1;
        PaperCup papercup = new PaperCup();
        papercup.setSize(size);
        assertEquals(papercup.getSize(), 1);
    }

    @Test
    public void testPriceAccessorsPaperCup() {
        double price = 1;
        PaperCup papercup = new PaperCup();
        papercup.setPrice(price);
        assertEquals(papercup.getPrice(), 1);
    }

    @Test
    public void testQuantityAccessorsPaperCup() {
        int quantity = 1;
        PaperCup papercup = new PaperCup();
        papercup.setQuantity(quantity);
        assertEquals(papercup.getQuantity(), 1);
    }



}
