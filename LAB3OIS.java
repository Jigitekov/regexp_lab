import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

public class LAB3OIS {
    public static boolean isValidMobileNo(String str) {
        Pattern ptrn = Pattern.compile("(7/7)?[0-9][0-9]{9}");
        Matcher match = ptrn.matcher(str);
        // returns a boolean value
        return (match.find() && match.group().equals(str));
    }

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\as\\d.txt");
        BufferedReader buffRdr = new BufferedReader(new FileReader(file));

        String number;
        while ((number = buffRdr.readLine()) != null) {
            char firstChar = number.charAt(0);
            if (firstChar == '+') {
                String newNumber = number.substring(1);
                // System.out.println(newNumber);
                if (isValidMobileNo(newNumber))
                    System.out.println("new - " + newNumber);
            }
        }
    }
}