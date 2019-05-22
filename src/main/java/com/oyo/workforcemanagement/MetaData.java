package com.oyo.workforcemanagement;

import com.opencsv.CSVWriter;
import com.oyo.metadata.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransportException;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MetaData {
    public static TMetaDataService.Client getClient(){
        THttpClient httpClient  = null;
        try {
            httpClient = new THttpClient("http://stg-acppr-metadata-api.ap-southeast-1.elasticbeanstalk.com/metadataservice/");
        } catch (TTransportException e) {
            e.printStackTrace();
        }
        httpClient.setConnectTimeout(3000);
        TProtocol protocol = new TJSONProtocol(httpClient);
        return new TMetaDataService.Client(protocol);
    }
    public static void listPackageDestinations(){
        TMetaDataService.Client client = getClient();
        try {
           List<TPackageDestinationResponse> tPackageDestinationResponseList = client.listPackageDestinations("en",TQueryPackageDestinations.BOTH_ACTIVE_AND_IN_ACTIVE_DESTINATIONS);
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
           for(TPackageDestinationResponse tPackageDestinationResponse : tPackageDestinationResponseList){
                rows.add(new String[]{Integer.toString(i),tPackageDestinationResponse.getPackageDestination().getId(), tPackageDestinationResponse.getPackageDestination().getName()});
               i++;
           }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void listStates(){
        TMetaDataService.Client client = getClient();
        try {
            List<TStateResponse> list = client.listStates("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            for(TStateResponse tStateResponse : list){
                rows.add(new String[]{Integer.toString(i),tStateResponse.getState().getId(),tStateResponse.getState().getName()});
                i++;
            }
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void listCountries(){
        TMetaDataService.Client client = getClient();
        try {
            List<TCountryResponse> list = client.listCountries("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            for(TCountryResponse tCountryResponse: list){
                rows.add(new String[]{Integer.toString(i),tCountryResponse.getCountry().getId(),tCountryResponse.getCountry().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  listPackageDurations(){
        TMetaDataService.Client client = getClient();
        try {
            List<TPackageDurationResponse> list = client.listPackageDurations("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TPackageDurationResponse tPackageDurationResponse: list){
                rows.add(new String[]{Integer.toString(i),tPackageDurationResponse.getPackageDuration().getId(),tPackageDurationResponse.getPackageDuration().getDisplayName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listMonths(){
        TMetaDataService.Client client = getClient();
        try {
            List<TMonthResponse> list = client.listMonths("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TMonthResponse tMonthResponse: list){
                rows.add(new String[]{Integer.toString(i),tMonthResponse.getMonth().getId(),tMonthResponse.getMonth().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listPackageInclusions(){
        TMetaDataService.Client client = getClient();
        try {
            List<TPackageInclusionResponse> list = client.listPackageInclusions("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TPackageInclusionResponse tPackageInclusionResponse: list){
                rows.add(new String[]{Integer.toString(i),tPackageInclusionResponse.getPackageInclusion().getId(),tPackageInclusionResponse.getPackageInclusion().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  listRestrictions(){
        TMetaDataService.Client client = getClient();
        try {
            List<TRestrictionResponse> list = client.listRestrictions("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TRestrictionResponse tRestrictionResponse: list){
                rows.add(new String[]{Integer.toString(i),tRestrictionResponse.getRestriction().getId(),tRestrictionResponse.getRestriction().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listAmenities(){
        TMetaDataService.Client client = getClient();
        try {
            List<TAmenityResponse> list = client.listAmenities("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TAmenityResponse tAmenityResponse: list){
                rows.add(new String[]{Integer.toString(i),tAmenityResponse.getAmenity().getId(),tAmenityResponse.getAmenity().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listPackageTags(){
        TMetaDataService.Client client = getClient();
        try {
            List<TPackageTagResponse> list = client.listPackageTags("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TPackageTagResponse tPackageTagResponse: list){
                rows.add(new String[]{Integer.toString(i),tPackageTagResponse.getPackageTag().getId(),tPackageTagResponse.getPackageTag().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  listHotelCategories(){
        TMetaDataService.Client client = getClient();
        try {
            List<THotelCategoryResponse> list = client.listHotelCategories("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(THotelCategoryResponse tHotelCategoryResponse: list){
                rows.add(new String[]{Integer.toString(i),tHotelCategoryResponse.getHotelCategory().getId(),tHotelCategoryResponse.getHotelCategory().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listRoomCategories(){
        TMetaDataService.Client client = getClient();
        try {
            List<TRoomCategoryResponse> list = client.listRoomCategories("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TRoomCategoryResponse tRoomCategoryResponse: list){
                rows.add(new String[]{Integer.toString(i),tRoomCategoryResponse.getRoomCategory().getId(),tRoomCategoryResponse.getRoomCategory().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listPickupPoints(){
        TMetaDataService.Client client = getClient();
        try {
            List<TPickupPointResponse> list = client.listPickupPoints("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TPickupPointResponse tPickupPointResponse: list){
                rows.add(new String[]{Integer.toString(i),tPickupPointResponse.getPickupPoint().getId(),tPickupPointResponse.getPickupPoint().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listAirports(){
            TMetaDataService.Client client = getClient();
            try {
                List<TAiportGETResponse> list = client.listAirports("en");
                CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
                List<String[]> rows = new LinkedList<String[]>();
                int i=1;
                rows.add(new String[]{" "," ", " ",""});
                for(TAiportGETResponse tAiportGETResponse: list){
                    rows.add(new String[]{Integer.toString(i),tAiportGETResponse.getMetadataId(),tAiportGETResponse.getAirportName(),tAiportGETResponse.getAirportCode()});
                    i++;
                }
                rows.add(new String[]{" "," ", " "," "});
                csvWriter.writeAll(rows);

                csvWriter.close();
            } catch (TException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public static void  listSightseeingPoints(){
        TMetaDataService.Client client = getClient();
        try {
            List<TSightseeingPointResponse> list = client.listSightseeingPoints("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TSightseeingPointResponse tSightseeingPointResponse: list){
                rows.add(new String[]{Integer.toString(i),tSightseeingPointResponse.getSightseeingPoint().getId(),tSightseeingPointResponse.getSightseeingPoint().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listCabCategories(){
        TMetaDataService.Client client = getClient();
        try {
            List<TCabCategoryGETResponse> list = client.listCabCategories("en");
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TCabCategoryGETResponse tCabCategoryGETResponse: list){
                rows.add(new String[]{Integer.toString(i),tCabCategoryGETResponse.getCabCategoryMetadataInfo().getId(),tCabCategoryGETResponse.getCabCategoryMetadataInfo().getCabCategoryDetails().getCategoryName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  listCities(){
        TMetaDataService.Client client = getClient();
        try {
            List<TCityResponse> list = client.listCities("en",false,false);
            CSVWriter csvWriter = new CSVWriter(new FileWriter("/Users/oyo/Desktop/meta-data.csv",true));
            List<String[]> rows = new LinkedList<String[]>();
            int i=1;
            rows.add(new String[]{" "," ", " "});
            for(TCityResponse tCityResponse: list){
                rows.add(new String[]{Integer.toString(i),tCityResponse.getCity().getId(),tCityResponse.getCity().getName()});
                i++;
            }
            rows.add(new String[]{" "," ", " "});
            csvWriter.writeAll(rows);

            csvWriter.close();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
