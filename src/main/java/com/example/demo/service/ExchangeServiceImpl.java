package com.example.demo.service;

import io.reactivex.Single;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceImpl implements ExchangeService {


    @Override
    public Single<String> verification(String documentNumber) {
        return Single.just("digito");
    }
}
