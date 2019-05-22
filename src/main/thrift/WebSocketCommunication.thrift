namespace java com.oyo.mm

/* Time stamp format yyyy-MM-dd'T'HH:mm:ss'Z'*/
typedef string Timestamp
typedef string NotificationId

enum TNotificationStatus {
  SEEN,
  UN_SEEN
}
struct TNotification {
   1: required string userProfileId;
   2: required string messageContent;
   3: string type;
   4: string infoLink;
   5: optional string clientType
}

exception TDBServiceError {
    1: string message;
}

exception TCreateRequestFailed {
    1: string message;
}

/* Services endpoints*/
service TNotificationService {
    NotificationId createNotification(1:TNotification tNotification) throws (1: TCreateRequestFailed e1, 2: TDBServiceError e2);
}