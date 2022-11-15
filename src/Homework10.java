import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.File;

/**
 * This program will read each line of the file states.csv.
 * then print the lines that have valid data (that is lines that have 6 fields).
 *
 * @author Chris Smitherman
 * @since November 2022
 */
public class Homework10 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "states.csv";
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        if(input.hasNextLine()){    //This if statement throws away the first line.
            input.nextLine();
        }
        while(input.hasNext()){
            String line = input.nextLine();
            try{
                String[] fields = line.split("\t");
                String[] nicknames = fields[1].split("#");
                if(fields.length == 6) {
                    String output = String.format("%-15s %-24s %-10s %-15s %,11d %s", fields[0], nicknames[nicknames.length - 1].trim(), toDate(fields[2]), fields[3], toInt(fields[4]), fields[5]);
                    System.out.println(output);
                }
            }catch(Exception ignored) {}
        }
    }

    /**
     * Converts a string that contains an integer to an int
     * @param s a string to change into a number
     * @return the integer version of the string. Returns Integer.MIN_VALUE if an error occurs
     */
    public static int toInt(String s){
        int result = Integer.MIN_VALUE;
        try{
            result = Integer.parseInt(s.trim());
        }catch(Exception ignored){

        }
        return result;
    }

    /**
     * Converts a string representation of a date to a LocalDate object
     * @param s A string date in the format "Year-Month-Day"
     * @return The LocalDate equivalent of the string. Returns null if an error occurs
     */
    public static LocalDate toDate(String s){
        LocalDate result = null;
        int year, month, day;
        try{
            String[] dateParts = s.split("-");
            if(dateParts.length == 3){
                year = toInt(dateParts[0]);
                month = toInt(dateParts[1]);
                day = toInt((dateParts[2]));
                result = LocalDate.of(year, month, day);
            }
        }catch (Exception ignored){}
        return result;
    }
}
