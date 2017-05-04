/**
 *
 */
/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.PlacingModel;


public interface PlacingDAO
{

	List<PlacingModel> findPlacings();


	List<PlacingModel> findPlacingsByCode(String code);
}