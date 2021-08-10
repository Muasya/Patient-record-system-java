/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
public abstract class ObservationType
{
	private String code;
	private String name;

	public  ObservationType(String code, String name)
	{
		
		this.setCode(code);
		this.setName(name);
	
	}

	public void getObservationTypeDetails(String c){
	
	}
	
	//other methods...

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	

	
	

	
	
	
}
