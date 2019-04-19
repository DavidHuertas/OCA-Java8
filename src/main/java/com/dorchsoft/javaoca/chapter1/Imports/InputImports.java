package com.dorchsoft.javaoca.chapter1.Imports;

//1) Valid imports:
import java.nio.file.Files;
import java.nio.file.Paths;

//2) Another valid import:
//import java.nio.file.*;

//3) NOT VALID: Wildcards only matches classes, not subpackages
//import java.nio.*;

//4) NOT VALID: Only one wildcard valid, must be at the end
//import java.nio.*.*;

//5) NOT VALID: Wildcards only matches classes, not methods
//import java.nio.file.Files.*;
//import java.nio.file.Paths.*;

public class InputImports {
	public void read (Files files) {
		Paths.get("name");
	}
}
