import java.util.*;

public class CalculateDistribution
{
	
	Payer entity = new Payer();
	ArrayList<Payer> payers;
	Double totalPayValue;
	CurrencyAmounts EntityCA = new CurrencyAmounts();
	
	public CalculateDistribution(ArrayList<Payer> mypayers, Double myPayValue) {
		payers = mypayers;
		totalPayValue = myPayValue;
	}
	
	public Map<Payer, ArrayList<Action>> Calculate(){
		Map<Payer, ArrayList<Action>> endResults = new HashMap<Payer, ArrayList<Action>>();
		
		return endResults;
	}
	
	private ArrayList<Action> payToEntity(ArrayList<Payer> mypayers) {
		Integer totalPayers = payers.size();
		Integer tempUnPayers = 0;
		Double tempPayValue = totalPayValue;
		ArrayList<Action> payActions = new ArrayList<Action>();
		ArrayList<Double> CurrencyList = new ArrayList<Double>();
		for (Double curvalue : CurrencyList) {
			if (tempPayValue > 0) {
				while (tempPayValue > 0) {
					for (Payer p : mypayers) {
						tempUnPayers = 0;
						if (tempPayValue < 0) {
							break;
						} else {
							if (p.CA.CurList.get(curvalue) > 0) {
								p.CA.setAmount(curvalue, p.CA.CurList.get(curvalue) - 1);
								tempPayValue = tempPayValue - curvalue;
								payActions.add(new Action(p, entity, curvalue, 1));
							} else {
								tempUnPayers = tempUnPayers + 1;
							}
						}
					}
					if (tempUnPayers == totalPayers) {
						break;
					}
				}
			}
		}
		
		for (Payer p: mypayers) {
			
		}
		return payActions;
	}
	
	private CurrencyAmounts makeChange(Double difference) {
		CurrencyAmounts tempCA = new CurrencyAmounts();
		
	}
	
	
	
	
}
