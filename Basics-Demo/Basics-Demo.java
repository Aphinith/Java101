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

    char charA = 'A';
    System.out.println("charA: " + charA);
    char charInt = 65;
    System.out.println("charInt: " + charInt);
    char charUnicode1 = '\u0041';
    System.out.println("charUnicode1: " + charUnicode1);
    char charUnicode2 = 0x41;
    System.out.println("charUnicode2: " + charUnicode2);
    char charBinary = 0b01000001;
    System.out.println("charBinary: " + charBinary);

  }

  static void typeCasting() {
    System.out.println("\nInside typeCasting...");
    // Explicit casting;
    long y = 42;
    // int x = y;
    int x = (int)y;

    // information loss due to out-of-range assignment
    byte narrowdByte = (byte)123456;
    System.out.println("narrowdByte: " + narrowdByte);

    // Truncation
    int iTruncated = (int)0.99;
    System.out.println("iTruncated: " + iTruncated);

    // Implicit cast (int to long)
    y = x;

    //Implicit cast (char to int)
    char cChar = 'A';
    int iInt = cChar;
    System.out.println("iInt: " + iInt);

    // byte to char using an explicit cast
    byte bByte = 65;
    cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int -- > char)
    System.out.println("cChar: " + cChar);
  }

  public static void main(String[] args) {
    // print();
    // primitives();
    typeCasting();
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