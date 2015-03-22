Example Sonar Plugin
=========

This is an example build framework for a sonar plugin using the gradle-sonar-packaging-plugin.

Currently the gradle plugin has not been published so clone the source and build and install.
```
git clone https://github.com/iwarapter/gradle-sonar-packaging-plugin.git
./gradlew clean build install
```

Usage
-----------

To build the plugin simply run:
```
./gradlew clean build
```
You can also use the plugin tasks to copy to a local sonar server and restart it (if its in dev-mode)
```
./gradlew localDeploy
./gradlew restartServer
```
