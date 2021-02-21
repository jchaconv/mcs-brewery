package expert.springframework.mcsbrewery.services;

import expert.springframework.mcsbrewery.web.model.BeerDtoV2;

import java.util.UUID;

public interface BeerService {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
