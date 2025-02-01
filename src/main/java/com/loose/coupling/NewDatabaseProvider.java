package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Get user details from new database
        return "user Details From New Database";
    }
}
