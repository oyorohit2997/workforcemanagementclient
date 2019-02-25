namespace java com.oyo.platform.mmdata


struct TMicroMarket {
  1: string id
  2: TMicroMarketDetails mmDetails
}


struct TMicroMarketDetails {
  1: string city
  2: string name
  3: string mmId
  4: i64 createdAt
  5: i64 updatedAt
  6: string walletId
  7: list<string> emails
  8: string sybType
  9: bool active
  10: bool sapSync
}


service TMMDataService{

   string createMM(1:TMicroMarketDetails microMarketDetails);

   string createMicroMarket(1:TMicroMarket microMarket);

   TMicroMarket getMicroMarketInfo(1:string mmId);

   bool associateEmployeeToMM(string userProfileId, string role, string mmId);

   list<string> getUsers(string mmId, list<string> role);

   TMicroMarket getMicroMarket(string userProfileId);

   string getMicroMarketId(string userProfileId);

   bool removeEmployeeFromMM(string userProfileId, string role, string mmId);

   list<TMicroMarket> findByName(string name);

   list<TMicroMarket> findById(string mmId);
}


