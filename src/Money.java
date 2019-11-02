abstract class Money {
	protected int amount;
	private String currency;

	public boolean equals(Object object)  {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}   

	abstract Money times(int multiplier);  

	static Money dollar(int amount)  {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	String currency() {
		return currency;
	}
}