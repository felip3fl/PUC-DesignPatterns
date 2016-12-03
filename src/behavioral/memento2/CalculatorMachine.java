package behavioral.memento2;
//Carataker
public class CalculatorMachine {
	public static void run(int number1, int number2){
		// program starts 
		Calculator calculator = new CalculatorImp();
		
		// assume user enters two numbers
		calculator.setFirstNumber(number1);
		calculator.setSecondNumber(number2);
		
		// find result
		System.out.println(calculator.getCalculationResult());
		
		// Store result of this calculation in case of error
		PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();
		
		// user enters a number
		calculator.setFirstNumber(number1*2);
		
		// user enters a wrong second number and calculates result
		calculator.setSecondNumber(number2*2);
		
		// calculate result
		System.out.println(calculator.getCalculationResult());
		
		// user hits CTRL + Z to undo last operation and see last result
		calculator.restorePreviousCalculation(memento);
		
		// result restored 
		System.out.println(calculator.getCalculationResult());	
		
	}
}
