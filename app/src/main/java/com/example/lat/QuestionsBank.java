package com.example.lat;

import java.util.ArrayList;
import java.util.List;


public class QuestionsBank {

    private static List<QuestionsList> pcmQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Give word meaning of deceptive?", "Magical", "illusory", "illogical", "imaginary", "Magical, illusory, illogical, imaginary","");
        final QuestionsList question2 = new QuestionsList("While speaking to an audience, you?", "Find it difficult to convey your ideas", "Are comfortable in conveying your ideas to audience", "Don’t know if audience is following or not", "None of the above", "Find it difficult to convey your ideas, Are comfortable in conveying your ideas to audience, Don’t know if audience is following or not, None of the above", "");
        final QuestionsList question3 = new QuestionsList("Give word meaning of Apathetic?", "Indifferent", "Concerned", "Ignorant", "None of the above", "Indifferent,  Concerned,  Ignorant, None of the above", "");
        final QuestionsList question4 = new QuestionsList("You hail from a rural area and took admission in a city college, you find your classmates counting on you as if you are not smart and unable to speak good English. How would you react??", "Leave studies half way and go back to your village", "Accept back their challenge and prove that you can match them", "reference", "none of the above", "Leave studies half way and go back to your village, Accept back their challenge and prove that you can match them, reference, none of the above", "");
        final QuestionsList question5 = new QuestionsList("Read the proverb and give the meaning “Too many cooks spoil the broth”", "Action speaks louder than words", "Too much consulting confounds", "Truth needs not many words", "None of the above", "Action speaks louder than words, Too much consulting confounds, Truth needs not many words, None of the above", "");
        final QuestionsList question6 = new QuestionsList("Which is the valid declarations within an interface definition?", "public double methoda();", "public final double methoda();", "static void methoda(double d1);", "protected void methoda(double d1);", "public double methoda();", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> pcbQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("What does PHP stand for?", "Professional Home Page", "Hypertext Preprocessor", "Pretext Hypertext Processor", "Preprocessor Home Page", "Hypertext Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("Who is the father of PHP?", "Rasmus Lerdorf", "Willam Makepiece", "Drek Kolkevi", "List Barely", "Rasmus Lerdorf", "");
        final QuestionsList question3 = new QuestionsList("PHP files have a default file extension of.", ".html", ".php", ".xml", ".json", ".php", "");
        final QuestionsList question4 = new QuestionsList("A PHP script should start with ___ and end with ___:", "< php >", "<php />", "< ? ? >", "< ?php ? >", "< ?php ? >", "");
        final QuestionsList question5 = new QuestionsList("Which version of PHP introduced Try/catch Exception?", "PHP 4", "PHP 5", "PHP 6", "PHP 5.3", "PHP 5", "");
        final QuestionsList question6 = new QuestionsList("If $a = 12 what will be returned when ($a == 12) ? 5 : 1 is executed?", "12", "1", "5", "error", "5", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> commerceMathQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("HTML stands for?", "Hyper Text Markup Language", "High Text Markup Language", "Hyper Tabular Markup Language", "None of these", "Hyper Text Markup Language", "");
        final QuestionsList question2 = new QuestionsList("which of the following tag is used to mark a begining of paragraph ?", "<TD>", "<br>", "<P>", "<TR>", "<P>", "");
        final QuestionsList question3 = new QuestionsList("From which tag descriptive list starts ?", "<LL>", "<DD>", "<DL>", "<DS>", "<DL>", "");
        final QuestionsList question4 = new QuestionsList("Correct HTML tag for the largest heading is", "<head>", "<large>", "<h6>", "<heading>", "<h1>", "");
        final QuestionsList question5 = new QuestionsList("The attribute of <form> tag", "Method", "Action", "Both (a)&(b)", "None of these", "Both (a)&(b)", "");
        final QuestionsList question6 = new QuestionsList("Markup tags tell the web browser", "How to organise the page", "How to display the page", "How to display message box on page", "None of these", "How to display the page", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> commerceQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Select a component which is NOT part of Android architecture.", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A ___________ makes a specific set of the application data available to other applications", "Content provider", "Broadcast receivers", "Intent", "None of these", "Content provider", "");
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android’s native libraries?", "Webkit", "Dalvik", "OpenGL", "SQLite", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an Activity life-cycle, what is the first callback method invoked by the system?", "onStop()", "onStart()", "onCreate()", "onRestore()", "onCreate()", "");
        final QuestionsList question5 = new QuestionsList("What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource XML?", "findViewByReference(int id);", "findViewById(int id);", "findViewById(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from Content Provider class is handled by method", "onCreate", "onSelect", "ContentResolver", "onClick", "ContentResolver", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "pcm":
                return pcmQuestions();
            case "pcb":
                return pcbQuestions();
            case "commerceMath":
                return commerceMathQuestions();
            default:
                return commerceQuestions();
        }
    }
}
