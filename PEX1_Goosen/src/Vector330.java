public class Vector330 {

    private double x;
    private double y; // test

    public Vector330() {
        this.x = 0;
        this.y = 0;
    }

    public Vector330(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector330(int x, int y) {
        this.x = (double) x;
        this.y = (double) y;
    }

    public Vector330(long x, long y) {
        this.x = (double) x;
        this.y = (double) y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public int getXint() {
        return (int) this.x;
    }

    public int getYint() {
        return (int) this.y;
    }

    public long getXlong() {
        return (long) this.x;
    }

    public long getYlong() {
        return (long) this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }

    //    public boolean equals(Vector330 other){
//
//    }
    public Vector330 add(Vector330 other) {
        Vector330 result = new Vector330();
        result.x = other.x + this.x;
        result.y = other.y + this.y;
        return result;
    }

    public Vector330 subtract(Vector330 other) {
        Vector330 result = new Vector330();
        result.x = this.x - other.x;
        result.y = this.y - other.y;
        return result;
    }
//    public double dotProduct(Vector330 other){
//
//    }
//    public Vector330 scale(double s){
//
//    }
//    public double magnitude(){
//
//    }
//    public double directon(){
//
//    }
//    public Vector330 normalize(){
//
//    }
//    public java.lang.String toString(){
//
//    }
//    public static Vector330 parseVector(java.until.Scanner s)
//        throws java.lang.Exception{
//
//    }
}
