package com.ebac.caue;

import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<People> male = new HashSet();
        Set<People> female = new HashSet();
        System.out.println("Qual o seu nome?");
        String name = scanner.next();
        System.out.println("Qual seu sexo? (masculino / feminino)");
        String gender = scanner.next();
        People people = new People(name, gender);

        if (gender.equalsIgnoreCase("masculino")) {
            male.add(people);
        } else if (gender.equalsIgnoreCase("feminino")) {
            female.add(people);
        }

        for (People p : male) {
            System.out.println("Grupo masculino: ");
            System.out.println(p.getName());
        }

        for (People p : female) {
            System.out.println("Grupo feminino: ");
            System.out.println(p.getName());
        }

        scanner.close();
    }
}