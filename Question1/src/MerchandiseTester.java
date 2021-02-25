import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MerchandiseTester {
	public static void main(String[] args) {
		String itemCode;
		int quantity;
		Double unitPrice;
		List<Merchandise> items = new ArrayList<>();

		String text = null;
		
		try (BufferedReader Scanner = new BufferedReader(
				new FileReader(new File("C:\\Users\\ve00ym241\\Desktop\\Training\\YMSLI_LabAssessment\\Question1\\src\\Input.dat")))) {

			while ((text = Scanner.readLine()) != null) {
				String[] words = text.split(" ");
				itemCode = words[0];
				quantity = Integer.parseInt(words[1]);
				unitPrice = Double.parseDouble(words[2]);
				items.add(new Merchandise(itemCode, quantity, unitPrice));
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Sorting as per Name");

		// Sorting as per ItemCode
		Collections.sort(items, (o1, o2) -> o1.getItemCode().compareTo(o2.getItemCode()));
		items.forEach((Item) -> System.out.println(Item));
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("Sorting as per Price");
		
		//Sorting by Price
		Collections.sort(items, (o1, o2) -> o2.getUnitPrice().compareTo(o1.getUnitPrice()));
		items.forEach((Item) -> System.out.println(Item));
		

	}

}