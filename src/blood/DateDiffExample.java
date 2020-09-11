package blood;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import org.joda.time.Days;
import org.joda.time.LocalDate;

/**
 * Java Program to find number of days between two dates in Java.
 * This program calculate difference between two dates in days using two ways
 * without using third party library and by using joda-time library.
 *
 * @author WINDOWS 8
 */

public class DateDiffExample {   
    
    private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    
    public static void main(String args[]) throws ParseException{
        
      System.out.println("Please enter two dates in format yyyy/MM/dd to compare");
      Scanner reader = new Scanner(System.in);
      
     // String first = reader.nextLine();
    //  String second = reader.nextLine();
    
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
Date date = new Date();
java.util.Date first = new SimpleDateFormat("dd/MM/yyyy").parse("12" +"/"+"12" +"/"+"1990");
System.out.println(dateFormat.format(first));
//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
      //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
           //  Calendar cal = Calendar.getInstance();
          //  java.util.Date one = getDate(first);
         //  LocalDate localDate = LocalDate.now();
            //java.util.Date two = getDate(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
      //Date one = getDate(first);
    //  Date two = getDate(second);
       // System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
      // quick and dirty way, work but not in all conditions
      // you can convert date into milliseconds then subtract
      // them and again convert it to days
 //     long numberOfDays = daysBetween(one, two);
    //  System.out.printf("Number of days between date %s and %s is : %d %n",
      //        first, second, numberOfDays);
          
      
      // a better way to calculate difference between two dates in Java
      // is by using JodaTime library as shown below
      //int differenceBetweenDates = daysBetweenUsingJoda(one, two);
      //System.out.printf("difference betweeen two dates %s and %s is : %d %n",
        //      first, second, differenceBetweenDates);
      
      
      reader.close();
    }
    
    /*
     * Simple way to parse String to date in Java
     */
    private static Date getDate(String date) throws ParseException{
        return df.parse(date);
    }
    
    
    /*
     * Java Method to calculate difference between two dates in Java
     * without using any third party library.
     */
    private static long daysBetween(Date one, Date two) {
        long difference =  (one.getTime()-two.getTime())/86400000;
        return Math.abs(difference);
    }
    
   
    /*
     * Java Method to find number of days between two dates
     * in Java using JodaTime library. To find difference 
     * we first need to convert java.util.Date to LocalDate
     * in JodaTime.
     */
    public static int daysBetweenUsingJoda(Date d1, Date d2){
        return Days.daysBetween(
                new LocalDate(d1.getTime()), 
                new LocalDate(d2.getTime())).getDays();
    }
}
