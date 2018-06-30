/*
 * Copyright (c) 2018. Tina Taylor All Rights Reserved
 */

package com.freecbdhomebiz.brandonflusa;

/**
 * Created by linuser1 on 6/29/18.
 */

public class ThePlace {

    /**
     * Used to determine if the place has an image associated with it
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** The name of the place */
    private String mName;
    /** The address of the place */
    private String mAddress;
    /** Phone number of the Place */
    private String mPhone;
    /** Image for the Place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /**
     *Create ThePlace object with 3 inputs
     */
    public ThePlace(String Name, String Address, String Phone ){
        mName = Name;
        mAddress = Address;
        mPhone = Phone;
    }

    /**
     *Create ThePlace object with 4 inputs
     */
    public ThePlace(String Name, String Address, String Phone, int imageResourceId ){
        mName = Name;
        mAddress = Address;
        mPhone = Phone;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the address of the place.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the phone number of the place.
     */
    public String getPhone() {
        return mPhone;
    }

    /**
     *  Get the image for the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /** Determines whether place has an image, resource Ids would be positive numbers  */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}
