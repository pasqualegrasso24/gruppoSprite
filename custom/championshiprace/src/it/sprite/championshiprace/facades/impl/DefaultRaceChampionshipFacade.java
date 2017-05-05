package it.sprite.championshiprace.facades.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.sprite.championship.model.DriverModel;
import it.sprite.championship.model.GranPrixModel;
import it.sprite.championship.model.PlacingModel;
import it.sprite.championship.model.RaceChampionshipModel;
import it.sprite.championship.model.VehicleModel;
import it.sprite.championship.services.RaceChampionshipService;
import it.sprite.championshiprace.data.DriverData;
import it.sprite.championshiprace.data.GranPrixData;
import it.sprite.championshiprace.data.PlacingData;
import it.sprite.championshiprace.data.RaceChampionshipData;
import it.sprite.championshiprace.data.VehicleData;
import it.sprite.championshiprace.facades.RaceChampionshipFacade;


public class DefaultRaceChampionshipFacade implements RaceChampionshipFacade
{

	private RaceChampionshipService raceChampionshipService;

	@Override
	public RaceChampionshipData getRaceChampionship(final String name)
	{
		RaceChampionshipModel rcm = null;
		if (name != null)
		{
			rcm = raceChampionshipService.getRaceChampionshipsForCode(name);
			if (rcm == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("RaceChampionship with name " + name + " not found.");
		}
		final List<GranPrixData> granPrix = new ArrayList<GranPrixData>();
		RaceChampionshipData rcd = null;
		if (rcm.getGranPrix() != null)
		{
			rcd = new RaceChampionshipData();
			final Iterator<GranPrixModel> granPrixIterator = rcm.getGranPrix().iterator();
			while (granPrixIterator.hasNext())
			{
				final GranPrixModel gp = granPrixIterator.next();
				granPrix.add(getGranPrixData(gp));
			}
			rcd.setName(rcm.getName());
			rcd.setType(rcm.getType().toString());
			rcd.setGranPrix(granPrix);
		}
		return rcd;
	}


	@Override
	public List<RaceChampionshipData> getRaceChampionships()
	{
		final List<RaceChampionshipModel> raceChampionshipModels = raceChampionshipService.getRaceChampionships();
		final List<RaceChampionshipData> raceChampionshipFacadeData = new ArrayList<RaceChampionshipData>();
		for (final RaceChampionshipModel rcm : raceChampionshipModels)
		{
			final List<GranPrixData> granPrix = new ArrayList<GranPrixData>();
			if (rcm.getGranPrix() != null)
			{
				final Iterator<GranPrixModel> granPrixIterator = rcm.getGranPrix().iterator();

				while (granPrixIterator.hasNext())
				{
					final GranPrixModel gp = granPrixIterator.next();
					granPrix.add(getGranPrixData(gp));
				}
			}
			final RaceChampionshipData rcd = new RaceChampionshipData();
			rcd.setName(rcm.getName());
			rcd.setType(rcm.getType().toString());
			rcd.setGranPrix(granPrix);
			raceChampionshipFacadeData.add(rcd);
		}
		return raceChampionshipFacadeData;
	}

	private VehicleData getVehicleData(final DriverModel driverM)
	{
		final VehicleModel vehicleM = driverM.getVehicle();
		final VehicleData vehicle = new VehicleData();
		vehicle.setName(vehicleM.getName());
		vehicle.setNumber(vehicleM.getNumber());
		vehicle.setType(vehicleM.getType().toString());
		return vehicle;
	}

	private DriverData getDriverData(final PlacingModel placing)
	{
		final DriverModel driverM = placing.getDriver();
		final DriverData driver = new DriverData();
		driver.setName(driverM.getName());
		driver.setSurname(driver.getSurname());
		driver.setNationality(driverM.getNationality());
		driver.setVehicle(getVehicleData(driverM));
		return driver;
	}

	private GranPrixData getGranPrixData(final GranPrixModel gp)
	{
		final GranPrixData summary = new GranPrixData();
		summary.setDate(gp.getDate());
		summary.setLaps(gp.getLaps());
		summary.setName(gp.getName());
		summary.setNation(gp.getNation());
		summary.setPlacing(getPlacingsData(gp));
		return summary;
	}

	private List<PlacingData> getPlacingsData(final GranPrixModel gp)
	{
		final List<PlacingData> placings = new ArrayList<PlacingData>();
		if (gp.getPlacings() != null)
		{
			final Iterator<PlacingModel> placingIterator = gp.getPlacings().iterator();

			while (placingIterator.hasNext())
			{
				final PlacingModel placing = placingIterator.next();
				final PlacingData summary = new PlacingData();
				summary.setPosition(placing.getPosition());
				summary.setTime(placing.getTime());
				summary.setDriver(getDriverData(placing));
				placings.add(summary);
			}
		}
		return placings;

	}


	@Required
	public void setRaceChampionshipService(final RaceChampionshipService raceChampionshipService)
	{
		this.raceChampionshipService = raceChampionshipService;
	}

}
