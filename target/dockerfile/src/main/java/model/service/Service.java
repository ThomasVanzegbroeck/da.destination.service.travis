package model.service;

import java.util.List;


public interface Service {
	public String getAllDataAsJSON();

	public List<String> getAllSteden();

	public void addDataToDataBase(String stad, String info);

	public String getInfoForStad(String stad);

	public String getInfoForStadAsJson(String stad);

}
