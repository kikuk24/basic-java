public class MethodOverLoading {
  public int tambah(int a, int b) {
    return a + b;
  }
  public static void main(String[] args) {
    MethodOverLoading calc = new MethodOverLoading();
    int hasil = calc.tambah(2, 9);
    System.out.println("Hasil : " + hasil);
  }
}
