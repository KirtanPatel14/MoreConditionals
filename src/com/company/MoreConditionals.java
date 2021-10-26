package com.company;

public class MoreConditionals{
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0)&& ( year %400 == 0 || year % 100 !=0));
        }
    public static boolean isLater( int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1 > year2){
            return true;
        }
        if (year2> year1){
            return false;
        }
        if (month1> month2){
            return true;
        }
        if (month1<month2){
            return false;
        }
        if (day1> day2){
            return true;
        }
        if (day2>day1){
            return false;
        }
        else{
            return false;
        }
    }
    public static int findBestFit(int size1, int size2, int space){
        if (size1+size2<=space){
            return 3;
        }
        else if (size1>size2){
            return 1;
        }
        else if (size2>size1){
            return 2;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2004 " + isLeapYear(2004));
        System.out.println("2003 " + isLeapYear(2003));
        System.out.println("2100 " + isLeapYear(2100));
        System.out.println("     ");
        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010 " + isLater(1,2,2011, 1,2,2010));
        System.out.println("1/5/2010 is later than 3/2/2010 " + isLater(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
        System.out.println("1/2/2010 is later than 1/3/2010 " + isLater(1,2,2010, 1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is later than 1/2/2011 " + isLater(4,8,2010, 1,2,2011));
        System.out.println("  ");
        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));
    }
}
