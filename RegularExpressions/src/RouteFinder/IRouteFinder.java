package RouteFinder;

import javafx.util.Pair;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IRouteFinder
{
    /**
     * Gets the URL text of the provided URL
     * @param url: fixed for this assignment https://www.communitytransit.org/busservice/schedules/
     * @return the URL Text "the web page text"
     */
    String getUrlText(final String url) throws IOException;

    /**
     * The function return the route URLs for a specific destination initial using the URL text
     * @param routesUrlText: Text for specific Route defined by the user
     * @param destInitial This represents a destination (e.g. b/B is initial for Bellevue, Bothell, ...)
     * @return key/value map of the routes with key is route id and value is the route page URL
     */
    Map<String, String> getBusRoutesUrls(final String routesUrlText, final char destInitial);

    /**
     * The function returns route stops for a certain route ID and and a list of bus routes URLs
     * @param busRoutesUrls a map of bus routes with key is route id and value is the route page URL
     * @param routeId the id of the route that you want to get its bus stops
     * @return key/value map of the stops grouped by destination To/From with key is destination To
     * (e.g. To Bellevue) and value is the list of stops in the same order that it was parsed on
     */
    Map<String, List<Pair<String, String>>> getRouteStops(final Map<String, String> busRoutesUrls, final String routeId) throws IOException;
}

/* We used list and not map because we want to preserve the order of the stops which is ascending on the way to
destination and descending on the way back. A list will keep the order that we put stuff in. We used a pair
to avoid defining a custom class like

class myStop
{
    String stopNumer;
    String stopName;
}
*/