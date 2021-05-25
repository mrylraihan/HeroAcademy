package com.study.Heroes.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.Heroes.dto.HeroDTO;
import com.study.Heroes.exception.HeroException;
import com.study.Heroes.service.HeroService;

@Validated
@RestController
@RequestMapping(value = "heroAPI")
public class HeroAPI {
	
	@Autowired
	private HeroService heroService;
	
	@GetMapping(value = "ranking/{heroRanking}")
	public ResponseEntity<HeroDTO> findByHeroRanking (@PathVariable Integer heroRanking)throws HeroException {
		HeroDTO heroDTO = heroService.findByHeroRanking(heroRanking);
		
		return new ResponseEntity<HeroDTO>(heroDTO, HttpStatus.OK);
	}
	@GetMapping(value = "class/{heroClass}")
	public ResponseEntity<List<HeroDTO>> findByHeroClass (@PathVariable Character heroClass)throws HeroException {
		List<HeroDTO> dtoList = heroService.findByHeroClass(heroClass);
		return new ResponseEntity<List<HeroDTO>>(dtoList, HttpStatus.OK);
	}
	
	@GetMapping(value = "heroName/{heroName}")
	public ResponseEntity<HeroDTO> findByHeroName (@PathVariable String heroName)throws HeroException {
		HeroDTO heroDTO = heroService.findByHeroName(heroName);
		return new ResponseEntity<HeroDTO>(heroDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "actualName/{actualName}")
	public ResponseEntity<List<HeroDTO>> findByActualName(@PathVariable String actualName) throws HeroException {
		List<HeroDTO> dtoList = heroService.findByActualName(actualName);
		return new ResponseEntity<List<HeroDTO>>(dtoList, HttpStatus.OK);
	}

}
