package com.bitbook.Models;

/**
 * A User class used for storing data from the Users table of the database
 */
public class User {
    /** The username of the User */
    private String username;
    /** The password of the User | */
    private String password;
    /** The email address of the User | NN */
    private String email;
    /** The first name of the User */
    private String firstName;
    /** The last name of the User */
    private String lastName;
    /** The date of birth of the User | NN */
    private String dateOfBirth;
    /** The path to the uploaded picture of the User */
    private String pathToPicture;
    /** The signup date of the User | NN */
    private String signUpDate;
    /** The status of if the User is a member | NN */
    private int membership;


    public User(String username, String password, String email, String lastName, String firstName, String dateOfBirth, String pathToPicture, String signUpDate, int membership) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.pathToPicture = pathToPicture;
        this.signUpDate = signUpDate;
        this.membership = membership;
    }

    /**
     * A default equals function to compare two User objects
     * @param o User to be compared with
     * @return Returns a if two given Users are equal or not
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) 0;
        return username.equals(user.username) &&
                password.equals(user.password) &&
                email.equals(user.email) &&
                firstName.equals(user.firstName) &&
                lastName.equals(user.lastName) &&
                dateOfBirth.equals(user.dateOfBirth) &&
                pathToPicture.equals(user.pathToPicture) &&
                signUpDate.equals(user.signUpDate) &&
                (membership == user.membership);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPathToPicture() {
        return pathToPicture;
    }

    public void setPathToPicture(String pathToPicture) {
        this.pathToPicture = pathToPicture;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }
}
