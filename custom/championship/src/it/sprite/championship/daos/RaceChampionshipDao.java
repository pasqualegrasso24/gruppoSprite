package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.RaceChampionshipModel;


public interface RaceChampionshipDao
{
	List<RaceChampionshipModel> findRaceChampionships();

	List<RaceChampionshipModel> findRaceChampionshipsByCode(String code);

	List<String> retrieveGranPrixCalendar(String code);
}
