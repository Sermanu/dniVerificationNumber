package com.example.demo.controller;

import com.example.demo.facade.ExchangeFacade;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/verification")
public class ExchangeController {

    private final ExchangeFacade exchangeFacade;

    public ExchangeController(ExchangeFacade exchangeFacade) {
        this.exchangeFacade = exchangeFacade;
    }


    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Single<String> verification(@RequestParam("documentNumber") String documentNumber){
      return exchangeFacade.verification(documentNumber)
                .subscribeOn(Schedulers.io());
    }

}
