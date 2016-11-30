/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist261litfit;

/**
 *
 * @author drf5180
 */
public class Food {
    private String foodName;
    private int foodCalories;
    private NavController controller;
    private int gramsProtein;
    private int carbs;
    private int gramsFat;
    
    
    public Food( NavController controller, String food, int cal, int protein, int carbs, int fat){
        this.foodName = food;
        this.foodCalories = cal;
        this.controller = controller;
        this.gramsProtein = protein;
        this.carbs = carbs;
        this.gramsFat = fat;
                
        System.out.println(foodName + " " + foodCalories);
    }

    /**
     * @return the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return the foodCalories
     */
    public int getFoodCalories() {
        return foodCalories;
    }

    /**
     * @param foodCalories the foodCalories to set
     */
    public void setFoodCalories(int foodCalories) {
        this.foodCalories = foodCalories;
    }

    /**
     * @return the gramsProtein
     */
    public int getGramsProtein() {
        return gramsProtein;
    }

    /**
     * @param gramsProtein the gramsProtein to set
     */
    public void setGramsProtein(int gramsProtein) {
        this.gramsProtein = gramsProtein;
    }

    /**
     * @return the carbs
     */
    public int getCarbs() {
        return carbs;
    }

    /**
     * @param carbs the carbs to set
     */
    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    /**
     * @return the gramsFat
     */
    public int getGramsFat() {
        return gramsFat;
    }

    /**
     * @param gramsFat the gramsFat to set
     */
    public void setGramsFat(int gramsFat) {
        this.gramsFat = gramsFat;
    }
}
