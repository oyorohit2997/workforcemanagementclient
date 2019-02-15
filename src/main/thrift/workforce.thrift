namespace java com.oyo.workforce

//typedef

//------------------------------------------------------------------------------------------------------------------------------------
//wfconfig
//typedef string AgentID // is same as userProfileId ? resolve string type and integer type conflict is it always long?? can it take alphanumeric
typedef string EntitiyID
typedef i32 Weight
typedef bool Success
typedef string ErrorMessage
//------------------------------------------------------------------------------------------------------------------------------------

/* Date format YYYY-MM-DD*/
typedef i64 TDate


// exceptions

//------------------------------------------------------------------------------------------------------------------------------------

//wfconfig
exception TInvalidRequest {
    1:required ErrorMessage errorMessage;
}

exception TDataAlreadyExist {
    1:required ErrorMessage errorMessage;
}

exception TDataBaseError {
    1:required ErrorMessage errorMessage;
}

exception TConfigNotFound {
    1:required ErrorMessage errorMessage;
}

exception TConfigDeactivated {
    1:required ErrorMessage errorMessage;
}

//------------------------------------------------------------------------------------------------------------------------------------


exception TMongoDocDoesntExistException {
   1: i32 errorCode;
   2: string message;
}
exception TEmployeeNotOnboardedException {
   1: i32 errorCode;
   2: string message;
}
exception TEmployeeAlreadyOnboardedException {
   1: i32 errorCode;
   2: string message;
}
exception TEmployeeDoesntExistException {
   1: i32 errorCode;
   2: string message;
}
exception TInvalidUserProfileIdException {
   1: i32 errorCode;
   2: string message;
}
exception TInvalidBusinessIdException {
   1: i32 errorCode;
   2: string message;
}
exception TInvalidWorkLoadValueException {
   1: i32 errorCode;
   2: string message;
}
exception TInvalidEpochTimeException {
   1: i32 errorCode;
   2: string message;
}
exception TInvalidDateException {
   1: i32 errorCode;
   2: string message;
}
exception TInvalidToggleOffReasonException {
   1: i32 errorCode;
   2: string message;
}
exception TInvalidVersionException {
   1: i32 errorCode;
   2: string message;
}
exception TInternalErrorException {
   1: i32 errorCode;
   2: string message;
}



// enums

//------------------------------------------------------------------------------------------------------------------------------------
//wfconfig
enum TType {
    WEDDINGZ_CITY,
    WEDDINGZ_VENUE,
    WEDDINGZ_NONVENUE
}
//------------------------------------------------------------------------------------------------------------------------------------

enum TResponseStatus {
    SUCCESS,
    FAILURE
}


// requests

//------------------------------------------------------------------------------------------------------------------------------------
//wfconfig

struct TWorkforceConfig{

    1:required i64 userProfileId;
    2:required EntitiyID entityId;
    3:required TType entityType;
    4:required Weight weight;
}

struct TActDeactRequestData {
    1:required i64 userProfileId;
    2:required EntitiyID entityId;
    3:required TType entityType;
}

//------------------------------------------------------------------------------------------------------------------------------------


struct TEmployeeOnboardRequest {
	1: required i64 userProfileId;
	2: required string businessId;
}

struct TEmployeeOffboardRequest {
	1: required i64 userProfileId;
	2: required string businessId;
}

struct TEmployeeBusinessUpdateRequest {
	1: required i64 userProfileId;
	2: required string businessId;
}

struct TGetEmployeesRequest {
	1: required i64 beforeTime;
	2: required string businessId;
	3: optional i32 limit;
}

struct TRoasterMarkAvailableRequest {
	1: required i64 userProfileId;
	2: required i64 startTime;
	3: required i64 endTime;
	4: required string summary;
}

struct TRoasterMarkUnAvailableRequest {
	1: required i64 userProfileId;
	2: required i64 dateTime;
}

struct TRoasterAvailabilityRequest {
	1: required i64 userProfileId;
	2: required i64 startTime;
	3: required i64 endTime;
}

struct TToggleOnRequest {
	1: required i64 userProfileId;
	2: required string businessId;
}
struct TToggleOffRequest {
	1: required i64 userProfileId;
	2: required string businessId;
	3: required string reason;
}
struct TToggleGetRequest {
	1: required i64 userProfileId;
	2: required string businessId;
}
struct TWorkLoadAddRequest {//date is epoch second;
	1: required i64 userProfileId;
	2: required TDate date;
	3: required i64 lastAssignedDate;
	4: required i32 load;
	5: required string businessId;
	6: required i64 version;
}
struct TWorkLoadGetRequest {
	1: required i64 userProfileId;
	2: required TDate date;
	3: required string businessId;
}



// responses
struct TUserProfileIdsWithWorkLoads {
    1: required i64 userProfileId;
    2: required i32 workload;
}

struct TGetEmployeesResponse {
    1: required TResponseStatus status;
	2: required i64 beforeTime;
	3: required string businessId;
	4: optional i32 limit;
	5: optional list<TUserProfileIdsWithWorkLoads> userProfileIdsWithWorkLoads;
}
struct TEmployeeResponse {
    1: required TResponseStatus status;
    2: optional bool result;
}
struct TEmployeeGetBusinessIdResponse {
    1: required TResponseStatus status;
    2: optional string businessId;
}

struct TRoasterAvailabilityResponse {
    1: required TResponseStatus status;
	2: optional bool isAvailable;
}

struct TToggleStatus {
    1: required i64 userProfileId;
    2: required string businessId;
    3: required bool toggle;
    4: optional string reason;
}
struct TToggleGetResponse {
    1: required TResponseStatus response;
    2: optional TToggleStatus toggle;
}

struct TWorkLoad {
    1: required i32 load;
    2: required i64 version;
}
struct TWorkLoadResponse {
    1: required TResponseStatus status;
    2: optional TWorkLoad tWorkLoad;
}


//services


//------------------------------------------------------------------------------------------------------------------------------------
//wfconfig

service TWorkForceConfigService {
    //get all the active agents mapped to an entity
   list<TWorkforceConfig> getAgents(1:EntitiyID entityId,2:TType entityType)
   throws (1:TInvalidRequest tInvalidRequest,2:TDataBaseError tDataBaseError);

   //CRUD Kinda operations
   Success createConfig(1:TWorkforceConfig tWorkForceConfig)
   throws (1:TInvalidRequest tInvalidRequest,2:TDataAlreadyExist tDataAlreadyExist,3:TDataBaseError tDataBaseError,4: TEmployeeNotOnboardedException tEmployeeNotOnboardedException);

   Success updateConfig(1:TWorkforceConfig tWorkForceConfig)
   throws (1:TInvalidRequest tInvalidRequest,2:TDataBaseError tDataBaseError,3:TConfigNotFound tConfigNotFoundError,4:TConfigDeactivated tConfigDeactivatedError,5:TEmployeeNotOnboardedException tEmployeeNotOnboardedException);

   Success deactivateConfig(1:TActDeactRequestData tActDeactRequestData)
   throws (1:TInvalidRequest tInvalidRequest,2:TDataBaseError tDataBaseError,3:TConfigNotFound tConfigNotFoundError,4:TEmployeeNotOnboardedException tEmployeeNotOnboardedException);

//   Success activateConfig(1:TActDeactRequestData tActDeactRequestData)
//   throws (1:TInvalidRequest tInvalidRequest,2:TDataBaseError tDataBaseError,3:TConfigNotFound tConfigNotFoundError);
}

//------------------------------------------------------------------------------------------------------------------------------------


service TEmployeeOnBoardingService {
    // Checks whether employee is onboarded or not
	TEmployeeResponse isEmployeeOnboarded(1:i64 userProfileId);

    TResponseStatus onboardEmployee(1:TEmployeeOnboardRequest tEmployeesOnboardRequest) throws (1:TEmployeeAlreadyOnboardedException tEmployeeAlreadyOnboardedException, 2:TEmployeeDoesntExistException tEmployeeDoesntExistException);

    //to offboard an Employee
    TResponseStatus offboardEmployee(1:TEmployeeOffboardRequest tEmployeesOnboardRequest) throws (1:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 2:TInvalidBusinessIdException tInvalidBusinessIdException);

    TEmployeeGetBusinessIdResponse getEmployeesBusinessId(1:i64 userProfileId) throws(1:TEmployeeNotOnboardedException tEmployeeNotOnboardedException);

}

service TWorkForceService {
    TGetEmployeesResponse getEmployees(1:TGetEmployeesRequest tGetEmployeesRequest);
	// Returns the status of employee avaialbility - union of roaster availability, toggle availability and calendar availability
    TEmployeeResponse isEmployeeAvailableNow(1:i64 userProfileId) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInternalErrorException tInternalErrorException);
	// Returns the status of employee avaialbility - union of roaster availability, toggle availability and calendar availability
    TEmployeeResponse isEmployeeAvailableInRange(1:i64 userProfileId, 2:i64 startTime, 3:i64 endTime) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInternalErrorException tInternalErrorException);
}

service TRosterService {
    // Marks the user as avaialble during the given period
    TResponseStatus markAvailable(1:TRoasterMarkAvailableRequest tRoasterMarkAvailableRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInvalidEpochTimeException tInvalidEpochTimeException);
    // Marks the user as unavaialble during the given period
    TResponseStatus markUnavailable(1:TRoasterMarkUnAvailableRequest tRoasterMarkUnAvailableRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInvalidEpochTimeException tInvalidEpochTimeException);
    // Checks the user is avaialble during the given period
	TRoasterAvailabilityResponse isAvailable(1:TRoasterAvailabilityRequest tRoasterAvailabilityRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInvalidEpochTimeException tInvalidEpochTimeException);
}

service TToggleService {
    // Makes the toggle on for the given user
    TResponseStatus toggleOn(1:TToggleOnRequest tToggleOnRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException);
    // Makes the toggle off for the given user
    TResponseStatus toggleOff(1:TToggleOffRequest tToggleOffRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInvalidToggleOffReasonException tInvalidToggleOffReasonException);
    // Checks whether the toggle is on for the given user
    TToggleGetResponse isToggleOn(1:TToggleGetRequest TToggleGetRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException);
}

service TWorkLoadService {
    // Increases/decreases the load value of a user at given time
    TResponseStatus addLoad(1:TWorkLoadAddRequest tWorkLoadAddRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInvalidDateException tInvalidDateException, 4:TInvalidWorkLoadValueException tInvalidWorkLoadValueException, 5:TInvalidVersionException tInvalidVersionException, 6:TInvalidBusinessIdException tInvalidBusinessIdException);
    // Gets the load value of a user for the given time range
    TWorkLoadResponse getLoad(1:TWorkLoadGetRequest tWorkLoadGetRequest) throws (1:TInvalidUserProfileIdException tInvalidUserProfileIdException, 2:TEmployeeNotOnboardedException tEmployeeNotOnboardedException, 3:TInvalidDateException tInvalidDateException, 4:TInvalidBusinessIdException tInvalidBusinessIdException);
}

