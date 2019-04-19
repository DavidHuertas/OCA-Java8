public class CompileTest {
	public static void main(String[] arguments) {
		System.out.println(arguments[0]);
		System.out.println(arguments[1]);
	}
}

//Try to compile this class with command line:
//	javac CompileTest.java
//
//And try to execute with the examples:
//	java CompileTest Hola Mundo
//	java CompileTest Hola Mundo Cruel
//	java CompileTest Hola
//	
//¿Why the third line execution´s output is a runtime error?