package com.edubay.dao.impl;

import ch.qos.logback.core.db.ConnectionSource;
import com.edubay.dao.ParcelDAOdelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

@Component
public class ParcelDAOdeleteImpl implements ParcelDAOdelete {
    private static final String SQL_DELETE_PARCEL = "DELETE FROM parcel WHERE parcel_id=?";

    @Autowired
    DataSource dataSource;

    @Override
    public void deleteParcel(Integer parcel_id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(SQL_DELETE_PARCEL))
        {
            ps.setInt(1, parcel_id);
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
