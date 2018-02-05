/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 *
 * @author van Selst
 */
public class VirusLogica {

    static ArrayList<Virus> allVirus = new ArrayList<>();

//    static ArrayList<Integer> dsRNA = new ArrayList<>();
//    static ArrayList<Integer> dsDNA = new ArrayList<>();
//    static ArrayList<Integer> ssRNA = new ArrayList<>();
//    static ArrayList<Integer> ssDNA = new ArrayList<>();
//    static ArrayList<Integer> retro = new ArrayList<>();
//    static ArrayList<Integer> viroid = new ArrayList<>();
//    static ArrayList<Integer> satilate = new ArrayList<>();
//    static ArrayList<Integer> others = new ArrayList<>();
    static Hashtable<Integer, HashSet<Virus>> hosts = new Hashtable<>();

    public static void inladen(String[] info) {
        int virusID = Integer.parseInt(info[0]);
        int hostID = Integer.parseInt(info[7]);
        String[] clasFind = info[2].split(";");
        boolean alin = false;
        for (Virus virus : allVirus) {
            if (virus.getID() == virusID) {
                alin = true;
                virus.addHost(hostID);
                if (!hosts.containsKey(hostID)) {
                    hosts.put(hostID, new HashSet());
                }
                HashSet<Virus> oud = hosts.get(hostID);
                oud.add(virus);
                hosts.put(hostID, oud);
                break;
            }
        }
        if (alin == false) {
            allVirus.add(new Virus(virusID, info[1], clasFind[1], hostID));
            if (!hosts.containsKey(hostID)) {
                hosts.put(hostID, new HashSet());
            }
            HashSet<Virus> oud = hosts.get(hostID);
            Virus virus = allVirus.get(allVirus.size()-1);
            oud.add(virus);
            hosts.put(hostID, oud); 
        }
        
        System.out.println(hosts.toString());
    }
}
