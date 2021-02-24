package expert.springframework.mcsbrewery.web.mappers;

import expert.springframework.mcsbrewery.domain.Beer;
import expert.springframework.mcsbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);

}
