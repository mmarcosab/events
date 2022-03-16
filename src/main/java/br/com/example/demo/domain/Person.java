package br.com.example.demo.domain;

import java.time.LocalDate;

public class Person {

    private String name;
    private String doc;
    private LocalDate birthDate;

    public Person() {

    }

    public Person(String name, String doc, LocalDate birthDate) {
        this.name = name;
        this.doc = doc;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
