import java.util.Objects;

public class Starship {
    private String name;
    private Vector position;
    private Vector velocity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Starship starship = (Starship) o;
        return Objects.equals(name, starship.name) && Objects.equals(position, starship.position) && Objects.equals(velocity, starship.velocity);
    }

    @Override
    public String toString() {
        return this.getName() + " at " + this.getPosition() + " moving " + getVelocity();
    }

    public Starship (String n, Vector p){
        name=n;
        position=p;
        velocity =new Vector();
    }

    public Starship(){
        velocity=new Vector();
    }

    public String getName() {
        return name;
    }

    public Vector getPosition() {
        return position;
    }

    public Vector getVelocity() {
        return this.velocity;
    }

    public void accelerate(Vector b) {
        this.velocity = this.velocity.plus(b);
    }
    public void drift(){
        this.position = this.position.plus(this.velocity);
    }
}

Starship.java
Displaying Starship.java.
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
