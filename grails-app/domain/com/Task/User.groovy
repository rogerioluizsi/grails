package com.grailsinaction
class User {
     String userId
     String password
     String homepage
     Date dateCreated


Profile profile

profile(nullable: true)

static mapping = {
     profile lazy:false

static hasMany = [ posts : Post, tags : Tag, following : User ]}