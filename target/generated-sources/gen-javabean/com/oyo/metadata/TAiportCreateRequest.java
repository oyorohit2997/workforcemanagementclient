/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-11")
public class TAiportCreateRequest implements org.apache.thrift.TBase<TAiportCreateRequest, TAiportCreateRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TAiportCreateRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAiportCreateRequest");

  private static final org.apache.thrift.protocol.TField AIRPORT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("airportCode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AIRPORT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("airportName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_ZONE_FIELD_DESC = new org.apache.thrift.protocol.TField("timeZone", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("locale", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAiportCreateRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAiportCreateRequestTupleSchemeFactory();

  private java.lang.String airportCode; // required
  private java.lang.String airportName; // required
  private java.lang.String timeZone; // required
  private java.lang.String locale; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AIRPORT_CODE((short)1, "airportCode"),
    AIRPORT_NAME((short)2, "airportName"),
    TIME_ZONE((short)3, "timeZone"),
    LOCALE((short)4, "locale");

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
        case 1: // AIRPORT_CODE
          return AIRPORT_CODE;
        case 2: // AIRPORT_NAME
          return AIRPORT_NAME;
        case 3: // TIME_ZONE
          return TIME_ZONE;
        case 4: // LOCALE
          return LOCALE;
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
    tmpMap.put(_Fields.AIRPORT_CODE, new org.apache.thrift.meta_data.FieldMetaData("airportCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AIRPORT_NAME, new org.apache.thrift.meta_data.FieldMetaData("airportName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_ZONE, new org.apache.thrift.meta_data.FieldMetaData("timeZone", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TimeZone")));
    tmpMap.put(_Fields.LOCALE, new org.apache.thrift.meta_data.FieldMetaData("locale", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAiportCreateRequest.class, metaDataMap);
  }

  public TAiportCreateRequest() {
  }

  public TAiportCreateRequest(
    java.lang.String airportCode,
    java.lang.String airportName,
    java.lang.String timeZone,
    java.lang.String locale)
  {
    this();
    this.airportCode = airportCode;
    this.airportName = airportName;
    this.timeZone = timeZone;
    this.locale = locale;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAiportCreateRequest(TAiportCreateRequest other) {
    if (other.isSetAirportCode()) {
      this.airportCode = other.airportCode;
    }
    if (other.isSetAirportName()) {
      this.airportName = other.airportName;
    }
    if (other.isSetTimeZone()) {
      this.timeZone = other.timeZone;
    }
    if (other.isSetLocale()) {
      this.locale = other.locale;
    }
  }

  public TAiportCreateRequest deepCopy() {
    return new TAiportCreateRequest(this);
  }

  @Override
  public void clear() {
    this.airportCode = null;
    this.airportName = null;
    this.timeZone = null;
    this.locale = null;
  }

  public java.lang.String getAirportCode() {
    return this.airportCode;
  }

  public void setAirportCode(java.lang.String airportCode) {
    this.airportCode = airportCode;
  }

  public void unsetAirportCode() {
    this.airportCode = null;
  }

  /** Returns true if field airportCode is set (has been assigned a value) and false otherwise */
  public boolean isSetAirportCode() {
    return this.airportCode != null;
  }

  public void setAirportCodeIsSet(boolean value) {
    if (!value) {
      this.airportCode = null;
    }
  }

  public java.lang.String getAirportName() {
    return this.airportName;
  }

  public void setAirportName(java.lang.String airportName) {
    this.airportName = airportName;
  }

  public void unsetAirportName() {
    this.airportName = null;
  }

  /** Returns true if field airportName is set (has been assigned a value) and false otherwise */
  public boolean isSetAirportName() {
    return this.airportName != null;
  }

  public void setAirportNameIsSet(boolean value) {
    if (!value) {
      this.airportName = null;
    }
  }

  public java.lang.String getTimeZone() {
    return this.timeZone;
  }

  public void setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
  }

  public void unsetTimeZone() {
    this.timeZone = null;
  }

  /** Returns true if field timeZone is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeZone() {
    return this.timeZone != null;
  }

  public void setTimeZoneIsSet(boolean value) {
    if (!value) {
      this.timeZone = null;
    }
  }

  public java.lang.String getLocale() {
    return this.locale;
  }

  public void setLocale(java.lang.String locale) {
    this.locale = locale;
  }

  public void unsetLocale() {
    this.locale = null;
  }

  /** Returns true if field locale is set (has been assigned a value) and false otherwise */
  public boolean isSetLocale() {
    return this.locale != null;
  }

  public void setLocaleIsSet(boolean value) {
    if (!value) {
      this.locale = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case AIRPORT_CODE:
      if (value == null) {
        unsetAirportCode();
      } else {
        setAirportCode((java.lang.String)value);
      }
      break;

    case AIRPORT_NAME:
      if (value == null) {
        unsetAirportName();
      } else {
        setAirportName((java.lang.String)value);
      }
      break;

    case TIME_ZONE:
      if (value == null) {
        unsetTimeZone();
      } else {
        setTimeZone((java.lang.String)value);
      }
      break;

    case LOCALE:
      if (value == null) {
        unsetLocale();
      } else {
        setLocale((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case AIRPORT_CODE:
      return getAirportCode();

    case AIRPORT_NAME:
      return getAirportName();

    case TIME_ZONE:
      return getTimeZone();

    case LOCALE:
      return getLocale();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case AIRPORT_CODE:
      return isSetAirportCode();
    case AIRPORT_NAME:
      return isSetAirportName();
    case TIME_ZONE:
      return isSetTimeZone();
    case LOCALE:
      return isSetLocale();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TAiportCreateRequest)
      return this.equals((TAiportCreateRequest)that);
    return false;
  }

  public boolean equals(TAiportCreateRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_airportCode = true && this.isSetAirportCode();
    boolean that_present_airportCode = true && that.isSetAirportCode();
    if (this_present_airportCode || that_present_airportCode) {
      if (!(this_present_airportCode && that_present_airportCode))
        return false;
      if (!this.airportCode.equals(that.airportCode))
        return false;
    }

    boolean this_present_airportName = true && this.isSetAirportName();
    boolean that_present_airportName = true && that.isSetAirportName();
    if (this_present_airportName || that_present_airportName) {
      if (!(this_present_airportName && that_present_airportName))
        return false;
      if (!this.airportName.equals(that.airportName))
        return false;
    }

    boolean this_present_timeZone = true && this.isSetTimeZone();
    boolean that_present_timeZone = true && that.isSetTimeZone();
    if (this_present_timeZone || that_present_timeZone) {
      if (!(this_present_timeZone && that_present_timeZone))
        return false;
      if (!this.timeZone.equals(that.timeZone))
        return false;
    }

    boolean this_present_locale = true && this.isSetLocale();
    boolean that_present_locale = true && that.isSetLocale();
    if (this_present_locale || that_present_locale) {
      if (!(this_present_locale && that_present_locale))
        return false;
      if (!this.locale.equals(that.locale))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAirportCode()) ? 131071 : 524287);
    if (isSetAirportCode())
      hashCode = hashCode * 8191 + airportCode.hashCode();

    hashCode = hashCode * 8191 + ((isSetAirportName()) ? 131071 : 524287);
    if (isSetAirportName())
      hashCode = hashCode * 8191 + airportName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTimeZone()) ? 131071 : 524287);
    if (isSetTimeZone())
      hashCode = hashCode * 8191 + timeZone.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocale()) ? 131071 : 524287);
    if (isSetLocale())
      hashCode = hashCode * 8191 + locale.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TAiportCreateRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAirportCode()).compareTo(other.isSetAirportCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAirportCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.airportCode, other.airportCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAirportName()).compareTo(other.isSetAirportName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAirportName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.airportName, other.airportName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTimeZone()).compareTo(other.isSetTimeZone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeZone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeZone, other.timeZone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLocale()).compareTo(other.isSetLocale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locale, other.locale);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAiportCreateRequest(");
    boolean first = true;

    sb.append("airportCode:");
    if (this.airportCode == null) {
      sb.append("null");
    } else {
      sb.append(this.airportCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("airportName:");
    if (this.airportName == null) {
      sb.append("null");
    } else {
      sb.append(this.airportName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeZone:");
    if (this.timeZone == null) {
      sb.append("null");
    } else {
      sb.append(this.timeZone);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locale:");
    if (this.locale == null) {
      sb.append("null");
    } else {
      sb.append(this.locale);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetAirportCode()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'airportCode' is unset! Struct:" + toString());
    }

    if (!isSetAirportName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'airportName' is unset! Struct:" + toString());
    }

    if (!isSetTimeZone()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'timeZone' is unset! Struct:" + toString());
    }

    if (!isSetLocale()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'locale' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAiportCreateRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAiportCreateRequestStandardScheme getScheme() {
      return new TAiportCreateRequestStandardScheme();
    }
  }

  private static class TAiportCreateRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAiportCreateRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAiportCreateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AIRPORT_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.airportCode = iprot.readString();
              struct.setAirportCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AIRPORT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.airportName = iprot.readString();
              struct.setAirportNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_ZONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timeZone = iprot.readString();
              struct.setTimeZoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locale = iprot.readString();
              struct.setLocaleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAiportCreateRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.airportCode != null) {
        oprot.writeFieldBegin(AIRPORT_CODE_FIELD_DESC);
        oprot.writeString(struct.airportCode);
        oprot.writeFieldEnd();
      }
      if (struct.airportName != null) {
        oprot.writeFieldBegin(AIRPORT_NAME_FIELD_DESC);
        oprot.writeString(struct.airportName);
        oprot.writeFieldEnd();
      }
      if (struct.timeZone != null) {
        oprot.writeFieldBegin(TIME_ZONE_FIELD_DESC);
        oprot.writeString(struct.timeZone);
        oprot.writeFieldEnd();
      }
      if (struct.locale != null) {
        oprot.writeFieldBegin(LOCALE_FIELD_DESC);
        oprot.writeString(struct.locale);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAiportCreateRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAiportCreateRequestTupleScheme getScheme() {
      return new TAiportCreateRequestTupleScheme();
    }
  }

  private static class TAiportCreateRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAiportCreateRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAiportCreateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.airportCode);
      oprot.writeString(struct.airportName);
      oprot.writeString(struct.timeZone);
      oprot.writeString(struct.locale);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAiportCreateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.airportCode = iprot.readString();
      struct.setAirportCodeIsSet(true);
      struct.airportName = iprot.readString();
      struct.setAirportNameIsSet(true);
      struct.timeZone = iprot.readString();
      struct.setTimeZoneIsSet(true);
      struct.locale = iprot.readString();
      struct.setLocaleIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
