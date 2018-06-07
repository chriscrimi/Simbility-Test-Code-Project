# Simbility Test Code Project
My Code
The Code is written in Java, using selenium webdriver to host and run the tests. TestNG plug in is used to introduce some new functionalities that make it more powerful and easier to use.

TestNG
Add TestNG by selecting the Help tab > Eclipse Marketplace and search for TestNG. Once installed go to Build Path > Configure Build Path > Library > Add Library and select TestNG. 

Set Up

1. Make sure to download the chromedriver_win32.jar, selenium-java-3.12.0.zip, and the selenium-server-standalone.jar and add all three as External JARs in your build path. Under selenium-server-standalone.jar make sure the javadoc location https://seleniumhq.github.io/selenium/docs/api/java/ is implemented. 

2. Make sure in TestUtils.java that the System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christian\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe"); (line 48) is set to the path pathway of chromedriver on your computer.



