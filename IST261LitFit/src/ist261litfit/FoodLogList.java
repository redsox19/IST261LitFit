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
public class FoodLogList {
    private ArrayList<FoodLog> logList;
    
    public FoodLogList(){
        this.logList = new ArrayList<>();
    }

    /**
     * @return the logList
     */
    public ArrayList<FoodLog> getLogList() {
        return logList;
    }

    /**
     * @param logList the logList to set
     */
    public void setLogList(ArrayList<FoodLog> logList) {
        this.logList = logList;
    }
    
    public void addLogToList(FoodLog log){
        this.logList.add(log);
    }
}
