// Name: Isaac Snow

import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Assignment4A {

	public int minPrice(String[] tiles) {
		//return recurse(prepareArrays(tiles), new int[0], -1);
    int[][] array = prepareArrays(tiles);
    int[] results = new int[tiles.length];
    int index = -1; // Don't block anything the first time.

    for (int i = 0; i < array.length; i++) {
      int[] current = nth(array, i);

      // Store the index rather than the result so I can have the index that's blocked for the next call.
      index = findResultsIndex(current, next(array, i), index);
      results[i] = current[index];
    }

    return sum(results);
	}

	private int findResultsIndex(int[] current, int[] next, int blocked) {

    int[] ints = current;
		int index = indexOfMin(ints);
		int min = ints[index];

    // If we wouldn't be blocking the best case for the next set and if this isn't blocked
		if (min < next[index] && index != blocked) {
			return index;
		} else {
			ints[index] = 1001; // 1001 because values are between 1 and 1000 so all other vals will be less than this.
		}

		index = indexOfMin(ints);
		min = ints[index];

    // If we wouldn't be blocking the best case for the next set and if this isn't blocked
		if (min < next[index] && index != blocked) {
			return index;
 		} else {
			ints[index] = 1001; // 1001 because values are between 1 and 1000 so all other vals will be less than this.
		}

    // Just return the last possible choice.
		return indexOfMin(ints);
	}

	private int indexOfMin(int[] array) {
		if (array[0] <= array[1] && array[0] <= array[2]) return 0;

		if (array[1] <= array[0] && array[1] <= array[2]) return 1;

		return 2;
	}

	private int sum(int[] results) {
    int sum = 0;

    for (int i : results) {
      sum += i;
    }

    return sum;
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
    if (current + 1 < array.length) return nth(array, current + 1);

    // If next doesn't exist, return array of ints that will always be larger than ones being checked.
    return new int[]{ 1001, 1001, 1001 };
  }
}
