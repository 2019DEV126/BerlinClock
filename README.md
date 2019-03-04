# BerlinClockConverter
This project features converting digital time to Berlin clock representation and vice-versa. It contains a mainscreen having two options to choose i.e Convert Digital time to Berlin Clock and Convert Berlin Clock to Digial time. When user selects digital to Berlin clock conversion, it redirects to screen where user can input time in hours:minutes:seconds format, click convert button and then its equivalent Berlin clock representation is shown as output. If user selects Berlin clock to digital time conversion, it redirects to screen where user can select time on Berlin clock by clicking its blocks for hours, minutes and seconds and then is equivalent digital time in hours:minutes:seconds format is displayed as output.

Following are the steps to import, build and run the application assuming Android Studio is already installed on the machine:

1) Download the project zip file from https://github.com/2019DEV126/BerlinClock and extract it.

2) Open the Android Studio IDE and select File->Open->Select the path where project zip file is extracted->select project folder i.e BerlinClockConverter->click OK

3) Above steps opens this Android Application project on Android Studio.

4) Wait for sometime till Android Studio sets up the project. Once the project setup is completed, message "Project setup:synced successfully" is shown.

5) Click Build->Clean Project and wait untill its done and success message is shown.

6) Click Build->Build Project and wait till Android Studio successfully builds the project and message is shown.

7) Now to run the project, use needs either an Android phone with developer settings ON(Step 7.1) OR an Android phone emulator setup on machine(Step 7.2).

    7.1) Following are the steps to run this application in debug mode on Android phone :

    a) If the developer settings are not turned ON then follow the steps mentioned in below link to turn ON the developer mode to be    able to install and test application in debug mode :
https://developer.android.com/studio/debug/dev-options

    b) Connect Android phone to the machine using usb cable.

    c) Click Run and select MainActivity to run.

    d) Deployment Target window appears showing the list of Android devices attached to the machine and available virtual devices i.e emulators.

    e) Select the Android device to run the application and click OK.

    f) Wait till the application gets installed on device, "Installing APKs" dialog is shown on Android Studio.

    g) And the user is ready to see and test the application on Android phone now.

    Note : If in Deployment Target window Android device is not getting detected then follow the steps mentioned in below link:
https://developer.android.com/studio/run/device

    7.2) Following are the steps to run this application in Android phone emulator on machine:

    a) Steps to create emulator if not created any : 
https://developer.android.com/studio/run/managing-avds

    b) Click Run and select MainActivity to run.

    c) Deployment Target window appears showing the list of Android devices attached to the machine and available virtual devices i.e emulators.

    d) Select the emulator to run the application and click OK.

    e) Wait till the application gets installed on emulator.

    f) And the user is ready to see and test the application on Android phone emulator.

Note : This project supports minimum android version 4.0.3 ICE_CREAM_SANDWICH, so the targeted Android device's android version should not be less than this.


