package com.example.retrofittest;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class Matadate
{
    @SerializedName("perPage")
    private String perPage;
    @SerializedName("data")
    private ArrayList<Raindata> Raindata;
    @SerializedName("currentCount")
    private String currentCount;
    @SerializedName("matchCount")
    private String matchCount;
    @SerializedName("page")
    private String page;
    @SerializedName("totalCount")
    private String totalCount;

    public String getPerPage ()
    {
        return perPage;
    }

    public void setPerPage (String perPage)
    {
        this.perPage = perPage;
    }

    public ArrayList<Raindata> getData ()
    {
        return Raindata;
    }

    public void setData (ArrayList<Raindata> Raindata)
    {
        this.Raindata = Raindata;
    }

    public String getCurrentCount ()
    {
        return currentCount;
    }

    public void setCurrentCount (String currentCount)
    {
        this.currentCount = currentCount;
    }

    public String getMatchCount ()
    {
        return matchCount;
    }

    public void setMatchCount (String matchCount)
    {
        this.matchCount = matchCount;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getTotalCount ()
    {
        return totalCount;
    }

    public void setTotalCount (String totalCount)
    {
        this.totalCount = totalCount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [perPage = "+perPage+", data = "+ Raindata +", currentCount = "+currentCount+", matchCount = "+matchCount+", page = "+page+", totalCount = "+totalCount+"]";
    }
}