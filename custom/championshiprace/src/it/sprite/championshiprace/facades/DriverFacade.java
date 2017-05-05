package it.sprite.championshiprace.facades;

import it.sprite.championshiprace.data.DriverData;
import it.sprite.championshiprace.data.VehicleData;

public interface DriverFacade
{

	DriverData getDriver(String name);

	DriverData getDriver(VehicleData vehicle);

}
