package com.Task
class User {
     String userId
     String password
     String homepage
     Date dateCreated


	Profile profile
	static mapping = {
    	profile lazy:false
 	}
 	static constraints = {	profile nullable:true}
	static hasMany = [ posts : Post, tags : Tag, following : User ]
}