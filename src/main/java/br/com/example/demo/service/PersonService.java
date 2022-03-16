package br.com.example.demo.service;

import br.com.example.demo.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void process(){
        //until version 4.2 it was not possible publish a object
        applicationEventPublisher.publishEvent(new Person());
    }


}
