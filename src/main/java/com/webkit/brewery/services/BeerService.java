package com.webkit.brewery.services;

import com.webkit.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);


}
