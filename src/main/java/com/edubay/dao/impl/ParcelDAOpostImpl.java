package com.edubay.dao.impl;

import com.edubay.dao.ParcelDAOpost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

@Component
public class ParcelDAOpostImpl implements ParcelDAOpost {

    private static final String SQL_INSERT_PARCEL = "INSERT INTO parcel (date_of_booking,date_of_delivery,from_address,from_name,to_address,to_name)" +
            "VALUES ( ?, ?, ?, ?,?,?)";


    @Autowired
    DataSource dataSource;

    @Override
    public void saveParcel(LocalDate date_of_booking,LocalDate date_of_delivery,String from_address, String from_name,String to_address,String to_name)
    {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(SQL_INSERT_PARCEL))
        {

            ps.setDate(1, Date.valueOf(date_of_booking));
            ps.setDate(2, Date.valueOf(date_of_delivery));
            ps.setString(3, from_address);
            ps.setString(4, from_name);
            ps.setString(5, to_address);
            ps.setString(6, to_name);
//            ps.setInt(7, user_id);
           // ps.setInt(8, 1);
            ps.execute();
        }

        catch (SQLException throwables)
        {
            throw new RuntimeException("Error  on saving Passport details", throwables);
        }


    }
}
