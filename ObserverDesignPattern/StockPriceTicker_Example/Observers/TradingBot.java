package ObserverDesignPattern.StockPriceTicker_Example.Observers;

import ObserverDesignPattern.StockPriceTicker_Example.Subjects.StockExchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TradingBot implements StockObserver {
	@Override
	public void actionOnEvent(StockExchange object) {
		Map<String, List<Double>> stockCatalog = object.getStockCatalog();
		String latestUpdatedStock = object.getLastUpdatedCompanyStock();
		Double currentPrice = stockCatalog.get(latestUpdatedStock).getLast();
		List<Double> priceHistory = stockCatalog.get(latestUpdatedStock);
		Double previousPrice = priceHistory.get(priceHistory.size() - 2);

		if (currentPrice > previousPrice) {
			System.out.println("\nBot -> " + latestUpdatedStock + " rising ($" + previousPrice +
									   " -> $" + currentPrice + "). HOLD.");
		}
		else if (currentPrice < previousPrice) {
			System.out.println("\nBot -> " + latestUpdatedStock + " dropping ($" + previousPrice +
									   " -> $" + currentPrice + "). BUY.");
		}
	}
}
