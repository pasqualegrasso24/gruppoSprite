/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.DriverModel;


/**
 * @author soprasteria
 *
 */
public interface DriverDAO
{
	List<DriverModel> findGranPrix();
}

