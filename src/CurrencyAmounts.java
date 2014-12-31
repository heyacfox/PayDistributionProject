
import java.util.*;public class CurrencyAmounts
{
	public Map<Double, Integer> CurList = new HashMap<Double, Integer>();
	
	public CurrencyAmounts() {
		CurList.put(20.00, 0);
		CurList.put(10.00, 0);
		CurList.put(5.00, 0);
		CurList.put(1.00, 0);
		CurList.put(0.50, 0);
		CurList.put(0.25, 0);
		CurList.put(0.10, 0);
		CurList.put(0.05, 0);
		CurList.put(0.01, 0);
	}
	
	public void setAmount(Double Value, Integer Amount) {
		CurList.put(Value, Amount);
	}
	
}
