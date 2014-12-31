import java.util.*;

public class ExampleDist
{
	Double TotalPayValue = 114.63;
	
	
	public ArrayList<Payer> Payers = new ArrayList<Payer>();
	public ExamplePayers ep = new ExamplePayers();
	public ExampleDist() {
		Payers.add(ep.payer1);
		Payers.add(ep.payer2);
		Payers.add(ep.payer3);
		Payers.add(ep.payer4);
	}
	
}
