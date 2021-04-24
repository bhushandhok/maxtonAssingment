package com.maxton;

import com.maxton.model.DateRange;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateMerger {
    public static final String ddMMyyyy_WITH_HYPHEN = "dd MMM yyyy";
    public static SimpleDateFormat sdf = null;
    public static SimpleDateFormat String_sdf = null;

    static {
        sdf = new SimpleDateFormat(ddMMyyyy_WITH_HYPHEN);
        String_sdf = new SimpleDateFormat(ddMMyyyy_WITH_HYPHEN);
    }


    public static List<DateRange> mergeDates(List<DateRange> dateRanges) {
        List<DateRange> dateRanges1 = new ArrayList<>();
        Comparator<DateRange> comparator = (o1,o2)->{
            return o1.getdStartDate().compareTo(o2.getdStartDate());
        };
        Collections.sort(dateRanges,comparator);
        List<DateRange> ret = new ArrayList<>();
        for (DateRange dateRange : dateRanges) {
            if(ret.size() == 0){
                ret = new ArrayList<>();
                ret.add(dateRange);
            }else {
                if(isDateRange(ret, dateRange)){
                   ret.add(dateRange);
                }
            }
        }
        return ret;
    }

    private static boolean isDateRange(List<DateRange> ret, DateRange dateRange) {
        for (DateRange range : ret){
            if(range.getdEndDate().after(dateRange.getdStartDate()) ||
                    range.getdEndDate().equals(dateRange.getdStartDate())){
                range.setdEndDate(dateRange.getdEndDate());

                return false;
            }
        }
        return true;
    }


    public static Date getDate(String date){
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String getStrDate(Date date){
        return sdf.format(date);
    }
}
