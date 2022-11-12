package com.example.resturantmariam;

public class worker {
    private String name ;
    private int phonenumber;
    private int id ;
    public worker(String name , int id){
        this.name= name ;
        this.id=id;
    }
    public String getname() {
        return this.name; }
    public int getphonenumber() {
        return this.phonenumber; }
    public int getid() {
        return this.id; }
    public void setname(String name) {
        this.name = name;}
    public void setphonenumber(int phonenumber) {
        this.phonenumber = phonenumber;}
    public void setid(int id) {
        this.id = id;}
    public String toString() {
        return ("NAME"+name + "id" + id );}
}
