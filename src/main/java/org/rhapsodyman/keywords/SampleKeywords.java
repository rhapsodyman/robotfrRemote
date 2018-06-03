package org.rhapsodyman.keywords;


import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SampleKeywords {

    @RobotKeyword("Print Message")
    @ArgumentNames({"message"})
    public void printMessage(String message) {
        System.out.println(message);
    }
    
    
    @RobotKeyword("Get a number")
    public int getANumber() {
    	return 4;
    }
}
