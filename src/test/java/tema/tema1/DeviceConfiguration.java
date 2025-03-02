package tema.tema1;

import org.testng.annotations.Test;

public class DeviceConfiguration {
    //deviceName (String)
    //supportedBrowsers (String[])
    //deviceType (char)
    //screenResolutionWidth (int)
    //screenResolutionHeight (int)
    //osVersion (float)
    //availableStorage (double)
    //isRooted (boolean)

    public String deviceName;
    public String[] supportedBrowser;
    public char deviceType;
    public int screenResolutionWidth;
    public int ScreenResolutionHeight;
    public float osVersion;
    public double availableStorage;
    public boolean isRooted;

    @Test
    public void displayDeviceConfiguration() {
        deviceName = "macOS";
        String[] browserTypes = {"Chrome", "Firefox", "Safari"};
        supportedBrowser = browserTypes;
        deviceType = 'D';
        screenResolutionWidth = 1512;
        ScreenResolutionHeight = 982;
        osVersion = 12.6f;
        availableStorage = 20.12;
        isRooted = true;

        System.out.println("Device name: " + deviceName);
        System.out.println("Supported browser:");
        for (String browser : supportedBrowser) {
            System.out.println("- " + browser);
        }
        System.out.println("Device type: " + deviceType);
        System.out.println("Screen resolution(pixels): " + screenResolutionWidth + " x " + ScreenResolutionHeight);
        System.out.println("Os version: " + osVersion);
        System.out.println("Available storage(MB): " + availableStorage);
        System.out.println("Is rooted: " + isRooted);

    }
}
