package com.nt.service;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entuty.Country;
import com.nt.repo.repo;
@Service
public class ServiceImplClass implements serviceImpl {
@Autowired
private repo rep1;

 

	@Override
	public Set<String> getAllCountry() {
		System.out.println("///////");
		System.out.println("ServiceImplClass.getAllCountry()");
      Locale locales[]=Locale.getAvailableLocales();
      System.out.println(locales+"locales countries");
      Set<String>countrySet=new TreeSet();
		for(Locale l:locales) {
			if(l!=null)
				countrySet.add(l.getDisplayCountry());
		}
      return countrySet;
	}

	@Override
	public String save(Country country) {
System.out.println("ServiceImplClass.save()");
		return rep1.save(country)+"deta save sucessfully";
	}

}
