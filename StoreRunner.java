public class StoreRunner {
  public static void main(String[] args) {

/*
/ Instaniates Superclass Objects
/ First No-Argument Constructor
/ Then followed by Parameterized Contructor
*/
Bedding comfy = new Bedding();
    System.out.println(comfy);
    
Bedding sleepy = new Bedding ("Sheet", "blue", 4.0);
    System.out.println(sleepy);
    
// Superclass Mutator Methods    
comfy.setColor("green");
    System.out.println(comfy);
    
sleepy.setWeight(0.0);
    System.out.println(sleepy);

/*
/ Pillow Subclass Objects Instaniated
/ First No-Argument Constructor
/ Then followed by Parameterized Constructor
*/
Pillow plain = new Pillow();
    System.out.println(plain);
    
Pillow premium = new Pillow ("Couch Throw", "pink", 6.0, "Feather", true);
    System.out.println(premium);

// Subclass Mutator Methods   
plain.setStuffing("Memory Foam");
plain.setHasPattern(true);
    System.out.println(plain);
    
premium.setColor("orange");
premium.setStuffing("Cotton");
  System.out.println(premium);
    
/*
/ Blanket Subclass Objects Instaniated
/ First No-Argument Constructor
/ Then followed by Parameterized Constructor
*/
Blanket twin = new Blanket();
    System.out.println(twin);

Blanket king = new Blanket("King Size Blanket", "purple", 10.0, "Silk", 108, 100);
    System.out.println(king);
    
// Subclass Mutator Methods  
twin.setName("Twin Size Blanket");
twin.setWeight(8.0);
    System.out.println(twin);

king.setWidth(100);
king.setLength(108);
    System.out.println(king);
  }
}