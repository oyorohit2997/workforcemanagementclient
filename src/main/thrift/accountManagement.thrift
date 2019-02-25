namespace java com.oyo.mm.channel.accountmanagement

const i32 T_SIZE_EXCEEDED = 1000;
const i32 T_ACCOUNT_CREATION_ERROR = 10001;
const i32 T_NO_ACCOUNT_ERROR = 10002;
const i32 T_ALREADY_DELETED_ERROR = 10003;
const i32 T_ACCOUNT_UPDATING_ERROR = 10004;
const i32 T_ACCOUNT_DELETION_ERROR = 10005;
const i32 T_ACCOUNT_DATA_VALIDATION_ERROR = 10006;
const i32 T_ACCOUNT_CODE_MISSING_ERROR = 10007;
const i32 T_ACCOUNT_SEARCH_ERROR = 10008;
const i32 T_ACCOUNT_VERSION_ERROR = 10009;
const i32 T_NO_BILLING_ADDRESS_EXCEPTION = 10010;
const i32 T_BILLING_ADDRESS_SEARCH_EXCEPTION = 10011;
const i32 T_BILLING_ADDRESS_UPDATE_EXCEPTION = 10012;
const i32 T_BILLING_ADDRESS_DATA_VALIDATION_EXCEPTION = 10013;
const i32 T_BILLING_ADDRESS_CREATION_EXCEPTION = 10014;
const i32 T_BILLING_ADDRESS_RESPONSE_DELETE_EXCEPTION = 10015;
const i32 T_ACCOUNT_ACCEPT_ERROR = 10016;
const i32 T_ACCOUNT_REJECT_ERROR = 10017;
const i32 T_ONBOARDING_DATA_VALIDATION_ERROR = 10018;
const i32 T_JSON_PARSE_EXCEPTION = 10019;


//Will be shifting to Metadata service
enum TCountryCode{
    AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW,
    AU, AT, AZ, BH, BS, BD, BB, BY, BE, BZ, BJ, BM, BT,
    BO, BQ, BA, BW, BV, BR, IO, BN, BG, BF, BI, KH, CM,
    CA, CV, KY, CF, TD, CL, CN, CX, CC, CO, KM, CG, CD,
    CK, CR, CI, HR, CU, CW, CY, CZ, DK, DJ, DM, DO, EC,
    EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF,
    TF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT,
    GG, GN, GW, GY, HT, HM, VA, HN, HK, HU, IS, IN, ID,
    IR, IQ, IE, IM, IL, IT, JM, JP, JE, JO, KZ, KE, KI,
    KP, KR, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU,
    MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT,
    MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP,
    NL, NC, NZ, NI, NE, NG, NU, NF, MP, NO, OM, PK, PW,
    PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, RE, RO,
    RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA,
    SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, SS,
    ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH,
    TL, TG, TK, TO, TT, TN, TR, TM, TC, TV, UG, UA, AE,
    GB, US, UM, UY, UZ, VU, VE, VN, VG, VI, WF, EH, YE,
    ZM, ZW
}

enum TEntityType{
Company,
TravelAgent
}

/* just for reference purposes */
enum Category{
    Medical
    Institutional
    Sports
    Entertainment
    B2BSubagents
    Aggregators
    DestinationExperts
    Wedding
    Corporate
    KitchenGroups
    Events
    MMTa
    Event
    RetailDhaba
    RetailOthers
    Promoter
    Partnership
    None
    MMCorporate
    MedicalTourism
    EventBusiness
    LongStayBusiness
    RegularBookingBusiness
    Ministries
    SubMinistries
    PSUs
    Defense
    GovtMedicalBodies
    Government
    HotelSale
    Medicals
}

/* just for reference purposes */
enum agentType{
    Unorganized,
    Organized,
    OwnerTA,
    ThreeP
}

/* just for reference purposes
 * Account reach */
enum typeOfBusiness{
    National,
    International,
    Both
}

enum TDiscountType {
	Percentage,
	Amount
}

enum TBillingCycle {
	WeeklyBilling,
	BiweeklyBilling,
	MonthlyBilling
}

struct TAccountConfig{
    1: optional bool fixedPricing;
    2: optional bool enableBarRates;
    3: optional bool isFocValid;
    4: optional bool isSmartTa;
    5: optional bool taSellable;
    6: optional bool shouldMarkUpPrice;
    7: optional double markupFactor;
    8: optional bool hideComissionTa;
    9: optional bool hidePriceRangeTaPortal;
    10: optional bool waiveCancellationCharge;
    11: optional string smartTaActivationDate;
    12: optional bool limits;
    13: optional bool smartTaIncentiveValid;
    14: optional double smartTaCommission;
    15: optional bool bookingApproval;
    16: optional bool bookingApprovalDefaultApproved;
    17: optional i32 tatForApproval;
    18: optional bool multiTier;
    19: optional bool packageVendor;
    20: optional string approvalSubType;
    21: optional bool notUseWalletApproval;
    22: optional bool couponAllowed;
    23: optional bool skipPrepaid;
    24: optional i32 expectedRoomNightsPerMonth;
    25: optional i32 numberOfEmployees;
    26: optional bool requireInvoices;
    27: optional i32 discount;
    28: optional TDiscountType discountType;
    29: optional TBillingCycle billingCycle;
    30: optional bool isD2t;
}

enum TAccountStatus{
    Active,
    Inactive,
    financeApprovalPending,
    financeApprovalRejected;
}

struct TExternalIdObject{
   1: optional string crsId;
   2: optional string salesAgentId;
   3: optional string kamUserProfileId;
   4: optional string glin;
   5: required string mmid;
   6: optional string walletId;
   7: optional string crsCode;
}

struct TAccountObject{
   1: required string accountCode;
   2: required TCountryCode countryCode;
   3: required TEntityType entityType;
   4: required string accountData;
   5: optional string onboardingData;
   6: required string name;
   7: required i64 createdAt;
   8: required i64 updatedAt;
   9: required string id;
   10: required i64 version;
   11: optional TAccountConfig accountConfig;
   12: required TExternalIdObject externalIdObject;
   13: required string createdBy;
   14: required string updatedBy;
   15: optional map<string, string> documentDetails;
   16: optional bool selfSignUp;
   17: required TAccountStatus status;
   18: optional map<string, string> onboardStatus;
}

struct TCreateAccountRequest{
   1: required TCountryCode countryCode;
   2: required TEntityType entityType;
   3: required string name;
   4: required string accountData;
   5: optional string onboardingData;
   6: optional TAccountConfig accountConfig;
   7: required TExternalIdObject externalIdObject;
   8: required string createdBy;
   9: optional map<string, string> documentDetails;
   10: optional bool selfSignUp;
}

struct TUpdateAccountRequest{
   1: required string accountCode;
   2: required string AccountData;
   3: optional string name;
   4: optional TAccountConfig accountConfig;
   5: optional TExternalIdObject externalIdObject;
   6: required i64 version;
   7: required string updatedBy;
   8: optional map<string, string> documentDetails;
}

struct TRangeObject{
    1:  string startRange;
    2:  string endRange;
}

/*
* Map will contain keys and value such as "accountCode" => "value"
* and for nested object like ExternalIdObject it will be "externalIdObject" => "value"
 */
struct TSearchAccountRequest{
    1: required map<string, list<string>> accountSearchObject;
    2: optional map<string,TRangeObject> rangeSearch;
    3: optional i32 offset;
    4: optional i32 size;
}

struct TAutoCompleteRequest{
    1: required string name;
    2: optional map<string, list<string>> accountSearchObject;
    3: optional map<string,TRangeObject> rangeSearch;
    4: optional i32 offset;
    5: optional i32 size;
}

struct TAccountResponse {
    1: required string message;
    2: required string code;
    3: string accountCode;
}

struct TAutoCompleteResponse {
    1: required string name;
    3: required string code;
}

struct TAccountSearchResponse {
	1: required i32 count;
	2: optional list<string> accountIds;
	3: optional list<string> accountNames;
	4: optional list<TAccountObject> accounts;
    5: optional bool success;
}

struct TAddressObject {
    1: required TCountryCode countryCode;
    2: required string stateCode;
    3: required string cityCode;
    4: required string addressLine1;
    5: optional string addressLine2;
    6: required string postalCode;
}

struct TCreateBillingAddressRequest {
    1: required TAddressObject address;
    2: required string lin;
    3: required bool isHeadquaters;
    4: optional string name;
}

struct TUpdateBillingAddressRequest {
    1: required TAddressObject address;
    2: required string lin;
    3: required bool isHeadquaters;
    4: required string billingId;
    5: required string accountCode;
    6: optional string name;
}

struct TBillingAddressObject {
    1: required TAddressObject address;
    2: required string lin;
    3: required string accountCode;
    4: required bool isHeadquaters;
    5: required string billingId;
    6: optional string name;
}

struct TGetBillingAddressesResponse {
    1: required i64 totalCount;
    2: required list<TBillingAddressObject> billingAddressObjects;
}

struct TBillingAddressResponse {
    1: required string message;
    2: required string code;
}

struct TAccountVersionResponse {
    1: required TAccountObject account;
    2: required TAccountStatus status;
}

exception TAccountCreationException{
    1: string errorMessage;
    2: i32 errorCode = T_ACCOUNT_CREATION_ERROR;
}
exception TAccountAcceptedException{
    1: string errorMessage;
    2: i32 errorCode = T_ACCOUNT_ACCEPT_ERROR;
}
exception TAccountRejectedException{
    1: string errorMessage;
    2: i32 errorCode = T_ACCOUNT_REJECT_ERROR;
}

exception TNoAccountException{
    1: string errorMessage;
    2: i32 errorCode = T_NO_ACCOUNT_ERROR;
}
exception TAccountDataValidationException{
    1: list<string> errorMessage;
    2: i32 errorCode = T_ACCOUNT_DATA_VALIDATION_ERROR;
}

exception TAccountDeleteException{
    1: string errorMessage;
    2: i32 errorCode = T_ACCOUNT_UPDATING_ERROR;
}

exception TAlreadyDeletedException{
    1: string errorMessage;
    2: i32 errorCode = T_ALREADY_DELETED_ERROR;
}
exception TAccountUpdateException{
    1: string errorMessage;
    2: i32 errorCode = T_ACCOUNT_UPDATING_ERROR;
}
exception TAccountSearchException{
    1: string errorMessage;
    2: i32 errorCode = T_ACCOUNT_SEARCH_ERROR;
}
exception TSizeExceededException{
    1: string errorMessage;
    2: i32 errorCode = T_SIZE_EXCEEDED;
}

exception TNoBillingAddressException {
    1: string errorMessage;
    2: i32 errorCode = T_NO_BILLING_ADDRESS_EXCEPTION;
}

exception TBillingAddressSearchException {
    1: string errorMessage;
    2: i32 errorCode = T_BILLING_ADDRESS_SEARCH_EXCEPTION;
}

exception TBillingAddressUpdateException {
    1: string errorMessage;
    2: i32 errorCode = T_BILLING_ADDRESS_UPDATE_EXCEPTION;
}

exception TBillingAddressDataValidationException {
    1: string errorMessage;
    2: i32 errorCode = T_BILLING_ADDRESS_DATA_VALIDATION_EXCEPTION;
}

exception TBillingAddressCreationException {
    1: string errorMessage;
    2: i32 errorCode  = T_BILLING_ADDRESS_CREATION_EXCEPTION;
}

exception TBillingAddressResponseDeleteException {
    1: string errorMessage;
    2: i32 errorCode = T_BILLING_ADDRESS_RESPONSE_DELETE_EXCEPTION;
}

exception TAccountHistoryException{
    1: string errorMessage;
    2: i32 errorCode = T_ACCOUNT_VERSION_ERROR;
}

exception TOnboardingDataException{
    1: string errorMessage;
    2: i32 errorCode = T_ONBOARDING_DATA_VALIDATION_ERROR;
}

exception TJsonParseException{
    1: string errorMessage;
    2: i32 errorCode = T_JSON_PARSE_EXCEPTION;
}

exception Error {
    1: i32 code
    2: string message
    3: list<string> errors
}

service AccountManagement{
    TAccountResponse createAccount(1: TCreateAccountRequest createAccountRequest) throws (1: TAccountCreationException e1, 2: TAccountDataValidationException e2, 3: TOnboardingDataException e3);
    TAccountResponse deleteAccount(1: string accountCode) throws (1: TAccountDeleteException e1, 2:TNoAccountException e2, 3:TAlreadyDeletedException e3);
    TAccountResponse financeApprovalGranted(1: string accountCode, 2: string approver, 3: string countryCode) throws(1: TNoAccountException e1, 2: TAccountAcceptedException e2);
    TAccountResponse financeApprovalRejected(1: string accountCode, 2: string reason, 3: string approver, 4: string countryCode ) throws(1: TNoAccountException e1, 2: TAccountRejectedException e2);
    TAccountResponse updateAccount(1: TUpdateAccountRequest updateAccountRequest) throws (1: TAccountUpdateException e1, 2:TAlreadyDeletedException e2, 3:TNoAccountException e3, 4:TAccountDataValidationException e4);
    TAccountObject getAccount(1: string accountCode) throws (1: TNoAccountException e1, 2:TAccountSearchException e2);
    TAccountObject getAccountFromCrsId(1: string crsId, 2: TEntityType entityType) throws (1: TNoAccountException e1);
    TAccountObject getAccountFromCrsCode(1: string crsCode, 2: TEntityType entityType) throws (1: TNoAccountException e1);
    list<TAccountObject> getAccounts(1:list<string> accountCodes) throws (1: TNoAccountException e1, 2:TAccountSearchException e2);
    TAccountSearchResponse searchAccounts(1:TSearchAccountRequest searchAccountRequest)throws (1:TAccountSearchException e1, 2: TSizeExceededException e2, 3: Error e3);
    list<TAutoCompleteResponse> AutoCompleteName(1:TAutoCompleteRequest autoCompleteRequest)throws (1:TAccountSearchException e1, 2: TSizeExceededException e2, 3: Error e3);
    list<TAccountVersionResponse> getAccountHistory(1: string accountCode) throws (1: TAccountHistoryException e1);
    bool checkIsD2t(1: string accountCode) throws (1: TNoAccountException e1, 2: TAccountSearchException e2);
}

service BillingAddressManagement{
    TGetBillingAddressesResponse getBillingAddressesOfAccount(1: string accountCode, 2: i32 page, 3: i32 perPage) throws (1: TNoBillingAddressException e1, 2: TBillingAddressSearchException e2, 3: TNoAccountException e3);
    TBillingAddressResponse addBillingAddressesToAccount(1: list<TCreateBillingAddressRequest> createBillingAddressRequests, 2: string accountCode) throws (1: TBillingAddressCreationException e1, 2: TBillingAddressDataValidationException e2, 3: TJsonParseException e3);
    TBillingAddressResponse deleteBillingAddressesOfAccount(1: list<string> billingIds, 2: string accountCode) throws (1: TBillingAddressResponseDeleteException e1, 2: TNoBillingAddressException e2,3: TAlreadyDeletedException e3);
    TBillingAddressResponse updateBillingAddress(1: TUpdateBillingAddressRequest updateBillingAddressRequest) throws (1: TBillingAddressUpdateException e1, 2: TAlreadyDeletedException e2, 3: TNoBillingAddressException e3, 4: TBillingAddressDataValidationException e4, 5: TJsonParseException e5);
}