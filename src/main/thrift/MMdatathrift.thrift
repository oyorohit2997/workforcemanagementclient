namespace java com.oyo.platform.orgdata


struct TMicroMarket {
  1: string id
  2: TMicroMarketDetails mmDetails
}

enum TOrgType {
   MICROMARKET,
   HUB,
   ZONE,
   COUNTRY,
   CITY
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

service TOrgDataService{

   TMicroMarket getMMOrgInfo(string mmId);

   bool associateEmployeeToOrg(string userProfileId, string role, string id, TOrgType orgType);

   list<string> getUsers(string id, list<string> role, TOrgType orgType);

   TMicroMarket getMicroMarket(string userProfileId);

   string getOrgId(string userProfileId, TOrgType orgType);

   bool removeEmployeeFromOrg(string userProfileId, string role, string id, TOrgType orgType);

   list<TMicroMarket> findMMByName(string name);

   list<TMicroMarket> findMMById(string mmId);

   string getParent(string id, TOrgType orgType, TOrgType parentOrgType);
}



