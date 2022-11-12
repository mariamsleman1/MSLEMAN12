package com.example.resturantmariam;

public class breakfast {
    private boolean meal1;
    private boolean meal2;
    private boolean meal3;
    private boolean meal4;
    public breakfast(boolean meal1 , boolean meal2, boolean meal3, boolean meal4){
        this.meal1= meal1 ;
        this.meal2=meal2;
        this.meal3=meal3;
        this.meal4=meal4;}
    public boolean getmeal1() {
        return this.meal1; }
    public boolean getmeal2() {
        return this.meal2; }
    public boolean getmeal3() {
        return this.meal3; }
    public boolean getmeal4() {
        return this.meal4; }
    public void setmeal1 (boolean meal1) {
        this.meal1 = meal1;}
    public void setmeal2(boolean meal2) {
        this.meal2 = meal2;}
    public void setmeal3(boolean meal3) {
        this.meal3 = meal3;}
    public void setmeal4(boolean meal4) {
        this.meal4 = meal4;}
    public String toString() {
        return ("maeal1"+meal1 +"meal2;"+meal2 +"meal3"+ meal3 +" meal4"+meal4);}
}
