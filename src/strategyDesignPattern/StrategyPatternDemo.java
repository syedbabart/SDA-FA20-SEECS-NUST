package strategyDesignPattern;

interface Calculation {
	   public int doOperation(int num1, int num2);
	}

class OperationAdd implements Calculation{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
	}
class OperationSubstract implements Calculation{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 - num2;
	   }
	}
class OperationMultiply implements Calculation{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 * num2;
	   }
	}

class Context {
	   private Calculation strategy;

	   public Context(Calculation strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
	}


public class StrategyPatternDemo {
	   public static void main(String[] args) {
		  Context context = null;
		  // take input 1
		  // get context
		  // switch {if add
		  context = new Context(new OperationAdd());		
		  // switch (if subtract
		  context = new Context(new OperationSubstract());		
		  // switch (if multiply
	      context = new Context(new OperationMultiply());		
	      
//        switch (if context is square
//		  context = new Context(new OperationSquare());
//
//		// take input 2
	      System.out.println("10 " + "operation" + "5 = " + context.executeStrategy(10, 5));
	   }
}