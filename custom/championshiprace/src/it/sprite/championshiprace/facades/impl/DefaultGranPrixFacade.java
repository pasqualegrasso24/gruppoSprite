package it.sprite.championshiprace.facades.impl;

import org.springframework.beans.factory.annotation.Required;

import it.sprite.championship.model.GranPrixModel;
import it.sprite.championship.services.GranPrixService;
import it.sprite.championshiprace.data.GranPrixData;
import it.sprite.championshiprace.facades.GranPrixFacade;


public class DefaultGranPrixFacade implements GranPrixFacade
{

	private GranPrixService granPrixService;

	@Override
	public GranPrixData getGranPrix(final String name)
	{
		GranPrixModel granPrix = null;
		if (name != null)
		{
			granPrix = granPrixService.getGranPrixForCode(name);
			if (granPrix == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("GranPrix with name " + name + " not found.");
		}

		final GranPrixData granPrixData = new GranPrixData();
		granPrixData.setName(granPrix.getName());
		granPrixData.setLaps(granPrix.getLaps());
		granPrixData.setNation(granPrix.getNation());
		granPrixData.setDate(granPrix.getDate());
		return granPrixData;
	}

	@Required
	public void setGranPrixService(final GranPrixService granPrixService)
	{
		this.granPrixService = granPrixService;
	}


}
