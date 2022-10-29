@echo off

:: set the classpath
set CLASSPATH=./lib/mcreator.jar

:: set MCreator launch parameters
set MCREATORARGS=--started-by-exe --arch64

:: launch MCreator with bundled java
"./jdk/jre/bin/java.exe" co.pylo.mcreator.Launcher %MCREATORARGS%