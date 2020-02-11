package RouteFinder;

import javafx.util.Pair;
import java.io.IOException;
import java.util.*;

public class Client extends RouteFinder
{
    public static RouteFinder routeFinder = new RouteFinder();
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
            String urlText = routeFinder.getUrlText(url);
            // Create map to store destination and routes.
            Map hashMap = routeFinder.getBusRoutesUrls(urlText, destination.toUpperCase().charAt(0));
            // Collects users desired bus route.
            System.out.print("\nPlease enter a route ID as a string: ");
            String routeID = scanner.next();
            hashMap = routeFinder.getRouteStops(hashMap, routeID);

            Iterator<Map.Entry<String, List<Pair<String, String>>>> itr = hashMap.entrySet().iterator();

            while(itr.hasNext())
            {
                Map.Entry<String, List<Pair<String, String>>> entry = itr.next();
                String key = entry.getKey();
                List<Pair<String, String>> pair = entry.getValue();
                System.out.println("Destination: " + key);
                System.out.println(pair);
//                System.out.println("Stop number: " + ? + " is " + ?);
                /**
                 * Print pair data structure.
                 */
            }
            
            // Asks user to lookup another destination, or to close program.
            System.out.print("Do you want to check different destination? Please type Y to continue or press any other key to exit.");
            decision = scanner.next();
        }
        scanner.close();
    }
}