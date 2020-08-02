package runners;

import com.computer.SystemInfo;
import junit.framework.TestCase;
import org.junit.Before;

public class SystemInfoTest extends TestCase{

    private SystemInfo systemInfo;

    @Before
    public void setUp(){
        systemInfo = new SystemInfo();
    }

    public void testGetSystemHostName(){
        assertNotNull(systemInfo.getHostName());
    }

    public void testGetSystemIPAddress(){
        assertNotNull(systemInfo.getHostIPAddress());
    }

    public void testGetJavaRunTimeName(){
        assertNotNull(systemInfo.getJavaRunTimeName());
    }

    public void testGetJDKLibPath(){
        assertNotNull(systemInfo.getJdkLibPath());
    }

    public void testGetUserCountry(){
        System.out.println("User Country is : "+systemInfo.getUserCountry());
//        assertNotNull(systemInfo.getUserCountry());
    }

    public void testGetUserDir(){
        assertNotNull(systemInfo.getUserDir());
    }

    public void testGetOsName(){
        assertNotNull(systemInfo.getOsName());
    }

    public void testGetOsVersion(){
        assertNotNull(systemInfo.getOsVersion());
    }

    public void testGetJavaHome(){
        assertNotNull(systemInfo.getJavaHome());
    }

    public void testGetUserName(){
        assertNotNull(systemInfo.getUserName());
    }

    public void testGetHostMaxHeapMemory(){
        assertNotNull(systemInfo.getHostMaxHeapMemory());
    }

    public void testGetHostTotalAvailableHeapMemory(){
        assertNotNull(systemInfo.getHostTotalAvailableHeapMemory());
    }

    public void testGetHostUsedHeapMemory(){
        assertNotNull(systemInfo.getHostUsedHeapMemory());
    }

    public void testGetHostFreeHeapMemory(){
        assertNotNull(systemInfo.getHostFreeHeapMemory());
    }

    public void testGetHostMaxPhysicalMemory(){
        assertNotNull(systemInfo.getHostMaxPhysicalMemory());
    }

    public void testGetHostFreePhysicalMemory(){
        assertNotNull(systemInfo.getHostFreePhysicalMemory());
    }

    public void testGetProcessors(){
        assertNotNull(systemInfo.getProcessors());
    }

    public void testGetApplicationIPAddress(){
        assertNotNull(systemInfo.getApplicationIPAddress("http://www.google.com"));
    }

    public void testGetPathSeparator(){
        assertNotNull(systemInfo.getPathSeparator());
    }

    public void testGetUserTimeZone(){
        assertNotNull(systemInfo.getUserTimeZone());
    }

    public void testGetFileSeparator(){
        assertNotNull(systemInfo.getFileSeparator());
    }

    public void testGetJavaVMName(){
        assertNotNull(systemInfo.getJavaVMName());
    }

    public void testGetUserLanguage(){
        assertNotNull(systemInfo.getUserLanguage());
    }

    public void testGetUserHome(){
        assertNotNull(systemInfo.getUserHome());
    }

    public void testGetJavaVersion(){
        assertNotNull(systemInfo.getJavaVersion());
    }

    public void testGetHostOS(){
        assertNotNull(systemInfo.getHostOS());
    }
}
