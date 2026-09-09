package com.localcylic.lc2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.localcylic.lc2.controllerLyr.Controller;
import com.localcylic.lc2.serviceLyr.Account;

/*so, there were things called instances, interfaces and so forth, with 
 *so,a model, so a model or entities to hold this, interfaces are to shalow, it said and...
 *sijui, sijui, si, si, si, sijui commandLine something
 *before checking it out, before, mmh, checking it out, what, what, what, what does it do
 *in my usage, to run stuff, its interpretated by bpp to test out stuff so like, so it suggests
 *it, it, it, it suggest that i do that with, with, with, with, with the commandLineInterface
 *checking, checking it put, it, it, it is called  commandLineRunner. mmh
 **/
@SpringBootApplication
public class Lc2Application implements CommandLineRunner{
	public final Controller smthing;//i think caps is only mandatory, mmh, kwa, kwa, kwa, kwa what, for a class...interface maybe i don't know
	@Autowired
	 public Lc2Application(Controller smthing) {//ata nishasahau, how to make a constructor, ama sijashika inakuanga muscel memory when creating a black class??
		this.smthing=smthing;
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Lc2Application.class, args);
		//lakini i don't really know, mmh, why i'm doing
		//so
	
	}



	@Override
	public void run(String... args) throws Exception {		
		smthing.addUser();
	}


}
