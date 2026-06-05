// Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets

package HashSet_Map;
import java.util.*;

public class FindItinerary {

    public static String getStart(HashMap<String, String> tickets) {

        HashSet<String> destinations = new HashSet<>();

        // store all destinations
        for (String key : tickets.keySet()) {
            destinations.add(tickets.get(key));
        }

        // find starting point
        for (String key : tickets.keySet()) {
            if (!destinations.contains(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.println("Start: " + start);

        if (start != null) {
            while (tickets.containsKey(start)) {
                System.out.println(start + " -> " + tickets.get(start));
                start = tickets.get(start);
            }
        } else {
            System.out.println("No valid starting point found.");
        }
    }
}