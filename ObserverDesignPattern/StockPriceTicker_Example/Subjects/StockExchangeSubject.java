package ObserverDesignPattern.StockPriceTicker_Example.Subjects;

import ObserverDesignPattern.StockPriceTicker_Example.Observers.StockObserver;

public interface StockExchangeSubject {
	void registerObserver(StockObserver observer);
	void removeObserver(StockObserver observer);
	void notifyObserver();
}
