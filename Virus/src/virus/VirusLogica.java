package virus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author van Selst
 * @data 30-01-2018
 */
public class VirusLogica {

    static ArrayList<Virus> allVirus = new ArrayList<>();
    static Hashtable<Long, HashSet<Virus>> hosts = new Hashtable<>();
    static Hashtable<String, Long> hostsName = new Hashtable<>();
    static HashSet<Virus> setHost1 = new HashSet<>();
    static HashSet<Virus> setHost2 = new HashSet<>();
    static HashSet<Virus> setOverlap;
    static String sort = "ID";
    static ArrayList<Virus> lijstHost1, lijstHost2, lijstOverlap;

    /**
     * Word aangeroepen door de actionpreform van de open button. Verzameld de
     * informatie voor de parameters van het nieuw te maken Virus object. staat
     * de virussen op in de set van de bijbehorende host en de set van alle
     * virussen. als het virus object al bestaat word er een extra verwijzing
     * naar het object gemaakt vanaf een andere host set.
     *
     * @param info
     */
    public static void inladen(String[] info) {
        try {
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
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Word aangeroepen door host 1 en 2 drowdown menu's. Haalt de set van de
     * gegeven hosts op en zet ze als ze de goede clasificatie hebben in de set.
     *
     * @param host
     * @param clas
     * @param curendSet
     */
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

    /**
     * Word aangeroepen door de radio buttons actionpreformd. Maakt ArrayList
     * van de sets en verandert het typen. Roept sort aan uit Collections on de
     * virussen te sorteren.
     *
     * @param type
     */
    public static void getSorted(String type) {
        try {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
