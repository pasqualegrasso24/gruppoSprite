/**
 *
 */
package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.VehicleModel;


public interface VehicleDao
{
	List<VehicleModel> findVehicles();

	List<VehicleModel> findVehiclesByCode(String code);
}
