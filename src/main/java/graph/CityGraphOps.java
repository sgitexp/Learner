package graph;

import java.util.Iterator;

public class CityGraphOps {
	
	private static CityGraph graph = new CityGraph();
	
	public static void addCity(String city, String destCity) {
		
		if( graph == null) return;
		
		//Create current city
		City currentCity = new City();
		currentCity.cityName = city;
		
		//Create destination city
		City closestCity = new City();
		closestCity.cityName = destCity;
		
		//Add cuurent coto to graph list
		if( !graph.cities.contains(currentCity) ) {
			graph.cities.add(currentCity);
		}
		//Add destination to graph list
		if( !graph.cities.contains(closestCity) ) {
			graph.cities.add(closestCity);
		}
		//Set neiboring cities to each other
		currentCity.setOfNearbyCities.add( closestCity );
		closestCity.setOfNearbyCities.add( currentCity );
		
	}
	
	public static void dfs(City startingCity , City destinationCity) {
	 
	}
	
	private static boolean getCity(City aCity) {
		Iterator<City> i = graph.cities.iterator(); 
		while(i.hasNext()) {
			City c = i.next();
			if( c.equals(aCity) )  
				return true;
		}
		return false;
	}

}
