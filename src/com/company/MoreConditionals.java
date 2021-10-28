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
        else if (space > size1 & size1> size2) {
            return 1;
        }
        else if (space > size2 & size2> size1){
            return 2;
        }
        else if (size1>space & size2<space){
            return 2;
        }
        else if ( size2>space & size1<space){
            return 1;
        }
        else return 0;
    }

    public static boolean makeBench(int small, int big, int goal){
        if(big*5+small>=goal & goal%5 <= small){
            return true;
        }
        else{
            return false;
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
        System.out.println("Make bench 3 1 8 is " + makeBench(3,1,8));
        System.out.println("Make bench 3 1 9 is " + makeBench(3,1,9));
        System.out.println("Make bench 11 1 15 is " + makeBench(11,1,15));
        System.out.println("Make bench 4 2 15 is " + makeBench(4,2,15));
        System.out.println("Make bench 20 0 20 is " + makeBench(20,0,20));
        System.out.println("Make bench 3 4 20 is " + makeBench(3,4,20));
        System.out.println("Make bench 0 6 30 is " + makeBench(0,6,30));
        System.out.println("Make bench 0 5 30 is " + makeBench(0,5,30));
        System.out.println("Make benches 2 6 23 is " + makeBench(2,6,23));

        /*
        System.out.println("Make bench 3 1 8 is " + makeBench(3,1,8)); true
System.out.println("Make bench 3 1 9 is " + makeBench(3,1,9));false
System.out.println("Make bench 11 1 15 is " + makeBench(11,1,15));true
System.out.println("Make bench 4 2 15 is " + makeBench(4,2,15));false
System.out.println("Make bench 20 0 20 is " + makeBench(20,0,20));true
System.out.println("Make bench 3 4 20 is " + makeBench(3,4,20));true
System.out.println("Make bench 0 6 30 is " + makeBench(0,6,30));true
System.out.println("Make bench 0 5 30 is " + makeBench(0,5,30));false
System.out.println("Make benches 2 6 23 is " + makeBenches(2,6,23));false
         */
    }
}
