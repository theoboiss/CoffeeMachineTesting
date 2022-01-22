package coffeemachine.coffeemachine;

import coffeemachine.coffeemachine.model.Drink;
import coffeemachine.coffeemachine.model.DrinkOrder;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrinkOrderTest
        extends TestCase
{

    /* ****************************************************************
     ************************** UNIT TESTS ****************************
     ****************************************************************** */

    /* ****************************************************************
     *********************** GETTERS UNIT TESTS ***********************
     ****************************************************************** */

    @Test
    public void testGetNumber() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Field field = drinkOrder.getClass().getDeclaredField("number");
        field.setAccessible(true);
        field.set(drinkOrder, 1);
        final int result = drinkOrder.getNumber();
        assertEquals(1, result);
    }

    @Test
    public void testGetDate() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Field field = drinkOrder.getClass().getDeclaredField("date");
        field.setAccessible(true);
        Date date = new Date();
        field.set(drinkOrder, date);
        final Date result = drinkOrder.getDate();
        assertEquals(date, result);
    }

    @Test
    public void testGetDrink() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Drink drink = new Drink();
        final Field field = drinkOrder.getClass().getDeclaredField("drink");
        field.setAccessible(true);
        field.set(drinkOrder, drink);
        final Drink result = drinkOrder.getDrink();
        assertEquals(drink, result);
    }

    @Test
    public void testGetSize() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Field field = drinkOrder.getClass().getDeclaredField("size");
        field.setAccessible(true);
        field.set(drinkOrder, 1);
        final double result = drinkOrder.getSize();
        assertEquals(1, result);
    }

    @Test
    public void testIsWithPaperCup() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Field field = drinkOrder.getClass().getDeclaredField("withPaperCup");
        field.setAccessible(true);
        field.set(drinkOrder, true);
        final boolean result = drinkOrder.isWithPaperCup();
        assertEquals(true, result);
    }

    @Test
    public void testGetSugar() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Field field = drinkOrder.getClass().getDeclaredField("sugar");
        field.setAccessible(true);
        field.set(drinkOrder, 1);
        final double result = drinkOrder.getSugar();
        assertEquals(1, result);
    }

    @Test
    public void testGetPrice() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Field field = drinkOrder.getClass().getDeclaredField("price");
        field.setAccessible(true);
        field.set(drinkOrder, 1);
        final double result = drinkOrder.getPrice();
        assertEquals(1, result);
    }

    @Test
    public void testIsOrdered() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        final Field field = drinkOrder.getClass().getDeclaredField("ordered");
        field.setAccessible(true);
        field.set(drinkOrder, true);
        final boolean result = drinkOrder.isOrdered();
        assertEquals(true, result);
    }

    /* ****************************************************************
     ************************** SETTERS UNIT TESTS ********************
     ****************************************************************** */

    @Test
    public void testSetNumber() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setNumber(1);
        final Field field = drinkOrder.getClass().getDeclaredField("number");
        field.setAccessible(true);
        assertEquals(1, field.get(drinkOrder));
    }

    @Test
    public void testSetDate() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        Date date = new Date();
        drinkOrder.setDate(date);
        final Field field = drinkOrder.getClass().getDeclaredField("date");
        field.setAccessible(true);
        assertEquals(date, field.get(drinkOrder));
    }

    @Test
    public void testSetDrink() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        Drink drink = new Drink();
        drinkOrder.setDrink(drink);
        final Field field = drinkOrder.getClass().getDeclaredField("drink");
        field.setAccessible(true);
        assertEquals(drink, field.get(drinkOrder));
    }

    @Test
    public void testSetSize() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setSize(1);
        final Field field = drinkOrder.getClass().getDeclaredField("size");
        field.setAccessible(true);
        assertEquals(1.0, field.get(drinkOrder));
    }

    @Test
    public void testSetWithPaperCup() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setWithPaperCup(true);
        final Field field = drinkOrder.getClass().getDeclaredField("withPaperCup");
        field.setAccessible(true);
        assertEquals(true, field.get(drinkOrder));
    }

    @Test
    public void testSetSugar() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setSugar(1);
        final Field field = drinkOrder.getClass().getDeclaredField("sugar");
        field.setAccessible(true);
        assertEquals(1.0, field.get(drinkOrder));
    }

    @Test
    public void testSetPrice() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setPrice(1);
        final Field field = drinkOrder.getClass().getDeclaredField("price");
        field.setAccessible(true);
        assertEquals(1.0, field.get(drinkOrder));
    }

    @Test
    public void testSetOrdered() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setOrdered(false);
        final Field field = drinkOrder.getClass().getDeclaredField("ordered");
        field.setAccessible(true);
        assertEquals(false, field.get(drinkOrder));
    }

    /* ****************************************************************
     ************************ INTEGRATION TESTS ***********************
     ****************************************************************** */

    @Test
    public void testNumberAccessorsDrinkOrder() {
        int number = 1;
        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setNumber(number);
        assertEquals(drinkOrder.getNumber(), 1);
    }

    @Test
    public void testDateAccessorsDrinkOrder() {
        DrinkOrder drinkOrder = new DrinkOrder();
        Date date = new Date();
        drinkOrder.setDate(date);
        assertEquals(drinkOrder.getDate(), date);
    }

    @Test
    public void testDrinkAccessorsDrinkOrder() {
        DrinkOrder drinkOrder = new DrinkOrder();
        Drink drink = new Drink();
        drinkOrder.setDrink(drink);
        assertEquals(drinkOrder.getDrink(), drink);
    }

    @Test
    public void testSizeAccessorsDrinkOrder() {
        double size = 1;
        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setSize(size);
        assertEquals(drinkOrder.getSize(), 1);
    }

    @Test
    public void testWithPaperCupAccessorsDrinkOrder() {
        boolean withPaperCup = true;
        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setWithPaperCup(withPaperCup);
        assertEquals(drinkOrder.isWithPaperCup(), true);
    }

    @Test
    public void testSugarAccessorsDrinkOrder() {
        double sugar = 1;
        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setSugar(sugar);
        assertEquals(drinkOrder.getSugar(), 1);
    }

    @Test
    public void testPriceAccessorsDrinkOrder() {
        double price = 1;
        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setPrice(price);
        assertEquals(drinkOrder.getPrice(), 1);
    }

    @Test
    public void testIsOrderedAccessorsDrinkOrder() {
        boolean isOrdered = false;
        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.setOrdered(isOrdered);
        assertEquals(drinkOrder.isOrdered(), false);
    }





}
