package com.sound.app.models;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private int age;
	private String Nom;
	private String Couleur;
	private Double Poids;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getCouleur() {
		return Couleur;
	}

	public void setCouleur(String couleur) {
		Couleur = couleur;
	}

	public Double getPoids() {
		return Poids;
	}

	public void setPoids(Double poids) {
		Poids = poids;
	}
	
	public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(effectSource));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource+"La voix commence! ");
		System.out.println("s : "+clip.isActive());
		
		while(clip.isActive()) {
			//System.out.println("hola "+effectSource);
		}
		
		clip.close();
		System.out.println(effectSource+" La voix fini ! ");
	}
}
