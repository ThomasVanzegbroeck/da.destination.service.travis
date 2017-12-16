package model.db;

import java.util.List;
import java.util.Map;


public interface DestinationDB {

	public void addVal(String stad, String data);

	public Map<String, String> getMap();

	public String getInfo(String stad);

	public List<String> getallSteden();

	public String toJson();

	public String getInfoForStadAsJson(String stad);
}