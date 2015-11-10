// Name: Isaac Snow
// Did it recursively for fun/to see how big of a time difference it made/


import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Assignment4A {

	public int minPrice(String[] tiles) {
		return recurse(prepareArrays(tiles), new int[0], -1);
	}

	private int recurse(int[][] list, int[] result, int blocked) {
		if (list.length == 1) {

			int[] ints = list[0];
			int index = indexOfMin(ints);

			if (index != blocked)
				return sum(setResult(result, ints[index]), 0);

			ints[index] = 1001;
			index = indexOfMin(ints);

			return sum(setResult(result, ints[index]), 0);
		}

		int[] ints = list[0];
		int index = indexOfMin(ints);
		int min = ints[index];

		if (min < list[1][index] && index != blocked) {
			return recurse(rest(list), setResult(result, min), index);
		} else {
			ints[index] = 1001; // 1001 because values are between 1 and 1000 so all other vals will be less than this.
		}

		index = indexOfMin(ints);
		min = ints[index];

		if (min < list[1][index] && index != blocked) {
			return recurse(rest(list), setResult(result, min), index);
 		} else {
			ints[index] = 1001; // 1001 because values are between 1 and 1000 so all other vals will be less than this.
		}

		index = indexOfMin(ints);
		min = ints[index];

		return recurse(rest(list), setResult(result, min), index);
	}

	private int[] setResult(int[] res, int val) {

		int[] out = Arrays.copyOf(res, res.length + 1);
		out[out.length - 1] = val;

		return out;
	}

	private int indexOfMin(int[] array) {
		if (array[0] <= array[1] && array[0] <= array[2]) return 0;

		if (array[1] <= array[0] && array[1] <= array[2]) return 1;

		return 2;
	}

	private int min3(int[] array) {
		return Math.min(Math.min(array[0], array[1]), array[2]);
	}

	private int sum(int[] results, int memo) {
		return results.length != 0 ?
			sum(rest(results), first(results) + memo) :
			memo;
	}

	// Array preperation. Did it recursively for fun. Might have to redo for performance.
	private int[][] prepareArrays(String[] strings) {
		return recurseArray(strings, new int[0][0]);
	}

	private int[][] recurseArray(String[] strings, int[][] out) {
		if (strings.length == 0) return out;

		return recurseArray(rest(strings), setLast(padArray(out), toIntArray(toStringArray(first(strings)))));
	}

	private int[][] padArray(int[][] array) {
		return Arrays.copyOf(array, array.length + 1);
	}

	private int[][] setLast(int[][] array, int[] ints) {
		int[][] out = array;
		int i = array.length - 1;

		out[i] = ints;

		return out;
	}

	private int[] toIntArray(String[] strings) {
		return Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
	}

	private String[] toStringArray(String string) {
		return string.split(" ");
	}

	// Utility functions
	private int first(int[] array) {
		return nth(array, 0);
	}

	private int nth(int[] array, int n) {
		return array[n];
	}

	private int[] rest(int[] array) {
		return Arrays.copyOfRange(array, 1, array.length);
	}

	private String first(String[] array) {
		return nth(array, 0);
	}

	private String nth(String[] array, int n) {
		return array[n];
	}

	private String[] rest(String[] array) {
		return Arrays.copyOfRange(array, 1, array.length);
	}

	private int[][] rest(int[][] array) {
		return Arrays.copyOfRange(array, 1, array.length);
	}
}
