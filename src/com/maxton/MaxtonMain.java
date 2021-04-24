package com.maxton;

import com.maxton.model.DateRange;

import java.util.ArrayList;
import java.util.List;

public class MaxtonMain {
    public static void main(String[] args) {
        List<DateRange> dateRangeList = new ArrayList(){{
            add(new DateRange("01 Jan 2014", "30 Jan 2014"));
            add(new DateRange("15 Jan 2014", "15 Feb 2014"));
            add(new DateRange("10 Mar 2014", "15 Apr 2014"));
            add(new DateRange("10 Apr 2014", "15 May 2014"));
        }};

        System.out.println("-----------------//Input Data//----------");
        dateRangeList.forEach(x-> {
            System.out.println(x);
        });

        System.out.println("===============//Output Data//================");
        List<DateRange> dateRangeOut = DateMerger.mergeDates(dateRangeList);
        dateRangeOut.forEach(x-> {
            System.out.println(x);
        });
        System.out.println("**********************************************************");
        dateRangeList = new ArrayList(){{
           add(new DateRange("01 Jan 2014" ,"15 Jan 2014"));
                   add(new DateRange("16 Jan 2014", "30 Jan 2014"));
        }};
        System.out.println("-----------------//Input Data//----------");
        dateRangeList.forEach(x-> {
            System.out.println(x);
        });

        dateRangeOut = DateMerger.mergeDates(dateRangeList);
        System.out.println("===============//Output Data//================");
        dateRangeOut.forEach(x-> {
            System.out.println(x);
        });
        System.out.println("**********************************************************");
        dateRangeList = new ArrayList(){{
            add(new DateRange("01 Jan 2014" ,"15 Jan 2014"));
            add(new DateRange("15 Jan 2014", "30 Jan 2014"));
        }};
        System.out.println("-----------------//Input Data//----------");
        dateRangeList.forEach(x-> {
            System.out.println(x);
        });

        dateRangeOut = DateMerger.mergeDates(dateRangeList);
        System.out.println("===============//Output Data//================");
        dateRangeOut.forEach(x-> {
            System.out.println(x);
        });




    }
}
