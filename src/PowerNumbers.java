
public class PowerNumbers implements Chain {
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		nextInChain=nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		float res=1;
		int num=0;
		if(request.getOperation()=="Pow"){
			if(request.getNum2()<0){
				num=(int)request.getNum2()*-1;
				for(int i=0; i<num; i++){
					res=res*request.getNum1();
				}
				res=1/res;
			}
			else{
				num=(int)request.getNum2();
				for(int i=0; i<num; i++){
					res=res*request.getNum1();
				}
			}
			System.out.print(request.getNum1() + " Power " + request.getNum2() + " = "+ res);
		}
		else{
			//nextInChain.calculate(request);
			System.out.print("Not valid Operation");
		}
	}
}
