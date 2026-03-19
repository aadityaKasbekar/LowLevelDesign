package ObserverDesignPattern.StockPriceTicker_Example.Observers;

import ObserverDesignPattern.StockPriceTicker_Example.Subjects.StockExchange;

public class PriceDisplay implements StockObserver {
	@Override
	public void actionOnEvent(StockExchange object) {
		String companyStockSymbol = object.getLastUpdatedCompanyStock();
		System.out.print("\nDisplay -> " + companyStockSymbol + ": $" + object.getStockPrice(companyStockSymbol));
	}
}
