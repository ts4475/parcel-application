package com.edubay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;



public class Parcel {

    private Integer Parcel_id;
    private String From_Name;
    private String To_Name;
    private String From_Address;
    private String To_Address;
//    private  int User_id;
    private LocalDate Date_of_Booking = LocalDate.now();
    private LocalDate Date_of_Delivery = LocalDate.now();

    public Parcel() {

    } //default constructor

    public Parcel(Integer Parcel_id, String From_Name, String To_Name, String From_Address, String To_Address,LocalDate Date_of_Booking, LocalDate Date_of_Delivery) {

        this.Parcel_id=Parcel_id;
        this.From_Name = From_Name;
        this.To_Name = To_Name;
        this.From_Address = From_Address;
        this.To_Address = To_Address;
        //this.User_id=User_id;
        this.Date_of_Booking = Date_of_Booking;
        this.Date_of_Delivery = Date_of_Delivery;

    }

    public Integer getParcelId() {
        return Parcel_id;
    }

    public void setParcelId(Integer Parcel_id) {
        this.Parcel_id = Parcel_id;
    }

    public String getFrom_Name() {
        return From_Name;
    }

    public void setFrom_Name(String From_Name) {
        this.From_Name = From_Name;
    }

    public String getTo_Name() {
        return To_Name;
    }

    public void setTo_Name(String To_Name) {
        this.To_Name = To_Name;
    }

    public String getFrom_Address() {
        return From_Address;
    }

    public void setFrom_Address(String From_Address) {
        this.From_Address = From_Address;
    }

    public String getTo_Address() {
        return To_Address;
    }

    public void setTo_Address(String To_Address) {
        this.To_Address = To_Address;
    }

//    public int getUser_id(){return User_id;}
//    public void  setUser_id(int User_id){this.User_id=User_id;}

    public LocalDate getDate_of_Booking() {
        return Date_of_Booking;
    }

    public void setDate_of_Booking(LocalDate Date_of_Booking) {
        this.Date_of_Booking = Date_of_Booking;
    }

    public LocalDate getDate_of_Delivery() {
        return Date_of_Delivery;
    }

    public void setDate_of_Delivery(LocalDate Date_of_Delivery) {
        this.Date_of_Delivery = Date_of_Delivery;
    }


    @Override
    public String toString() {
        return "Parcel{" +
                "Parcel_Id=" + Parcel_id +
                ", From_Name='" + From_Name + '\'' +
                ", To_Name='" + To_Name + '\'' +
                ", From_Address='" + From_Address + '\'' +
                ", To_Address='" + To_Address + '\'' +
                ",  Date_of_Booking='" + Date_of_Booking + '\'' +
                ", Date_of_Delivery='" + Date_of_Delivery + '\'' +
                '}';

    }


}
