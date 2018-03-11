package converter;

/**
 * Test class for testing Enum class (Length). 
 * @author Poorin Pichayamongkol
 */
public class Test {
	public static void main(String[] args) {
		Length[] lengths = Length.values();
		for(Length x : lengths) 
			System.out.println(x.toString()+" = "+x.getValue());
	}
}
