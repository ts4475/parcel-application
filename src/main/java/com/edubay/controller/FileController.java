package com.edubay.controller;

import com.edubay.dao.ParcelDAOdelete;
import com.edubay.dao.ParcelDAOget;
import com.edubay.dao.ParcelDAOpost;
import com.edubay.dao.ParcelDAOput;
import com.edubay.model.Parcel;
import com.edubay.model.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
    public class FileController
    {
        @Autowired
        private ParcelDAOget parcelDAOget;

        @Autowired
        private ParcelDAOpost parcelDAOpost;

        @Autowired
        private ParcelDAOput parcelDAOput;

        @Autowired
        ParcelDAOdelete parcelDAOdelete;

        @GetMapping("/parcel/{parcel_id}")
        @ResponseStatus(HttpStatus.OK)
        @CrossOrigin(origins = "*")
        List<Parcel> getParcelByID(@PathVariable Integer parcel_id) {
            return parcelDAOget.getParcel(parcel_id);
        }


        public FileController() throws IOException {
        }

        @PostMapping("/parcel")
        @ResponseStatus(HttpStatus.OK)
        @CrossOrigin(origins = "*")

        public Response saveParcel(@RequestBody Parcel parcel)
        {
            parcelDAOpost.saveParcel(parcel.getDate_of_Booking(),parcel.getDate_of_Delivery(),parcel.getFrom_Address(),parcel.getFrom_Name(),parcel.getTo_Address(),parcel.getTo_Name());
            Response response = new Response();
            response.setMessage("Data Inserted");
            response.setSuccess(true);
            return response;

        }
        @PutMapping("/parcel/{parcel_id}")
        @ResponseStatus(HttpStatus.OK)
        @CrossOrigin(origins = "*")
        public Response updateParcel(@PathVariable Integer parcel_id,@RequestBody Parcel parcel)
        {
            parcelDAOput.updateParcel(parcel_id,parcel.getDate_of_Booking(),parcel.getDate_of_Delivery(),parcel.getFrom_Address(),parcel.getFrom_Name(),parcel.getTo_Address(),parcel.getTo_Name());
            Response response = new Response();
            response.setMessage("Data Updated");
            response.setSuccess(true);
            return response;

        }

        @DeleteMapping("/parcel/{parcel_id}")
        @ResponseStatus(HttpStatus.OK)
        @CrossOrigin(origins = "*")
        public  Response deleteParcel(@PathVariable Integer parcel_id){
            parcelDAOdelete.deleteParcel(parcel_id);
            Response response = new Response();
            response.setMessage("Data Deleted");
            response.setSuccess(true);
            return response;
        }



}
