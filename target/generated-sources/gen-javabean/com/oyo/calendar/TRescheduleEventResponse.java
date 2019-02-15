/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.calendar;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-02-14")
public class TRescheduleEventResponse implements org.apache.thrift.TBase<TRescheduleEventResponse, TRescheduleEventResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TRescheduleEventResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRescheduleEventResponse");

  private static final org.apache.thrift.protocol.TField CALENDAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("calendarId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRescheduleEventResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRescheduleEventResponseTupleSchemeFactory();

  private java.lang.String calendarId; // required
  private java.lang.String errorCode; // required
  private java.lang.String errorMessage; // required
  private java.lang.String status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CALENDAR_ID((short)1, "calendarId"),
    ERROR_CODE((short)2, "errorCode"),
    ERROR_MESSAGE((short)3, "errorMessage"),
    STATUS((short)4, "status");

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
        case 1: // CALENDAR_ID
          return CALENDAR_ID;
        case 2: // ERROR_CODE
          return ERROR_CODE;
        case 3: // ERROR_MESSAGE
          return ERROR_MESSAGE;
        case 4: // STATUS
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CALENDAR_ID, new org.apache.thrift.meta_data.FieldMetaData("calendarId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRescheduleEventResponse.class, metaDataMap);
  }

  public TRescheduleEventResponse() {
  }

  public TRescheduleEventResponse(
    java.lang.String calendarId,
    java.lang.String errorCode,
    java.lang.String errorMessage,
    java.lang.String status)
  {
    this();
    this.calendarId = calendarId;
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRescheduleEventResponse(TRescheduleEventResponse other) {
    if (other.isSetCalendarId()) {
      this.calendarId = other.calendarId;
    }
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

  public TRescheduleEventResponse deepCopy() {
    return new TRescheduleEventResponse(this);
  }

  @Override
  public void clear() {
    this.calendarId = null;
    this.errorCode = null;
    this.errorMessage = null;
    this.status = null;
  }

  public java.lang.String getCalendarId() {
    return this.calendarId;
  }

  public void setCalendarId(java.lang.String calendarId) {
    this.calendarId = calendarId;
  }

  public void unsetCalendarId() {
    this.calendarId = null;
  }

  /** Returns true if field calendarId is set (has been assigned a value) and false otherwise */
  public boolean isSetCalendarId() {
    return this.calendarId != null;
  }

  public void setCalendarIdIsSet(boolean value) {
    if (!value) {
      this.calendarId = null;
    }
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
    case CALENDAR_ID:
      if (value == null) {
        unsetCalendarId();
      } else {
        setCalendarId((java.lang.String)value);
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
    case CALENDAR_ID:
      return getCalendarId();

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
    case CALENDAR_ID:
      return isSetCalendarId();
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
    if (that instanceof TRescheduleEventResponse)
      return this.equals((TRescheduleEventResponse)that);
    return false;
  }

  public boolean equals(TRescheduleEventResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_calendarId = true && this.isSetCalendarId();
    boolean that_present_calendarId = true && that.isSetCalendarId();
    if (this_present_calendarId || that_present_calendarId) {
      if (!(this_present_calendarId && that_present_calendarId))
        return false;
      if (!this.calendarId.equals(that.calendarId))
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

    hashCode = hashCode * 8191 + ((isSetCalendarId()) ? 131071 : 524287);
    if (isSetCalendarId())
      hashCode = hashCode * 8191 + calendarId.hashCode();

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
  public int compareTo(TRescheduleEventResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCalendarId()).compareTo(other.isSetCalendarId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCalendarId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.calendarId, other.calendarId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRescheduleEventResponse(");
    boolean first = true;

    sb.append("calendarId:");
    if (this.calendarId == null) {
      sb.append("null");
    } else {
      sb.append(this.calendarId);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRescheduleEventResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRescheduleEventResponseStandardScheme getScheme() {
      return new TRescheduleEventResponseStandardScheme();
    }
  }

  private static class TRescheduleEventResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRescheduleEventResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRescheduleEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CALENDAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.calendarId = iprot.readString();
              struct.setCalendarIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorCode = iprot.readString();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRescheduleEventResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.calendarId != null) {
        oprot.writeFieldBegin(CALENDAR_ID_FIELD_DESC);
        oprot.writeString(struct.calendarId);
        oprot.writeFieldEnd();
      }
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

  private static class TRescheduleEventResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRescheduleEventResponseTupleScheme getScheme() {
      return new TRescheduleEventResponseTupleScheme();
    }
  }

  private static class TRescheduleEventResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRescheduleEventResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRescheduleEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCalendarId()) {
        optionals.set(0);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(1);
      }
      if (struct.isSetErrorMessage()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCalendarId()) {
        oprot.writeString(struct.calendarId);
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
    public void read(org.apache.thrift.protocol.TProtocol prot, TRescheduleEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.calendarId = iprot.readString();
        struct.setCalendarIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errorCode = iprot.readString();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = iprot.readString();
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

