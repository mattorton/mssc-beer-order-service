package uk.oakwoodland.beer.order.service.web.mappers;

import uk.oakwoodland.beer.order.service.domain.BeerOrderLine;
import uk.oakwoodland.beer.order.service.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
