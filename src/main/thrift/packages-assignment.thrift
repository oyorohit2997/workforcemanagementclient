namespace java com.oyo.lms

enum TResponse {
    FAILURE,
    SUCCESS
}

// exceptions
exception TInvalidRequest {
   1: required i32 errorCode;
   2: required string message;
}
exception TInternalError {
   1: required i32 errorCode;
   2: required string message;
}

struct TDestination{
    1: required string destination;
}

struct TDestinationResponse{
    1: required list<TDestination> destinationList;
}

struct TDestinationConversion{
    1: required string destination;
    2: required double conversion;
}
struct TAgentDestinationConversion{
    1: required string destination;
    2: required string email;
    3: required i64 userProfileId;
    4: required double conversion;
}

struct TManualOverride {
    1: required string destination;
    2: required string email;
    3: required i64 userProfileId;
    4: required bool overide;
}

struct TAgentDestination{
    1: required string destination;
    2: optional string email;
    3: optional i64 userProfileId;
}

struct TAssignmentConstants {
    1: required i32 duplicateDurationInDays;
    2: required i32 QPA;
    3: required i32 GAP;
}

struct TAssignmentRequest {
    1: required map<string, string> leadDetails;
    2: required list<string> allTheAgentsEmailIds;
    3: required TAssignmentConstants tAssignmentConstants;
}

struct TAssignmentResponse {
    1: required string agentEmailId;
}

service TPackageDestinationService {
    TResponse addDestination(1:string destination) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
    TDestinationResponse getDestinations() throws (1:TInternalError tInternalError);
}

service TDestinationConversionService {
    TResponse setDestinationConversion(1:TDestinationConversion tDestinationConversion) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
    TDestinationConversion getDestinationConversion(1:string destination) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
}

service TAgentDestinationConversionService {
    TResponse setAgentDestinationConversion(1:TAgentDestinationConversion tAgentDestinationConversion) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
    TAgentDestinationConversion getAgentDestinationConversion(1:TAgentDestination tAgentDestination) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
}

service TManualOverrideService {
    TResponse enableOverride(1:TAgentDestination tAgentDestination) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
    TResponse disableOverride(1:TAgentDestination tAgentDestination) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
    TManualOverride isOverride(1:TAgentDestination tAgentDestination) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
}

service TAssignmentService {
    TAssignmentResponse getAgent(1:TAssignmentRequest tAssignmentRequest) throws (1:TInvalidRequest tInvalidRequest, 2:TInternalError tInternalError);
}