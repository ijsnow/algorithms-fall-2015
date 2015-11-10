// Name: Isaac Snow

import java.util.*;

public class Assignment3A {

	public int numPaint(String input) {
		int len = input.length();
		int min = len;
		int i = 0;

		while (i < len) {
			String front = input.substring(0, i + 1);
			String back = input.substring(i, len - 1);

			int countF = counter(front, "W");
			int countB = counter(back, "B");

			int c = countF + countB;

			min = min > c ? c : min;
			i++;
		}

		return min;
	}

	private int counter(String in, String c) {
		int count = 0;

		String s = in.contains(c) ? in.substring(in.indexOf(c) + 1) : "";

		while (s != "") {
			s = s.contains(c) ? s.substring(s.indexOf(c) + 1) : "";
			count++;
		}

		return count;
	}
}
