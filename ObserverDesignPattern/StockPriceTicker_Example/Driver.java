package ObserverDesignPattern.StockPriceTicker_Example;

import ObserverDesignPattern.StockPriceTicker_Example.Observers.AlertService;
import ObserverDesignPattern.StockPriceTicker_Example.Observers.PriceDisplay;
import ObserverDesignPattern.StockPriceTicker_Example.Observers.TradingBot;
import ObserverDesignPattern.StockPriceTicker_Example.Subjects.StockExchange;

public class Driver {
	public static void main(String[] args) {
		StockExchange exchange = StockExchange.getInstance();

		PriceDisplay display = new PriceDisplay();
		AlertService alerts = new AlertService();
		TradingBot bot = new TradingBot();

		exchange.registerObserver(display);
		exchange.registerObserver(alerts);
		exchange.registerObserver(bot);

		alerts.setAlerts("AAPL", 180.0);
		alerts.setAlerts("GOOG", 140.0);

		exchange.addToCatalog(130.10, "AAPL", "GOOG");
		exchange.updateStockPrice("AAPL", 175.50);
		exchange.updateStockPrice("GOOG", 138.25);
		exchange.updateStockPrice("AAPL", 182.00);
		exchange.updateStockPrice("GOOG", 141.75);
	}
}
