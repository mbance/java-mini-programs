public class InvoiceItem {

	//instance variables
	int id;
	String description;
	int quantity;
	double unitPrice;

	//class variables
	static int counter = 0;

	public static void main(String [] args){
		InvoiceItem a = new InvoiceItem(001, "a", 1, 1.00);
		InvoiceItem b = new InvoiceItem(002, "b", 2, 2.00);
		InvoiceItem c = new InvoiceItem(003, "c", 3, 3.00);
	}

	//constructor
	public InvoiceItem(int id, String description, int quantity, double unitPrice){
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		counter++;
	}

	//getters

	int getId(int id) { //returns the id
		return id;
	}

	String getDescription(String description) { //returns the description
		return description;
	}

	int getQuantity(int quantity) { //returns the quantity
		return quantity;
	}

	double getUnitPrice(double unitPrice) { //returns the unit price
		return unitPrice;
	}

	//setters

	void setQuantity(int quantity) { //sets the quantity
		quantity = 1;
	}

	void setUnitPrice(double unitPrice) { //sets the unit price
		unitPrice = 1;
	}

	public String toString() {
		return System.out.print("Invoice Item: " + "ID: " + this.id + ", Description: " + this.description + ", Quantity: " + this.quantity + ", Unit Price: " + Str(this.unitPrice));
	}

}