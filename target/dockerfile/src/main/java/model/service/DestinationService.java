package model.service;

import java.util.List;

import model.db.DestinationDB;
import model.db.DestinationDBInMemory;
public class DestinationService implements Service {
	private DestinationDB db;

	public DestinationService() {
		this.db = new DestinationDBInMemory();
	}

	@Override
	public String getAllDataAsJSON() {
		// TODO Auto-generated method stub
		return db.toJson();
	}

	@Override
	public List<String> getAllSteden() {
		// TODO Auto-generated method stub
		return db.getallSteden();
	}

	@Override
	public void addDataToDataBase(String stad, String info) {
		// TODO Auto-generated method stub
		db.addVal(stad, info);
	}

	@Override
	public String getInfoForStad(String stad) {
		// TODO Auto-generated method stub
		return db.getInfo(stad);
	}

	@Override
	public String getInfoForStadAsJson(String stad) {
		// TODO Auto-generated method stub
		return db.getInfoForStadAsJson(stad);
	}

	

}
