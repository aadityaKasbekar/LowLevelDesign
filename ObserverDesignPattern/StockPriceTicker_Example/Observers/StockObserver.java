package ObserverDesignPattern.StockPriceTicker_Example.Observers;

import ObserverDesignPattern.StockPriceTicker_Example.Subjects.StockExchange;

public interface StockObserver {
	void actionOnEvent(StockExchange object);
}
