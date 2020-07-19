package runners;

import com.computer.SystemInfo;

public class Tester {
    public static void main(String[] args) {
        SystemInfo systemInfo = new SystemInfo();
        System.out.println(systemInfo.getHostName());
        System.out.println(systemInfo.getHostIPAddress());
        System.out.println(systemInfo.getJavaRunTimeName());
        System.out.println(systemInfo.getJdkLibPath());
        System.out.println(systemInfo.getUserCountry());
        System.out.println(systemInfo.getUserDir());
        System.out.println(systemInfo.getOsName());
        System.out.println(systemInfo.getOsVersion());
        System.out.println(systemInfo.getJavaHome());
        System.out.println(systemInfo.getUserName());

        System.out.println(systemInfo.getHostMaxHeapMemory());
        System.out.println(systemInfo.getHostTotalAvailableHeapMemory());
        System.out.println(systemInfo.getHostUsedHeapMemory());
        System.out.println(systemInfo.getHostFreeHeapMemory());

        System.out.println(systemInfo.getHostMaxPhysicalMemory());
        System.out.println(systemInfo.getHostFreePhysicalMemory());

        System.out.println(systemInfo.getProcessors());
        System.out.println(systemInfo.getApplicationIPAddress("http://www.google.com"));
        System.out.println(systemInfo.getPathSeparator());
        System.out.println(systemInfo.getUserTimeZone());
        System.out.println(systemInfo.getFileSeparator());
        System.out.println(systemInfo.getJavaVMName());
        System.out.println(systemInfo.getUserLanguage());
        System.out.println(systemInfo.getUserHome());
        System.out.println(systemInfo.getJavaVersion());
        System.out.println(systemInfo.getHostOS());

    }
}
