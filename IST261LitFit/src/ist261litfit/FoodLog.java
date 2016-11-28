/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist261litfit;
import java.util.*;
/**
 *
 * @author drf5180
 */
public class FoodLog {
    private ArrayList<Food> foodLog;
    private int foodLogID; // increment by 1. FoodLog 1, FoodLog 2 etc...
    private int totCalories;
    private String foodLogName; // user input name
    
    public FoodLog(int ID, String Name){
        foodLog = new ArrayList<>();
        this.foodLogID = ID;
        this.foodLogName = Name;
        System.out.println(foodLogName + " " + foodLogID +  " log was created");
    }

    /**
     * @return the foodLog
     */
    public ArrayList<Food> getFoodLog() {
        return foodLog;
    }

    /**
     * @param foodLog the foodLog to set
     */
    public void setFoodLog(ArrayList<Food> foodLog) {
        this.foodLog = foodLog;
    }
    
    public void addFood(Food food){
        foodLog.add(food);
        System.out.println("Food was added to the list");
    }

    /**
     * @return the totCalories
     */
    public int getTotCalories() {
        return totCalories;
    }

    /**
     * @param totCalories the totCalories to set
     */
    public void setTotCalories(int totCalories) {
        this.totCalories = totCalories;
    }

    /**
     * @return the foodLogID
     */
    public int getFoodLogID() {
        return foodLogID;
    }

    /**
     * @param foodLogID the foodLogID to set
     */
    public void setFoodLogID(int foodLogID) {
        this.foodLogID = foodLogID;
    }

    /**
     * @return the foodLogName
     */
    public String getFoodLogName() {
        return foodLogName;
    }

    /**
     * @param foodLogName the foodLogName to set
     */
    public void setFoodLogName(String foodLogName) {
        this.foodLogName = foodLogName;
    }
    
}
