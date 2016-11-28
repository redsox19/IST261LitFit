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
public class ProfileController {
    private Profile profile;
    private ProfileUI profileUI;
    private NavController navController;
    
    public ProfileController(){
       this.profileUI = new ProfileUI(this);
      profileUI.setVisible(true);
    }
    
    public void createProfile(String name, int height, int weight, ProfileController controller){
       this.profile = new Profile(name, height, weight, this);
    }
    
    public void hideProfileUI(){
        this.profileUI.setVisible(false);
    }
    
    public void createNavController(){
        this.navController = new NavController(this);
    }
    
    public void calculateBMI(){
        int tempBMI = ((profile.getUserWeight() * 703)/(profile.getUserHeight()*profile.getUserHeight()));
        profile.setUserBMI(tempBMI);
        System.out.print("BMI: " + tempBMI);
    }
}
