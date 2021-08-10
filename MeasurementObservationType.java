/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/

public class MeasurementObservationType extends ObservationType
{
	private String unit;
	private String code;
	private String name;
	public MeasurementObservationType [] MeasurementObservationT;
	
	public MeasurementObservationType() {
		super("", "");
	}
//	public MeasurementObservationType() {
//		// TODO Auto-generated constructor stub
//	}

	public MeasurementObservationType(String code, String name, String unit)
	{
		super(code, name);
		this.unit = unit;
//		new MeasurementObservationT(code, name, unit);
		
	}

//	public void MeasurementObservationType(String code2, String name2, String unit2) {
//		
//		MeasurementObservationType(unit2, unit2, unit2);
//	}


	//override patent class abstract method here...

	//other methods...
	

	public void addMeasurementObservationType(String code, String name, String unit) {
		new MeasurementObservationType(code, name, unit);
	}
	
	public  MeasurementObservationType[] getMeasurementObservationType() {
		return MeasurementObservationT;
	}


	
}