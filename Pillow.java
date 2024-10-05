public class Pillow extends Bedding {

// Instance Variables
private String stuffing;
private boolean hasPattern;
  
// Constructor Methods
  // No-Argument
public Pillow(){
  super();
  this.stuffing = "Cotton";
  this.hasPattern = false;
  }

  // Parameterized 
public Pillow (String name, String color, double weight, String stuffing, boolean hasPattern) {
 super(name, color, weight);
  this.stuffing = stuffing;
  this.hasPattern = hasPattern;
  }

  // Accessor Methods
public String getStuffing() {
  return stuffing;
  }
  
public boolean hasPattern() {
  return hasPattern;
  }

  // Mutator Methods
public void setStuffing(String stuffing) {
  this.stuffing = stuffing;
  }

public void setHasPattern(boolean hasPattern) {
  this.hasPattern = hasPattern;
  }

// toString Method Override Subclass
public String toString() {
  String text = "\nItem: Pillow \n";
  text += super.toString();
  text += ", Stuffing: " + stuffing + ", Does it have a Pattern? " + hasPattern;
  return text;
  }
}