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
    public String getUrlText(String url) throws IOException {
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
        String patternString = "<h3>(" + destInitial + ".*)</h3>";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(routesUrlText);

        while(matcher.find())
        {
            String location = matcher.group(1);
            System.out.println(location);

            // Medium
//            String patternStr = "<h3>" + location + "</h3>(\\s*.*){3}>(.*)</a></strong>(\\s*.*){3}";
            // Captures all cities, but displays every single route.
//            String patternStr = "(<h3>" + location + "</h3>)*\\s.*\\s<div class=\"col-xs-3 text-nowrap\">\\s.*\">(.*)</a></strong>\\s.*\\s.*\\s.*";

            String patternStr = "" +
                    "            <h3>" + location + "</h3>\n" +
                    "(                <div class=\"row Community\">\n" +
                    "                    <div class=\"col-xs-3 text-nowrap\">\n" +
                    "                        <strong><a href=.*>(.*)</a></strong>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"col-xs-8 col-xs-offset-1\">(?:.*)</div>\n" +
                    "                </div>)*";

            Pattern pat = Pattern.compile(patternStr);
            Matcher mat = pat.matcher(routesUrlText);

            while(mat.find())
            {
//                System.out.println(mat.group(0));
//                System.out.println(mat.group(1));
                System.out.println(mat.group(2));
//                System.out.println(mat.group(3));
//                System.out.println(mat.group(4));
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
