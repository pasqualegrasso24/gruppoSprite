/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.RaceChampionshipModel;


/**
 * @author soprasteria
 *
 */
public interface RaceChampionshipDAO
{
	List<RaceChampionshipModel> findRaceChampionship();
}
