package day41;

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
					new File("D:\\EclipseJavaprogs2\\ITPAugust\\myfolder\\products.json"), //absolute path
					//new File("myfolder/products.json"), // relative path
					new TypeReference<List<Product>>() {
					});

		} catch (FileNotFoundException ex1) {
			System.out.println(ex1.getMessage());
		}

		System.out.println("All Titles");
		products.stream().map(prod->prod.getTitle()).forEach(System.out::println);
		
		
		System.out.println("Title of products whose price >= 100");
		products.stream().filter(prod->prod.getPrice()>=100).map(Product::getTitle).forEach(System.out::println);
	
		//sum of all prices of Electronics Products
		double ans = products.stream()
		        .filter(prod -> prod.getCategory().equalsIgnoreCase("electronics"))
		        .mapToDouble(Product::getPrice)
		        .sum();
		
		System.out.println(ans);
		
		
		//sum of all Ids of Jewelry Products
		int ans1=products.stream()
				.filter(prod -> prod.getCategory().equalsIgnoreCase("jewelery"))
				.mapToInt(Product::getId)
				.sum();
		
		System.out.println(ans1);
	}
}
