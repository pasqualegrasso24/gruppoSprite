package it.sprite.championshiprace.facades;

import java.util.List;

import it.sprite.championshiprace.data.RaceChampionshipData;


public interface RaceChampionshipFacade
{
	RaceChampionshipData getRaceChampionship(String name);

	List<RaceChampionshipData> getRaceChampionships();

}
