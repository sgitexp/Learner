package graph;

import java.util.HashSet;
import java.util.Set;

public class City {
	
	public String cityName;
	public Set<City> setOfNearbyCities = new HashSet<City>();
	@Override
	public int hashCode(){
		return cityName.hashCode();
	}
	@Override
	public boolean equals(Object aCity) {
		if( aCity == null )
			return false;
		if( aCity instanceof City == false)
			return false;
		else
		   return cityName.equals(aCity);
	}
	
}
