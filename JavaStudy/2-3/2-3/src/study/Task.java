package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
	public class Task extends Calculator{
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	Calculator calculator = new Calculator();
    		int plusA = calculator.plus(10);
    		System.out.println("plusメソッドの引数が一つの場合："+ plusA);
    		
    		int plusB = calculator.plus(10,20);
    		System.out.println("plusメソッドの引数が二つの場合："+ plusB);
    		
    		int plusC = calculator.plus(10,20,30);
    		System.out.println("plusメソッドの引数が三つの場合："+ plusC);   		
    		
    	}
	}
    