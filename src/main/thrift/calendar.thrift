namespace java com.oyo.calendar
/**
*Calendar service
 **/

 const map<string, string> T_ERROR_CODES = {
      "FIELDS_REQUIRED_NOT_PRESENT" : "101",
      "NOT_SUFFICIENT_PERMISSIONS" : "102",
      "DB_ERROR" : "103",
      "SLOTS_UNAVAILABLE" : "104",
      "INVALID DATE" : "105",
      "INTERNAL ERROR" : "100",
      "GOOGLE_API_ERROR" : "106"
}

enum Status {
  SUCCESS = 1,
  FAILED = 2
}

struct TScheduleEventRequest {
	1: required string userId;
	2: required string serviceId;
	3: required string clientReferenceId;
	4: required i64 startTime;
	5: required i64 endTime;
	6: string metaData;
	7: required string summary;
}

struct TRescheduleEventRequest {
	1: required string userId;
	2: required string serviceId;
	3: string metaData;
	4: required string summary;
	5: required string clientReferenceId;
	6: required i64 startTime;
	7: required i64 endTime;
	8: required i64 updatedStartTime;
	9: required i64 updatedEndTime;
}

struct TCheckAvailabilityRequest {
	1: required string userId;
	2: required string serviceId;
	3: required i64 startTime;
	4: required i64 endTime;
}

struct TDeleteEventRequest {
	1: required string userId;
	2: required string serviceId;
	3: required i64 eventDate;
	4: required string clientReferenceId;
}

struct TScheduleEventResponse {
	1: string calendarId
	2: string errorCode;
	3: string errorMessage;
	4: string status;
}

struct TRescheduleEventResponse {
	1: string calendarId
	2: string errorCode;
	3: string errorMessage;
	4: string status;
}

struct TCheckAvailabilityResponse {
	1: bool isAvailable;
	2: i64 blockedStartTime;
	3: i64 blockedEndTime;
	4: string errorCode;
	5: string errorMessage;
	6: string status;
}

struct TDeleteEventResponse {
	1: string errorCode;
	2: string errorMessage;
	3: string status;
}

service TCalendarService {
	TScheduleEventResponse scheduleEvent(1: TScheduleEventRequest request);
	TRescheduleEventResponse rescheduleEvent(1: TRescheduleEventRequest request);
	TCheckAvailabilityResponse checkAvailability(1: TCheckAvailabilityRequest request);
	TDeleteEventResponse deleteEvent(1: TDeleteEventRequest request);
}