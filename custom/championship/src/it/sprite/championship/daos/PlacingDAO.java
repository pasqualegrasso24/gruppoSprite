/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.PlacingModel;


/**
 * @author soprasteria
 *
 */
public interface PlacingDAO
{
	List<PlacingModel> findGranPrix();
}
