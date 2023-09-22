class Main {
  public static void main(String[] args) {
    int one = Integer.parseInt(args[1]);
    int two = Integer.parseInt(args[2]);
    GCD test = new GCD(one, two);
    System.out.println(recurse());
  }
}