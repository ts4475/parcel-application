package com.edubay.dao;

import java.util.List;

public interface ParcelDAOget<Parcel, Integer> {
    List<Parcel> getParcel(int parcel_id);
}
