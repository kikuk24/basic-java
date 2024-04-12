public class Pengondisian {

  public static void main(String[] args) {
    int value = 50;
    int pass = 60;
    // !    if else, menggunakan tenary operator
    String result = (value >= pass) ? "anda lulus" : "try again";
    System.out.println(result);
    // ?    pengondisian menggunakan switch case
    switch (value) {
      case 50:
        System.out.println("anda sedikit lagi lulus");
        break;
      case 100:
        System.out.println("Selamat anda Lulus!");
        break;
    }
  }
}