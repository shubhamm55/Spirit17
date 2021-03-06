package com.spit.spirit17.HelperClasses;

/**
 * Created by Tejas on 04/01/2017.
 */

public class Event {
    //////////Custom data type for events//////////
    private String name, type,category, venue, time, registration, prizes, contact1_name, contact1_no, contact2_name, contact2_no, color;
    private int image, favourite, reminder;

    public Event(String name,String type,String category, String venue, String time, String registration, String prizes,
                 String contact1_name, String contact1_no, String contact2_name, String contact2_no, String color) {
        //Used for inserting events in database on first launch
        this.name = name;
        this.type = type;
        this.category = category;
        this.venue = venue;
        this.time = time;
        this.registration = registration;
        this.prizes = prizes;
        this.contact1_name = contact1_name;
        this.contact1_no = contact1_no;
        this.contact2_name = contact2_name;
        this.contact2_no = contact2_no;
        this.color=color;
    }

    public Event(String name,String type ,String category, int image, String venue, String time, String registration, String prizes,
                 String contact1_name, String contact1_no, String contact2_name, String contact2_no, int favourite, int reminder, String color)
    {
        //Used while fetching data
        this.name = name;
        this.type = type;
        this.category = category;
        this.image = image;
        this.venue = venue;
        this.time = time;
        this.registration = registration;
        this.prizes = prizes;
        this.contact1_name = contact1_name;
        this.contact1_no = contact1_no;
        this.contact2_name = contact2_name;
        this.contact2_no = contact2_no;
        this.favourite = favourite;
        this.reminder = reminder;
        this.color = color;
    }
    public String getVenue() {
        return venue;
    }

    public String getTime() {
        return time;
    }

    public String getRegistration(){
        return registration;
    }

    public String getPrizes(){
        return prizes;
    }

    public String getContact1_name() {
        return contact1_name;
    }

    public String getContact2_name() {
        return contact2_name;
    }

    public String getContact1_no() {
        return contact1_no;
    }

    public String getContact2_no() {
        return contact2_no;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getFavourite() {
        return favourite;
    }

    public int getReminder() {
        return reminder;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getImage(){
        return image;
    }

    public String getColor() {
        return color;
    }

}
