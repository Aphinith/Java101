class BasicsDemo {
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!!");
    System.out.println();
    System.out.print("Hello, world!!!");
    System.out.print(" ");
    System.out.print("Hello,");
    System.out.print(" ");
    System.out.print("World!!!");
    System.out.println();
  }

  static void primitives() {
    System.out.println("\n\nInside primitives...");
    int intHex = 0x0041;
    System.out.println("intHex: " + intHex);
    int intBinary = 0b01000001;
    System.out.println("intBinary: " + intBinary);
    int intUnderscore = 1_23_456;
    System.out.println("intUnderscore: " + intUnderscore);
  }

  public static void main(String[] args) {
    // print();
    primitives();
  }
}



// class BasicsDemo {
//   // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
//   static void print() {
//     System.out.println("\n\nInside print ...");
//     System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
//     System.out.println();                 // Print empty line
//     System.out.print("Hello, world!!");   // Cursor stayed after the printed string
//     System.out.println("Hello,");
//     System.out.print(" ");                // Print a space
//     System.out.print("world!!");
//   }
  
//   public static void main(String[] args) {	
// 	   	// Language Basics 1
// 		print();				
//   }       
// }