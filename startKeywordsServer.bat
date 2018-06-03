@echo off


set CLASSPATH=%CLASSPATH%;./target/sample-remote-library-1.0-server.jar

java org.rhapsodyman.SampleRemoteLibrary
pause