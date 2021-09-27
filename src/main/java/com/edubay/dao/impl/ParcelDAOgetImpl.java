package com.edubay.dao.impl;

import com.edubay.dao.ParcelDAOget;
import com.edubay.model.Parcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ParcelDAOgetImpl implements ParcelDAOget {
    @Autowired
    DataSource dataSource;

    @Override
    public List<Parcel> getParcel(int parcel_id) {
        List<Parcel> parcelList = new ArrayList<>();
        try(Connection connection = dataSource.getConnection()){
            try(PreparedStatement ps = connection.prepareStatement("SELECT * FROM parcel where parcel_id=?")){
                ps.setInt(1, parcel_id);
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        Parcel parcel = new Parcel();
                        parcel.setParcelId(rs.getInt("parcel_id"));
                        parcel.setFrom_Address(rs.getString("from_Address"));
                        parcel.setFrom_Name(rs.getString("from_Name"));
                        parcel.setTo_Address(rs.getString("to_Address"));
                        parcel.setTo_Name(rs.getString("to_Name"));
//                        parcel.setUser_id(rs.getInt("user_id"));
                        parcelList.add(parcel);
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return parcelList;
    }

}
