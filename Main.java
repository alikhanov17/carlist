package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static int count = 1;
    public static Scanner scanner = new Scanner(in);


    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        ArrayList<User> userArrayList = new ArrayList<>();

        System.out.println("xush kelibsiz !!!");

        System.out.println();

while (true){
        System.out.println("1-> admin panel");
        System.out.println("2-> userpanel ");
        int a = scanner.nextInt();
        if (a==1){
        System.out.println("Loginni kriting: ");
        String login = scanner.next();
        System.out.println("Parolni kriting: ");
        int password = scanner.nextInt();
        if (login.contains("admin") && password == 1234) {

                System.out.println("[1] yangi avtomobil listini qo'shish ");
                System.out.println("[2] avtomobillar listini ko'rish ");
                System.out.println("[3] avtomobillar listini o'chirish ");
                System.out.println("[4] avtomobillar listini yangilash  ");
                System.out.println("[5] qo'shilgan userlar listini ko'rish ");
                System.out.println("[6] qo'shilgan userlarni listini o'chirish ");
                System.out.println("[7] exit");
                int n = scanner.nextInt();
                switch (n) {
                    case 1 -> {
                        System.out.println("Avtomobilni nomini kiriting: ");
                        String name = scanner.next();
                        System.out.println("Avtomobilni brandini kriting: ");
                        String brand = scanner.next();
                        System.out.println("Avtomobilni yilini kiriting: ");
                        int age = scanner.nextInt();
                        System.out.println("Avtomobilni narxini kiriting ");
                        int price = scanner.nextInt();
                        carArrayList.add(new Car(name, brand, age, price));
                    }
                    case 2 -> {
                        if (carArrayList.isEmpty()==false){
                        carArrayList.forEach(car -> {

                            System.out.println("nomi: " + car.getName() + " " + "brandi: " + car.getBrand() + " " + "yili: " + " " + car.getAge() + " " + "narxi: " + car.getPrice());

                        });}else {
                            System.out.println("list bosh");
                        }
                        System.out.println();
                    }
                    case 3 -> {
                        if (carArrayList.isEmpty()==true){
                            System.out.println("list bosh");
                        }
                        else{
                        carArrayList.clear();
                    }}
                    case 4 -> {

                        System.out.println("Avtomobilni nomini kiriting: ");
                        String nameCar = scanner.next();

                        System.out.println("Avtomobilni brandini kriting: ");
                        String brandCar = scanner.next();
                        System.out.println("Avtomobilni yilini kiriting: ");
                        int ageCar = scanner.nextInt();
                        System.out.println("Avtomobilni narxini kiriting ");
                        int priceCar = scanner.nextInt();
                        carArrayList.set(0, new Car(nameCar, brandCar, ageCar, priceCar));


                    }
                    case 5->{
                        if (userArrayList.isEmpty()==true){
                            System.out.println("userlar listi bush");
                        }
                        else{

                        for (User user : userArrayList) {
                            System.out.println(user.getName() + " | " + user.getAge() + " | " + user.getPassword() + " | " + user.getCard());
                        }}
                        System.out.println();
                    }
                    case 6->{
                        userArrayList.clear();
                    }
                    case 7->{
                        break;
                    }




                
            }
        } }else if (a==2){

                System.out.println("[1] yangi user qo'shish ");
                System.out.println("[2] userlar haqida malumot ");
                System.out.println("[3] avtomobilni sotib olish ");
                System.out.println("[4] avtomobillar listiga qaytish");

                int b = scanner.nextInt();

                switch (b) {


                    case 1 -> {
                        System.out.println("Isim: ");
                        String userName1 = scanner.next();
                        System.out.println("Password ");
                        int userPassword1 = scanner.nextInt();
                        System.out.println("Yosh: ");
                        int userAge1 = scanner.nextInt();
                        System.out.println("Card: ");
                        int userCard1 = scanner.nextInt();
                        userArrayList.add(new User(userName1, userAge1, userPassword1, userCard1));
                    }
                    case 2 -> {
                        for (User user : userArrayList) {
                            System.out.println(user.getName() + " | " + user.getAge() + " | " + user.getPassword() + " | " + user.getCard());
                        }
                        System.out.println();
                    }
                    case 3->{
                        System.out.println("sotib olish uchun user malumotlarini kiriting: ");
                        System.out.println("Isim: ");
                        String userName = scanner.next();
                        System.out.println("Password ");
                        int userPassword = scanner.nextInt();
                        System.out.println("Yosh: ");
                        int userAge = scanner.nextInt();
                        System.out.println("Card: ");
                        int userCard = scanner.nextInt();
                        userArrayList.forEach(user -> {
                            if (userPassword==user.getPassword()){
                                System.out.println("avtomobil sotib olindi ");
                                System.out.println();
                            }
                            else {
                                System.out.println("avtomobil sotib olinmadi");
                            }
                        });
                    }
                    case 4->{
                        break;
                    }


                }



        }
    }
}}


