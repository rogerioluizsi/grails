package com.Task

class Post {
	String content
    Date dateCreated

    static hasMany = [ tags : Tag ]
    static constraints = {
    }
     static belongsTo = [ user : User ] /* Isso faz o relacionamento bidirecional*/
}
