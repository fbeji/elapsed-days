package edu.cnm.deepdive.util;

public class DateOnly {

  private static final int DAYS_PER_YEAR = 365;
  private static final int BASELINE_YEAR = 1970;
  private static final int[] DAYS_IN_MONTH = { 31,28, 31,30,31,30,31,30,31,30,31,30};
  private static final int BASELINE_LEAP_DAYS = 0;

 public static int elapsedDays(int year, int month, int day) {

   return  daysElapsed = leapDaysFromZero(year)+ dayOfYear(year,month,day)+daysInMonth(year,month)  ;

  }

  private static boolean isLeapYear(int year){
  
  return year % 4 == 0 && (year % 100 !=0 || year % 400 ==0);
  }

  private static int daysInMonth(int year, int month){

    return DAYS_IN_MONTH[month] + ((month == 1 && isLeapYear(year)) ? 1 : 0);
  }

  private static int leapDaysFromZero(int year){

    return 1 + Math.floorDiv(year -1, 4) - Math.floorDiv(year -1 , 100)+ Math.floorDiv(year -1 , 400);
  }


  private static int leapDaysFromBaseline(int year){


   return leapDaysFromZero(year)- (BASELINE_LEAP_DAYS - year) ;
  }



  private static int dayOfYear(int year, int month, int day){


   int count = 0;

   for(int i=0; i < month ; i++){

     count += daysInMonth(year,i);
   }
   return count +day -1;
  }

}



//    int refyear = 1970;
//    int refday = 1;
//    int refMonth = 1;
//    int leapday = 0;
//
//    //int years = year - refyear;
//
//    //int[] years1 = new int[years];
//
//    // leap days in year -refyear
//
//    for (int i = refyear; i < year; i++) {
//      if ((i % 4 == 0 && i % 100 != 0) || i % 400 != 0) {
//        leapday = leapday + 1;
//      }
//
//      int days = (year - refyear) * 365 + (month * 30) + leapday;
//
//      return days;
//    }
//  }// TODO Implement this method to return correct value.
//
//
//
//     for( int i = refyear; i<years; i++){
//    if ((years1[i] % 4 == 0 && years1[i] % 100 != 0) || years1[i] % 400 != 0) {
//      leapday += leapday ;
//    }
//    return leapday;
//  }
//
//  int days = (year - refyear) * 365 + day - refday + leapday;
//}