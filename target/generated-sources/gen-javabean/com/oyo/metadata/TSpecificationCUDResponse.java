/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-11")
public class TSpecificationCUDResponse implements org.apache.thrift.TBase<TSpecificationCUDResponse, TSpecificationCUDResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TSpecificationCUDResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSpecificationCUDResponse");

  private static final org.apache.thrift.protocol.TField METADATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("metadataId", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSpecificationCUDResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSpecificationCUDResponseTupleSchemeFactory();

  private java.lang.String metadataId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA_ID((short)1, "metadataId");

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
        case 1: // METADATA_ID
          return METADATA_ID;
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
    tmpMap.put(_Fields.METADATA_ID, new org.apache.thrift.meta_data.FieldMetaData("metadataId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSpecificationCUDResponse.class, metaDataMap);
  }

  public TSpecificationCUDResponse() {
  }

  public TSpecificationCUDResponse(
    java.lang.String metadataId)
  {
    this();
    this.metadataId = metadataId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSpecificationCUDResponse(TSpecificationCUDResponse other) {
    if (other.isSetMetadataId()) {
      this.metadataId = other.metadataId;
    }
  }

  public TSpecificationCUDResponse deepCopy() {
    return new TSpecificationCUDResponse(this);
  }

  @Override
  public void clear() {
    this.metadataId = null;
  }

  public java.lang.String getMetadataId() {
    return this.metadataId;
  }

  public void setMetadataId(java.lang.String metadataId) {
    this.metadataId = metadataId;
  }

  public void unsetMetadataId() {
    this.metadataId = null;
  }

  /** Returns true if field metadataId is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadataId() {
    return this.metadataId != null;
  }

  public void setMetadataIdIsSet(boolean value) {
    if (!value) {
      this.metadataId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case METADATA_ID:
      if (value == null) {
        unsetMetadataId();
      } else {
        setMetadataId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA_ID:
      return getMetadataId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case METADATA_ID:
      return isSetMetadataId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TSpecificationCUDResponse)
      return this.equals((TSpecificationCUDResponse)that);
    return false;
  }

  public boolean equals(TSpecificationCUDResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_metadataId = true && this.isSetMetadataId();
    boolean that_present_metadataId = true && that.isSetMetadataId();
    if (this_present_metadataId || that_present_metadataId) {
      if (!(this_present_metadataId && that_present_metadataId))
        return false;
      if (!this.metadataId.equals(that.metadataId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMetadataId()) ? 131071 : 524287);
    if (isSetMetadataId())
      hashCode = hashCode * 8191 + metadataId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TSpecificationCUDResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMetadataId()).compareTo(other.isSetMetadataId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadataId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadataId, other.metadataId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSpecificationCUDResponse(");
    boolean first = true;

    sb.append("metadataId:");
    if (this.metadataId == null) {
      sb.append("null");
    } else {
      sb.append(this.metadataId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMetadataId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadataId' is unset! Struct:" + toString());
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

  private static class TSpecificationCUDResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSpecificationCUDResponseStandardScheme getScheme() {
      return new TSpecificationCUDResponseStandardScheme();
    }
  }

  private static class TSpecificationCUDResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSpecificationCUDResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSpecificationCUDResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadataId = iprot.readString();
              struct.setMetadataIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSpecificationCUDResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadataId != null) {
        oprot.writeFieldBegin(METADATA_ID_FIELD_DESC);
        oprot.writeString(struct.metadataId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSpecificationCUDResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSpecificationCUDResponseTupleScheme getScheme() {
      return new TSpecificationCUDResponseTupleScheme();
    }
  }

  private static class TSpecificationCUDResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSpecificationCUDResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSpecificationCUDResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.metadataId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSpecificationCUDResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.metadataId = iprot.readString();
      struct.setMetadataIdIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

