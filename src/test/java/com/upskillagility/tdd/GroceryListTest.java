package com.upskillagility.tdd;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ajit on 2/2/17.
 */
public class GroceryListTest {

    private GroceryList myGroceryList = createGroceryList();


    @Test
    public void getListOfItemsForShopping()
    {
        //when we nvoke get method for list of items without setting/initializing it
        //then we should not get Null object so that we avoid runtime exceptions form consumer applications
        assertNotNull(myGroceryList.getListOfItemForShopping());

    }

    @Test
    public void setListOfItemForShopping()
    {
        //given we have a new list
        ArrayList groceryList=new ArrayList();

        //when we initialize the grocery list object with this list

        myGroceryList.setListOfItemForShopping(groceryList) ;

        // then we see that grocerylist items list and this list are same.

        assertTrue( myGroceryList.getListOfItemForShopping().equals(groceryList) );
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
