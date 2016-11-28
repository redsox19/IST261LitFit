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
public class Profile {
    private String userName;
    private int userAge;
    private int userHeight; // total inches
    private int userWeight;
    private int calorieGoal;
    private int userBMI; //  total
    private ProfileController controller;
    
     public Profile(){
         
     }
             
      
    public Profile(String Name, int height, int weight, ProfileController Controller){
        userName = Name;
        userWeight = weight;
        userHeight = height;
        controller = Controller;
        calorieGoal = 2000; // example daily calories
        System.out.println(this.userName + " " + this.userHeight + " "+ this.userWeight);
    }

    /**
     * @return the userAge
     */
    public int getUserAge() {
        return userAge;
    }

    /**
     * @param userAge the userAge to set
     */
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    /**
     * @return the userHeight
     */
    public int getUserHeight() {
        return userHeight;
    }

    /**
     * @param userHeight the userHeight to set
     */
    public void setUserHeight(int userHeight) {
        this.userHeight = userHeight;
    }

    /**
     * @return the calorieGoal
     */
    public int getCalorieGoal() {
        return calorieGoal;
    }

    /**
     * @param calorieGoal the calorieGoal to set
     */
    public void setCalorieGoal(int calorieGoal) {
        this.calorieGoal = calorieGoal;
    }

    /**
     * @return the userBMI
     */
    public int getUserBMI() {
        return userBMI;
    }

    /**
     * @param userBMI the userBMI to set
     */
    public void setUserBMI(int userBMI) {
        this.userBMI = userBMI;
    }
    
    public int getUserWeight(){
        return this.userWeight;
    }
    
    public void setUserWeight(int weight){
        userWeight = weight;
    }
    
    public void setUserName(String name){
        userName = name;
    }
    
    public String getUserName(){
        return userName;
    }
    
}
