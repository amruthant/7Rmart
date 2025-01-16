package utilities;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

public class FakerUtility {

	Faker faker = new Faker();
	
	public String generateName() {
		
		
		return faker.name().fullName();
	}

	public String generateAdress() {
		
		
		return faker.address().fullAddress();
	}
	
	public int generateRandomNumber() {
		
		
		int value =faker.number().randomDigit();
		return value;
		
	}
public String generateRandomEmail() {
		
		
		return faker.internet().emailAddress();
	}

public String generatePassword() {
	return faker.random().toString();
}


}
