/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekdaycalculator;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class WeekdayCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("05 26 1985 => " + weekday(05, 26, 1985));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		//put a function call for weekday() here
		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
                String date = "";
                
                
		

                //bunch of calculations go here
                
                yy = yyyy - 1900;
                total = (yy / 4) + yy + dd + Integer.parseInt(month_offset(mm));
                
                if(is_leap(yyyy)){
                
                    total --;
                }
                 dd = total % 7;
                 
               
		date = month_name(mm) + ", " + weekday_name(dd) + " " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
        public static String month_name(int month){
           String Jan, Feb, Mar, Apr, May, Jun, Jul, Aug,Sep, Oct, Nov, Dec, err;
           err = "error";
          
            switch(month){
                 case 1: {
                    Jan = "January";
                    return  Jan;
                 }
                 case 2:{
                     Feb = "Febuary";
                    return  Feb;
                 }
                 case 3:{
                     Mar = "March";
                    return  Mar;
                 }
                 case 4:{
                     Apr = "April";
                    return  Apr;
                 }
                 case 5:{
                     May = "May";
                    return  May;
                 }
                 case 6:{
                     Jun = "June";
                    return  Jun;
                 }
                 case 7:{
                     Jul = "July";
                    return  Jul;
                 }
                 case 8:{
                     Aug = "August";
                    return  Aug;
                 }
                 case 9:{
                     Sep = "September";
                    return  Sep;
                 }
                 case 10:{
                     Oct = "October";
                    return  Oct;
                 }
                 case 11:{
                     Nov = "November";
                    return  Nov;
                 }
                 case 12:{
                     Dec = "December";
                    return  Dec;
                 }
                 default:{

                     return err;
                 }

            }
        }
        
         public static String month_offset(int month){
           String Jan, Feb, Mar, Apr, May, Jun, Jul, Aug,Sep, Oct, Nov, Dec, err;
           err = "-1";
          
       switch(month){
            case 1: {
               Jan = "1";
               return  Jan;
            }
            case 2:{
                Feb = "4";
               return  Feb;
            }
            case 3:{
                Mar = "4";
               return  Mar;
            }
            case 4:{
                Apr = "0";
               return  Apr;
            }
            case 5:{
                May = "2";
               return  May;
            }
            case 6:{
                Jun = "5";
               return  Jun;
            }
            case 7:{
                Jul = "0";
               return  Jul;
            }
            case 8:{
                Aug = "3";
               return  Aug;
            }
            case 9:{
                Sep = "6";
               return  Sep;
            }
            case 10:{
                Oct = "1";
               return  Oct;
            }
            case 11:{
                Nov = "4";
               return  Nov;
            }
            case 12:{
                Dec = "6";
               return  Dec;
            }
            default:{
            
                return err;
                
            }
            
         
        }
                
        
            
        
    }
	
          public static String weekday_name( int weekday )
	{
		String mon, tues, wed, thurs, fri, sat, sun, err;
                
                err = "error";
                
        switch (weekday) {
            case 1:{
                sun = "Sunday";
                return sun;
            }
            case 2:{
                mon = "Monday";
                return mon;
            }
            case 3:{
                tues = "Tuesday";
                return tues;
            }
            case 4:{
                wed = "Wednesday";
                return wed;
            }
            case 5:{
                thurs = "Thursday";
                return thurs;
            }
            case 6:{
                fri = "Friday";
                return fri;
            }
            case 7:{
                sat = "Saturday";
                return sat;
            }
            case 0:{
                sat = "Saturday";
                return sat;
            }
            default:{
                
                return err;
            }
        }
                
		
		
	}

         
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
        
        
        
        
       
    


}
