/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-03")
public class TCenterGetRequest implements org.apache.thrift.TBase<TCenterGetRequest, TCenterGetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TCenterGetRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCenterGetRequest");

  private static final org.apache.thrift.protocol.TField CENTER_METADATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("centerMetadataId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("locale", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCenterGetRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCenterGetRequestTupleSchemeFactory();

  private java.lang.String centerMetadataId; // required
  private java.lang.String locale; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CENTER_METADATA_ID((short)1, "centerMetadataId"),
    LOCALE((short)2, "locale");

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
        case 1: // CENTER_METADATA_ID
          return CENTER_METADATA_ID;
        case 2: // LOCALE
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
    tmpMap.put(_Fields.CENTER_METADATA_ID, new org.apache.thrift.meta_data.FieldMetaData("centerMetadataId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "CallCenterMetadataId")));
    tmpMap.put(_Fields.LOCALE, new org.apache.thrift.meta_data.FieldMetaData("locale", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCenterGetRequest.class, metaDataMap);
  }

  public TCenterGetRequest() {
  }

  public TCenterGetRequest(
    java.lang.String centerMetadataId,
    java.lang.String locale)
  {
    this();
    this.centerMetadataId = centerMetadataId;
    this.locale = locale;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCenterGetRequest(TCenterGetRequest other) {
    if (other.isSetCenterMetadataId()) {
      this.centerMetadataId = other.centerMetadataId;
    }
    if (other.isSetLocale()) {
      this.locale = other.locale;
    }
  }

  public TCenterGetRequest deepCopy() {
    return new TCenterGetRequest(this);
  }

  @Override
  public void clear() {
    this.centerMetadataId = null;
    this.locale = null;
  }

  public java.lang.String getCenterMetadataId() {
    return this.centerMetadataId;
  }

  public void setCenterMetadataId(java.lang.String centerMetadataId) {
    this.centerMetadataId = centerMetadataId;
  }

  public void unsetCenterMetadataId() {
    this.centerMetadataId = null;
  }

  /** Returns true if field centerMetadataId is set (has been assigned a value) and false otherwise */
  public boolean isSetCenterMetadataId() {
    return this.centerMetadataId != null;
  }

  public void setCenterMetadataIdIsSet(boolean value) {
    if (!value) {
      this.centerMetadataId = null;
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
    case CENTER_METADATA_ID:
      if (value == null) {
        unsetCenterMetadataId();
      } else {
        setCenterMetadataId((java.lang.String)value);
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
    case CENTER_METADATA_ID:
      return getCenterMetadataId();

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
    case CENTER_METADATA_ID:
      return isSetCenterMetadataId();
    case LOCALE:
      return isSetLocale();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCenterGetRequest)
      return this.equals((TCenterGetRequest)that);
    return false;
  }

  public boolean equals(TCenterGetRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_centerMetadataId = true && this.isSetCenterMetadataId();
    boolean that_present_centerMetadataId = true && that.isSetCenterMetadataId();
    if (this_present_centerMetadataId || that_present_centerMetadataId) {
      if (!(this_present_centerMetadataId && that_present_centerMetadataId))
        return false;
      if (!this.centerMetadataId.equals(that.centerMetadataId))
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

    hashCode = hashCode * 8191 + ((isSetCenterMetadataId()) ? 131071 : 524287);
    if (isSetCenterMetadataId())
      hashCode = hashCode * 8191 + centerMetadataId.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocale()) ? 131071 : 524287);
    if (isSetLocale())
      hashCode = hashCode * 8191 + locale.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCenterGetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCenterMetadataId()).compareTo(other.isSetCenterMetadataId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCenterMetadataId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.centerMetadataId, other.centerMetadataId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCenterGetRequest(");
    boolean first = true;

    sb.append("centerMetadataId:");
    if (this.centerMetadataId == null) {
      sb.append("null");
    } else {
      sb.append(this.centerMetadataId);
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
    if (!isSetCenterMetadataId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'centerMetadataId' is unset! Struct:" + toString());
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

  private static class TCenterGetRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCenterGetRequestStandardScheme getScheme() {
      return new TCenterGetRequestStandardScheme();
    }
  }

  private static class TCenterGetRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCenterGetRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCenterGetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CENTER_METADATA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.centerMetadataId = iprot.readString();
              struct.setCenterMetadataIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCALE
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCenterGetRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.centerMetadataId != null) {
        oprot.writeFieldBegin(CENTER_METADATA_ID_FIELD_DESC);
        oprot.writeString(struct.centerMetadataId);
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

  private static class TCenterGetRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCenterGetRequestTupleScheme getScheme() {
      return new TCenterGetRequestTupleScheme();
    }
  }

  private static class TCenterGetRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCenterGetRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCenterGetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.centerMetadataId);
      oprot.writeString(struct.locale);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCenterGetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.centerMetadataId = iprot.readString();
      struct.setCenterMetadataIdIsSet(true);
      struct.locale = iprot.readString();
      struct.setLocaleIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
