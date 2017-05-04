/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.GranPrixModel;


/**
 * @author soprasteria
 *
 */
public interface GranPrixDAO
{
	List<GranPrixModel> findGranPrix();
}
