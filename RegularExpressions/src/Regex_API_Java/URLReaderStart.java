package Regex_API_Java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLReaderStart
{
    public static void main(String[] args) throws Exception
    {
        URLConnection bc = new URL("https://www.bellevuecollege.edu/courses/exams/").openConnection();
        bc.setRequestProperty("user-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        BufferedReader in = new BufferedReader(new InputStreamReader(bc.getInputStream()));

        String inputLine = "";
        String text = "";
        while ((inputLine = in.readLine()) != null)
        {
            text += inputLine + "\n";
        }

        // Removed html for fall and spring hyper links. Doesn't show null for empty exam time.
//        Pattern pattern = Pattern.compile("(?><tr><td>)(.+?)(?></td><td colspan=\"2\"><a href=\"#fall\">|</td><td colspan=\"2\"><a href=\"#spring\">|</td><td>)(.+?)(?></a></td></tr>|</td><td>)(.*?)(?=</td></tr>|</td></tr>|<tr><td>)");
        // Doesn't say null for empty exam time.
//        Pattern pattern = Pattern.compile("(?><tr><td>)(.+?)(?></td><td colspan=\"2\">|</td><td>)(.+?)(?></td></tr>|</td><td>)(.*?)(?=</td></tr>|</td></tr>|<tr><td>)");

        // Answer:
        Pattern pattern = Pattern.compile("<td>(.*?)</td>\\s*<td.*?>(.*?)</td>\\s*(<td>(.*?)</td>)?");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
//            System.out.println("Class Time: " + matcher.group(1));
//            System.out.println("Exam Day: " + matcher.group(2));
//            System.out.println("Exam Time: " + matcher.group(3));
//            System.out.println("++++++++++++++++++++++++++++++++++++++++");

            // Answer:
            System.out.println("Class Time: " + matcher.group(1));
            System.out.println("Exam Day: " + matcher.group(2));
            System.out.println("Exam Time: " + matcher.group(4));
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
        }
        in.close();
	}
}
