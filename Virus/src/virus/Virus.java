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
    private ArrayList<Integer> hostList = new ArrayList<Integer>();

    public Virus(int ID, String soort, String classificatie, int hostID) {
        this.ID = ID;
        this.soort = soort;
        this.classificatie = classificatie;
        hostList.add(hostID);
    }
    
    public void addHost(int hostID){
        hostList.add(hostID);
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

    public ArrayList<Integer> getHostList() {
        return hostList;
    }

    public void setHostList(ArrayList<Integer> hostList) {
        this.hostList = hostList;
    }
    
    
    
}
