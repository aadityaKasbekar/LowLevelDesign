package ObserverDesignPattern.StockPriceTicker_Example.Subjects;


import ObserverDesignPattern.StockPriceTicker_Example.Observers.StockObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchange implements StockExchangeSubject {
	private static StockExchange stockExchangeInstance = null;
	private final Map<String, List<Double>> stockCatalog;
	private final List<StockObserver> observersList;
	private String lastUpdatedCompanyStock = "";

	private StockExchange() {
		this.stockCatalog = new HashMap<String, List<Double>>();
		this.observersList = new ArrayList<StockObserver>();
	}

//	This works the same as double-checking lock mechanism.
//	private static final class StockExchangeInstanceHolder {
//		private static final StockExchange stockExchangeInstance = new StockExchange();
//	}
//
//	public static StockExchange getInstance() {
//		return StockExchangeInstanceHolder.stockExchangeInstance;
//	}

	public static StockExchange getInstance() {
		if (stockExchangeInstance == null) {
			synchronized (StockExchange.class) {
				if (stockExchangeInstance == null) {
					stockExchangeInstance = new StockExchange();
				}
			}
		}
		return stockExchangeInstance;
	}

	@Override
	public void registerObserver(StockObserver observer) {
		this.observersList.add(observer);
	}

	@Override
	public void removeObserver(StockObserver observer) {
		this.observersList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (StockObserver observer : this.observersList) {
			observer.actionOnEvent(this);
		}
	}

	public void addToCatalog(Double price, String... companyStocks) {
		for (String companyStock: companyStocks) {
			if (! this.stockCatalog.containsKey(companyStock)) {
				this.stockCatalog.put(companyStock, new ArrayList<>());
				this.stockCatalog.get(companyStock).add(price);
				this.lastUpdatedCompanyStock = companyStock;
				System.out.printf("\nThe Company Stock: %s is added to the StockCatalog. Initial Stock Price: $%f.\n", companyStock, price);
			} else {
				System.out.printf("\nThe Company Stock: %s is already added to the StockCatalog.Adding it again is prohibited.", companyStock);
			}
		}
	}

	public void updateStockPrice(String companyStock, Double newStockPrice) {
		if (this.stockCatalog.containsKey(companyStock)) {
			this.stockCatalog.get(companyStock).add(newStockPrice);
			this.lastUpdatedCompanyStock = companyStock;
			this.notifyObserver();
		} else {
			System.out.printf("\nThe Company Stock: %s is not added to the StockCatalog. Please first use the addToCatalog().", companyStock);
		}
	}

	public Double getStockPrice(String companyStock) {
		if (this.stockCatalog.containsKey(companyStock)) {
			return this.stockCatalog.get(companyStock).getLast();
		} else {
			System.out.printf("\nThe Company Stock: %s is not added to the StockCatalog. Please first use the addToCatalog().", companyStock);
			return 0.0;
		}
	}

	public String getLastUpdatedCompanyStock() {
		return lastUpdatedCompanyStock;
	}

	public Map<String, List<Double>> getStockCatalog() {
		Map<String, List<Double>> clone = new HashMap<>();

		for (Map.Entry<String, List<Double>> entry : stockCatalog.entrySet()) {
			clone.put(entry.getKey(), new ArrayList<>(entry.getValue()));
		}

		return clone;
	}
}