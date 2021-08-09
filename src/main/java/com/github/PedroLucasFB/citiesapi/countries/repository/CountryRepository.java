package com.github.PedroLucasFB.citiesapi.countries.repository;

import com.github.PedroLucasFB.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
