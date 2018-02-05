/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

import java.util.*;



/**
 *
 * @author van Selst
 */
public class Virus {

    private int ID;
    private String soort, classificatie;
    private HashSet<Integer> hostSet = new HashSet<>();
   

    public Virus(int ID, String soort, String classificatie, int hostID) {
        this.ID = ID;
        this.soort = soort;
        this.classificatie = classificatie;
        hostSet.add(hostID);
    }

    Virus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addHost(int hostID){
        hostSet.add(hostID);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getClassificatie() {
        return classificatie;
    }

    public void setClassificatie(String classificatie) {
        this.classificatie = classificatie;
    }

    public HashSet<Integer> getHostSet() {
        return hostSet;
    }

    public void setHostSet(HashSet<Integer> hostSet) {
        this.hostSet = hostSet;
    }
    
    
    
}
