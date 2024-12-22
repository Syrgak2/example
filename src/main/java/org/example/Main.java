package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String nameSyrgak = "Syrgak";
//        int ageSyrgak = 23;
//
//        String nameShorpogul = "Shorpogul";
//        int ageShorpogul = 22;
//
//        String Aidai = "Aidai";
//        int ageAidai = 21;
//
//
//        String[] names = {"Syrgak", "Shorpogul"};
//        int[] ages = {23, 22};

//        Person syrgak = new Person();
//        syrgak.name = "Syrgak";
//        syrgak.age = 23;
//        syrgak.phone = "+996 772 34 24 42";
//
//        Person shorpogul = new Person();
//        shorpogul.name = "Shorpogul";
//        shorpogul.age = 22;
//        shorpogul.phone = "+996 772 34 24 42";
//
//        Person aidai = new Person();
//        aidai.name = "Aidai";
//        aidai.age = 21;
//        aidai.phone = "+996 772 34 24 42";


//        Person syrgak = createPerson("Syrgak", 23, "+996 772 34 24 42");
//        Person shorpogul = createPerson("Shorpogul", 22, "+996 772 34 24 42");
//        Person aidai = createPerson("Aidai", 21, "+996 772 34 24 42");

        Person syrgak = new Person("Syrgak", 12, "+996 772 34 24 42", 6789);
        Person shorpogul = new Person("Shorpogul", 12, "+996 772 34 24 42", 6789);
        Person aidai = new Person("Aidai", 12, "+996 772 34 24 42", 6789);

        Person[] people = {syrgak, shorpogul, aidai};

        Person govnoPerson = new Person();

        govnoPerson.setName("kfdjsldk");

        if (syrgak.equals(shorpogul)) {

        }


        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge() + " " + person.getPhone());
        }

//        System.out.println(shorpogul.name + " " + shorpogul.age + " " + shorpogul.phone);




//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + " " + ages[i]);
//        }
    }


    }