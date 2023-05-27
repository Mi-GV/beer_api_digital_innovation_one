package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockNegativeQuantityException extends Exception {

    public BeerStockNegativeQuantityException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed reached negative capacity: %s", id, quantityToDecrement));
    }
}
