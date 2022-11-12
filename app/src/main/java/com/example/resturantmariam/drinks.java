package com.example.resturantmariam;

public class drinks {
    private boolean drink1;
    private boolean drink2;
    private boolean drink3;
    private boolean drink4;
    public drinks(boolean drink1 , boolean drink2 , boolean drink3, boolean drink4){
        this.drink1= drink1;
        this.drink2=drink2;
        this.drink3=drink1;
        this.drink4=drink4;}
    public boolean getdrink1() {
        return this.drink1; }
    public boolean getdrink2() {
        return this.drink2; }
    public boolean getdrink3() {
        return this.drink3; }
    public boolean getdrink4() {
        return this.drink4; }
    public void setdrink1 (boolean drink1t) {
        this.drink1= drink1;}
    public void setdrink2(boolean drink2) {
        this.drink2 = drink2;}
    public void setdrink3(boolean drink3) {
        this.drink3 = drink3;}
    public void setdrink4 (boolean drink4 ) {
        this.drink4 = drink4;}
    public String toString() {
        return ("meal1"+ drink1 +"meal2"+ drink2+"meal3" +drink3 + "meal4" +drink4);}
}
