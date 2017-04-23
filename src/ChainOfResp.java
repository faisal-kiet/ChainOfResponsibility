
public class ChainOfResp {

	public static void main(String[] args){
		Chain chain1=new AddNumbers();
		Chain chain2=new SubtractNumbers();
		Chain chain3=new MultiplyNumbers();
		Chain chain4=new DivideNumbers();
		Chain chain5=new PowerNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		chain4.setNextChain(chain5);
		
		Numbers request=new Numbers(3,4,"Pow");
		chain1.calculate(request);
	}
}
