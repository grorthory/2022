import java.util.Objects;

public class Vector {

    private double x;
    private double y;

    public Vector(double x1, double y1){
    x = x1;
    y = y1;
    }
    //in case of empty argument
    public Vector() {
        x = 0.;
        y = 0.;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(vector.x, x) == 0 && Double.compare(vector.y, y) == 0;
    }

    @Override
    public String toString() {
        return "<" + x +
                ", " + y +
                ">";
    }

    public void setX(double x){
    this.x=x;
    }

    public void setY(double y){
    this.y=y;
    }
    public double getX(){
    return this.x;
    }

    public double getY(){
        return this.y;
    }

    public Vector plus(Vector b){
        return new Vector(this.x+b.x, this.y+b.y);
    }

    public Vector minus(Vector b){
        return new Vector(this.x-b.x, this.y-b.y);
    }

    public double dot(Vector b){
        return (this.x*b.x) + (this.y*b.y);
    }

    public Vector times(int b){
        return new Vector(this.x*b, this.y*b);
    }

    public double distanceTo(Vector b){
        return (Math.sqrt(Math.pow(this.x-b.x, 2)+Math.pow(this.y-b.y, 2)));
    }
}
Vector.java
Displaying Vector.java.
Assignment: Defining Objects
Alain Kägi
•
Aug 28, 2022 (Edited May 9, 2023)
Individual Assignments
•
20
/20
20 points out of possible 20
Due Oct 24, 2022
TBA

Assignment: Defining Objects
Google Docs

VectorTest.java
Java

StarshipTest.java
Java
20/20
10/10
10/10
Your work
Graded

Starship.java
Java

Vector.java
Java
Private comments
Class comments
