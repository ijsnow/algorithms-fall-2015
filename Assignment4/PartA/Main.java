public class Main {
  public static void main(String[] args) {
    Assignment4A test = new Assignment4A();

    long startTime = System.currentTimeMillis();
    int num = test.minPrice(new String[]{ "2 90 90", "90 2 90", "90 90 2" }); // 2 + 2 + 2

    long endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "5 100 100", "100 100 100", "5 100 100" }); // 5 + 100 + 5

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "30 44 87", "53 64 61", "17 93 103" }); // 30 + 61 + 17

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "2 4 6", "10 10 10", "4 2 6" }); // 2 + 10 + 2

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
  }
}
