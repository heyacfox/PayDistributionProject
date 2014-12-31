
import java.util.*;

public class Payer
{
	public CurrencyAmounts CA = new CurrencyAmounts();
	Double PayShare;
	public Payer() {
		
		PayShare = 0.00;
	}
	
	public void setCurrencyAmounts(CurrencyAmounts newCA) {
		CA = newCA;
	}
	
	public void setPayShare(Double ps) {
		PayShare = ps;
	}
	
	public CurrencyAmounts getCA(){
		return CA;
	}
	
}
