public class ExamplePayers
{
	
	public Payer payer1 = new Payer();
	public Payer payer2 = new Payer();
	public Payer payer3 = new Payer();
	public Payer payer4 = new Payer();
	CurrencyAmounts CA1 = new CurrencyAmounts();
	CurrencyAmounts CA2 = new CurrencyAmounts();
	CurrencyAmounts CA3 = new CurrencyAmounts();
	CurrencyAmounts CA4 = new CurrencyAmounts();
	
	public ExamplePayers() {
		CA1.setAmount(20.00, 4);
		CA1.setAmount(5.00, 3);
		CA1.setAmount(0.25, 10);
		CA1.setAmount(0.01, 3);
		
		CA2.setAmount(1.00, 4);
		CA2.setAmount(0.05, 3);
		CA2.setAmount(10.00, 10);
		CA2.setAmount(0.01, 20);
		
		CA3.setAmount(5.00, 4);
		CA3.setAmount(1.00, 3);
		CA3.setAmount(0.05, 10);
		CA3.setAmount(0.25, 3);
		
		CA4.setAmount(20.00, 5);
		CA4.setAmount(1.00, 3);
		CA4.setAmount(0.25, 15);
		CA4.setAmount(0.01, 2);
		
		payer1.setCurrencyAmounts(CA1);
		payer2.setCurrencyAmounts(CA2);
		payer3.setCurrencyAmounts(CA3);
		payer4.setCurrencyAmounts(CA4);
		
		payer1.setPayShare(37.52);
		payer2.setPayShare(26.98);
		payer3.setPayShare(21.03);
		payer4.setPayShare(29.10);
	}
}
