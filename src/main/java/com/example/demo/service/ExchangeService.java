package com.example.demo.service;

import io.reactivex.Single;

public interface ExchangeService {

    Single<String> verification(String documentNumber);
}
