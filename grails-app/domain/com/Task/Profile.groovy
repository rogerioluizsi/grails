package com.Task

class Profile {
	 static belongsTo = User /* Indica que esta classe tem um relacionamento com "User" e indica como deve funcionar o cascade: ao atualizar ou remover um usuário, atualizar ou remover um perfil. */
    byte[] photo /* Usado para armazenar uma imagem. Na base é um Blob. */
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
