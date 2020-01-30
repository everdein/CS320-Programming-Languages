package Regex_API_Java;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_API_SSN
{
    public static void main(String[] args)
    {
        List<String> phoneNumbers = new ArrayList<>();

        phoneNumbers.add("123-45-6789");

//        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);

        for (String phoneNumber : phoneNumbers)
        {
            Matcher matcher = pattern.matcher(phoneNumber);
            while(matcher.find())
            {
                System.out.print(matcher.group(0) + "\n\n");
            }
        }
    }
}
