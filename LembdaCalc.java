public class LembdaCalc {

	
	interface MathOperation {
		int operation(int num1, int num2);
	}
	
	public int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
	private void addition() {
		MathOperation additionOp = (num1, num2) -> num1 + num2;
		System.out.println("10 + 5 = " + operate(10, 5, additionOp));
	}

	private void subtraction() {
		MathOperation subtractionOp = (num1, num2) -> num1 - num2;
		System.out.println("10 - 5 = " + operate(10, 5, subtractionOp));
	}

	private void multiplication() {
		MathOperation multiplicationOp = (num1, num2) -> num1 * num2;
		System.out.println("10 * 5= " + operate(10, 5, multiplicationOp));
	}

	private void division() {
		MathOperation divisionOp = (num1, num2) -> num1 / num2;
		System.out.println("10 / 5 = " + operate(10, 5, divisionOp));
	}

	public static void main(String[] args) {
                                System.out.println("The result is here ");
		LembdaCalc lembdaCalc = new LembdaCalc();
                                System.out.println("Addition of two numbers 10 and 5 ");
		lembdaCalc.addition();
                                System.out.println("Subtraction of two numbers 10 and 5 ");
		lembdaCalc.subtraction();
                                System.out.println("Multiplication of two numbers 10 and 5 ");
		lembdaCalc.multiplication();
                                System.out.println("Division of two numbers 10 and 5 ");
		lembdaCalc.division();
	}
}