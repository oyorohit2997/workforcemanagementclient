package com.oyo.workforcemanagement;




import com.oyo.metadata.TCallcenterHierarchyService;
import com.oyo.metadata.TTeamGetRequest;
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
//    private static int port = 9000;
//    private static String host = "localhost";
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //actual host
//    private static String host = "10.50.21.106";

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Services uri(one active at a time)

    //private static String uri = "employee_onboarding";
    //private static String uri = "workload_service";
    //private static String uri = "workforce_service";
    //private static String uri = "toggle_service";
    // private static String uri = "roster_service";
   // private static String uri = "workforce_config";
    private static String uri = "callcentre_hierarchy";
// ----------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        try{
            //create HTTP client
//            String url = "http://"+host+"/"+uri+"/"; //(for actual host)
//            System.out.println(url);
//            String url = "http://"+host+":" + port + "/"+uri+"/"; //(for local host)
//            System.out.println(url);
            THttpClient httpClient  = new THttpClient("http://acppr-0.metadataservice.incubate.oyorooms.ms/metadata_service_cch/");
            httpClient.setConnectTimeout(3000);
            TProtocol protocol = new TJSONProtocol(httpClient);

//----------------------------------------------------------------------------------------------------------------------------------------------------------
            //employee onboarding(working fine, dependency on crs)

           //TEmployeeOnBoardingService.Client client = new TEmployeeOnBoardingService.Client(protocol);
//            System.out.println(client);
//            System.out.println(client.onboardEmployee(new TEmployeeOnboardRequest(456,"PACKAGES")));
            //System.out.println(client.isEmployeeOnboarded(20001046));
            //System.out.println(client.getEmployeesBusinessId(20001046));
            //System.out.println(client.offboardEmployee(new TEmployeeOffboardRequest(20001046,"PACKAGES")));
//----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Workload Service(working fine)

//            TWorkLoadService.Client client = new TWorkLoadService.Client(protocol);
//            long epochTime= DateTimeUtil.getCurrentEpoch();
//            System.out.println(epochTime);
//            int load =5;
//            //System.out.println(client.addLoad(new TWorkLoadAddRequest(26162777,epochTime,epochTime,load,"WEDDINGZ",5)));
//            System.out.println(client.getLoad(new TWorkLoadGetRequest(23885906,new TTimeRange(1551037047,1551162701),"WEDDINGZ")));

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //WorkForce Service(check for isEmployeeAvailable once again,dependency on calendar service)

//            TWorkForceService.Client client = new TWorkForceService.Client(protocol);
//            TGetEmployeesRequest tGetEmployeesRequest = new TGetEmployeesRequest();
//            //long startTime = System.currentTimeMillis()/1000 + (80*3600);
//            //long endTime = startTime + 3600;
//            Long beforeTime = 1550226343L;
//            tGetEmployeesRequest.setBeforeTime(beforeTime);
//            tGetEmployeesRequest.setLimit(10);
//            tGetEmployeesRequest.setBusinessId("PACKAGES");
//            System.out.println(client.getEmployees(tGetEmployeesRequest));
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

           // TWorkForceConfigService.Client client = new TWorkForceConfigService.Client(protocol);
//            TWorkforceConfig tWorkforceConfig = new TWorkforceConfig();
//            tWorkforceConfig.setUserProfileId(23885906);
//            tWorkforceConfig.setEntityId("1");
//            tWorkforceConfig.setWeight(60);
//            tWorkforceConfig.setEntityType(TType.WEDDINGZ_NONVENUE);
//            tWorkforceConfig.setBusinessId("WEDDINGZ");
            //System.out.println(client.createConfig(tWorkforceConfig));
              //System.out.println(client.updateConfig(tWorkforceConfig));
//              TGetAgentRequest tGetAgentRequest = new TGetAgentRequest();
//              tGetAgentRequest.setEntityId("1");
//              tGetAgentRequest.setEntityType(TType.WEDDINGZ_NONVENUE);
//              tGetAgentRequest.setBussinessId("WEDDINGZ");
//              System.out.println(client.getAgents(tGetAgentRequest));


//            TActDeactRequestData tActDeactRequestData = new TActDeactRequestData();
//            tActDeactRequestData.setUserProfileId(123);
//            tActDeactRequestData.setEntityId("123");
//            tActDeactRequestData.setEntityType(TType.findByValue(1));
//            tActDeactRequestData.setBusinessId("PACKAGES");
//            System.out.println(client.deactivateConfig(tActDeactRequestData));
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Call Centre
            TCallcenterHierarchyService.Client client = new TCallcenterHierarchyService.Client(protocol);
            System.out.println(client.getTeam(new TTeamGetRequest("cch-team-d776d8ce-69aa-49ba-9f2e-f3748063ab38","en")));
//            TCallCentreHierarchyService.Client client = new TCallCentreHierarchyService.Client(protocol);
//            TAddEmployeeCallCentreHierarchyInfo tAddEmployeeCallCentreHierarchyInfo = new TAddEmployeeCallCentreHierarchyInfo();
//            tAddEmployeeCallCentreHierarchyInfo.setUserProfileId(2621800);
//            tAddEmployeeCallCentreHierarchyInfo.setLevel1("cch-team-34b1e3b3-bf63-49a7-8bb1-ceee673f3604");
//            tAddEmployeeCallCentreHierarchyInfo.setLevel2("cch-center-a33d2f75-c70e-47a4-8d31-983df879ef23");
//            tAddEmployeeCallCentreHierarchyInfo.setLevel3("cch-lob-aa0808c2-923a-4976-b901-1a95b0c06079");
//            tAddEmployeeCallCentreHierarchyInfo.setLevel4("cch-business-c89c57ef-54fc-4d88-8280-04ab364e0109");
//            tAddEmployeeCallCentreHierarchyInfo.setActive(true);
//            tAddEmployeeCallCentreHierarchyInfo.setCreatedById(23885944);
//            tAddEmployeeCallCentreHierarchyInfo.setParentId(1);
//            client.addEmployeeCallCentreHierarchyInfo(tAddEmployeeCallCentreHierarchyInfo);
//            TGetLevelInfoRequest tGetLevelInfoRequest = new TGetLevelInfoRequest();
//            tGetLevelInfoRequest.setUserProfileId(26218008);
//            //System.out.println(client.getLevelInfo(tGetLevelInfoRequest));
//            TGetParentIdRequest tGetParentIdRequest = new TGetParentIdRequest();
//            tGetParentIdRequest.setUserProfileId(26218008);
//            //System.out.println(client.getParentId(tGetParentIdRequest));
//            TGetSubordinateEmployeeDetailsRequest tGetSubordinateEmployeeDetailsRequest = new TGetSubordinateEmployeeDetailsRequest();
//            tGetSubordinateEmployeeDetailsRequest.setParentId(1);
//            //System.out.println(client.getSubordinateEmployeeDetails(tGetSubordinateEmployeeDetailsRequest));


            // close transport
            httpClient.close();
        }
        catch (Exception e){
            e.printStackTrace(System.out);
        }

    }
}
