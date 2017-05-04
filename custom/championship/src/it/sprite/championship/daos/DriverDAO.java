package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.DriverModel;


public interface DriverDAO
{

	List<DriverModel> findDrivers();

	List<DriverModel> findDriversByCode(String code);
}