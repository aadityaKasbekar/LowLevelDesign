package BuilderDesignPattern.CarManufacture_Example.Components;

public class GPSNavigator {
	private String route;

	public GPSNavigator() {
		this.route = "4290 Albany Dr, San Jose, CA, 95129";
	}

	public GPSNavigator(String manulRoute) {
		this.route = manulRoute;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return this.getRoute();
	}
}
