
public class PlayWithGit {

	public static int addTwoNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public static void printNumbers(int size) {
		for (int i = 1; i <= size; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		System.out.println(addTwoNumbers(22, 0));
		printNumbers(12);
	}

}
