Quiz App Collection
Overview

The Quiz App Collection is a suite of trivia games designed for various themes, including cars, animals, and brand logos. Each quiz app is a standalone module that leverages a shared common module for core functionality. This modular design allows for easy expansion and customization of quiz topics.
Features

    Multiple Quiz Themes: Choose from cars, animals, or brand logo quizzes.
    Multiple Choice Questions: Answer questions based on images with four possible answers.
    Hint Feature: Use hints to eliminate two incorrect answers.
    Hearts System: Users have four hearts, losing one for each incorrect answer.
   
    Game Over Screen: Displays when the user runs out of hearts, with options to restart or exit the game.

Installation

To install and run the Quiz App Collection locally, follow these steps:

    Clone the repository:

    bash

    git clone https://github.com/yourusername/quiz-app-collection.git

    Open the project: Open the project in your preferred Android development environment (e.g., Android Studio).

    Build and Run: Build and run the desired quiz app (Cars, Animals, or Brands) on an emulator or a physical Android device.

Usage

    Starting the Game: Launch the desired quiz app to start the game.
    Answering Questions: Tap on one of the four answer buttons to select your answer.
    Using Hints: Tap the hint button to eliminate two incorrect answers.
    Game Over: When you run out of hearts, the game over screen will appear with options to restart or exit.

Structure

The project is structured into multiple modules, each representing a different quiz theme, and a common module for shared functionality.
Common Module

    Activity_PanelBase.java: Main activity handling the quiz logic.
    GameManager.java: Manages the game state, including questions, answers, and scoring.
    DataManagerBase.java: Abstract base class for managing data.
    GameOver.java: Handles the game over screen and logic.

Quiz Modules

Each quiz module extends the common module to include specific questions and images.
Cars Module

    Activity_Panel.java: Extends Activity_PanelBase to initialize car-specific data.
    DataManagerCars.java: Provides car-related questions and answers.

Animals Module

    Activity_Panel.java: Extends Activity_PanelBase to initialize animal-specific data.
    DataManagerAnimals.java: Provides animal-related questions and answers.

Brands Module

    Activity_Panel.java: Extends Activity_PanelBase to initialize brand-specific data.
    DataManagerBrands.java: Provides brand-related questions and answers.

Customization

To customize the app for different themes or questions:

    Add New Questions: Modify the respective DataManager class in each quiz module to include new questions and images.
    Change Themes: Modify the styles in the res/values/styles.xml file to update the app's theme and button colors.
   

