package TableHTML;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TableHTML
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("/Users/matthewclark/Documents/GitHub/CS320 Programming Languages/RegularExpressions/src/TableHTML/table.html");
        Scanner scanner = new Scanner(file);
        String text = "";
        while(scanner.hasNextLine())
        {
            text += scanner.nextLine();
            text += "\n";
        }
        Pattern pattern = Pattern.compile("<tr>\\s*<td>(.*)</td>\\s*<td>(.*)</td>\\s*<td>(.*)</td>\\s*</tr>");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
        {
            System.out.println(matcher.group(1));
        }
    }
}