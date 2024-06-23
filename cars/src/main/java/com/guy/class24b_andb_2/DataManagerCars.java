package com.guy.class24b_andb_2;

import com.guy.common.DataManagerBase;
import com.guy.common.Question;

import java.util.ArrayList;
import java.util.Collections;

public class DataManagerCars extends DataManagerBase {

    @Override
    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question()
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkyOtvfEL4KXXDM1hw7gKiF_nGlokWuL5Ggg&s") // Placeholder URL, replace with actual URL
                .setAnswers(new String[]{"488", "Huracan", "911", "DB11"}, "488"));

        questions.add(new Question()
                .setImage("https://media.ed.edmunds-media.com/tesla/model-s/2024/oem/2024_tesla_model-s_sedan_plaid_fq_oem_1_1600.jpg") // Placeholder URL, replace with actual URL
                .setAnswers(new String[]{"Model S", "Leaf", "Bolt", "i3"}, "Model S"));

        questions.add(new Question()
                .setImage("https://m.atcdn.co.uk/ect/media/%7Bresize%7D/3e7dbe41afea4891a15e05034e6360e1.jpg") // Placeholder URL, replace with actual URL
                .setAnswers(new String[]{"Camaro", "Mustang", "Charger", "Supra"}, "Mustang"));

        questions.add(new Question()
                .setImage("https://uploads.audi-mediacenter.com/system/production/media/70272/images/3c92d2acbf6ab5f85be8006f854786f0f0ff36be/A1813681_web_2880.jpg?1698341967") // Placeholder URL, replace with actual URL
                .setAnswers(new String[]{"R8", "AMG GT", "570S", "Cayman"}, "R8"));

        questions.add(new Question()
                .setImage("https://hips.hearstapps.com/hmg-prod/amv-prod-cad-assets/images/14q1/562747/2014-mclaren-p1-test-review-car-and-driver-photo-580034-s-original.jpg?fill=16:9&resize=1200:*") // Placeholder URL, replace with actual URL
                .setAnswers(new String[]{"Chiron", "LaFerrari", "P1", "918 Spyder"}, "P1"));


        Collections.shuffle(questions);

        return questions;
    }

}