package com.oyo.workforcemanagement;




import com.oyo.workforce.*;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkForceManagementClient {

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Local Host
    private static int port = 9000;
    private static String host = "localhost";
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //actual host
    //private static String host = "acppr-0.acp-workforce-management.incubate.oyorooms.ms";

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Services uri(one active at a time)

    //private static String uri = "employee_onboarding";
    private static String uri = "workload_service";
    //private static String uri = "workforce_service";
    //private static String uri = "toggle_service";
    // private static String uri = "roster_service";
    //private static String uri = "workforce_config";
// ----------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        try{
            //create HTTP client
            //String url = "http://"+host+"/"+uri+"/"; //(for actual host)
            String url = "http://"+host+":" + port + "/"+uri+"/"; //(for local host)
            System.out.println(url);
            THttpClient httpClient  = new THttpClient(url);
            httpClient.setConnectTimeout(3000);
            TProtocol protocol = new TJSONProtocol(httpClient);

//----------------------------------------------------------------------------------------------------------------------------------------------------------
            //employee onboarding(working fine, dependency on crs)

//            TEmployeeOnBoardingService.Client client = new TEmployeeOnBoardingService.Client(protocol);
//            System.out.println(client);
            //System.out.println(client.onboardEmployee(new TEmployeeOnboardRequest(20001046,"PACKAGES")));
            //System.out.println(client.isEmployeeOnboarded(20001046));
            //System.out.println(client.getEmployeesBusinessId(20001046));
            //System.out.println(client.offboardEmployee(new TEmployeeOffboardRequest(20001046,"PACKAGES")));
//----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Workload Service(working fine)

//            TWorkLoadService.Client client = new TWorkLoadService.Client(protocol);
//            long epochTime= DateTimeUtil.getCurrentEpoch();
//            int load =5;
//            System.out.println(client.addLoad(new TWorkLoadAddRequest(20001046,epochTime,epochTime,load,"PACKAGES",0)));
//            System.out.println(client.getLoad(new TWorkLoadGetRequest(20001046,epochTime,"PACKAGES")));

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //WorkForce Service(check for isEmployeeAvailable once again,dependency on calendar service)

            //TWorkForceService.Client client = new TWorkForceService.Client(protocol);
            //TGetEmployeesRequest tGetEmployeesRequest = new TGetEmployeesRequest();
            //long startTime = System.currentTimeMillis()/1000 + (80*3600);
            //long endTime = startTime + 3600;
            //Long beforeTime = 1550188801L;
            //tGetEmployeesRequest.setBeforeTime(beforeTime);
            //tGetEmployeesRequest.setLimit(10);
            //tGetEmployeesRequest.setBusinessId("PACKAGES");
            //System.out.println(client.getEmployees(tGetEmployeesRequest));
            //System.out.println(client.isEmployeeAvailableInRange(20001046,startTime,endTime));
            //System.out.println(client.isEmployeeAvailableNow(20001046));

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Toggle Service(working fine)

//            TToggleService.Client client = new TToggleService.Client(protocol);
//            System.out.println(client.isToggleOn(new TToggleGetRequest(123,"WEDDINGZ")));
            //System.out.println(client.toggleOn(new TToggleOnRequest(20001046,"PACKAGES")));
            //System.out.println(client.toggleOff(new TToggleOffRequest(20001046,"PACKAGES","Not Feeling Well")));
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Roaster Service(check again,dependency on calendar service)

            //long startTime = System.currentTimeMillis()/1000 + (80*3600);
            //long endTime = startTime + 3600;
            //TRosterService.Client client = new TRosterService.Client(protocol);
            //System.out.println(client.markAvailable(new TRoasterMarkAvailableRequest(20001046,startTime,endTime,"Test Event Summary")));
            //System.out.println(client.isAvailable(new TRoasterAvailabilityRequest(20001046,startTime,endTime)));
            //System.out.println(client.markUnavailable(new TRoasterMarkUnAvailableRequest(20001046, 1550188800)));
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //WorkForce Config

//            TWorkForceConfigService.Client client = new TWorkForceConfigService.Client(protocol);
//            TWorkforceConfig tWorkforceConfig = new TWorkforceConfig();
//            tWorkforceConfig.setUserProfileId(123);
//            tWorkforceConfig.setEntityId("123");
//            tWorkforceConfig.setWeight(20);
//            tWorkforceConfig.setEntityType(TType.findByValue(1));
//            System.out.println(client.createConfig(tWorkforceConfig));
//            System.out.println(client.getAgents("123",TType.findByValue(1)));
//            System.out.println(client.updateConfig(tWorkforceConfig));

//            TActDeactRequestData tActDeactRequestData = new TActDeactRequestData();
//            tActDeactRequestData.setUserProfileId(20001046);
//            tActDeactRequestData.setEntityId("123");
//            tActDeactRequestData.setEntityType(TType.findByValue(1));
//            System.out.println(client.deactivateConfig(tActDeactRequestData));
// ----------------------------------------------------------------------------------------------------------------------------------------------------------


            // close transport
            httpClient.close();
        }
        catch (Exception e){
            e.printStackTrace(System.out);
        }

    }
}
