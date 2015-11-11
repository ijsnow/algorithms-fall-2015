// Name: Isaac Snow

import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Assignment4A {

	public int minPrice(String[] tiles) {

    int[][] arrays = prepareArrays(tiles);

		int[] possibilities = arrays[0];

		for (int i = 0; i < arrays.length - 1; i++) {
			possibilities = findResults(possibilities, next(arrays, i));
		}

		return findMin(possibilities);
	}

	private int[] findResults(int[] current, int[] next) {
		int[] results = new int[current.length];

		for (int i = 0; i < current.length; i++) {
			results[i] = minWithout(current, next[i], i);
		}

		return results;
	}

	private int minWithout(int[] current, int next, int index) {
		return minFromArray(withoutIndex(current, index), next);
	}

	private int minFromArray(int[] array, int constVal) {
		int min = array[0] + constVal;

		for (int i = 0; i < array.length; i++) {
			min = Math.min(array[i] + constVal, min);
		}

		return min;
	}

	private int findMin(int[] array) {
		return minFromArray(array, 0);
	}

	// Array preperation
	private int[][] prepareArrays(String[] strings) {

    int[][] arrays = new int[strings.length][3];

    for (int i = 0; i < strings.length; i++) {
      String[] strArray = toStringArray(strings[i]);

      int[] ints = new int[3];

      ints[0] = toInt(strArray[0]);
      ints[1] = toInt(strArray[1]);
      ints[2] = toInt(strArray[2]);

      arrays[i] = ints;
    }

    return arrays;
	}

  private int toInt(String string) {
		return Integer.parseInt(string);
	}

	private String[] toStringArray(String string) {
		return string.split(" ");
	}

	// Utility functions
  private int[] nth(int[][] array, int n) {
    return array[n];
	}

  private int[] next(int[][] array, int current) {
		if (array.length == current) return new int[array[0].length];

    return nth(array, current + 1);
  }

	private int[] withoutIndex(int[] array, int skipIndex) {
		int[] out = new int[array.length - 1];

		for (int i = 0; i < array.length; i++) {
			if (i != skipIndex) {
				if (i < skipIndex)
					out[i] = array[i];
				else
					out[i - 1] = array[i];
			}
		}

		return out;
	}
}
