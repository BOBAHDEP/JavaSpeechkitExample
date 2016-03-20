package main;

import audioFileReader.FileReader;
import speechRecognition.SpeechRecognition;

public class Main {

    public static void main(String[] args) {
        SpeechRecognition speechRecognition = new SpeechRecognition();
        System.out.println(speechRecognition.getString(new FileReader().getBytesFromFile()));
    }
}
