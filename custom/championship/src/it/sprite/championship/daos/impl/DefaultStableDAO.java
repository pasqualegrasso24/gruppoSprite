/**
 *
 */
package it.sprite.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import it.sprite.championship.daos.StableDAO;
import it.sprite.championship.model.StableModel;


/**
 * @author soprasteria
 *
 */
public class DefaultStableDAO implements StableDAO
{

	/*
	 * (non-Javadoc)
	 *
	 * @see it.sprite.championship.daos.StableDAO#findStable()
	 */
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<StableModel> findStable()
	{


		final String queryString = //
				"SELECT {stable:" + StableModel.PK + "} "//
						+ "FROM {" + StableModel._TYPECODE + " AS stable} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<StableModel> search(query).getResult();

	}
}


