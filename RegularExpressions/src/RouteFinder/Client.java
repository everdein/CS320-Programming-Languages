/**
 * Matthew Clark
 * CS320 Programming Languages
 * Community Transit RouteFinder Project
 */

package RouteFinder;

import javafx.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Client extends RouteFinder
{
    // Allows Client.java to access RouteFinger.java methods.
    public static RouteFinder routeFinder = new RouteFinder();

    // Main.
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String decision = "Y";
        while(decision.equals("Y"))
        {
            // Collects users desired destination.
            System.out.print("Please enter a letter that your destination starts with: ");
            String destination = scanner.next();
            String url = "https://www.communitytransit.org/busservice/schedules/";

            // Get URL text.
            String urlText = null;
            urlText = routeFinder.getUrlText(url);

            // Create map to store destination and routes.
            Map hashMap = routeFinder.getBusRoutesUrls(urlText, destination.toUpperCase().charAt(0));

            // Collects users desired bus route.
            System.out.print("\nPlease enter a route ID as a string: ");
            String routeID = scanner.next();
            hashMap = routeFinder.getRouteStops(hashMap, routeID);

            // Iterates through the map and prints to and from destination with stop numbers and stop names.
            Iterator<Map.Entry<String, List<Pair<String, String>>>> itr = hashMap.entrySet().iterator();
            while(itr.hasNext())
            {
                Map.Entry<String, List<Pair<String, String>>> entry = itr.next();
                String key = entry.getKey();
                List<Pair<String, String>> pair = entry.getValue();
                System.out.println("Destination: " + key);
                for (Pair x : pair)
                {
                    System.out.println("Stop number: " + x.getKey().toString() + " is " + x.getValue().toString());
                }
            }

            // Asks user to lookup another destination, or to close program.
            System.out.print("\nDo you want to check different destination? Please type Y to continue or press any other key to exit. ");
            decision = scanner.next().toUpperCase();
            System.out.println();
        }
        scanner.close();
    }
}