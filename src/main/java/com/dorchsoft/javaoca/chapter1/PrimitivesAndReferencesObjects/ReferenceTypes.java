package com.dorchsoft.javaoca.chapter1.PrimitivesAndReferencesObjects;

import java.util.Date;

public class ReferenceTypes {
	Date today;			//THERE ARE REFERENCES UNASIGNED TO OBJECTS
	String greeting;	//
	{
		today = new Date();			//today NOW POINTS TO A new Date OBJECT IN MEMORY,
									//YOU CAN USE today TO ACCESS TO THE METHODS AND FIELDS OF THIS Date OBJECT
		greeting = "How are you?";	//SAME WITH greeting
	}
	//THE new Date() AND ""How are you?" OBJECTS DO NOT HAVE NAMES
	//AND CAN BE ACCESSED ONLY VIA THEIR CORRESPONDED REFERENCES
	
	String $OK2Identifier;
	String _alsoOk1d3ntifi3e;
	String __$StillOkButKNotsonice$_$_$;
}
