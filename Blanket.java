public class Blanket extends Bedding {

// Instance Variables
  private String material;
  private int width;
  private int length;

// Constructor Methods
  // No-Argument
public Blanket() {
  super();
  this.material = "Cotton";
  this.width = 66;
  this.length = 90;
  }

  // Parameterized
public Blanket (String name, String color, double weight, String material, int width, int length) {
  super(name, color, weight);
  this.material = material;
  this.width = width;
  this.length = length;
  }

  // Accessor Methods
public String getMaterial() {
  return material;
  }

public int getWidth() {
  return width;
  }

public int getLength() {
  return length;
  }
  
  // Mutator Methods
public void setMaterial(String material) {
  this.material = material;
  }

public void setWidth(int width) {
  this.width = width;
  }

public void setLength(int length) {
  this.length = length;
  }

// toString Method Override Subclass
public String toString() {
  String text = "\nItem: Blanket \n";
  text += super.toString();
  text += ", Material: " + material + ", Width: " + width + ", Length: " + length;
  return text;
  }

}