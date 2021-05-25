package com.study.Heroes.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.Heroes.dto.HeroDTO;
import com.study.Heroes.entity.HeroEntity;
import com.study.Heroes.exception.HeroException;
import com.study.Heroes.repository.HeroRepository;

// does two things calls the same function thats it named it
//purpose is to call the function and convert it into dto or entity
@Service(value = "heroService")
@Transactional
public class HeroServiceImpl implements HeroService{
	
	@Autowired
	private HeroRepository heroRepository;
	
	
	@Override
	public HeroDTO findByHeroRanking(Integer heroRanking) throws HeroException {
		HeroEntity hero = heroRepository.findByHeroRanking(heroRanking);
		if(hero==null) {
			throw new HeroException("Service.Hero_Ranking_Not_Found");
		}
		return HeroEntity.entityToDTO(hero);
	}

	@Override
	public List<HeroDTO> findByHeroClass(Character heroClass) throws HeroException {
		List<HeroEntity> heroList = heroRepository.findByHeroClass(heroClass);
		if(heroList.isEmpty()) {
			throw new HeroException("Service.Hero_Class_Empty");
		}
		List<HeroDTO> anotherHeroList = new ArrayList<HeroDTO>();
		for(HeroEntity hero:heroList) {
			anotherHeroList.add(HeroEntity.entityToDTO(hero));
		}
		return anotherHeroList;
	}
	
	

	@Override
	public HeroDTO findByHeroName(String heroName) throws HeroException {
		HeroEntity hero = heroRepository.findByHeroName(heroName);
		if(hero==null) {
			throw new HeroException("Serive.Hero_Name_Not_Found");
		}
		return HeroEntity.entityToDTO(hero);
	}

	@Override
	public List<HeroDTO> findByActualName(String actualName) throws HeroException {
		List<HeroEntity> actualNameList = heroRepository.findByActualName(actualName);
		if(actualNameList.isEmpty()) {
			throw new HeroException("Service.Actual_Name_Not_Found");
		}
		List<HeroDTO> dtoList = new ArrayList<HeroDTO>();
		for(HeroEntity hero: actualNameList) {
			dtoList.add(HeroEntity.entityToDTO(hero));
		}
		
		return dtoList;
	}

	
}
