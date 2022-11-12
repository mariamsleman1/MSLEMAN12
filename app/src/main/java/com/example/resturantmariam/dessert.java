package com.example.resturantmariam;

public class dessert {
    private boolean meal1dessert;
    private boolean meal2dessert;
    private boolean meal3dessert;
    private boolean meal4dessert;
    public dessert(boolean meal1dessert , boolean meal2dessert , boolean meal3dessert, boolean meal4dessert){
        this.meal1dessert= meal1dessert;
        this.meal2dessert=meal2dessert;
        this.meal3dessert=meal3dessert;
        this.meal4dessert=meal4dessert;}
    public boolean getmeal1dessert() {
        return this.meal1dessert; }
    public boolean getmeal2dessert() {
        return this.meal2dessert; }
    public boolean getmeal3dessert() {
        return this.meal3dessert; }
    public boolean getmeal4dessert() {
        return this.meal4dessert; }
    public void setmeal1dessert (boolean meal1dessert) {
        this.meal1dessert = meal1dessert;}
    public void setmeal2dessert(boolean meal2dessert) {
        this.meal2dessert = meal2dessert;}
    public void setmeal3dessert(boolean meal3dessert) {
        this.meal3dessert = meal3dessert;}
    public void setmeal4dessert (boolean meal4dessert ) {
        this.meal4dessert = meal4dessert;}
    public String toString() {
        return ("meal1" + meal1dessert +"meal2"+
                meal2dessert+" meal3"+meal3dessert + "meal4"
        +meal4dessert);}
}
