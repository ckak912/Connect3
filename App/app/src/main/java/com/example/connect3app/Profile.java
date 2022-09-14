package com.example.connect3app;


// Profile class containing all variables & getters required throughout the app
public abstract class Profile {

    protected String userName;
    protected int age;
    protected String email;
    protected String password;
    protected int profilePic;
    protected float rep;
    protected String url;
    protected String bio;



// Constructor for all profiles, rep starts at 5 for all profiles
    public Profile(String userName,int age,String email,String password,int profilePic,float rep,String url,String bio) {
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.profilePic = profilePic;
        this.rep = rep;
        this.url = url;
        this.bio = bio;
    }

// Getters for Profiles
    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public float getRep() {
        return rep;
    }

    public String getUrl() {
        return url;
    }

    public String getBio() {
        return bio;
    }



}