package com.study.Heroes.service;

import java.util.List;

import com.study.Heroes.dto.HeroDTO;
import com.study.Heroes.entity.HeroEntity;
import com.study.Heroes.exception.HeroException;

public interface HeroService {
	
	public HeroDTO findByHeroRanking (Integer heroRanking)throws HeroException;
	
	public HeroDTO findByHeroName (String heroName)throws HeroException;

	public List<HeroDTO> findByActualName(String actualName) throws HeroException;

	public List<HeroDTO> findByHeroClass (Character heroClass)throws HeroException;

}
