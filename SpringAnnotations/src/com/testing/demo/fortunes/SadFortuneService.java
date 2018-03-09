package com.testing.demo.fortunes;

import org.springframework.stereotype.Component;


@Component
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Not looking good";
    }
}
