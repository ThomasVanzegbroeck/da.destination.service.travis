package model.db;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class DestinationDBInMemory implements DestinationDB {

	private Map<String, String> mem;

	public DestinationDBInMemory() {
		this.mem = new TreeMap<String, String>();

	}

	public void addVal(String stad, String info) {

		this.mem.put(stad, info);
	}

	public Map<String, String> getMap() {
		return this.mem;
	}

	public String getInfo(String stad) {
		// TODO Auto-generated method stub
		if(this.mem.get(stad)== null){
			throw new NullPointerException("Stad niet gevonden");
		}
		return this.mem.get(stad);
	}

	public List<String> getallSteden() {
		// TODO Auto-generated method stub
		ArrayList<String> res = new ArrayList<String>();

		res.addAll(this.mem.keySet());
		return res;
	}


	public String toJson() {
		String res = "[";
		int i = 0;
		for (String stad : this.getallSteden()) {
			if (i != 0) {
				res += ",";
			}
			String ss = "{ \"stad\" : \"" + stad + "\", \"info\" : \"" + this.getInfo(stad)
				+ "\"}";
			res = res + ss;
			i++;
		}
		res += "]";
		return res;
	}

	@Override
	public String getInfoForStadAsJson(String stad) {
		// TODO Auto-generated method stub
	if(!this.mem.containsKey(stad)){
		throw new NullPointerException("Sorry de stad is niet terug te vinden in onze databank");
	}
	String result = "{ \"stad\" : \"" + stad + "\", \"info\" : \"" + this.getInfo(stad)
	+ "\"}";
		return result;
	}



}
