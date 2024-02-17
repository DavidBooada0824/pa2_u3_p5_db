package com.example.demo.funcional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		// 1.Supplier
		// Clases
		System.err.println("------Supplier---\n");

		IPersonaSupplier<String> supplierClase = new PersonaSupplierImpl();
		System.err.println("\t------Clases---");
		System.out.println("\t" + supplierClase.getId() + "\n");
		// lambdas
		IPersonaSupplier<String> supplierlambda = () -> {
			String cedula = "1720030723";
			cedula = cedula + "canton";
			return cedula;

		};
		System.err.println("\t\t------Lambdas---");
		System.out.println("\t\t" + supplierlambda.getId() + "\n");

		IPersonaSupplier<String> supplierlambda2 = () -> "1720030723" + "Pais";
		System.err.println("\t\t------Lambdas---");
		System.out.println("\t\t" + supplierlambda2.getId() + "\n");

		IPersonaSupplier<Integer> supplierlambda3 = () -> {
			Integer valor1 = Integer.valueOf(100);
			valor1 = valor1 * Integer.valueOf(50) / Integer.valueOf(5);
			return valor1;

		};
		System.err.println("\t\t------Lambdas---");
		System.out.println("\t\t" + supplierlambda3.getId() + "\n");

		// 2.Consumer
		// Clases
		System.err.println("------Consumer---\n");

		IPersonaConsumer<String> consumerClase = new PersonaConsumerImpl();
		System.out.println("Clases");
		consumerClase.accept("\tProfesor");
		

		System.out.println("\nLambdas");
		IPersonaConsumer<String> consumerLamdba = (cadena) -> {
			System.out.println("\nSe inserta");
			System.out.println(cadena);
		};
		consumerLamdba.accept("Profesor");

		// 2.Consumer

		System.err.println("\n------Predicate---");
		IPersonaPredicate<Integer> predicateLambda = numero -> numero.compareTo(7)==0;
		System.out.println("\t\t"+predicateLambda.evaluar(Integer.valueOf(7)));
	
	}

}
