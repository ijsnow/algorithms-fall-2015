public class Main {
  public static void main(String[] args) {
    Assignment3A test = new Assignment3A();

    long startTime = System.currentTimeMillis();

    int num = test.numPaint("BBBWWWBWWWBWWBBBWWBBBWB");

    long endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.numPaint("BWBBWBBWBBBBBBBWBBWBWBWBBBBBBBBBBBBBBBBBWBBBBBBBBB");

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.numPaint("WBBWWBWWWWWBWWBBBWBWWBWBBBWWBWBWBBBWBBBBWBWWBWWBWB");

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
  }
}
