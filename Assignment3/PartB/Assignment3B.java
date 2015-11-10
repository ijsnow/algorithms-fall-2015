// Name: Isaac Snow

import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Assignment3B {

	public int numStep(int[] sequence) {

		int[] seq = sequence;
		int count = 0;

		while(!isPalindrome(seq)) {
			seq = step(seq);
			count++;
		}

		return count;
	}

	private int[] step(int[] in) {
		int front = 0; int end = in.length - 1;

		for (int i = 0; i < in.length; i++) {
			if (in[front] < in[end]) {
				return addVals(in, front, true);
			} else if (in[front] > in[end]) {
				return addVals(in, end, false);
			}

			front++; end--;
		}

		return in;
	}

	private int[] addVals(int[] in, int n, boolean fromFront) {
		int len = in.length;
		int[] out = new int[in.length - 1];

		if (fromFront) {
			for (int i = 0; i < out.length; i++) {
				if (i < n)
					out[i] = in[i];
				else if (i > n)
					out[i] = in[i + 1];
				else
					out[i] = in[i] + in[i + 1];
			}
		} else {
			for (int i = out.length - 1; i >= 0; i--) {
				int val = i + 1;

				if (val > n)
					out[i] = in[val];
				else if (val < n)
					out[i] = in[i];
				else
					out[i] = in[val] + in[i];
			}
		}

		return out;
	}

	private boolean isPalindrome(int[] sequence) {
		boolean isPal = true;
		int len = sequence.length - 1;

		if (len == 0) return true;

		for (int i = 0; i < len; i++) {
			if (sequence[i] != sequence[len - i]) {
				isPal = false;
			}
		}

		return isPal;
	}
}
