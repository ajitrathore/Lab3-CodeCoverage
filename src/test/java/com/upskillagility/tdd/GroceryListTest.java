package com.upskillagility.tdd;

import org.junit.After;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ajit on 2/2/17.
 */
public class GroceryListTest {

    private GroceryList myGroceryList = createGroceryList();




    @Test
    public void setListOfItemsForShopping()
    {
         final int initialSizeOfGroceryList = 0;



        //Given we have a new Object to add to our shopping list
        Object itemForShopping = new Object();

        // when we add this new item to the shopping list

        myGroceryList.getListOfItemForShopping().add(itemForShopping);

        //then size of grocerylist increments by 1 and

        assertTrue( (myGroceryList.getListOfItemForShopping().size() == initialSizeOfGroceryList+1));

    }

    @Test
    public void getListOfItemsForShopping()
    {
        //Gi
        assertNotNull(myGroceryList.getListOfItemForShopping());

    }

    @Test
    public void initialGroceryListState()
    {
        //when we initialize a new grocerylist
       GroceryList groceryList=new GroceryList();
       //then the list of tems in it should not be null - to avoid runtime null pointer exceptions?

       assertNotNull(groceryList.getListOfItemForShopping());
    }

    @After
    public void tearDown()
    {
        myGroceryList.dispose();
    }


    //Creating a static GroceryList Object for testing so we have shared instance
    private static GroceryList createGroceryList() {

        return new GroceryList();
    }
}
