package org.rhapsodyman.keywords;


import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SampleKeywords {

	public int counter = 0;

	@RobotKeyword("Print Message")
	@ArgumentNames({"message"})
	public void printMessage(String message) {
		System.out.println(message);
	}


	@RobotKeyword("Get counter value")
	public int getCounterValue() {
		return counter;
	}


	@RobotKeyword("Increment Counter Value")
	public void incrementCounterValue() {
		counter++;
	}
}
