public class Forloop {
  
  public static void main(String[] args) {
    int tinggi = 5;
    for (int i = 0; i < tinggi; i++) {

      for (int j = 0; j < tinggi - i - 1; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
