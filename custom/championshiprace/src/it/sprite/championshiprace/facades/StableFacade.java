package it.sprite.championshiprace.facades;

import it.sprite.championshiprace.data.StableData;
import it.sprite.championshiprace.data.VehicleData;

public interface StableFacade
{
	StableData getStable(String name);

	StableData getStable(VehicleData vehicle);
}
