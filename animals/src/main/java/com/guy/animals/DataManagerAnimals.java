package com.guy.animals;

import com.guy.common.DataManagerBase;
import com.guy.common.GameManager;
import com.guy.common.Question;

import java.util.ArrayList;

public class DataManagerAnimals extends DataManagerBase {



    @Override
    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question()
                .setImage("https://cdn.mos.cms.futurecdn.net/snvWHcGBeh6zwFMPsi8bDN-1920-80.jpg")
                .setAnswers(new String[]{"Panda", "Lion", "Crocodile", "Elephant"},"Panda"));

        questions.add(new Question()
                .setImage("https://images.pexels.com/photos/162140/duckling-birds-yellow-fluffy-162140.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
                .setAnswers(new String[]{"Duck", "Eagle", "Goose", "Bird"},"Duck"));
        questions.add(new Question()
                .setImage("https://images.pexels.com/photos/635499/pexels-photo-635499.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
                .setAnswers(new String[]{"Horse", "Donkey", "Cow", "Bull"},"Horse"));
//        questions.add(new Question()
//                .setImage("")
//                .setAnswers(new String[]{"", "", "", ""},""));


        return questions;
    }
}