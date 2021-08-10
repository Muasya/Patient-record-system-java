/*
This class is just a skeleton. Add your code where necessary. You might need to add additional methods as well.  
*/
public class CategoryObservationType extends ObservationType
{
	private static String [] categories;

	public CategoryObservationType(String code, String name, String [] categories)
	{
		super(code, name);
		this.categories = categories;
	}

	public static String[] getObservationTypeDetails() {
		// TODO Auto-generated method stub
		return categories;
	}

	//override patent class abstract method here...

	//other methods...
}