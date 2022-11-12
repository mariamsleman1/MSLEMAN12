package com.example.resturantmariam;

public class coustumer {
    private String name ;
    private int pasword;

    public coustumer(String name , int phonenumber) {
        this.name = name;
        this.pasword = phonenumber;
    }
    public String getname() {
        return this.name; }

    public int getpaswordr() {
        return this.pasword; }



    public void setname (String name) {
        this.name = name;}

    public void setpasword(int phonenumber) {
        this.pasword = phonenumber;}

    public String toString() {
        return (
                "name"+name +"pasword "+ pasword);}
}
