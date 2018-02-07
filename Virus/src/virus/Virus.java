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
public class Virus implements Comparable {

    private long ID;
    private String soort, classificatie;
    private HashSet<Long> hostSet = new HashSet<>();

    public Virus(long ID, String soort, String classificatie, long hostID) {
        this.ID = ID;
        this.soort = soort;
        this.classificatie = classificatie;
        hostSet.add(hostID);
    }

    Virus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addHost(long hostID) {
        hostSet.add(hostID);
    }

    public long getID() {
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

    public HashSet<Long> getHostSet() {
        return hostSet;
    }

    public void setHostSet(HashSet<Long> hostSet) {
        this.hostSet = hostSet;
    }

    @Override
    public int compareTo(Object t) {
        Virus v = (Virus) t;
        if (VirusLogica.sort.equals("ID")) {
            if (v.ID > this.ID) {
                return -1;
            }
            if (v.ID < this.ID) {
                return +1;
            } else {
                return 0;
            }
        } else if (VirusLogica.sort.equals("clas")) {
            int i = v.classificatie.compareTo(this.classificatie);
            return i;
        } else {
            if (v.hostSet.size() > this.hostSet.size()) {
                return -1;
            }
            if (v.hostSet.size() < this.hostSet.size()) {
                return +1;
            } else {
                return 0;
            }
        }
    }

}
