package com.example.demo.facade;

import com.example.demo.service.ExchangeService;
import io.reactivex.Single;
import org.springframework.stereotype.Component;

@Component
public class ExchangeFacade {

    private final ExchangeService exchangeService;

    public ExchangeFacade(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    public Single<String> verification(String documentNumber) {
        return exchangeService.verification(documentNumber);
    }


}
