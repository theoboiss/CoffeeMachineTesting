package coffeemachine.coffeemachine;

import coffeemachine.coffeemachine.model.Amounts;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmountsTest
        extends TestCase
{

    /* ****************************************************************
     ************************** UNIT TESTS ****************************
     ****************************************************************** */

    /* ****************************************************************
     *********************** GETTERS UNIT TESTS ***********************
     ****************************************************************** */

    @Test
    public void testGetId() throws NoSuchFieldException, IllegalAccessException {
        final Amounts amounts = new Amounts();
        final Field field = amounts.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(amounts, 1);
        final int result = amounts.getId();
        assertEquals(1, result);
    }

    @Test
    public void testGetWater() throws NoSuchFieldException, IllegalAccessException {
        final Amounts amounts = new Amounts();
        final Field field = amounts.getClass().getDeclaredField("water");
        field.setAccessible(true);
        field.set(amounts, 1);
        final double result = amounts.getWater();
        assertEquals(1, result);
    }

    @Test
    public void testGetSugar() throws NoSuchFieldException, IllegalAccessException {
        final Amounts amounts = new Amounts();
        final Field field = amounts.getClass().getDeclaredField("sugar");
        field.setAccessible(true);
        field.set(amounts, 1);
        final double result = amounts.getSugar();
        assertEquals(1, result);
    }

    /* ****************************************************************
     ************************** SETTERS UNIT TESTS ********************
     ****************************************************************** */

    @Test
    public void testSetId() throws NoSuchFieldException, IllegalAccessException {
        final Amounts amounts = new Amounts();
        amounts.setId(1);
        final Field field = amounts.getClass().getDeclaredField("id");
        field.setAccessible(true);
        assertEquals(1, field.get(amounts));
    }

    @Test
    public void testSetWater() throws NoSuchFieldException, IllegalAccessException {
        final Amounts amounts = new Amounts();
        amounts.setWater(1);
        final Field field = amounts.getClass().getDeclaredField("water");
        field.setAccessible(true);
        assertEquals(1.0, field.get(amounts));
    }

    @Test
    public void testSetSugar() throws NoSuchFieldException, IllegalAccessException {
        final Amounts amounts = new Amounts();
        amounts.setSugar(1);
        final Field field = amounts.getClass().getDeclaredField("sugar");
        field.setAccessible(true);
        assertEquals(1.0, field.get(amounts));
    }

    /* ****************************************************************
     ************************ INTEGRATION TESTS ***********************
     ****************************************************************** */

    @Test
    public void testIdAccessorsAmounts() {
        int id = 1;
        Amounts amounts = new Amounts();
        amounts.setId(id);
        assertEquals(amounts.getId(), 1);
    }

    @Test
    public void testWaterAccessorsAmounts() {
        double water = 1;
        Amounts amounts = new Amounts();
        amounts.setWater(water);
        assertEquals(amounts.getWater(), 1);
    }

    @Test
    public void testSugarAccessorsAmounts() {
        double sugar = 1;
        Amounts amounts = new Amounts();
        amounts.setSugar(sugar);
        assertEquals(amounts.getSugar(), 1);
    }

}
