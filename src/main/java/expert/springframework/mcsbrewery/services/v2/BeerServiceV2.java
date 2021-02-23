package expert.springframework.mcsbrewery.services.v2;

import expert.springframework.mcsbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);

}
