package com.company;

public class Login {
String username;
String password;
Login(){
username="swaraj";
password="1234";
}
boolean validate( String username, String password) {
if(this.username.equalsIgnoreCase(username) &&
this.password.equals(password))
return true;
else
return false;
}
}