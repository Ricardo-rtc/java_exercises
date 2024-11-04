public class ex6 {
	public static void main(String[] args) {
		Integer num1 = 10;
        Integer num2 = 20;
        Double numDouble = 15.5;

        // intValue() e doubleValue()
        System.out.println("Valor primitivo de Integer: " + num1.intValue());
        System.out.println("Valor primitivo de Double: " + numDouble.doubleValue());

        // equals()
        System.out.println("Num1 é igual a Num2? " + num1.equals(num2));

        // valueOf(), parseInt() e parseDouble()
        Integer numFromValueOf = Integer.valueOf(30);
        int numFromParseInt = Integer.parseInt("40");
        double numFromParseDouble = Double.parseDouble("25.5");

        System.out.println("valueOf: " + numFromValueOf);
        System.out.println("parseInt: " + numFromParseInt);
        System.out.println("parseDouble: " + numFromParseDouble);
	}
}
		      