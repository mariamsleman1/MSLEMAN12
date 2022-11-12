package com.example.resturantmariam;

public class dinner {
    private boolean meal1dinner;
    private boolean meal2dinner;
    private boolean meal3dinner;
    private boolean meal4dinner;
    public dinner(boolean meal1dinner , boolean meal2dinner, boolean meal3dinner, boolean meal4dinner){
        this.meal1dinner= meal1dinner ;
        this.meal2dinner=meal2dinner;
        this.meal3dinner=meal3dinner;
        this.meal4dinner=meal4dinner;}
    public boolean getmeal1dinner() {
        return this.meal1dinner; }
    public boolean getmeal2dinner() {
        return this.meal2dinner; }
    public boolean getmeal3dinner() {
        return this.meal3dinner; }
    public boolean getmeal4dinner() {
        return this.meal4dinner; }
    public void setmeal1dinner (boolean meal1dinner) {
        this.meal1dinner = meal1dinner;}
    public void setmeal2dinner(boolean meal2dinner) {
        this.meal2dinner = meal2dinner;}
    public void setmeal3dinner(boolean meal3dinner) {
        this.meal3dinner = meal3dinner;}
    public void setmeal4dinner (boolean meal4dinner ) {
        this.meal4dinner = meal4dinner;}
    public String toString() {
        return ("meal 1" + meal1dinner +"meal2"+
                meal2dinner+"meal3" +meal3dinner + "meal4" +meal4dinner);}
}
