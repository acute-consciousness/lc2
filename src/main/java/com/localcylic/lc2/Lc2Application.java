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
	//yeah, yeah, yeah, they, they, they, they should be here
	//says, says, Autowired is not allowed in this location. Is, is it because, is, is, is, is, is, is this because, is this because this is the main class, but, but ther ewas somthing, but there was something about, AutoWired not being neeeded even for the other... but obviously , i rather do it
	private Controller controllerLyr; //have not yet understood, understood final. And it says, only, only finals are  permitted and for now Autowired , i see, i see have final ...(interpretation, interpretation for now)
	//how, how, how, how, how, how did we, how did, how, how did we do constructors the class name, with a public..will this be suitable? nah, i don't think so
	private Lc2Application(Controller controllerLyr){//not static keywords, mmh, keywords, keywords in the constructor. The, the, the, the debugger, the, the, the debugger actually told me that, nah, juu 
		this.controllerLyr = controllerLyr;
	}
	//now, now, now, now what after this?
	//call the method in the command, in the CommandLineRunner
	public static void main(String[] args) {
		SpringApplication.run(Lc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		controllerLyr.addObject();
		
//		System.out.println('\n'+"CommandLineRunner Test"+'\n'+ controllerLyr.getObjectTest() .toString());//both,mmh, both scopes, run
//		and, and, and it says null, juu we haven't run the, run, mmh, run the, save user, but this, but i, but i, but ishould set up this to be done, to be done by spring
	}

}
