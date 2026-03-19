package ObserverDesignPattern.StockPriceTicker_Example.Observers;

import ObserverDesignPattern.StockPriceTicker_Example.Subjects.StockExchange;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlertService implements StockObserver {
	private final Map<String, Double> stockThresholds;

	public AlertService() {
		this.stockThresholds = new HashMap<>();
	}

	public void setAlerts(String companyStock, Double price) {
		this.stockThresholds.put(companyStock, price);
		System.out.printf("\nThe Threshold for Company Stock: %s is set to %.2f.\n", companyStock, price);
	}

	@Override
	public void actionOnEvent(StockExchange object) {
		Map<String, List<Double>> stockCatalog = object.getStockCatalog();
		String latestUpdatedStock = object.getLastUpdatedCompanyStock();
		Double latestStockValue = stockCatalog.get(latestUpdatedStock).getLast();
		Double thresholdValue = stockThresholds.get(latestUpdatedStock);

		if (latestStockValue > thresholdValue) {
			System.out.printf("\nALERT -> The Stock Price of the Company Stock is more than threshold by: $%.2f", (latestStockValue - thresholdValue));
		}
		else if (latestStockValue < thresholdValue) {
			System.out.printf("\nALERT -> The Stock Price of the Company Stock less than threshold by: $%.2f", (thresholdValue - latestStockValue));
		} else {
			System.out.print("\nALERT -> " + latestStockValue + " hit $" + latestStockValue +
									   " it's threshold price.");
		}

	}
}
