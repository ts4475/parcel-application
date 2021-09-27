package com.edubay.dao.impl;

import com.edubay.dao.ParcelDAOput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;


@Component
public class ParcelDAOputImpl implements ParcelDAOput //dao base class
{

    private static final String SQL_UPDATE_PARCEL= "UPDATE parcel SET date_of_booking=?,date_of_delivery=? ,from_address=?,from_name=?,to_address=?,to_name=? WHERE parcel_id=?";

   @Autowired
    DataSource dataSource;

    @Override
    public void updateParcel(Integer parcel_id,LocalDate date_of_booking,LocalDate date_of_delivery,String from_address, String from_name,String to_address,String to_name) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(SQL_UPDATE_PARCEL))
        {
            ps.setDate(1, Date.valueOf(date_of_booking));
            ps.setDate(2, Date.valueOf(date_of_delivery));
            ps.setString(3, from_address);
            ps.setString(4,from_name);
            ps.setString(5, to_address);
            ps.setString(6, to_name);
            ps.setInt(7,parcel_id);
            ps.execute();
        }
        catch (SQLException throwables) {

            throw new RuntimeException("Error on  saving course application details", throwables);
        }
    }



}
