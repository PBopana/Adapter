

public class MyMauriTax implements CalcTax {
	NewMauriTax mt = new NewMauriTax();
	double tax_amount=0.0;
	@Override
	public double taxAmount(String item, int qty, double price) {
		tax_amount = mt.calc(qty, price);
		return tax_amount;
	}

}