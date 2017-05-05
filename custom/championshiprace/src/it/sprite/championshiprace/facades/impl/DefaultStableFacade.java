package it.sprite.championshiprace.facades.impl;

import org.springframework.beans.factory.annotation.Required;

import it.sprite.championship.model.StableModel;
import it.sprite.championship.model.VehicleModel;
import it.sprite.championship.services.StableService;
import it.sprite.championshiprace.data.StableData;
import it.sprite.championshiprace.data.VehicleData;
import it.sprite.championshiprace.facades.StableFacade;


public class DefaultStableFacade implements StableFacade
{

	private StableService stableService;

	@Override
	public StableData getStable(final String name)
	{
		StableModel stable = null;
		if (name != null)
		{
			stable = stableService.getStablesForCode(name);
			if (stable == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Stable with name " + name + " not found.");
		}

		final StableData stableData = new StableData();
		stableData.setName(stable.getName());
		stableData.setNation(stable.getNation());
		stableData.setFirstVehicle(getVehicleData(stable.getFirstVehicle()));
		stableData.setSecondVehicle(getVehicleData(stable.getFirstVehicle()));
		return stableData;
	}

	@Override
	public StableData getStable(final VehicleData vehicle)
	{

		StableModel stable = null;
		if (vehicle != null)
		{
			stable = stableService.getStablesForVehicle(vehicle);
			if (stable == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Stable with vehicle " + vehicle.getName() + " not found.");
		}

		final StableData stableData = new StableData();
		stableData.setName(stable.getName());
		stableData.setNation(stable.getNation());
		stableData.setFirstVehicle(getVehicleData(stable.getFirstVehicle()));
		stableData.setSecondVehicle(getVehicleData(stable.getFirstVehicle()));
		return stableData;
	}

	private VehicleData getVehicleData(final VehicleModel vehicleM)
	{
		final VehicleData vehicle = new VehicleData();
		vehicle.setName(vehicleM.getName());
		vehicle.setNumber(vehicleM.getNumber());
		vehicle.setType(vehicleM.getType().toString());
		return vehicle;
	}

	@Required
	public void setStableService(final StableService stableService)
	{
		this.stableService = stableService;
	}

}
