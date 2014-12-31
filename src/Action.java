public class Action
{
    Payer actionFrom;
	Payer actionTo;
	Double CurValue;
	Integer CurAmount;
	
	public Action(Payer pf, Payer pt, Double cv, Integer ca) {
		actionTo = pt;
		CurValue = cv;
		CurAmount = ca;
		actionFrom = pf;
	}
	
}
