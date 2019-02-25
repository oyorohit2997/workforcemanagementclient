package com.oyo.workforcemanagement;




import com.oyo.platform.mmdata.TMMDataService;
import com.oyo.platform.mmdata.TMicroMarketDetails;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

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
            THttpClient httpClient  = new THttpClient("http://plcore-0.micromarket-data-service.incubate.oyorooms.ms/micromarket");
            httpClient.setConnectTimeout(3000);
            TProtocol protocol = new TJSONProtocol(httpClient);
            TMMDataService.Client client = new TMMDataService.Client(protocol);
            //System.out.println(client.getMicroMarketInfo("5c73942c27e4900001023435a"));
            client.associateEmployeeToMM("13122313","test","Test-1234");
            //System.out.println(client.getMicroMarket("126343"));
            //System.out.println(client.createMM(new TMicroMarketDetails("Patna","patna-mm","Test-1234",DateTimeUtil.getCurrentEpoch(),DateTimeUtil.getCurrentEpoch(),"123",null,"",true,true)));
//            AccountManagement.Client client = new AccountManagement.Client(protocol);
//            TAccountObject tAccountObject = client.getAccountFromCrsId("33830",TEntityType.TravelAgent);
//            // close transport
            httpClient.close();
        }
        catch (Exception e){
            e.printStackTrace(System.out);
        }

    }
}
