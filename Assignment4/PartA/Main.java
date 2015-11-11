public class Main {
  public static void main(String[] args) {
    Assignment4A test = new Assignment4A();

    long startTime = System.currentTimeMillis();

    int num = test.minPrice(new String[]{ "2 90 90", "90 2 90", "90 90 2" }); // 2 + 2 + 2

    long endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "5 100 100", "100 100 100", "5 100 100" }); // 5 + 100 + 5

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "30 44 87", "53 64 61", "17 93 103" }); // 30 + 61 + 17

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "2 4 6", "10 10 10", "4 2 6" }); // 2 + 10 + 2

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "2 3 4", "100 100 100", "53 63 73", "59 42 5", "52 52 46", "7 8 4" }); // 216

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "1 2 5", "1 50 60", "1 2 4", "1 2 7", "1 2 3" }); // 8

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "2 4 6", "10 10 10", "4 6 2", "100 2 100", "2 4 6", "10 10 10", "4 2 6" }); // 30

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "1 2 5", "1 2 5", "1 2 5", "1 50 60", "1 2 4", "1 2 7", "100 200 3" }); // 12

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "500 100 1000", "150 20 1000", "25 300 900", "350 40 1000", "45 500 1000" }); // 630

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{ "1 2 3", "10 20 30", "100 200 300" }); // 121

    endTime = System.currentTimeMillis();

    System.out.println("Output: " + num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
  }
}
