package RouteFinder;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RouteFinder implements IRouteFinder
{
    @Override
    public String getUrlText(String url) throws IOException
    {
        String text = collectHTMLText(url);
        return text;
    }

    @Override
    public Map<String, String> getBusRoutesUrls(String routesUrlText, char destInitial)
    {
        Map<String, String> hashMap = new HashMap<>();
        String regexLocationName = "<h3>(" + destInitial + ".*)</h3>";
        Pattern pattern1 = Pattern.compile(regexLocationName);
        Matcher matcher1 = pattern1.matcher(routesUrlText);
        while(matcher1.find())
        {
            String location = matcher1.group(1);
            System.out.println(location); // Prints locations
            String regexLocationRoutes = "<h3>\\Q" + location + "\\E</h3>[\\w[\\W]]+?(?:<hr id=\"(?:.*)\" />)";
            Pattern pattern2 = Pattern.compile(regexLocationRoutes);
            Matcher matcher2 = pattern2.matcher(routesUrlText);
            while(matcher2.find())
            {
                String regexRoutes = "(?:success>|\">)(.*)</a></strong>";
                String routesText = matcher2.group(0);
                Pattern pattern3 = Pattern.compile(regexRoutes);
                Matcher matcher3 = pattern3.matcher(routesText);
                while(matcher3.find())
                {
                    System.out.println(matcher3.group(1)); // Prints location respective routes
                    String routeURL = "https://www.communitytransit.org/busservice/schedules/route/" + matcher3.group(1);
                    hashMap.put(matcher3.group(1), routeURL); // Stores location route and route url.
                }
                System.out.println("++++++++++++++++++++++++++++++++++++");
            }
        }
        return hashMap;
    }

    @Override
    public Map<String, List<Pair<String, String>>> getRouteStops(Map<String, String> busRoutesUrls, String routeId) throws IOException
    {

        String routeUrl = busRoutesUrls.get(routeId);
        System.out.println("The URl for your route is: " + routeUrl);
        String text = collectHTMLText(routeUrl);
        String regexDestinationName = "<h2>Weekday<small>(.*)</small></h2>";
        Pattern pattern1 = Pattern.compile(regexDestinationName);
        Matcher matcher1 = pattern1.matcher(text);
        int stopNumber = 0;
        while(matcher1.find())
        {
            String destination = matcher1.group(1);
            System.out.println("Destination: " + destination);
            String regexStop = "<h2>Weekday<small>" + destination + "</small>[\\w[\\W]]+?</thead>";
            Pattern pattern2 = Pattern.compile(regexStop);
            Matcher matcher2 = pattern2.matcher(text);
            while(matcher2.find())
            {
                String regexStopName = "<strong class=\"fa fa-stack-1x\">(.*)</strong>[\\w[\\W]]+?<p>(.*)</p>";
                String routesText = matcher2.group(0);
                Pattern pattern3 = Pattern.compile(regexStopName);
                Matcher matcher3 = pattern3.matcher(routesText);
                while(matcher3.find())
                {
                    System.out.println("Stop number: " + matcher3.group(1) + " is " + matcher3.group(2));
                }
            }
        }
        return null;
    }

    public String collectHTMLText(String url) throws IOException
    {
        URLConnection communityTransit = new URL(url).openConnection();
        communityTransit.setRequestProperty("user-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        BufferedReader in = new BufferedReader(new InputStreamReader(communityTransit.getInputStream()));
        String inputLine = "";
        String text = "";
        while ((inputLine = in.readLine()) != null)
        {
            text += inputLine + "\n";
        }
        in.close();
        return text;
    }
}