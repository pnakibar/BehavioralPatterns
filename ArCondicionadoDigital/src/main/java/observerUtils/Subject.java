/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observerUtils;


import java.util.ArrayList;

/**
 *
 * @author cthulhu
 */
public abstract class Subject {
        private ArrayList<Sensor> observers = new ArrayList<Sensor>();
        
        
        public void addObserver(Sensor o){
                observers.add(o);
        }
        
        public void removeObserver(Sensor o){
                observers.remove(o);
        }
        
        public ArrayList<Sensor> getObseververs(){
                return this.observers;
        }
        
        public abstract void update();
        
}
