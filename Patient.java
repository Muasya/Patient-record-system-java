/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
import java.io.*;
import java.util.*;

public class Patient
{
	private String id;
	private String name;
	private Observation [] observations  = new Observation[50];	//size  initialised to 50
	private int observationCount;  			

	public Patient(String id, String name) //constructor
	{
		this.setId(id);
		this.setName(name);
		this.observationCount = 0; //initialised to zero
	}

	//method to add an observation (you can add to the method header if necessary)
	public void addObservation(Observation observation, String id)
	{
		
	}

	
	//other methods...
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the observations
	 */
	public Observation [] getObservations() {
		return observations;
	}

	/**
	 * @param observations the observations to set
	 */
	public void setObservations(Observation [] observations) {
		this.observations = observations;
	}



	


}