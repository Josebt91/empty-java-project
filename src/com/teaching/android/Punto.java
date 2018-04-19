package com.teaching.android;

public class Punto {
    private int x;
    private int y;
    public Punto (){
    }
    public Punto (int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distancia(int x,int y){
        double valordistancia;
        return valordistancia=Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
      public Punto (int x, int y){
        this.x=x;
        this.y=y;
    }  }
    public double distancia(Punto p){
        double valordistancia;
        return valordistancia=Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
    }
    public String toString(){
        return "punto ("+this.x+","+this.y+")";
    }
}
