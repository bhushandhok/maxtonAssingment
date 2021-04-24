package com.maxton.model;

import com.maxton.DateMerger;

import java.text.ParseException;
import java.util.Date;

public class DateRange {
    private String fromDate;
    private String toDate;
    private Date dStartDate;
    private Date dEndDate;
    public DateRange(String fromDate, String toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.dStartDate = DateMerger.getDate(fromDate);
        this.dEndDate = DateMerger.getDate(toDate);
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Date getdStartDate() {
        return dStartDate;
    }

    public void setdStartDate(Date dStartDate) {
        this.dStartDate = dStartDate;
    }

    public Date getdEndDate() {
        return dEndDate;
    }

    public void setdEndDate(Date dEndDate) {
        this.dEndDate = dEndDate;
        this.setToDate(DateMerger.getStrDate(dEndDate));
    }

    @Override
    public String toString() {
        return "DateRange{" +
                "fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", dStartDate=" + dStartDate +
                ", dEndDate=" + dEndDate +
                '}';
    }
}
