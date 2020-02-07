package RouteFinder;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
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

    @Override
    public Map<String, String> getBusRoutesUrls(String routesUrlText, char destInitial)
    {
        Map<String, String> hashMap = new HashMap<>();
        ArrayList<String> routesList = new ArrayList<String>();
        String regexLocationName = "<h3>(" + destInitial + ".*)</h3>";
        Pattern pattern1 = Pattern.compile(regexLocationName);
        Matcher matcher1 = pattern1.matcher(routesUrlText);
        while(matcher1.find())
        {
            String location = matcher1.group(1); // Prints users desired location.
            System.out.println(location);
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
                    System.out.println(matcher3.group(1)); // Prints location routes.
                }
                hashMap.put(location, routesList);
            }
        }
        return hashMap;
    }

    @Override
    public Map<String, List<Pair<String, String>>> getRouteStops(Map<String, String> busRoutesUrls, String routeId)
    {
        return null;
    }
}