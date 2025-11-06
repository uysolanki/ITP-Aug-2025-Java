package day33;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonFile {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Product> products=null;
		try {
			products = mapper.readValue(
					new File("D:\\EclipseJavaprogs2\\ITPAugust\\myfolder\\products1.json"), //absolute path
					//new File("myfolder/products.json"), // relative path
					new TypeReference<List<Product>>() {
					});

		} catch (FileNotFoundException ex1) {
			System.out.println(ex1.getMessage());
		}

		try
		{
		for(Product product:products)
			System.out.println(product);
		}
		catch(NullPointerException ex2)
		{
			System.out.println("No Data to Read");
		}
	}
}
