package com.oyo.workforcemanagement;




import com.oyo.platform.hierarchy.HierarchyServiceInterface;
import com.oyo.platform.orgdata.TOrgDataService;
import com.oyo.platform.orgdata.TOrgType;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

import java.util.ArrayList;
import java.util.List;

public class WorkForceManagementClient {

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Local Host
//    private static int port = 9000;
//    private static String host = "localhost";
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //actual host
    //private static String host = "acppr-0.acp-workforce-management.incubate.oyorooms.ms";

// ----------------------------------------------------------------------------------------------------------------------------------------------------------
            //Services uri(one active at a time)

    //private static String uri = "employee_onboarding";
//    private static String uri = "workload_service";
    //private static String uri = "workforce_service";
    //private static String uri = "toggle_service";
    // private static String uri = "roster_service";
    //private static String uri = "workforce_config";
// ----------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        try{
            //create HTTP client
            //String url = "http://"+host+"/"+uri+"/"; //(for actual host)
//            String url = "http://"+host+":" + port + "/"+uri+"/"; //(for local host)
//            System.out.println(url);
//            THttpClient httpClient  = new THttpClient("http://plcore-0.micromarket-data-service.incubate.oyorooms.ms/org");
//            httpClient.setConnectTimeout(3000);
//            TProtocol protocol = new TJSONProtocol(httpClient);
//            TOrgDataService.Client client = new TOrgDataService.Client(protocol);
//            //System.out.println(client.getMicroMarket("129264"));
//            System.out.println(client.getParent("MM_126",TOrgType.MICROMARKET,TOrgType.HUB));
           // System.out.println(client.getParent("MM_CHN_7", TOrgType.MICROMARKET,TOrgType.HUB));
            //            AccountManagement.Client client = new AccountManagement.Client(protocol);
//            TAccountObject tAccountObject = client.getAccountFromCrsId("33830",TEntityType.TravelAgent);

            THttpClient httpClient  = new THttpClient("http://plcore-0.platform-hierarchy-service.incubate.oyorooms.ms/hierarchyService");
            httpClient.setConnectTimeout(3000);
            TProtocol protocol = new TJSONProtocol(httpClient);
            HierarchyServiceInterface.Client client = new HierarchyServiceInterface.Client(protocol);
            List<String> parentList = new ArrayList<>();
            List<String> child = new ArrayList<>();
            parentList.add("123433");
            client.createOrUpdateEntity("ACP-PACKAGES","SUBORDIANTES-HIERARCHY","123444",parentList,child);
//            // close transport
            httpClient.close();
        }
        catch (Exception e){
            e.printStackTrace(System.out);
        }

    }
}
