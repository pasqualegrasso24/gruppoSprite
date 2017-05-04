/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.StableModel;


/**
 * @author soprasteria
 *
 */
public interface StableDAO
{

	List<StableModel> findStable();
}
