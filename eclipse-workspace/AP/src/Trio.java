
public class Trio implements MenuItem {
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;
	private String name;
	private double price;

	public Trio(Sandwich tempSandwich, Salad tempSalad, Drink tempDrink) {
		sandwich = tempSandwich;
		salad = tempSalad;
		drink = tempDrink;
		name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
		double allIn = sandwich.getPrice() + salad.getPrice() + drink.getPrice();
		price = allIn - Math.min(Math.min(sandwich.getPrice(), salad.getPrice()), drink.getPrice());
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
