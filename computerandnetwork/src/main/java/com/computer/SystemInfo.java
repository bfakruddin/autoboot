package com.computer;

import com.sun.management.OperatingSystemMXBean;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Properties;

/**
 * @Memory : Heap usage, returns in MBs
 * */
public class SystemInfo {

    private Properties systemProps = System.getProperties();
    private Runtime instance = Runtime.getRuntime();
    private OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

    private String hostName;
    private String jdkLibPath;
    private long hostMaxHeapMemory;
    private long hostTotalAvailableHeapMemory;
    private long hostUsedHeapMemory;
    private long hostFreeHeapMemory;
    private String hostIPAddress;
    private String applicationIPAddress;
    private double hostMaxPhysicalMemory;
    private double hostFreePhysicalMemory;
    private int processors;
    private String[] browsers;
    private double[] browserVersions;
    private String javaVersion;
    private String userDir;
    private String userHome;
    private String javaClassPath;
    private String userName;
    private String userLanguage;
    private String javaVMName;
    private String javaHome;
    private String fileSeparator;
    private String userTimeZone;
    private String osName;
    private String osVersion;
    private String pathSeparator;
    private String userCountry;
    private String javaRunTimeName;

    public String getHostName() {
        try {
            InetAddress currentMachine = InetAddress.getLocalHost();
            hostName = currentMachine.getHostName();
            return hostName;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getHostIPAddress() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            this.hostIPAddress = inetAddress.getHostAddress().toString();
            return (hostIPAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Returns Maximum memory
    public long getHostMaxHeapMemory() {
        this.hostMaxHeapMemory = instance.maxMemory()/(1024*1024);
        return this.hostMaxHeapMemory;
    }


    // Returns an Available Memory

    public Long getHostTotalAvailableHeapMemory() {
        this.hostTotalAvailableHeapMemory =  instance.totalMemory()/(1024*1024);
        return this.hostTotalAvailableHeapMemory;
    }
    // Returns an used memory

    public long getHostUsedHeapMemory() {
        this.hostUsedHeapMemory = (instance.totalMemory() - instance.freeMemory())/(1024 * 1024);
        return this.hostUsedHeapMemory;
    }
    // Returns free memory

    public long getHostFreeHeapMemory() {
        this.hostFreeHeapMemory = instance.freeMemory()/(1024 * 1024);
        return this.hostFreeHeapMemory;
    }

    public double getHostMaxPhysicalMemory() {
        this.hostMaxPhysicalMemory = operatingSystemMXBean.getTotalPhysicalMemorySize() / (1024 * 1024);
        return this.hostMaxPhysicalMemory;
    }

    public double getHostFreePhysicalMemory() {
        this.hostFreePhysicalMemory = operatingSystemMXBean.getFreePhysicalMemorySize() / (1024 * 1024);
        return hostFreePhysicalMemory;
    }

    public String getApplicationIPAddress(String applicationURL) {
        try {
            this.applicationIPAddress = InetAddress.getByName(new URL(applicationURL).getHost()).toString();
            return this.applicationIPAddress;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getHostOS() {
        return this.systemProps.getProperty("os.name");
    }

    public int getProcessors() {
        this.processors = Runtime.getRuntime().availableProcessors();
        return this.processors;
    }

    public String[] getBrowsers() {
        return browsers;
    }

    public double[] getBrowserVersions() {
        return browserVersions;
    }

    public String getJavaVersion() {
        this.javaVersion = systemProps.getProperty("java.version");
        return this.javaVersion;
    }

    public String getUserDir() {
        this.userDir = systemProps.getProperty("user.dir");
        return this.userDir;
    }

    public String getUserHome() {
        this.userHome = systemProps.getProperty("user.home");
        return this.userHome;
    }

    public String getJavaClassPath() {
        this.javaClassPath = systemProps.getProperty("java.class.path");
        return this.javaClassPath;
    }

    public String getUserName() {
        this.userName = systemProps.getProperty("user.name");
        return this.userName;
    }

    public String getUserLanguage() {
        this.userLanguage = systemProps.getProperty("user.language");
        return this.userLanguage;
    }

    public String getJavaVMName() {
        this.javaVMName = systemProps.getProperty("java.vm.name");
        return javaVMName;
    }

    public String getJavaHome() {
        this.javaHome = systemProps.getProperty("java.home");
        return this.javaHome;
    }

    public String getFileSeparator() {
        this.fileSeparator = systemProps.getProperty("file.separator");
        return this.fileSeparator;
    }

    public String getUserTimeZone() {
        this.userTimeZone = systemProps.getProperty("user.timezone");
        return this.userTimeZone;
    }

    public String getOsName() {
        this.osName = systemProps.getProperty("os.name");
        return this.osName;
    }

    public String getOsVersion() {
        this.osVersion = systemProps.getProperty("os.version");
        return this.osVersion;
    }

    public String getPathSeparator() {
        this.pathSeparator = systemProps.getProperty("path.separator");
        return this.pathSeparator;
    }

    public String getUserCountry() {
        this.userCountry = systemProps.getProperty("user.country.format");
        return this.userCountry;
    }

    public String getJavaRunTimeName() {
        this.javaRunTimeName = systemProps.getProperty("java.runtime.name");
        return this.javaRunTimeName;
    }

    public String getJdkLibPath() {
        this.jdkLibPath = systemProps.getProperty("sun.boot.library.path");
        return this.jdkLibPath;
    }
}
