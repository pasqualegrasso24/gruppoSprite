package it.sprite.championship.daos;

import java.util.List;

import it.sprite.championship.model.StableModel;


public interface StableDao
{
	List<StableModel> findStables();

	List<StableModel> findStablesByCode(String code);
}
