/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class date {

    /**
     * main class
     *
     * @param args
     */
    public static void main(String[] args) {
        date calUsage = new date();
        calUsage.performCalendarArithmetic();
    }

    /**
     * This method performs Calendar Arithmetic by adding 4 months and 5 days to
     * 6th March 2009 and prints in two date formats
     *
     */
    private void performCalendarArithmetic() {
        //Set calendar to 6th March 2009
        Calendar cal = new GregorianCalendar(2019, Calendar.FEBRUARY, 10);
        //Add 4months and 5days
        cal.add(Calendar.MONTH, 4);
        cal.add(Calendar.DAY_OF_MONTH, 5);
        //Define Format of date
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMMMM yyyy");
        String date = sdf.format(cal.getTime());
        System.out.println(date);

        //Define another Format of date
        sdf = new SimpleDateFormat("d MMMMMM yyyy hh:mm aaa");
        date = sdf.format(cal.getTime());
        System.out.println(date);
    }
}
