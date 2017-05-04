/**
 *
 */
package it.sprite.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.sprite.championship.daos.VehicleDAO;
import it.sprite.championship.model.VehicleModel;


/**
 * @author soprasteria
 *
 */
public class DefaultVehicleDAO implements VehicleDAO
{


	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<VehicleModel> findVehicles()
	{
		// YTODO Auto-generated method stub

		// Build a query for the flexible search.
		final String queryString = //
				"SELECT {vehicle:" + VehicleModel.PK + "} "//
						+ "FROM {" + VehicleModel._TYPECODE + " AS vehicle} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<VehicleModel> search(query).getResult();

	}


}
