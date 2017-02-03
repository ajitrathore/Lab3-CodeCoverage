package com.upskillagility.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ajit on 2/2/17.
 */
public class GroceryList {


   private List listOfItemForShopping= new ArrayList();


    public GroceryList()
    {

    }

    public List getListOfItemForShopping() {
        return listOfItemForShopping;
    }



    public void setListOfItemForShopping(ArrayList myGroceryList) {
        listOfItemForShopping=myGroceryList;
    }

    public void dispose() {

        // currently for demo only
    }
}
