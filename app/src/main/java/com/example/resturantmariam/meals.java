package com.example.resturantmariam;

public class meals {
    private breakfast  mealbraekfast;
    private lunch meaklunch;
    private dinner mealdinner;
    private dessert mealdessert;
    private drinks drink;
    public meals(breakfast   mealbraekfast, lunch meaklunch, dinner mealdinner, dessert mealdessert, drinks drink)
    {
        this.mealbraekfast=mealbraekfast;
        this.meaklunch=meaklunch;
        this.mealdinner=mealdinner;
        this.mealdessert= mealdessert;
        this.drink= drink;}
    public breakfast  getmealbraekfast() {
        return this.mealbraekfast; }
    public lunch getmeaklunch() {
        return this.meaklunch; }
    public dinner getmealdinner() {
        return this.mealdinner; }
    public dessert getmealdessert() {
        return this.mealdessert; }
    public drinks getdrink() {
        return this.drink; }
    public void setmealbraekfast (breakfast mealbraekfast) {
        this.mealbraekfast = mealbraekfast;}
    public void setmeaklunch(lunch meaklunch) {
        this.meaklunch = meaklunch;}
    public void setmealdinner(dinner mealdinner) {
        this.mealdinner= mealdinner;}
    public void setmealdessert(dessert mealdessert) {
        this.mealdessert = mealdessert;}
    public void setdrink(drinks drink) {
        this.drink=drink;}
    public String toString() {
        return (" meal breakfast" + mealbraekfast +"meal lunch"+ meaklunch+"mealdinner" + mealdinner + "meal dessert" +
                mealdessert+"drinks "+ drink);}
}
