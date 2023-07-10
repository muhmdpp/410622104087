package javaLabCard1;

public class ImplicitAndExplictInDataTypes {
	public static void main(String[] args) {
		boolean boolValue = true;
		byte byteValue = 100;
		char charValue ='A';
		short shortValue = 1000;
		int intValue = 100000;
		long longValue = 1000000000L;
		float floatValue = 3.14f;
		double doubleValue =3.14159;
		
		int widenedIntValue = byteValue;
		long widenedLongValue = intValue;
		float widenedFloatValue = longValue;
		double widenedDoubleValue = floatValue;
		
		byte narrowedByteValue = (byte) intValue;
		short narrowedShortValue = (short) longValue;
		int narrowedIntValue = (int) floatValue;
		long narrowedlongValue = (long) doubleValue;
		
		System.out.println("Initial values");
		System.out.println("Boolean:" + boolValue);
		System.out.println("Byte:" + byteValue);
		System.out.println("Char:" + charValue);
		System.out.println("Short:" + shortValue);
		System.out.println("Int:" + intValue);
		System.out.println("Long:" + longValue);
		System.out.println("Float:" + floatValue);
		System.out.println("Double:" + doubleValue);
	    System.out.println("                                                                                                                       ");
		System.out.println("Implicit values");
		System.out.println("Int::" + byteValue);
		System.out.println("Long:" + intValue);
		System.out.println("Float:" + longValue);
		System.out.println("double:" + floatValue);
		System.out.println("                                                                                                                       ");
		System.out.println("Explicit values");
		System.out.println("Byte::" + intValue);
		System.out.println("Short:" + longValue);
		System.out.println("Int:" + floatValue);
		System.out.println("Long:" + doubleValue);

		
	}
}
