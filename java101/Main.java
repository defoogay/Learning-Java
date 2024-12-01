public class Main {
    public static int[] arr = {4, 3, 2, 8, 3};
    public static int[][] twoArr = {{12,13,14}, {22, 23, 24}, {32, 33, 34}};
	public static void main(String[] args) {
		System.out.println(PracticeProblems.countOccurrences(3, arr));
        System.out.println(PracticeProblems.IntArrayToString(PracticeProblems.reverseArray(arr)));;
        System.out.println(PracticeProblems.sumGrid(twoArr));
        System.out.println(PracticeProblems.fib(50));
	}
}