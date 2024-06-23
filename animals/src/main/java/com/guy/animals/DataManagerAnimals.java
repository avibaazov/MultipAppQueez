package com.guy.animals;

import com.guy.common.DataManagerBase;
import com.guy.common.GameManager;
import com.guy.common.Question;

import java.util.ArrayList;
import java.util.Collections;

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

        questions.add(new Question()
                .setImage("https://cdn.download.ams.birds.cornell.edu/api/v1/asset/362635561/900")
                .setAnswers(new String[]{"Penguin", "Seagull", "Duck", "Swan"},"Penguin"));

        questions.add(new Question()
                .setImage("https://www.ktalnews.com/wp-content/uploads/sites/5/2022/07/GettyImages-1300100945.jpg?w=2560&h=1440&crop=1")
                .setAnswers(new String[]{"Camel", "Horse", "Llama", "Deer"},"Camel"));

        questions.add(new Question()
                .setImage("https://media.npr.org/assets/img/2018/12/10/roger-the-kangaroo-sanctuary-alice-springs-2_custom-23e77a11f31c4688c8557f5993d2b4af0b6d52db.jpg?s=800&c=85&f=jpeg")
                .setAnswers(new String[]{"Kangaroo", "Rabbit", "Deer", "Elephant"},"Kangaroo"));

        questions.add(new Question()
                .setImage("https://thumbs.dreamstime.com/b/tiger-portrait-horizontal-11392212.jpg")
                .setAnswers(new String[]{"Tiger", "Lion", "Leopard", "Cheetah"},"Tiger"));
//        questions.add(new Question()
//                .setImage("")
//                .setAnswers(new String[]{"", "", "", ""},""));

        Collections.shuffle(questions);
        return questions;
    }
}