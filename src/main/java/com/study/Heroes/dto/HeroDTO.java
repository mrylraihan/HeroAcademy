package com.study.Heroes.dto;

import com.study.Heroes.entity.HeroEntity;

public class HeroDTO {
	
	private Integer heroId;
	private String actualName;
	private String heroName;
	private String homeCity;
	private String superpower;
	private Integer heroRanking;
	private Character heroClass;
	
	public Integer getHeroId() {
		return heroId;
	}
	public void setHeroId(Integer heroId) {
		this.heroId = heroId;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHomeCity() {
		return homeCity;
	}
	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}
	public String getSuperpower() {
		return superpower;
	}
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	public Integer getHeroRanking() {
		return heroRanking;
	}
	public void setHeroRanking(Integer heroRanking) {
		this.heroRanking = heroRanking;
	}
	public Character getHeroClass() {
		return heroClass;
	}
	public void setHeroClass(Character heroClass) {
		this.heroClass = heroClass;
	}
	
	public HeroEntity dtoToEntity() {
		
		HeroEntity entity = new HeroEntity();
		entity.setActualName(this.getActualName());
		entity.setHeroName(this.getHeroName());
		entity.setHeroClass(this.getHeroClass());
		entity.setHeroId(this.getHeroId());
		entity.setHeroRanking(this.getHeroRanking());
		entity.setHomeCity(this.getHomeCity());
		entity.setSuperpower(this.getSuperpower());
		
		return entity;
	}

}
