/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.VehicleModel;


/**
 * @author soprasteria
 *
 */
public interface VehicleDAO
{
	List<VehicleModel> findVehicles();
}
