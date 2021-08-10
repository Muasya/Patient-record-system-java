/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
import java.io.*;
import java.util.*;

public class PatientRecordSystem
{
	// collection of observation types and patients
	private ObservationType [] observationTypes = new ObservationType[50];
	private int observationTypeCount;
	
	private Patient [] patients;
	private int patientCount;
	public PatientRecordSystem() //constructor
	{

	}

	public String toString()
	{
		String str = "===== PATIENT RECORD SYSTEM =====\n";
		str = str + "OBSERVATION TYPES:\n";
		// return details of the observation types
		str = str + CategoryObservationType.getObservationTypeDetails();
		str = str + "\n\n";
		// return details of the Measurement observation types
		str = str + "Measurement Observation Types:\n";
		MeasurementObservationType mot = new MeasurementObservationType();
		str = str + mot.getMeasurementObservationType();
		str = str + "\n\n";
		// and details of the patients
		str = str + "Patients:\n";
//		str = str + Arrays.toString(patients);
		
		str = str + getPatients();
		str = str + "\n\n";
		
		
		return str;
	}

	// Method to add measurement observation types (you can add to the method header if required)
	public void addMeasurementObservationType(String code, String name, String unit) 
	{
//		PatientRecordSystem prs = new PatientRecordSystem();
		MeasurementObservationType mot = new MeasurementObservationType();
		mot.addMeasurementObservationType(code, name, unit);
		
		
	}

//	private void addMeasurementObservationType(MeasurementObservationType mot) {
//		// TODO Auto-generated method stub
//		MeasurementObservationType.
//		
//	}

	// Helper method: Search for an observation type to ensure functional correctness
	// Return index if found
	// Return -1 if not
	public int searchObservationType(String code)
	{

       return -1;
	}

	// Add category observation types (you can add to the method header if required)
	public void addCategoryObservationType(String code, String name, String [] categories)
	{
		CategoryObservationType cot = new CategoryObservationType(code, name, categories);
       
	}

	// Add a new patient (you can add to the method header if required)
	public void addPatient(String id, String name)
	{
		new Patient(id, name);
//		patients[patients.length] = p;
	}

	// Helper method: Search for a patient by patient id to ensure functional correctness
	// return index if the patient is found
	// Return -1 if the patient is not found
	public int searchPatient(String id)
	{
       return -1;
		
	}

	// Add a measurement observation for a patient (you can add to the method header if required)
	public void addMeasurementObservation(String id, String code, int value)
	{
//		ObservationType ot = new ObservationType(code, id);
//		new MeasurementObservation(id, code, value);
		
	}

	// method to add a category observation for a patient (you can add to the method header if required)
	public void addCategoryObservation(String id, String code, String value)
	{
//		new CategoryObservation(id, code, value);
	}

	// retrieve details of an observation type
	public String retrieveObservationTypeDetails(String code)
	{

		return "-1";
	}

	// retrieve details of a patient
	public String retrievePatientDetails(String id)
	{
//		String allOfThem = "";
//		for(int x=0; x < patients.length; x++) {
//			this.allOfThem += patients.toString();
//		}
//		return patients[3].length
		
		return "-1 two";

	}

	/**
	 * @return the observationTypes
	 */
	public ObservationType [] getObservationTypes() {
		return observationTypes;
	}

	/**
	 * @param observationTypes the observationTypes to set
	 */
	public void setObservationTypes(ObservationType [] observationTypes) {
		this.observationTypes = observationTypes;
	}

	/**
	 * @return the observationTypeCount
	 */
	public int getObservationTypeCount() {
		return observationTypeCount;
	}

	/**
	 * @param observationTypeCount the observationTypeCount to set
	 */
	public void setObservationTypeCount(int observationTypeCount) {
		this.observationTypeCount = observationTypeCount;
	}

	/**
	 * @return the patients
	 */
	public Patient [] getPatients() {
		return patients;
	}

	/**
	 * @param patients the patients to set
	 */
	public void setPatients(Patient [] patients) {
		this.patients = patients;
	}

	/**
	 * @return the patientCount
	 */
	public int getPatientCount() {
		return patientCount;
	}

	/**
	 * @param patientCount the patientCount to set
	 */
	public void setPatientCount(int patientCount) {
		this.patientCount = patientCount;
	}

}