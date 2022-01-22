package coffeemachine.coffeemachine;

import coffeemachine.coffeemachine.controller.OrderDrink;
import coffeemachine.coffeemachine.model.Drink;
import coffeemachine.coffeemachine.model.DrinkOrder;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkTest
        extends TestCase
{

    /* ****************************************************************
     ************************** UNIT TESTS ****************************
     ****************************************************************** */

    /* ****************************************************************
     ************************* DAO UNIT TESTS *************************
     ****************************************************************** */

    //TO IMPROVE

    @Test
    void testDrinkOrder() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_file");
        EntityManager em = emf.createEntityManager();

        Drink drink = new Drink("nom", "desc", 5, 5, null);
        Drink drink2 = new Drink("nom2", "desc2", 5, 5, null);

        DrinkOrder order = new DrinkOrder(null, drink, 1, false, 2, 2, true);

        OrderDrink dao = Mockito.mock(OrderDrink.class);

        List<Drink> listDrinks = Arrays.asList(drink, drink2);
        Mockito.when(dao.getDrinks()).thenReturn(listDrinks);

        Assertions.assertEquals(2, listDrinks.size());
    }

    /* ****************************************************************
     *********************** GETTERS UNIT TESTS ***********************
     ****************************************************************** */

    @Test
    public void testGetNumber() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        final Field field = drink.getClass().getDeclaredField("number");
        field.setAccessible(true);
        field.set(drink, 1);
        final int result = drink.getNumber();
        assertEquals(1, result);
    }

    @Test
    public void testGetName() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        final Field field = drink.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(drink, "name");
        final String result = drink.getName();
        assertEquals("name", result);
    }

    @Test
    public void testGetDescription() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        final Field field = drink.getClass().getDeclaredField("description");
        field.setAccessible(true);
        field.set(drink, "desc");
        final String result = drink.getDescription();
        assertEquals("desc", result);
    }

    @Test
    public void testGetPrice() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        final Field field = drink.getClass().getDeclaredField("price");
        field.setAccessible(true);
        field.set(drink, 1);
        final double result = drink.getPrice();
        assertEquals(1, result);
    }

    @Test
    public void testGetQuantity() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        final Field field = drink.getClass().getDeclaredField("quantity");
        field.setAccessible(true);
        field.set(drink, 1);
        final int result = drink.getQuantity();
        assertEquals(1, result);
    }

    @Test
    public void testGetOrders() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder order1 = new DrinkOrder(null, null, 1, false, 2, 2, true);
        final DrinkOrder order2 = new DrinkOrder(null, null, 1, true, 5, 5, false);
        List<DrinkOrder> listOrders = Arrays.asList(order1, order2);
        final Drink drink = new Drink();
        final Field field = drink.getClass().getDeclaredField("orders");
        field.setAccessible(true);
        field.set(drink, listOrders);
        final List<DrinkOrder> result = drink.getOrders();
        assertEquals(listOrders, result);
    }

    /* ****************************************************************
     ************************** SETTERS UNIT TESTS ********************
     ****************************************************************** */

    @Test
    public void testSetNumber() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        drink.setNumber(1);
        final Field field = drink.getClass().getDeclaredField("number");
        field.setAccessible(true);
        assertEquals(1, field.get(drink));
    }

    @Test
    public void testSetName() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        drink.setName("name");
        final Field field = drink.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals("name", field.get(drink));
    }

    @Test
    public void testSetDescription() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        drink.setDescription("desc");
        final Field field = drink.getClass().getDeclaredField("description");
        field.setAccessible(true);
        assertEquals("desc", field.get(drink));
    }

    @Test
    public void testSetPrice() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        drink.setPrice(1);
        final Field field = drink.getClass().getDeclaredField("price");
        field.setAccessible(true);
        assertEquals(1.0, field.get(drink));
    }

    @Test
    public void testSetQuantity() throws NoSuchFieldException, IllegalAccessException {
        final Drink drink = new Drink();
        drink.setQuantity(1);
        final Field field = drink.getClass().getDeclaredField("quantity");
        field.setAccessible(true);
        assertEquals(1, field.get(drink));
    }

    @Test
    public void testSetOrders() throws NoSuchFieldException, IllegalAccessException {
        final DrinkOrder order1 = new DrinkOrder(null, null, 1, false, 2, 2, true);
        final DrinkOrder order2 = new DrinkOrder(null, null, 1, true, 5, 5, false);
        List<DrinkOrder> listOrders = Arrays.asList(order1, order2);
        final Drink drink = new Drink();
        drink.setOrders(listOrders);
        final Field field = drink.getClass().getDeclaredField("orders");
        field.setAccessible(true);
        assertEquals(listOrders, field.get(drink));
    }

    /* ****************************************************************
     ************************ INTEGRATION TESTS ***********************
     ****************************************************************** */

    @Test
    public void testNumberAccessorsDrink() {
        int number = 1;
        Drink drink = new Drink();
        drink.setNumber(number);
        assertEquals(drink.getNumber(), 1);
    }

    @Test
    public void testNameAccessorsDrink() {
        String name = "name";
        Drink drink = new Drink();
        drink.setName(name);
        assertEquals(drink.getName(), "name");
    }

    @Test
    public void testDescriptionAccessorsDrink() {
        String name = "desc";
        Drink drink = new Drink();
        drink.setDescription(name);
        assertEquals(drink.getDescription(), "desc");
    }

    @Test
    public void testPriceAccessorsDrink() {
        double price = 1;
        Drink drink = new Drink();
        drink.setPrice(price);
        assertEquals(drink.getPrice(), price);
    }

    @Test
    public void testQuantityAccessorsDrink() {
        int quantity = 1;
        Drink drink = new Drink();
        drink.setQuantity(quantity);
        assertEquals(drink.getQuantity(), quantity);
    }




}