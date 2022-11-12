package com.example.resturantmariam;

public class lunch {
    private boolean meal1lunch;
    private boolean meal2lunch;
    private boolean meal3lunch;
    private boolean meal4lunch;
    public lunch(boolean meal1lunch , boolean meal2lunch, boolean meal3lunch, boolean meal4lunch){
        this.meal1lunch= meal1lunch ;
        this.meal2lunch=meal2lunch;
        this.meal3lunch=meal3lunch;
        this.meal4lunch=meal4lunch;}
    public boolean getmeal1lunch() {
        return this.meal1lunch; }
    public boolean getmeal2lunch() {
        return this.meal2lunch; }
    public boolean getmeal3lunch() {
        return this.meal3lunch; }
    public boolean getmeal4lunch() {
        return this.meal4lunch; }
    public void setmeal1lunch (boolean meal1lunch) {
        this.meal1lunch = meal1lunch;}
    public void setmeal2lunch(boolean meal2lunch) {
        this.meal2lunch = meal2lunch;}
    public void setmeal3lunch(boolean meal3lunch) {
        this.meal3lunch = meal3lunch;}
    public void setmeal4lunch(boolean meal4lunch) {
        this.meal4lunch = meal4lunch;}
    public String toString() {
        return ("meal 1 lunch"+meal1lunch+"meal2 lunch "+ meal2lunch +"melas 3 lunch"+ meal3lunch +"meal4lunch" +meal4lunch);}
}
