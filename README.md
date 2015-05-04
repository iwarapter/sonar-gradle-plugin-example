Example Sonar Plugin
=========

This is an example build framework for a sonar plugin using the gradle-sonar-packaging-plugin.

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

Example Output
-------------
```sh
:sonar-example-plugin:pluginPackaging
Checking for sonar-plugin-api
-------------------------------------------------------
Plugin definition in update center
    Created-By: Gradle
    Built-By: iwarapter
    Build-Jdk: 1.7.0_75
    Build-Time: 2015-05-04T23:20:45+0100
    Plugin-BuildDate: 2015-05-04T23:20:45+0100
    Plugin-Class: com.example.ExamplePlugin
    Plugin-Description: An Example Plugin!
    Plugin-Developers: 
    Plugin-Homepage: 
    Plugin-IssueTrackerUrl: 
    Plugin-Key: example
    Plugin-License: 
    Plugin-Name: Example
    Plugin-Organization: 
    Plugin-OrganizationUrl: 
    Plugin-SourcesUrl: 
    Plugin-TermsConditionsUrl: 
    Plugin-Version: 0.1
    Sonar-Version: 3.7
-------------------------------------------------------
Following dependencies are packaged in the plugin:

	sonar-gradle-plugin-example:example-squid:0.1
	org.codehaus.sonar.sslr:sslr-core:1.20
	org.codehaus.sonar.sslr-squid-bridge:sslr-squid-bridge:2.4
	org.codehaus.sonar.sslr:sslr-xpath:1.20
	jaxen:jaxen:1.1.4
	org.codehaus.sonar.common-rules:sonar-common-rules:1.2

See following page for more details about plugin dependencies:

	http://docs.sonarqube.org/display/SONAR/Coding+a+Plugin

Sonar Plugin Created.

BUILD SUCCESSFUL

Total time: 4.706 secs
```