package edu.calpoly.csc305.lab1a;

class Driver {
  private Driver() {}

  public static void main() {
    Example ex = new Example();
    int total = 0;

    for (int i = 0; i < ex.getNums().length; i++) {
      int num = ex.getNums()[i];
      total += num;
    }

    System.out.println(total);
    System.out.println(ex.sameName("Bora"));
  }
}

