class DataStructures2 {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //commit
    long startTime = System.currentTimeMillis();
    String[] array = { "a", "b", "c", "d" };
    for (String s : array) {
      System.out.println("array item: " + s);
    }
    long estimatedTime = System.currentTimeMillis() - startTime;

    System.out.println("Elapsed: " + estimatedTime);
  }
}