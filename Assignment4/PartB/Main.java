import java.util.*;

public class Main {
  public static void main(String[] args) {
    Assignment4B test = new Assignment4B();

    String[] input = new String[]{
      "B..FS",
      "...FF",
      "....."
    };

    long startTime = System.currentTimeMillis();

    int num = test.minTime(input);

    long endTime = System.currentTimeMillis();
    System.out.println("Input: " + Arrays.toString(input));
    System.out.println("Output: " + num); // -1 because spot is blocked

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    input = new String[]{
      "B",
      "S"
    };

    startTime = System.currentTimeMillis();

    num = test.minTime(input);

    endTime = System.currentTimeMillis();
    System.out.println("Input: " + Arrays.toString(input));
    System.out.println("Output: " + num); // 1

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    input = new String[]{
      "B..S..S",
      ".B...BB",
      ".S..S.."
    };

    startTime = System.currentTimeMillis();

    num = test.minTime(input);

    endTime = System.currentTimeMillis();

    System.out.println("Input: " + Arrays.toString(input));
    System.out.println("Output: " + num); // 7

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    input = new String[]{
      "BBB..FS.S.S",
      "BBB..F.S.S.",
      "BB.........",
      "BB...FSSSSS"
    };

    startTime = System.currentTimeMillis();

    num = test.minTime(input);

    endTime = System.currentTimeMillis();

    System.out.println("Input: " + Arrays.toString(input));
    System.out.println("Output: " + num); // TA says 96? I get 83

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    System.out.println("----------------------------------------------------------------");
    System.out.println("----------------------------------------------------------------");

    input = new String[]{
      "...B.FB.",
      ".....F..",
      ".....F.S",
      ".S...F.."
    };

    startTime = System.currentTimeMillis();

    num = test.minTime(input);

    endTime = System.currentTimeMillis();

    System.out.println("Input: " + Arrays.toString(input));
    System.out.println("Output: " + num); // TA says 96? I get 83

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
  }
}
