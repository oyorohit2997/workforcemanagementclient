namespace java com.oyo.metadata

typedef string TimeZone	// Eg. "GMT+05:30"
typedef string MetadataId

enum TStatus {
	SUCCESS,
	FAILURE
}

enum TMetadataStatus {
	ACTIVE,
	IN_ACTIVE
}

enum TQueryPackageDestinations {
	ACTIVE_DESTINATIONS = 1,
	IN_ACTIVE_DESTINATIONS = 2,
	BOTH_ACTIVE_AND_IN_ACTIVE_DESTINATIONS = 3,
}

struct TPackageDestination {
	1: string id,
	2: string name,
	3: string category,
	4: TMetadataStatus status
}

//struct TPackageCity {
//	1: string id,
//	2: string name
//}
struct TCity {
	1: string id,
	2: string name,
	3: string stateName,
	4: bool isPackageSearchableCity,
	5: bool isMiceSearchableCity,
	6: string country
}

struct TState {
	1: string id,
	2: string name,
	3: string countryName,
	4: bool isPackageSearchableState,
	5: bool isMiceSearchableState
}

struct TCountry {
	1: string id,
	2: string name,
	3: bool isPackageSearchableCountry,
    4: bool isMiceSearchableCountry,
    5: string countryCode
}

struct TPackageDuration {
	1: string id,
	2: string displayName,
	3: i32 minNumberOfDays,
	4: i32 maxNumberOfDays,
	5: i32 sequence
}

struct TMonth {
	1: string id,
	2: string name,
	3: string acronym,
	4: i32 sequence
}

struct TPackageInclusion {
	1: string id,
	2: string name
}

//struct TPackageExclusion {
//	1: string id,
//	2: string name
//}

struct TRestriction {
	1: string id,
	2: string name
}

struct TAmenity {
	1: string id,
	2: string name
}

struct TPackageTag {
	1: string id,
	2: string name
}

struct THotelCategory {
	1: string id,
	2: string name
}

struct TRoomCategory {
	1: string id,
	2: string name
}

struct TMiceTag {
	1: string id,
	2: string name
}

struct TMiceEvent {
	1: string id,
	2: string name,
	3: i32 sequence
}

struct TMiceDestination {
	1: string id,
	2: string name
}

struct TPropertyLevel {
	1: string id,
	2: string name
}

struct TPaymentPolicy {
	1: string id,
	2: string description,
	3: map<string,string> policyRule
}

struct TCancellationPolicy {
	1: string id,
	2: string description,
	3: map<string,string> policyRule
}

struct TCatalogSection {
	1: string id;
	2: string sectionKey; 	// to be provided by admin and is unique for every catalogSection ex. hot_selling_packages, popular_packages, other_packages
	3: string sectionTitle;	// translatable value
	4: list<string> catalogIds;	// list of package Ids
}

//struct TOtherDestinationsToExplore {
//	1: string id;
//	2: string sectionKey; 	// to be provided by admin and is unique for every catalogSection ex. hot_selling_packages, popular_packages, other_packages
//	3: string SectionTitle;	// translatable value
//	4: list<string> catalogIds;	// list of destination Ids
//}
struct TSightseeingPoint {
	1: string id,
	2: string name,
	3: string cityName
}

struct TPickupPoint {
	1: string id;
	2: string name;
	3: string cityName;
}
struct TDropPoint {
	1: string id;
	2: string name;
}
struct TLocality {
	1: string id;
	2: string name,
	3: string cityName,
	4: bool isPackageSearchableLocality,
	5: bool isMiceSearchableLocality
}
struct TVenuePolicy {
	1: string id;
	2: string name;
	3: string description;
}
// Veg,NonVeg,Jain,Vegan
struct TFoodType {
	1: string id,
	2: string name;
}
// Salad, soup
struct TFoodCategory {
	1: string id,
	2: string name;
}
struct TPaxRange {
	1: string id,
	2: string displayName,
	3: i32 minNumberOfPax,
	4: i32 maxNumberOfPax,
	5: i32 sequence
}

struct TPackageCategoryGETResponse {
    1: required MetadataId id;
    2: required string name;
    3: string description;
}
struct TPackageCategoryCreateRequest{
	1: required string name;
	2: string description;
}
struct TPackageCategoryUpdateRequest{
    1: required string metadataId;
    2: string name;
    3: string description;
}
struct TMealPlanGETReponse {
	1: required MetadataId id;
	2: required string name;
	3: string acronym;
}
struct TMealPlanCreateRequest {
    1: required string name;
    2: string acronym;
}
struct TMealPlanUpdateRequest{
    1: required MetadataId id;
    2: string name;
    3: string acronym;
}

// GET Package Destination response
struct TPackageDestinationResponse {
	1: TPackageDestination packageDestination,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageDestinationCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Package City response
//struct TPackageCityResponse {
//	1: TPackageCity packageCity,
//	2: TStatus status,
//	3: map<string, string> errorList
//}
//struct TPackageCityCUDResponse {
//	1: string metadataId,
//	2: TStatus status,
//	3: map<string, string> errorList
//}

// GET City response
struct TCityResponse {
	1: TCity city,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TCityCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
// GET State response
struct TStateResponse {
	1: TState state,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TStateCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Country response
struct TCountryResponse {
	1: TCountry country,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TCountryCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TPackageDurationResponse {
	1: TPackageDuration packageDuration,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageDurationCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TMonthResponse {
	1: TMonth month,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TMonthCUDResponse {
    1: string metadataId,
    2: TStatus status,
    3: map<string, string> errorList
}

// GET Package Inclusion response
struct TPackageInclusionResponse {
	1: TPackageInclusion packageInclusion,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageInclusionCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Package Exclusion response
//struct TPackageExclusionResponse {
//	1: TPackageExclusion packageExclusion,
//	2: TStatus status,
//	3: map<string, string> errorList
//}
//struct TPackageExclusionCUDResponse {
//	1: string metadataId,
//	2: TStatus status,
//	3: map<string, string> errorList
//}

// GET Restriction response
struct TRestrictionResponse {
	1: TRestriction restriction,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TRestrictionCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Amenity response
struct TAmenityResponse {
	1: TAmenity amenity,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TAmenityCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Hotel Category response
struct THotelCategoryResponse {
	1: THotelCategory hotelCategory,
	2: TStatus status,
	3: map<string, string> errorList
}
struct THotelCategoryCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Room Category response
struct TRoomCategoryResponse {
	1: TRoomCategory roomCategory,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TRoomCategoryCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Tags response
struct TPackageTagResponse {
	1: TPackageTag packageTag,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageTagCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TMiceTagResponse {
	1: TMiceTag miceTag,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TMiceTagCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Mice Event response
struct TMiceEventResponse {
	1: TMiceEvent eventType,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TMiceEventCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
// GET Mice Destination response
struct TMiceDestinationResponse {
	1: TMiceDestination miceDestination,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TMiceDestinationCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Level response
struct TPropertyLevelResponse {
	1: TPropertyLevel propertyLevel,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPropertyLevelCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET policy response
struct TPaymentPolicyResponse {
	1: TPaymentPolicy paymentPolicy,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPaymentPolicyCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TCancellationPolicyResponse {
	1: TCancellationPolicy cancellationPolicy,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TCancellationPolicyCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TCatalogSectionResponse {
	1: TCatalogSection catalogSection,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TCatalogSectionCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

//struct TOtherDestinationToExplore {
//	1: string id;
//	2: string catalogId;
//}
//struct TOtherDestinationToExploreResponse {
//	1: TOtherDestinationToExplore otherDestination,
//	2: TStatus status,
//	3: map<string, string> errorList
//}
struct TSightseeingPointResponse {
	1: TSightseeingPoint sightseeingPoint,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TSightseeingPointCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPickupPointResponse {
	1: TPickupPoint pickupPoint,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPickupPointCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TDropPointResponse {
	1: TDropPoint dropPoint,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TDropPointCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TLocalityResponse {
	1: TLocality locality,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TLocalityCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TVenuePolicyResponse {
	1: TVenuePolicy venuePolicy,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TVenuePolicyCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TFoodTypeResponse {
	1: TFoodType foodType,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TFoodTypeCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TFoodCategoryResponse {
	1: TFoodCategory foodCategory,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TFoodCategoryCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPaxRangeResponse {
	1: TPaxRange paxRange,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPaxRangeCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TDeleteMetadataResponse{
    1: TStatus status,
    2: map<string, string> errorList
}


struct TCabCategoryDetails{
    1: string categoryName,
    2: i32 sittingCapacity
}

struct TCabCategoryMetadataInfo{
    1: string id,
    2: TCabCategoryDetails cabCategoryDetails
}

struct TCabCategoryGETResponse{
    1: TCabCategoryMetadataInfo cabCategoryMetadataInfo,
    2: TStatus status,
    3: map<string, string> errorList
}

struct TCabCategoryCUDResponse{
    1: string metadataId,
    2: TStatus status,
    3: map<string, string> errorList
}

struct TSpecificationCreateRequest {
	1: required string displayName;
	2: required string locale;
}

struct TSpecificationUpdateRequest {
	1: required string metadataId;
	2: required string displayName;
	3: required string locale;
}

struct TSpecificationGETRequest {
	1: required string metadataId;
	2: string displayName;
	3: required string locale;
}

struct TSpecificationCUDResponse {
	1: required string metadataId;
}

struct TSpecificationGETResponse {
	1: required string metadataId;
	2: required string displayName;
}

struct TAiportCreateRequest {
	1: required string airportCode;
	2: required string airportName;
	3: required TimeZone timeZone;
	4: required string locale;
}
struct TAiportUpdateRequest {
	1: required string metadataId;
	2: required string airportCode;	// not editable
	3: required string airportName;
	4: required TimeZone timeZone;
	5: required string locale;
}
struct TAiportGetRequest {
	1: required string airportCode;
	2: required string locale;
}
struct TAiportCUDResponse {
	1: required string metadataId;
}
struct TAiportGETResponse {
	1: required string metadataId;
	2: required string airportCode;
	3: string airportName;
	4: TimeZone timeZone;	// GMT
}

exception TItemNotFoundException {
  1: i32 errorCode = 404,
  2: string message;
}

exception TInternalServerException {
  1: i32 errorCode = 500,
  2: string message;
}

exception TDBInternalException{
  1: i32 errorCode = 504,
  2: string message;
}

exception TBadRequestException{
  1: i32 errorCode = 400,
  2: string message;
}

service TMetaDataService{

	// GET operation
	TPackageDestinationResponse getPackageDestination(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	// LIST operation
	list<TPackageDestinationResponse> listPackageDestinations(1: string locale, 2: optional TQueryPackageDestinations queryDestinations)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);

	// 	CREATE operation
	TPackageDestinationCUDResponse createPackageDestination(1: string packageDestinationName, 2: string category, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException, 3:TBadRequestException badRequestException);
	TPackageDestinationCUDResponse updatePackageDestination(1:string metadataId, 2:string packageDestinationName, 3:string category, 4:string locale, 5:TMetadataStatus status)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//	TDeleteMetadataResponse deletePackageDestination(1:string metadataId)
//throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

//	TPackageCityResponse getPackageCity(1: string metadataId, 2: string locale);
//	list<TPackageCityResponse> listPackageCities(1: string locale);
//	TPackageCityCUDResponse createPackageCity(1: string city, 2: string locale);

	TCityResponse getCity(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TCityResponse> listCities(1: string locale, 2: bool getPakageCities, 3: bool getMiceCities)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TCityCUDResponse createCity(1: string city, 2: string locale, 3:string stateMetadataId, 4: bool isPackageCity, 5: bool isMiceCity)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException, 3:TBadRequestException badRequestException);
	list<TCityResponse> batchGetCities(1: list<string> metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
    TCityCUDResponse updateCity( 1: string metadataId , 2: string city, 3: string locale, 4:string stateMetadataId, 5: bool isPackageCity, 6: bool isMiceCity)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TStateResponse getState(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TStateResponse> listStates(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TStateCUDResponse createState(1: string state, 2: string locale, 3:string countryMetadataId, 4: bool isPackageState, 5: bool isMiceState)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException, 3:TBadRequestException badRequestException);
	TStateCUDResponse updateState(1: string metadataId , 2:string state, 3: string locale, 4:string countryMetadataId, 5: bool isPackageState, 6: bool isMiceState)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TCountryResponse getCountry(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TCountryResponse> listCountries(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TCountryCUDResponse createCountry(1: string country, 2: string locale, 3:bool isPackageCountry, 4:bool isMiceCountry, 5:string countryCode)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException,3:TBadRequestException badRequestException);
	TCountryCUDResponse updateCountry(1: string metadataId, 2: string country, 3: string locale, 4:bool isPackageCountry, 5:bool isMiceCountry)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TPackageDurationResponse getPackageDuration(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TPackageDurationResponse> listPackageDurations(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPackageDurationCUDResponse createPackageDuration(1: string packageDurationDisplayName, 2: i32 minNumberOfDays, 3: i32 maxNumberOfDays, 4: string locale, 5: i32 sequence)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPackageDurationCUDResponse updatePackageDuration(1: string metadataId, 2: string packageDurationDisplayName, 3: i32 minNumberOfDays, 4: i32 maxNumberOfDays, 5: string locale, 6: i32 sequence)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TMonthResponse getMonth(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TMonthResponse> listMonths(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TMonthResponse> batchGetMonths(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TMonthCUDResponse updateMonth(1: string metadataId, 2: string monthName, 3: string acronym, 4: string locale, 5:i32 sequence)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	// Update month with locale
	//bool saveMonth(1: TMonth month);

	TPackageInclusionResponse getPackageInclusion(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TPackageInclusionResponse> listPackageInclusions(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPackageInclusionCUDResponse createPackageInclusion(1: string inclusion, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TPackageInclusionResponse> batchGetPackageInclusions(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TPackageInclusionCUDResponse updatePackageInclusion(1:string metadataId, 2: string inclusion, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

//	TPackageExclusionResponse getPackageExclusion(1: string metadataId, 2: string locale);
//	list<TPackageExclusionResponse> listPackageExclusions(1: string locale);
//	TPackageExclusionCUDResponse createPackageExclusion(1: string exclusion, 2: string locale);


	TRestrictionResponse getRestriction(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TRestrictionResponse> listRestrictions(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TRestrictionCUDResponse createRestriction(1: string restriction, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TRestrictionCUDResponse updateRestriction(1: string metadataId, 2: string restriction, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TAmenityResponse getAmenity(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TAmenityResponse> listAmenities(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TAmenityCUDResponse createAmenity(1: string amenity, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TAmenityResponse> batchGetAmenities(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TAmenityCUDResponse updateAmenity(1:string metadataId, 2: string amenity, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TPackageTagResponse getPackageTag(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TPackageTagResponse> listPackageTags(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPackageTagCUDResponse createPackageTag(1: string packageTag, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TPackageTagResponse> batchGetPackageTags(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TPackageTagCUDResponse updatePackageTag(1: string metadataId, 2: string packageTag, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	THotelCategoryResponse getHotelCategory(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<THotelCategoryResponse> listHotelCategories(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	THotelCategoryCUDResponse createHotelCategory(1: string hotelCategory, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	THotelCategoryCUDResponse updateHotelCategory(1: string metadataId , 2: string hotelCategory, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TRoomCategoryResponse getRoomCategory(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TRoomCategoryResponse> listRoomCategories(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TRoomCategoryCUDResponse createRoomCategory(1: string roomCategory, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TRoomCategoryCUDResponse updateRoomCategory(1:string metadataId , 2: string roomCategory, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TMiceTagResponse getMiceTag(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TMiceTagResponse> listMiceTags(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TMiceTagCUDResponse createMiceTag(1: string miceTag, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TMiceTagResponse> batchGetMiceTags(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TMiceTagCUDResponse updateMiceTag(1:string metadataId , 2: string miceTag, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TMiceEventResponse getMiceEvent(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TMiceEventResponse> listMiceEvents(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TMiceEventCUDResponse createMiceEvent(1: string miceEventName, 2: string locale, 3: i32 sequence)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TMiceEventResponse> batchGetMiceEvents(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TMiceEventCUDResponse updateMiceEvent(1: string metadataId, 2: string miceEventName, 3: string locale , 4: i32 sequence)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);


	TMiceDestinationResponse getMiceDestination(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TMiceDestinationResponse> listMiceDestinations(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TMiceDestinationCUDResponse createMiceDestination(1: string miceDestinationName, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TMiceDestinationCUDResponse updateMiceDestination(1: string metadataId, 2: string miceDestinationName, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);


	TPropertyLevelResponse getPropertyLevel(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TPropertyLevelResponse> listPropertyLevel(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPropertyLevelCUDResponse createPropertyLevel(1: string propertyLevel, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPropertyLevelCUDResponse updatePropertyLevel(1: string metadataId, 2: string propertyLevel, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	// Policy APIs

	TPaymentPolicyResponse getPaymentPolicy(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TPaymentPolicyResponse> listPaymentPolicies(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPaymentPolicyCUDResponse createPaymentPolicy(1: string description, 2: map<string,string> rule, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPaymentPolicyCUDResponse updatePaymentPolicy(1: string metadataId, 2: string description, 3: map<string,string> rule, 4: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TCancellationPolicyResponse getCancellationPolicy(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TCancellationPolicyResponse> listCancellationPolicies(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TCancellationPolicyCUDResponse createCancellationPolicy(1: string description, 2: map<string,string> rule, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TCancellationPolicyCUDResponse updateCancellationPolicy(1:string metadataId, 2: string description, 3: map<string,string> rule, 4: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
 	// Catalog collection APIs

	list<TCatalogSectionResponse> listCatalogSections(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TCatalogSectionResponse getCatalogSection(1: string sectionKey, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TCatalogSectionCUDResponse createCatalogSection(1: string sectionKey, 2: string sectionTitle, 3: list<string> catalogIds, 4: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TCatalogSectionCUDResponse updateCatalogSection( 1: string sectionKey, 2: string sectionTitle, 3: list<string> catalogIds, 4: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

//	list<TOtherDestinationToExploreResponse> listOtherDestinationsToExplore(1: string locale);
//	TOtherDestinationToExploreResponse createOtherDestinationToExplore(1: string catalogId, 2: string locale);

	TSightseeingPointResponse getSightSeeingPoint(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TSightseeingPointCUDResponse createSightseeingPoint(1: string sightseeingPoint, 2:string cityMetadataId, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TSightseeingPointResponse> listSightseeingPoints(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TSightseeingPointCUDResponse updateSightseeingPoint(1: string metadataId, 2: string sightseeingPoint, 3:string cityMetadataId, 4: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TPickupPointResponse getPickupPoint(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TPickupPointCUDResponse createPickupPoint(1: string pickupPoint, 2:string cityMetadataId, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TPickupPointResponse> listPickupPoints(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPickupPointCUDResponse updatePickupPoint(1: string metadataId, 2: string pickupPoint, 3:string cityMetadataId, 4: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TLocalityResponse getLocality(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TLocalityResponse> listLocalities(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TLocalityCUDResponse createLocality(1: string locality, 2: string locale, 3:string cityMetadataId, 4: bool isPackageCity, 5: bool isMiceCity)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TLocalityCUDResponse updateLocality(1: string metadataId, 2: string locality, 3: string locale, 4:string cityMetadataId, 5: bool isPackageCity, 6: bool isMiceCity)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TVenuePolicyResponse getVenuePolicy(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TVenuePolicyResponse> listVenuePolicies(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TVenuePolicyCUDResponse createVenuePolicy(1: string venuePolicyTitle, 2: string venuePolicyDescription, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TVenuePolicyResponse> batchGetVenuePolicies(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TVenuePolicyCUDResponse updateVenuePolicy(1: string metadataId, 2: string venuePolicyTitle, 3: string venuePolicyDescription, 4: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TFoodTypeResponse getFoodType(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TFoodTypeResponse> listFoodTypes(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TFoodTypeCUDResponse createFoodType(1: string foodType, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TFoodTypeCUDResponse updateFoodType(1:string metadataId ,2: string foodType, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TFoodCategoryResponse getFoodCategory(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TFoodCategoryResponse> listFoodCategories(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TFoodCategoryCUDResponse createFoodCategory(1: string foodCategory, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TFoodCategoryResponse> batchGetFoodCategories(1: list<string> metadataIds, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TFoodCategoryCUDResponse updateFoodCategory(1:string metadataId ,2: string foodCategory, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TPaxRangeResponse getPaxRange(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TPaxRangeResponse> listPaxRanges(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPaxRangeCUDResponse createPaxRange(1: string paxRangeDisplayName, 2: i32 minNumberOfPax, 3: i32 maxNumberOfPax, 4: string locale, 5:i32 sequence)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TPaxRangeCUDResponse updatePaxRange(1: string metadataId, 2: string paxRangeDisplayName, 3: i32 minNumberOfPax, 4: i32 maxNumberOfPax, 5: string locale, 6:i32 sequence)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);


    TCabCategoryGETResponse getCabCategory(1: string metadataId, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
    list<TCabCategoryGETResponse> listCabCategories(1: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
    TCabCategoryCUDResponse createCabCategory(1: TCabCategoryDetails cabCategoryDetails, 2: string locale)
throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
    TCabCategoryCUDResponse updateCabCategory(1: string metadataId, 2: TCabCategoryDetails cabCategoryDetails, 3: string locale)
throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

	TPackageCategoryGETResponse getPackageCategory (1: string metadataId , 2: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	MetadataId createPackageCategory (1: TPackageCategoryCreateRequest packageCategoryCreateRequest 2: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	MetadataId updatePackageCategory (1: TPackageCategoryUpdateRequest packageCategoryUpdateRequest 2: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TPackageCategoryGETResponse> listPackageCategories(1: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);

	TMealPlanGETReponse getMealPlan(1: string metadataId , 2: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	MetadataId createMealPlan (1:TMealPlanCreateRequest mealPlanCreateRequest 2: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	MetadataId updateMealPlan (1: TMealPlanUpdateRequest mealPlanUpdateRequest 2: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TMealPlanGETReponse> listMealPlans(1: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);

	TAiportGETResponse getAirportDetails(1: TAiportGetRequest airportGetRequest)
        throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	list<TAiportGETResponse> listAirports(1: string locale)
        throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TAiportCUDResponse createAirport(1: TAiportCreateRequest airportDetails)
        throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException, 3:TBadRequestException badRequestException);
    TAiportCUDResponse updateAirportDetails(1: TAiportUpdateRequest airportUpdateRequest)
        throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);


    TSpecificationGETResponse getSpecification(1: TSpecificationGETRequest specificationGetRequest)
        throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
    TSpecificationGETResponse getSpecificationWithName(1: TSpecificationGETRequest specificationGetRequest)
        throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException);
	list<TSpecificationGETResponse> listSpecifications(1: TSpecificationGETRequest specificationGetRequest)
	    throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	TSpecificationCUDResponse createSpecification(1: TSpecificationCreateRequest specificationCreateRequest)
	    throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TSpecificationGETResponse> batchGetSpecifications(1: list<TSpecificationGETRequest> specificationGetRequestList)
	    throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
	TSpecificationCUDResponse updateSpecification(1: TSpecificationUpdateRequest specificationUpdateRequest)
	    throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
}