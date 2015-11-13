// Name: Isaac Snow

import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Assignment4B {

	public int minTime(String[] map) {

		char[][] graph = prepareGraph(map);

		int[][] times = findAllTimes(graph);

		if (!allParked(times)) return -1;

		return findLowestTime(times);
	}

	private int[][] findAllTimes(char[][] graph) {

		ArrayList<int[]> bikeCoords = findBikeCoords(graph);
		ArrayList<int[]> spaceCoords = findSpaceCoords(graph);

		int[][] times = new int[bikeCoords.size()][spaceCoords.size()];

		for (int i = 0; i < bikeCoords.size(); i++) {
			for (int j = 0; j < spaceCoords.size(); j++) {
				times[i][j] = moves(graph, spaceCoords.get(i), bikeCoords.get(j));
			}
		}

		return times;
	}

	private ArrayList<int[]> findBikeCoords(char[][] graph) {
		return findCoords(graph, 'B');
	}

	private ArrayList<int[]> findSpaceCoords(char[][] graph) {
		return findCoords(graph, 'S');
	}

	private ArrayList<int[]> findCoords(char[][] graph, char type) {
		ArrayList<int[]> coords = new ArrayList<int[]>();

		for(int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				if (graph[i][j] == type) coords.add(new int[]{ i, j });
			}
		}

		return coords;
	}

	// Traversing the graph. ~ BFS
	private int moves(char[][] graph, int[] start, int[] target) {

		ArrayList<ArrayList<int[]>> tree = createTree(start);

		int count = -1;
		boolean isTargetFound = false;
		boolean isTreeExhausted = false;

		while(!isTargetFound && !isTreeExhausted) {

			ArrayList<ArrayList<int[]>> toAdd = new ArrayList<ArrayList<int[]>>();

			for (ArrayList<int[]> branch : tree) {
				int[] node = last(branch);

				if (node[0] == target[0] && node[1] == target[1]) {
					isTargetFound = true;
					count = branch.size() - 1;
					break; // break out of loop
				}

				if (canMoveTo(graph, branch, node[0], node[1] + 1, target)) {
				  toAdd.add(listWith(branch, node[0], node[1] + 1));
				}

				if (canMoveTo(graph, branch, node[0] + 1, node[1], target)) {
					toAdd.add(listWith(branch, node[0] + 1, node[1]));
				}

				if (canMoveTo(graph, branch, node[0], node[1] - 1, target)) {
					toAdd.add(listWith(branch, node[0], node[1] - 1));
				}

				if (canMoveTo(graph, branch, node[0] - 1, node[1], target)) {
					toAdd.add(listWith(branch, node[0] - 1, node[1]));
				}
		  }

			isTreeExhausted = toAdd.size() == 0;

		  tree = toAdd;
		}

		return count;
	}

	private ArrayList<ArrayList<int[]>> createTree(int[] node) {

		ArrayList<int[]> branch = new ArrayList<int[]>();
		branch.add(new int[]{ node[0], node[1] });

		ArrayList<ArrayList<int[]>> tree = new ArrayList<ArrayList<int[]>>();
		tree.add(branch);

		return tree;
	}

	private boolean isTarget(int[] node, int x, int y) {
		return node[0] == x && node[1] == y;
	}

	private boolean canMoveTo(char[][] graph, ArrayList<int[]> branch, int x, int y, int[] target) {
		if (isTarget(target, x, y)) return true;
		if (!isInBounds(graph, x, y)) return false;
		if (!isValidType(graph[x][y])) return false;
		if (isInBranch(branch, x, y)) return false;

		return true;
	}

	private boolean isInBranch(ArrayList<int[]> branch, int x, int y) {
		return contains(branch, new int[]{ x, y });
	}

	private boolean isValidType(char type) {
		return type == '.' || type == 'B';
	}

	private boolean isInBounds(char[][] graph, int x, int y) {
		return (x < graph.length) && (y < graph[0].length) && (x >= 0) && (y >= 0);
	}

	private boolean isInBounds(int xBound, int yBound, int x, int y) {
		return (x < xBound) && (y < yBound) && (x >= 0) && (y >= 0);
	}

	private int findLowestTime(int[][] times) {

		if (times.length == 1) return times[0][0];

		int [] permutation = getFirstPermutation(times.length);
		int min = sum(times, permutation);

		for(int i = 1; i <= factorial(times.length); i++) {
			min = Math.min(min, sum(times, permutation));
			permutation = nextPermutation(permutation, times.length);
		}

		return min;
	}

	private int[] getFirstPermutation(int n) {
		int[] permutation = new int[n];

		for (int i = 0; i < n; i++)
			permutation[i] = i;

		return permutation;
	}

	private int sum(int[][] times, int[] permutation) {

		boolean pathIsBroken = false;
		int sum = 0;

		for (int i = 0; i < times.length && !pathIsBroken; i++) {

			if (times[i][permutation[i]] == -1)
				pathIsBroken = true;
			else
				sum += times[i][permutation[i]];
		}

		return pathIsBroken ? 10000 : sum;
	}

	//Find permutations using Lexicoographic order algorithm from https://en.wikipedia.org/wiki/Permutation#Systematic_generation_of_all_permutations
	private int[] nextPermutation(int[] array, int n) {

		int[] permutation = copy(array, array.length);

		int a = n - 2; int b = n - 1;

		while (permutation[a] >= permutation[a + 1] && a > 0) {
			a--;
		}

		while (permutation[a] >= permutation[b] && b > 0) {
			b--;
		}

		permutation = swap(permutation, a, b);

		for (int j = 1; a + j < n - j; j++)
			permutation = swap(permutation, a + j, n - j);

		return permutation;
	}

	private int[] swap(int[] array, int a, int b) {
		int[] out = Arrays.copyOf(array, array.length);

		out[a] = array[b];
		out[b] = array[a];

		return out;
	}

	private int factorial(int n) {
		int factorial = 1;

		for (int i = 2; i < n + 1; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	// Graph preperation
	private char[][] prepareGraph(String[] strings) {
		char[][] out = new char[strings.length][strings[0].length()];

		for (int i = 0; i < strings.length; i++) {
			out[i] = toCharArray(strings[i]);
		}

		return out;
	}

	private char[] toCharArray(String string) {
		return string.toCharArray();
	}

	// Utilities
	private int sum(int[] array) {
		int sum = 0;

		for (int i : array) {
			sum += i;
		}

		return sum;
	}

	private int[] last(ArrayList<int[]> list) {
		return list.get(list.size() - 1);
	}

	private boolean contains(ArrayList<int[]> list, int[] node) {

		for(int[] test : list) {
			if (test[0] == node[0] && test[1] == node[1]) return true;
		}

		return false;
	}

	private int[] copy(int[] array, int size) {
		return Arrays.copyOf(array, size);
	}

	private ArrayList<int[]> listWith(ArrayList<int[]> branch, int x, int y) {
		ArrayList<int[]> out = new ArrayList<int[]>();

		for (int[] node : branch) {
			out.add(new int[]{ node[0], node[1] });
		}

		out.add(new int[]{ x, y });

		return out;
	}

	private ArrayList<ArrayList<int[]>> rest(ArrayList<ArrayList<int[]>> tree) {
		// Deep copy without the first element
		ArrayList<ArrayList<int[]>> out = new ArrayList<ArrayList<int[]>>();

		for (int i = 1; i < tree.size(); i++) {
			ArrayList<int[]> branch = new ArrayList<int[]>();

			for (int[] node : tree.get(i)) {
				branch.add(new int[]{ node[0], node[1] });
			}

			out.add(branch);
		}

		return out;
	}

	private boolean allParked(int[][] times) {
		for (int[] node : times) {
			if (node[0] == -1 && node.length == 1) return false;
		}

		return true;
	}

	private int findMinTime(int[][] times) {
		int min = 10000;

		for (int i = 0; i < times.length; i++) {
			int sum = 0;

			for (int j = 0; j < times[i].length; j++) {
				sum = sum + (times[i][j] >= 0 ? times[i][j] : 1000);
			}

			min = sum < min ? sum : min;
		}

		return min;
	}
}
