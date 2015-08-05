package com.Task

class Profile {
	static belongsTo = User 
    byte[] photo 
    String fullName
    String bio
    String homepage
    String email
    String timezone
    String country
    String jabberAddress
    static constraints = {
    }
}
