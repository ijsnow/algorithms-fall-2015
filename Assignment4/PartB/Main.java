public class Main {
  public static void main(String[] args) {
    Assignment4A test = new Assignment4A();

    long startTime = System.currentTimeMillis();
    int num = test.minPrice(new String[]{ "B..FS",
                                          "...FF",
                                          "....." });

    long endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{"B",
                                     "S"});

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.minPrice(new String[]{"B..S..S",
                                     ".B...BB",
                                     ".S..S.."});

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
  }
}
