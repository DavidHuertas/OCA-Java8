package com.dorchsoft.javaoca.chapter1.Imports;

//1) If needed java.util.Date and another import from java.sql
import java.util.Date;
import java.sql.*;

//2) DOES NOT COMPILE: Date import collides
//import java.util.Date;
//import java.sql.Date;

//3) COMPILE ERROR AT LINE 16: type Date is ambiguous
//import java.util.*;
//import java.util.*;

public class ImportsConflicts {
	Date date;
	Timestamp timestamp;
}
