/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.workforce;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-19")
public class TWorkLoadAddRequest implements org.apache.thrift.TBase<TWorkLoadAddRequest, TWorkLoadAddRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TWorkLoadAddRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TWorkLoadAddRequest");

  private static final org.apache.thrift.protocol.TField USER_PROFILE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userProfileId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField EPOCH_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("epochTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_ASSIGNED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastAssignedTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField LOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("load", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField BUSINESS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("businessId", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TWorkLoadAddRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TWorkLoadAddRequestTupleSchemeFactory();

  private long userProfileId; // required
  private long epochTime; // required
  private long lastAssignedTime; // required
  private int load; // required
  private java.lang.String businessId; // required
  private long version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_PROFILE_ID((short)1, "userProfileId"),
    EPOCH_TIME((short)2, "epochTime"),
    LAST_ASSIGNED_TIME((short)3, "lastAssignedTime"),
    LOAD((short)4, "load"),
    BUSINESS_ID((short)5, "businessId"),
    VERSION((short)6, "version");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_PROFILE_ID
          return USER_PROFILE_ID;
        case 2: // EPOCH_TIME
          return EPOCH_TIME;
        case 3: // LAST_ASSIGNED_TIME
          return LAST_ASSIGNED_TIME;
        case 4: // LOAD
          return LOAD;
        case 5: // BUSINESS_ID
          return BUSINESS_ID;
        case 6: // VERSION
          return VERSION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USERPROFILEID_ISSET_ID = 0;
  private static final int __EPOCHTIME_ISSET_ID = 1;
  private static final int __LASTASSIGNEDTIME_ISSET_ID = 2;
  private static final int __LOAD_ISSET_ID = 3;
  private static final int __VERSION_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_PROFILE_ID, new org.apache.thrift.meta_data.FieldMetaData("userProfileId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EPOCH_TIME, new org.apache.thrift.meta_data.FieldMetaData("epochTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTime")));
    tmpMap.put(_Fields.LAST_ASSIGNED_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastAssignedTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTime")));
    tmpMap.put(_Fields.LOAD, new org.apache.thrift.meta_data.FieldMetaData("load", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BUSINESS_ID, new org.apache.thrift.meta_data.FieldMetaData("businessId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TWorkLoadAddRequest.class, metaDataMap);
  }

  public TWorkLoadAddRequest() {
  }

  public TWorkLoadAddRequest(
    long userProfileId,
    long epochTime,
    long lastAssignedTime,
    int load,
    java.lang.String businessId,
    long version)
  {
    this();
    this.userProfileId = userProfileId;
    setUserProfileIdIsSet(true);
    this.epochTime = epochTime;
    setEpochTimeIsSet(true);
    this.lastAssignedTime = lastAssignedTime;
    setLastAssignedTimeIsSet(true);
    this.load = load;
    setLoadIsSet(true);
    this.businessId = businessId;
    this.version = version;
    setVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TWorkLoadAddRequest(TWorkLoadAddRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userProfileId = other.userProfileId;
    this.epochTime = other.epochTime;
    this.lastAssignedTime = other.lastAssignedTime;
    this.load = other.load;
    if (other.isSetBusinessId()) {
      this.businessId = other.businessId;
    }
    this.version = other.version;
  }

  public TWorkLoadAddRequest deepCopy() {
    return new TWorkLoadAddRequest(this);
  }

  @Override
  public void clear() {
    setUserProfileIdIsSet(false);
    this.userProfileId = 0;
    setEpochTimeIsSet(false);
    this.epochTime = 0;
    setLastAssignedTimeIsSet(false);
    this.lastAssignedTime = 0;
    setLoadIsSet(false);
    this.load = 0;
    this.businessId = null;
    setVersionIsSet(false);
    this.version = 0;
  }

  public long getUserProfileId() {
    return this.userProfileId;
  }

  public void setUserProfileId(long userProfileId) {
    this.userProfileId = userProfileId;
    setUserProfileIdIsSet(true);
  }

  public void unsetUserProfileId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERPROFILEID_ISSET_ID);
  }

  /** Returns true if field userProfileId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserProfileId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERPROFILEID_ISSET_ID);
  }

  public void setUserProfileIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERPROFILEID_ISSET_ID, value);
  }

  public long getEpochTime() {
    return this.epochTime;
  }

  public void setEpochTime(long epochTime) {
    this.epochTime = epochTime;
    setEpochTimeIsSet(true);
  }

  public void unsetEpochTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EPOCHTIME_ISSET_ID);
  }

  /** Returns true if field epochTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEpochTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EPOCHTIME_ISSET_ID);
  }

  public void setEpochTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EPOCHTIME_ISSET_ID, value);
  }

  public long getLastAssignedTime() {
    return this.lastAssignedTime;
  }

  public void setLastAssignedTime(long lastAssignedTime) {
    this.lastAssignedTime = lastAssignedTime;
    setLastAssignedTimeIsSet(true);
  }

  public void unsetLastAssignedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTASSIGNEDTIME_ISSET_ID);
  }

  /** Returns true if field lastAssignedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastAssignedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTASSIGNEDTIME_ISSET_ID);
  }

  public void setLastAssignedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTASSIGNEDTIME_ISSET_ID, value);
  }

  public int getLoad() {
    return this.load;
  }

  public void setLoad(int load) {
    this.load = load;
    setLoadIsSet(true);
  }

  public void unsetLoad() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOAD_ISSET_ID);
  }

  /** Returns true if field load is set (has been assigned a value) and false otherwise */
  public boolean isSetLoad() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOAD_ISSET_ID);
  }

  public void setLoadIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOAD_ISSET_ID, value);
  }

  public java.lang.String getBusinessId() {
    return this.businessId;
  }

  public void setBusinessId(java.lang.String businessId) {
    this.businessId = businessId;
  }

  public void unsetBusinessId() {
    this.businessId = null;
  }

  /** Returns true if field businessId is set (has been assigned a value) and false otherwise */
  public boolean isSetBusinessId() {
    return this.businessId != null;
  }

  public void setBusinessIdIsSet(boolean value) {
    if (!value) {
      this.businessId = null;
    }
  }

  public long getVersion() {
    return this.version;
  }

  public void setVersion(long version) {
    this.version = version;
    setVersionIsSet(true);
  }

  public void unsetVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_PROFILE_ID:
      if (value == null) {
        unsetUserProfileId();
      } else {
        setUserProfileId((java.lang.Long)value);
      }
      break;

    case EPOCH_TIME:
      if (value == null) {
        unsetEpochTime();
      } else {
        setEpochTime((java.lang.Long)value);
      }
      break;

    case LAST_ASSIGNED_TIME:
      if (value == null) {
        unsetLastAssignedTime();
      } else {
        setLastAssignedTime((java.lang.Long)value);
      }
      break;

    case LOAD:
      if (value == null) {
        unsetLoad();
      } else {
        setLoad((java.lang.Integer)value);
      }
      break;

    case BUSINESS_ID:
      if (value == null) {
        unsetBusinessId();
      } else {
        setBusinessId((java.lang.String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_PROFILE_ID:
      return getUserProfileId();

    case EPOCH_TIME:
      return getEpochTime();

    case LAST_ASSIGNED_TIME:
      return getLastAssignedTime();

    case LOAD:
      return getLoad();

    case BUSINESS_ID:
      return getBusinessId();

    case VERSION:
      return getVersion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_PROFILE_ID:
      return isSetUserProfileId();
    case EPOCH_TIME:
      return isSetEpochTime();
    case LAST_ASSIGNED_TIME:
      return isSetLastAssignedTime();
    case LOAD:
      return isSetLoad();
    case BUSINESS_ID:
      return isSetBusinessId();
    case VERSION:
      return isSetVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TWorkLoadAddRequest)
      return this.equals((TWorkLoadAddRequest)that);
    return false;
  }

  public boolean equals(TWorkLoadAddRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userProfileId = true;
    boolean that_present_userProfileId = true;
    if (this_present_userProfileId || that_present_userProfileId) {
      if (!(this_present_userProfileId && that_present_userProfileId))
        return false;
      if (this.userProfileId != that.userProfileId)
        return false;
    }

    boolean this_present_epochTime = true;
    boolean that_present_epochTime = true;
    if (this_present_epochTime || that_present_epochTime) {
      if (!(this_present_epochTime && that_present_epochTime))
        return false;
      if (this.epochTime != that.epochTime)
        return false;
    }

    boolean this_present_lastAssignedTime = true;
    boolean that_present_lastAssignedTime = true;
    if (this_present_lastAssignedTime || that_present_lastAssignedTime) {
      if (!(this_present_lastAssignedTime && that_present_lastAssignedTime))
        return false;
      if (this.lastAssignedTime != that.lastAssignedTime)
        return false;
    }

    boolean this_present_load = true;
    boolean that_present_load = true;
    if (this_present_load || that_present_load) {
      if (!(this_present_load && that_present_load))
        return false;
      if (this.load != that.load)
        return false;
    }

    boolean this_present_businessId = true && this.isSetBusinessId();
    boolean that_present_businessId = true && that.isSetBusinessId();
    if (this_present_businessId || that_present_businessId) {
      if (!(this_present_businessId && that_present_businessId))
        return false;
      if (!this.businessId.equals(that.businessId))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(userProfileId);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(epochTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastAssignedTime);

    hashCode = hashCode * 8191 + load;

    hashCode = hashCode * 8191 + ((isSetBusinessId()) ? 131071 : 524287);
    if (isSetBusinessId())
      hashCode = hashCode * 8191 + businessId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(version);

    return hashCode;
  }

  @Override
  public int compareTo(TWorkLoadAddRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserProfileId()).compareTo(other.isSetUserProfileId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserProfileId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userProfileId, other.userProfileId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEpochTime()).compareTo(other.isSetEpochTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEpochTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.epochTime, other.epochTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastAssignedTime()).compareTo(other.isSetLastAssignedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastAssignedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastAssignedTime, other.lastAssignedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLoad()).compareTo(other.isSetLoad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.load, other.load);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBusinessId()).compareTo(other.isSetBusinessId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.businessId, other.businessId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TWorkLoadAddRequest(");
    boolean first = true;

    sb.append("userProfileId:");
    sb.append(this.userProfileId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("epochTime:");
    sb.append(this.epochTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastAssignedTime:");
    sb.append(this.lastAssignedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("load:");
    sb.append(this.load);
    first = false;
    if (!first) sb.append(", ");
    sb.append("businessId:");
    if (this.businessId == null) {
      sb.append("null");
    } else {
      sb.append(this.businessId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetUserProfileId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userProfileId' is unset! Struct:" + toString());
    }

    if (!isSetEpochTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'epochTime' is unset! Struct:" + toString());
    }

    if (!isSetLastAssignedTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'lastAssignedTime' is unset! Struct:" + toString());
    }

    if (!isSetLoad()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'load' is unset! Struct:" + toString());
    }

    if (!isSetBusinessId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'businessId' is unset! Struct:" + toString());
    }

    if (!isSetVersion()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TWorkLoadAddRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TWorkLoadAddRequestStandardScheme getScheme() {
      return new TWorkLoadAddRequestStandardScheme();
    }
  }

  private static class TWorkLoadAddRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TWorkLoadAddRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TWorkLoadAddRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_PROFILE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userProfileId = iprot.readI64();
              struct.setUserProfileIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EPOCH_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.epochTime = iprot.readI64();
              struct.setEpochTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_ASSIGNED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastAssignedTime = iprot.readI64();
              struct.setLastAssignedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.load = iprot.readI32();
              struct.setLoadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BUSINESS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.businessId = iprot.readString();
              struct.setBusinessIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TWorkLoadAddRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_PROFILE_ID_FIELD_DESC);
      oprot.writeI64(struct.userProfileId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EPOCH_TIME_FIELD_DESC);
      oprot.writeI64(struct.epochTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_ASSIGNED_TIME_FIELD_DESC);
      oprot.writeI64(struct.lastAssignedTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOAD_FIELD_DESC);
      oprot.writeI32(struct.load);
      oprot.writeFieldEnd();
      if (struct.businessId != null) {
        oprot.writeFieldBegin(BUSINESS_ID_FIELD_DESC);
        oprot.writeString(struct.businessId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI64(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TWorkLoadAddRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TWorkLoadAddRequestTupleScheme getScheme() {
      return new TWorkLoadAddRequestTupleScheme();
    }
  }

  private static class TWorkLoadAddRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TWorkLoadAddRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TWorkLoadAddRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.userProfileId);
      oprot.writeI64(struct.epochTime);
      oprot.writeI64(struct.lastAssignedTime);
      oprot.writeI32(struct.load);
      oprot.writeString(struct.businessId);
      oprot.writeI64(struct.version);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TWorkLoadAddRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.userProfileId = iprot.readI64();
      struct.setUserProfileIdIsSet(true);
      struct.epochTime = iprot.readI64();
      struct.setEpochTimeIsSet(true);
      struct.lastAssignedTime = iprot.readI64();
      struct.setLastAssignedTimeIsSet(true);
      struct.load = iprot.readI32();
      struct.setLoadIsSet(true);
      struct.businessId = iprot.readString();
      struct.setBusinessIdIsSet(true);
      struct.version = iprot.readI64();
      struct.setVersionIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

