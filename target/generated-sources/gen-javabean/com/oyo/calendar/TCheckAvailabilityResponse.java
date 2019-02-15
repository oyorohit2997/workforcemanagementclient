/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.calendar;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-14")
public class TCheckAvailabilityResponse implements org.apache.thrift.TBase<TCheckAvailabilityResponse, TCheckAvailabilityResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TCheckAvailabilityResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCheckAvailabilityResponse");

  private static final org.apache.thrift.protocol.TField IS_AVAILABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("isAvailable", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField BLOCKED_START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("blockedStartTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField BLOCKED_END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("blockedEndTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCheckAvailabilityResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCheckAvailabilityResponseTupleSchemeFactory();

  private boolean isAvailable; // required
  private long blockedStartTime; // required
  private long blockedEndTime; // required
  private java.lang.String errorCode; // required
  private java.lang.String errorMessage; // required
  private java.lang.String status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_AVAILABLE((short)1, "isAvailable"),
    BLOCKED_START_TIME((short)2, "blockedStartTime"),
    BLOCKED_END_TIME((short)3, "blockedEndTime"),
    ERROR_CODE((short)4, "errorCode"),
    ERROR_MESSAGE((short)5, "errorMessage"),
    STATUS((short)6, "status");

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
        case 1: // IS_AVAILABLE
          return IS_AVAILABLE;
        case 2: // BLOCKED_START_TIME
          return BLOCKED_START_TIME;
        case 3: // BLOCKED_END_TIME
          return BLOCKED_END_TIME;
        case 4: // ERROR_CODE
          return ERROR_CODE;
        case 5: // ERROR_MESSAGE
          return ERROR_MESSAGE;
        case 6: // STATUS
          return STATUS;
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
  private static final int __ISAVAILABLE_ISSET_ID = 0;
  private static final int __BLOCKEDSTARTTIME_ISSET_ID = 1;
  private static final int __BLOCKEDENDTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_AVAILABLE, new org.apache.thrift.meta_data.FieldMetaData("isAvailable", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BLOCKED_START_TIME, new org.apache.thrift.meta_data.FieldMetaData("blockedStartTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BLOCKED_END_TIME, new org.apache.thrift.meta_data.FieldMetaData("blockedEndTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCheckAvailabilityResponse.class, metaDataMap);
  }

  public TCheckAvailabilityResponse() {
  }

  public TCheckAvailabilityResponse(
    boolean isAvailable,
    long blockedStartTime,
    long blockedEndTime,
    java.lang.String errorCode,
    java.lang.String errorMessage,
    java.lang.String status)
  {
    this();
    this.isAvailable = isAvailable;
    setIsAvailableIsSet(true);
    this.blockedStartTime = blockedStartTime;
    setBlockedStartTimeIsSet(true);
    this.blockedEndTime = blockedEndTime;
    setBlockedEndTimeIsSet(true);
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCheckAvailabilityResponse(TCheckAvailabilityResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isAvailable = other.isAvailable;
    this.blockedStartTime = other.blockedStartTime;
    this.blockedEndTime = other.blockedEndTime;
    if (other.isSetErrorCode()) {
      this.errorCode = other.errorCode;
    }
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
  }

  public TCheckAvailabilityResponse deepCopy() {
    return new TCheckAvailabilityResponse(this);
  }

  @Override
  public void clear() {
    setIsAvailableIsSet(false);
    this.isAvailable = false;
    setBlockedStartTimeIsSet(false);
    this.blockedStartTime = 0;
    setBlockedEndTimeIsSet(false);
    this.blockedEndTime = 0;
    this.errorCode = null;
    this.errorMessage = null;
    this.status = null;
  }

  public boolean isIsAvailable() {
    return this.isAvailable;
  }

  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
    setIsAvailableIsSet(true);
  }

  public void unsetIsAvailable() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISAVAILABLE_ISSET_ID);
  }

  /** Returns true if field isAvailable is set (has been assigned a value) and false otherwise */
  public boolean isSetIsAvailable() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISAVAILABLE_ISSET_ID);
  }

  public void setIsAvailableIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISAVAILABLE_ISSET_ID, value);
  }

  public long getBlockedStartTime() {
    return this.blockedStartTime;
  }

  public void setBlockedStartTime(long blockedStartTime) {
    this.blockedStartTime = blockedStartTime;
    setBlockedStartTimeIsSet(true);
  }

  public void unsetBlockedStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BLOCKEDSTARTTIME_ISSET_ID);
  }

  /** Returns true if field blockedStartTime is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockedStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BLOCKEDSTARTTIME_ISSET_ID);
  }

  public void setBlockedStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BLOCKEDSTARTTIME_ISSET_ID, value);
  }

  public long getBlockedEndTime() {
    return this.blockedEndTime;
  }

  public void setBlockedEndTime(long blockedEndTime) {
    this.blockedEndTime = blockedEndTime;
    setBlockedEndTimeIsSet(true);
  }

  public void unsetBlockedEndTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BLOCKEDENDTIME_ISSET_ID);
  }

  /** Returns true if field blockedEndTime is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockedEndTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BLOCKEDENDTIME_ISSET_ID);
  }

  public void setBlockedEndTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BLOCKEDENDTIME_ISSET_ID, value);
  }

  public java.lang.String getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
  }

  public void unsetErrorCode() {
    this.errorCode = null;
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return this.errorCode != null;
  }

  public void setErrorCodeIsSet(boolean value) {
    if (!value) {
      this.errorCode = null;
    }
  }

  public java.lang.String getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case IS_AVAILABLE:
      if (value == null) {
        unsetIsAvailable();
      } else {
        setIsAvailable((java.lang.Boolean)value);
      }
      break;

    case BLOCKED_START_TIME:
      if (value == null) {
        unsetBlockedStartTime();
      } else {
        setBlockedStartTime((java.lang.Long)value);
      }
      break;

    case BLOCKED_END_TIME:
      if (value == null) {
        unsetBlockedEndTime();
      } else {
        setBlockedEndTime((java.lang.Long)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((java.lang.String)value);
      }
      break;

    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((java.lang.String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_AVAILABLE:
      return isIsAvailable();

    case BLOCKED_START_TIME:
      return getBlockedStartTime();

    case BLOCKED_END_TIME:
      return getBlockedEndTime();

    case ERROR_CODE:
      return getErrorCode();

    case ERROR_MESSAGE:
      return getErrorMessage();

    case STATUS:
      return getStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case IS_AVAILABLE:
      return isSetIsAvailable();
    case BLOCKED_START_TIME:
      return isSetBlockedStartTime();
    case BLOCKED_END_TIME:
      return isSetBlockedEndTime();
    case ERROR_CODE:
      return isSetErrorCode();
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCheckAvailabilityResponse)
      return this.equals((TCheckAvailabilityResponse)that);
    return false;
  }

  public boolean equals(TCheckAvailabilityResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_isAvailable = true;
    boolean that_present_isAvailable = true;
    if (this_present_isAvailable || that_present_isAvailable) {
      if (!(this_present_isAvailable && that_present_isAvailable))
        return false;
      if (this.isAvailable != that.isAvailable)
        return false;
    }

    boolean this_present_blockedStartTime = true;
    boolean that_present_blockedStartTime = true;
    if (this_present_blockedStartTime || that_present_blockedStartTime) {
      if (!(this_present_blockedStartTime && that_present_blockedStartTime))
        return false;
      if (this.blockedStartTime != that.blockedStartTime)
        return false;
    }

    boolean this_present_blockedEndTime = true;
    boolean that_present_blockedEndTime = true;
    if (this_present_blockedEndTime || that_present_blockedEndTime) {
      if (!(this_present_blockedEndTime && that_present_blockedEndTime))
        return false;
      if (this.blockedEndTime != that.blockedEndTime)
        return false;
    }

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (!this.errorCode.equals(that.errorCode))
        return false;
    }

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isAvailable) ? 131071 : 524287);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(blockedStartTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(blockedEndTime);

    hashCode = hashCode * 8191 + ((isSetErrorCode()) ? 131071 : 524287);
    if (isSetErrorCode())
      hashCode = hashCode * 8191 + errorCode.hashCode();

    hashCode = hashCode * 8191 + ((isSetErrorMessage()) ? 131071 : 524287);
    if (isSetErrorMessage())
      hashCode = hashCode * 8191 + errorMessage.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCheckAvailabilityResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetIsAvailable()).compareTo(other.isSetIsAvailable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsAvailable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isAvailable, other.isAvailable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBlockedStartTime()).compareTo(other.isSetBlockedStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockedStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockedStartTime, other.blockedStartTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBlockedEndTime()).compareTo(other.isSetBlockedEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockedEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockedEndTime, other.blockedEndTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCheckAvailabilityResponse(");
    boolean first = true;

    sb.append("isAvailable:");
    sb.append(this.isAvailable);
    first = false;
    if (!first) sb.append(", ");
    sb.append("blockedStartTime:");
    sb.append(this.blockedStartTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("blockedEndTime:");
    sb.append(this.blockedEndTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorCode:");
    if (this.errorCode == null) {
      sb.append("null");
    } else {
      sb.append(this.errorCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorMessage:");
    if (this.errorMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.errorMessage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TCheckAvailabilityResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCheckAvailabilityResponseStandardScheme getScheme() {
      return new TCheckAvailabilityResponseStandardScheme();
    }
  }

  private static class TCheckAvailabilityResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCheckAvailabilityResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCheckAvailabilityResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_AVAILABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isAvailable = iprot.readBool();
              struct.setIsAvailableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BLOCKED_START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.blockedStartTime = iprot.readI64();
              struct.setBlockedStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BLOCKED_END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.blockedEndTime = iprot.readI64();
              struct.setBlockedEndTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorCode = iprot.readString();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.status = iprot.readString();
              struct.setStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCheckAvailabilityResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_AVAILABLE_FIELD_DESC);
      oprot.writeBool(struct.isAvailable);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BLOCKED_START_TIME_FIELD_DESC);
      oprot.writeI64(struct.blockedStartTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BLOCKED_END_TIME_FIELD_DESC);
      oprot.writeI64(struct.blockedEndTime);
      oprot.writeFieldEnd();
      if (struct.errorCode != null) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeString(struct.errorCode);
        oprot.writeFieldEnd();
      }
      if (struct.errorMessage != null) {
        oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.errorMessage);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeString(struct.status);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCheckAvailabilityResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCheckAvailabilityResponseTupleScheme getScheme() {
      return new TCheckAvailabilityResponseTupleScheme();
    }
  }

  private static class TCheckAvailabilityResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCheckAvailabilityResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCheckAvailabilityResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIsAvailable()) {
        optionals.set(0);
      }
      if (struct.isSetBlockedStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetBlockedEndTime()) {
        optionals.set(2);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(3);
      }
      if (struct.isSetErrorMessage()) {
        optionals.set(4);
      }
      if (struct.isSetStatus()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetIsAvailable()) {
        oprot.writeBool(struct.isAvailable);
      }
      if (struct.isSetBlockedStartTime()) {
        oprot.writeI64(struct.blockedStartTime);
      }
      if (struct.isSetBlockedEndTime()) {
        oprot.writeI64(struct.blockedEndTime);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeString(struct.errorCode);
      }
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
      if (struct.isSetStatus()) {
        oprot.writeString(struct.status);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCheckAvailabilityResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.isAvailable = iprot.readBool();
        struct.setIsAvailableIsSet(true);
      }
      if (incoming.get(1)) {
        struct.blockedStartTime = iprot.readI64();
        struct.setBlockedStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.blockedEndTime = iprot.readI64();
        struct.setBlockedEndTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.errorCode = iprot.readString();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
      if (incoming.get(5)) {
        struct.status = iprot.readString();
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

