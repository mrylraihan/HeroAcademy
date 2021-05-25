package com.study.Heroes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.study.Heroes.dto.HeroDTO;

@Entity
@Table(name = "hero")
public class HeroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	
	public static HeroDTO entityToDTO(HeroEntity heroEntity) {
		
		HeroDTO dto = new HeroDTO();
		dto.setActualName(heroEntity.getActualName());
		dto.setHeroName(heroEntity.getHeroName());
		dto.setHeroClass(heroEntity.getHeroClass());
		dto.setHeroId(heroEntity.getHeroId());
		dto.setHeroRanking(heroEntity.getHeroRanking());
		dto.setHomeCity(heroEntity.getHomeCity());
		dto.setSuperpower(heroEntity.getSuperpower());
		
		return dto;
		
	}
}
