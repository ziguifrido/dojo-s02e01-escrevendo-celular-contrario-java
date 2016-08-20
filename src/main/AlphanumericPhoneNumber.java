package main;

public class AlphanumericPhoneNumber {
	
	public AlphanumericPhoneNumber(){	
		
	}
	
	public String execute(String numbers){	
		String result = "";
		
		// If input is empty returns empty
		if (!(numbers.isEmpty() || numbers == null)){
			numbers = numbers.toUpperCase();
			String numberList[] = numbers.split("");			
			for (String number:numberList){
				if (!("ABC".indexOf(number) == -1)){
					result += "2";
					continue;
				}
				if (!("DEF".indexOf(number) == -1)){
					result += "3";
					continue;
				}
				if (!("GHI".indexOf(number) == -1)){
					result += "4";
					continue;
				}
				if (!("JKL".indexOf(number) == -1)){
					result += "5";
					continue;
				}
				if (!("MNO".indexOf(number) == -1)){
					result += "6";
					continue;
				}
				if (!("PQRS".indexOf(number) == -1)){
					result += "7";
					continue;
				}
				if (!("TUV".indexOf(number) == -1)){
					result += "8";
					continue;
				}
				if (!("WXYZ".indexOf(number) == -1)){
					result += "9";
					continue;
				}
				if (!("*#-".indexOf(number) == -1)){
					result += number;
					continue;
				}
				if (number.equals(" ")){
					result += "-";
				continue;
				}
				if (Character.isDigit(number.charAt(0))){
					result += number;
				continue;
				}
				throw new IllegalArgumentException("Error: Invalid Number!");
			}		
		}		
		return result;
	}

}
