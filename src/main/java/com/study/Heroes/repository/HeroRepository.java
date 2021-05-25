package com.study.Heroes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.study.Heroes.entity.HeroEntity;

@Repository
public interface HeroRepository extends CrudRepository<HeroEntity, Integer> {
	// entity class because the hero entity is mapped to the database
	// no need to make an implementation class because we already extended crud
	
	public HeroEntity findByHeroRanking (Integer heroRanking);
	
	public HeroEntity findByHeroName (String heroName);
	
	public List<HeroEntity> findByActualName(String actualName);
	
	public List<HeroEntity> findByHeroClass (Character heroClass);

}
