package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entuty.Country;

public interface repo extends JpaRepository<Country,Integer> {

}
