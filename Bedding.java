public class Bedding {
  
// Instance Variables
private String name;
private String color;
private double weight;

// Constructor Methods
  // No-Argument
public Bedding() {
  name = "Bedding";
  color = "White";
  weight = 5.0;
  }
  
  // Parameterized
public Bedding(String name, String color, double weight) {
  this.name = name;
  this.color = color;
  this.weight = weight;
  }
  
// Acessor Methods
public String getName() {
  return name;
  }

public String getColor() {
  return color;
  }
  
public double getWeight() {
  return weight;
  }

 // Mutator Methods 
public void setName(String name) {
  this.name = name;
  }

public void setColor(String color) {
  this.color = color;
  }

public void setWeight(double weight) {
 if(weight< 0.0) {
    this.weight = 0.0;
   } else {
     this.weight = weight;
  }
}
  
// toString Method Override Superclass
public String toString() {
  String text = "\nName: " + this.name + ", Color: " + this.color + ", Weight: " + this.weight;
  return text;
  }
}