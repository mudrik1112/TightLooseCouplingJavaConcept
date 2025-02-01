package com.loose.coupling;

public class UserDatabaseProvider  implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Get user details from database
        return "user Details From Database";
    }
}
