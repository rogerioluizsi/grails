package com.Task

class Tag {

   String name
    User user
    static constraints = {
        name(blank: false)
    }
    static hasMany = [ posts : Post ] /* Uma tag está em vários posts*/
    static belongsTo = [ User, Post ] /* Uma tag pertence a um usuário e também pertence a uma postagem */
}
