package com.guy.brands;

import com.guy.common.DataManagerBase;
import com.guy.common.Question;

import java.util.ArrayList;

public class DataManagerBrands extends DataManagerBase {

    @Override
    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

//        questions.add(new Question()
//                .setImage("https://www.muraldecal.com/en/img/asfs360-jpg/folder/products-listado-merchant/stickers-nike-logo.jpg")
//                .setAnswers(new String[]{"nike", "Lion", "Crocodile", "Elephant"},"nike"));

        questions.add(new Question()
                .setImage("https://1000logos.net/wp-content/uploads/2016/10/Apple-Logo.png")
                .setAnswers(new String[]{"Apple", "Microsoft", "Google", "Amazon"},"Apple"));

        questions.add(new Question()
                .setImage("https://cdn.logojoy.com/wp-content/uploads/20240110153809/Black-tesla-logo-600x600.png")
                .setAnswers(new String[]{"BMW", "Audi", "Mercedes", "Tesla"},"Tesla"));



        questions.add(new Question()
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2IrrREW17NJJzGG6Og7btw-FFhHIJa4gSbQ&s")
                .setAnswers(new String[]{"Pepsi", "Coca-Cola", "Dr. Pepper", "Mountain Dew"},"Coca-Cola"));

        questions.add(new Question()
                .setImage("https://static.vecteezy.com/system/resources/previews/010/994/239/non_2x/adidas-logo-black-symbol-clothes-design-icon-abstract-football-illustration-with-white-background-free-vector.jpg")
                .setAnswers(new String[]{"Nike", "Adidas", "Puma", "Reebok"},"Adidas"));


        return questions;
    }
}