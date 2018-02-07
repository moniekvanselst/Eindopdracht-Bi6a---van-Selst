/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

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
    static Hashtable<Long, HashSet<Virus>> hosts = new Hashtable<>();
    static Hashtable<String, Long> hostsName = new Hashtable<>();
    static HashSet<Virus> setHost1 = new HashSet<>();
    static HashSet<Virus> setHost2 = new HashSet<>();
    static HashSet<Virus> setOverlap;
    static String sort = "ID";
    static ArrayList<Virus> lijstHost1, lijstHost2, lijstOverlap;

    public static void inladen(String[] info) {
        long virusID = Long.parseLong(info[0]);
        long hostID = Long.parseLong(info[7]);
        String hostnaam = info[8] + "(" + info[7] + ")";
        String[] clasFind = info[2].split(";");
        boolean alIn = false;
        for (Virus virus : allVirus) {
            if (virus.getID() == virusID) {
                alIn = true;
                virus.addHost(hostID);
                if (!hosts.containsKey(hostID)) {
                    hosts.put(hostID, new HashSet());
                    hostsName.put(hostnaam, hostID);
                }
                HashSet<Virus> oud = hosts.get(hostID);
                oud.add(virus);
                hosts.put(hostID, oud);
                break;
            }
        }
        if (alIn == false) {
            allVirus.add(new Virus(virusID, info[1], clasFind[1], hostID));
            if (!hosts.containsKey(hostID)) {
                hosts.put(hostID, new HashSet());
                hostsName.put(hostnaam, hostID);
            }
            HashSet<Virus> oud = hosts.get(hostID);
            Virus virus = allVirus.get(allVirus.size() - 1);
            oud.add(virus);
            hosts.put(hostID, oud);
        }
        System.out.println("d");

//        System.out.println(hosts.toString());
//            System.out.println(hostsName.toString());
    }

    public static Hashtable<String, Long> getHostsName() {
        return hostsName;
    }

    public static void makeHost(String host, String clas, HashSet<Virus> curendSet) {
        curendSet.clear();
        long hostID = hostsName.get(host);
        if (clas.equals("Allen")) {
            curendSet.addAll(hosts.get(hostID));
            // setHost1 = hosts.get(hostID);
        } else {
            for (Virus virus : hosts.get(hostID)) {
                if (virus.getClassificatie().contains(clas)) {
                    curendSet.add(virus);
                }
                if (clas.equals("Anderen") && !virus.getClassificatie().contains("ssDNA") && !virus.getClassificatie().contains("dsDNA") && !virus.getClassificatie().contains("ssRNA") && !virus.getClassificatie().contains("dsRNA") && !virus.getClassificatie().contains("Retro")) {
                    curendSet.add(virus);
                }
            }
        }
        setOverlap = (HashSet<Virus>) setHost1.clone();
        setOverlap.retainAll(setHost2);

    }

    public static void getSorted(String type) {
        sort = type;
        lijstHost1 = new ArrayList<Virus>(setHost1);
        lijstHost2 = new ArrayList<Virus>(setHost2);
        lijstOverlap = new ArrayList<Virus>(setOverlap);
        if (setHost1.size() > 1) {
            Collections.sort(lijstHost1);
        }
        if (setHost2.size() > 1) {
            Collections.sort(lijstHost2);
        }
        if (setOverlap.size() > 1) {
            Collections.sort(lijstOverlap);
        }
        // ArrayList<Virus> lijstHost1 =(ArrayList<Virus>) setHost1.toArray();
    }

}
