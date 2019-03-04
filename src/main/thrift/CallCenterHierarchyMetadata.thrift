namespace java com.oyo.metadata

typedef string CallCenterMetadataId

/* Requests */
struct TTeamGetRequest{
	1: required CallCenterMetadataId teamMetadataId;
	2: required string locale;
}

struct TLOBGetRequest{
	1: required CallCenterMetadataId lobMetadataId;
	2: required string locale;
}

struct TCenterGetRequest{
	1: required CallCenterMetadataId centerMetadataId;
	2: required string locale;
}

struct TBusinessGetRequest{
	1: required CallCenterMetadataId businessMetadataId;
	2: required string locale;
}

struct TTeamCreateRequest{
	1: required string teamName;
	2: required string locale;
}

struct TLOBCreateRequest{
	1: required string lobName;
	2: required string locale;
}

struct TCenterCreateRequest{
	1: required string centerName;
	2: required string locale;
}

struct TBusinessCreateRequest{
	1: required string businessName;
	2: required string locale;
}

/* Responses */
struct TTeamGetResponse{
	1: required CallCenterMetadataId teamMetadataId;
	2: required string teamName;
}

struct TLOBGetResponse{
	1: required CallCenterMetadataId lobMetadataId;
	2: required string lobName;
}

struct TCenterGetResponse{
	1: required CallCenterMetadataId centerMetadataId;
	2: required string centerName;
}

struct TBusinessGetResponse{
	1: required CallCenterMetadataId businessMetadataId;
	2: required string businessName;
}

/* Exceptions */
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

service TCallcenterHierarchyService{

	/* Get APIs */
	TTeamGetResponse getTeam(1: TTeamGetRequest teamGetRequest)
		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
 	TLOBGetResponse getLOB(1: TLOBGetRequest lobGetRequest)
    		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
    TCenterGetResponse getCenter(1: TCenterGetRequest centerGetRequest)
     		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
    TBusinessGetResponse getBusiness(1: TBusinessGetRequest businessGetRequest)
    		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

    /* List APIs */
	list<TTeamGetResponse> listTeams(1: string locale)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TLOBGetResponse> listLOBs(1: string locale)
			throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TCenterGetResponse> listCenters(1: string locale)
			throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	list<TBusinessGetResponse> listBusinesses(1: string locale)
			throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);

    /* Create APIs */
	CallCenterMetadataId createTeam(1: TTeamCreateRequest teamGetRequest)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	CallCenterMetadataId createLOB(1: TLOBCreateRequest teamGetRequest)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	CallCenterMetadataId createCenter(1: TCenterCreateRequest teamGetRequest)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);
	CallCenterMetadataId createBusiness(1: TBusinessCreateRequest teamGetRequest)
		throws (1: TInternalServerException internalServiceException, 2:TDBInternalException dbInternalException);

//    /* Update APIs */
//	TTeamGetResponse updateTeam(1: TTeamGetRequest teamGetRequest)
//		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//	TTeamGetResponse updateLOB(1: TTeamGetRequest teamGetRequest)
//			throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//	TTeamGetResponse updateCenter(1: TTeamGetRequest teamGetRequest)
//			throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//	TTeamGetResponse updateBusiness(1: TTeamGetRequest teamGetRequest)
//			throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//
//    /* Delete APIs */
//	TTeamGetResponse deleteTeam(1: TTeamGetRequest teamGetRequest)
//		throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//	TTeamGetResponse deleteLOB(1: TTeamGetRequest teamGetRequest)
//			throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//	TTeamGetResponse deleteCenter(1: TTeamGetRequest teamGetRequest)
//			throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);
//	TTeamGetResponse deleteBusiness(1: TTeamGetRequest teamGetRequest)
//			throws (1: TInternalServerException internalServiceException, 2:TItemNotFoundException itemNotFoundException, 3:TDBInternalException dbInternalException, 4:TBadRequestException badRequestException);

}