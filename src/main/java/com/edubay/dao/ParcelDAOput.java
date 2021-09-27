package com.edubay.dao;

import java.time.LocalDate;


public interface ParcelDAOput
{
    void updateParcel(Integer parcel_id,LocalDate date_of_booking,LocalDate date_of_delivery,String from_address, String from_name,String to_address,String to_name);
}
