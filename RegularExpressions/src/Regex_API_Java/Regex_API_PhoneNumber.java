package Regex_API_Java;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_API_PhoneNumber
{
    public static void main(String[] args)
    {
        List<String> phoneNumbers = new ArrayList<>();

        phoneNumbers.add("1234567890");
        phoneNumbers.add("123-456-7890");
        phoneNumbers.add("123.456.7890");
        phoneNumbers.add("123 456 7890");
        phoneNumbers.add("(123) 456 7890");

        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

        Pattern pattern = Pattern.compile(regex);

        for (String phoneNumber : phoneNumbers)
        {
            Matcher matcher = pattern.matcher(phoneNumber);
            while(matcher.find())
            {
                System.out.println(matcher.group(0));
                System.out.print(matcher.group(1) + matcher.group(2) + matcher.group(3) + "\n\n");
            }
        }
    }
}
