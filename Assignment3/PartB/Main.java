public class Main {
  public static void main(String[] args) {
    Assignment3B test = new Assignment3B();

    long startTime = System.currentTimeMillis();
    int num = test.numStep(new int[]{ 9, 25, 25, 9 });

    long endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.numStep(new int[]{ 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26 });

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");

    startTime = System.currentTimeMillis();

    num = test.numStep(new int[]{ 7073, 755, 7328, 5694, 277, 5412, 9642, 9610, 1, 4, 1805, 1445, 901, 9750, 432, 2206, 3328, 3857, 49, 601, 650, 475, 6710, 1955, 683, 9750, 417, 1788, 47, 94, 706, 786, 318, 9610, 777, 4316, 798, 3751, 864, 3095, 1730, 1115, 357, 1472, 2750, 5639, 164, 423, 1102, 7828 });

    endTime = System.currentTimeMillis();

    System.out.println(num);

    System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
  }
}
