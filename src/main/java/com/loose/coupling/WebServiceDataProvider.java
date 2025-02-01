package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Get user details from web service
        return "user Details From Web Service";
    }
}
