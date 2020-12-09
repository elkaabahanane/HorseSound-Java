package com.sound.app.models;


import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Animal cheval = new Cheval();
		
		cheval.ReadSound("C:\\Users\\Admin\\eclipse-workspace\\HorseSound\\src\\wav\\Horse.wav");

	}
}