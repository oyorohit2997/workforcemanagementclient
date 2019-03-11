/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.workforce;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-11")
public class TGetEmployeesRequest implements org.apache.thrift.TBase<TGetEmployeesRequest, TGetEmployeesRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TGetEmployeesRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetEmployeesRequest");

  private static final org.apache.thrift.protocol.TField BEFORE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("beforeTime", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField BUSINESS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("businessId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("limit", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetEmployeesRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetEmployeesRequestTupleSchemeFactory();

  private long beforeTime; // required
  private java.lang.String businessId; // required
  private int limit; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BEFORE_TIME((short)1, "beforeTime"),
    BUSINESS_ID((short)2, "businessId"),
    LIMIT((short)3, "limit");

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
        case 1: // BEFORE_TIME
          return BEFORE_TIME;
        case 2: // BUSINESS_ID
          return BUSINESS_ID;
        case 3: // LIMIT
          return LIMIT;
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
  private static final int __BEFORETIME_ISSET_ID = 0;
  private static final int __LIMIT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LIMIT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BEFORE_TIME, new org.apache.thrift.meta_data.FieldMetaData("beforeTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BUSINESS_ID, new org.apache.thrift.meta_data.FieldMetaData("businessId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LIMIT, new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetEmployeesRequest.class, metaDataMap);
  }

  public TGetEmployeesRequest() {
  }

  public TGetEmployeesRequest(
    long beforeTime,
    java.lang.String businessId)
  {
    this();
    this.beforeTime = beforeTime;
    setBeforeTimeIsSet(true);
    this.businessId = businessId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetEmployeesRequest(TGetEmployeesRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.beforeTime = other.beforeTime;
    if (other.isSetBusinessId()) {
      this.businessId = other.businessId;
    }
    this.limit = other.limit;
  }

  public TGetEmployeesRequest deepCopy() {
    return new TGetEmployeesRequest(this);
  }

  @Override
  public void clear() {
    setBeforeTimeIsSet(false);
    this.beforeTime = 0;
    this.businessId = null;
    setLimitIsSet(false);
    this.limit = 0;
  }

  public long getBeforeTime() {
    return this.beforeTime;
  }

  public void setBeforeTime(long beforeTime) {
    this.beforeTime = beforeTime;
    setBeforeTimeIsSet(true);
  }

  public void unsetBeforeTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BEFORETIME_ISSET_ID);
  }

  /** Returns true if field beforeTime is set (has been assigned a value) and false otherwise */
  public boolean isSetBeforeTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BEFORETIME_ISSET_ID);
  }

  public void setBeforeTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BEFORETIME_ISSET_ID, value);
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

  public int getLimit() {
    return this.limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
    setLimitIsSet(true);
  }

  public void unsetLimit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case BEFORE_TIME:
      if (value == null) {
        unsetBeforeTime();
      } else {
        setBeforeTime((java.lang.Long)value);
      }
      break;

    case BUSINESS_ID:
      if (value == null) {
        unsetBusinessId();
      } else {
        setBusinessId((java.lang.String)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BEFORE_TIME:
      return getBeforeTime();

    case BUSINESS_ID:
      return getBusinessId();

    case LIMIT:
      return getLimit();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BEFORE_TIME:
      return isSetBeforeTime();
    case BUSINESS_ID:
      return isSetBusinessId();
    case LIMIT:
      return isSetLimit();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetEmployeesRequest)
      return this.equals((TGetEmployeesRequest)that);
    return false;
  }

  public boolean equals(TGetEmployeesRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_beforeTime = true;
    boolean that_present_beforeTime = true;
    if (this_present_beforeTime || that_present_beforeTime) {
      if (!(this_present_beforeTime && that_present_beforeTime))
        return false;
      if (this.beforeTime != that.beforeTime)
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

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(beforeTime);

    hashCode = hashCode * 8191 + ((isSetBusinessId()) ? 131071 : 524287);
    if (isSetBusinessId())
      hashCode = hashCode * 8191 + businessId.hashCode();

    hashCode = hashCode * 8191 + ((isSetLimit()) ? 131071 : 524287);
    if (isSetLimit())
      hashCode = hashCode * 8191 + limit;

    return hashCode;
  }

  @Override
  public int compareTo(TGetEmployeesRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBeforeTime()).compareTo(other.isSetBeforeTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeforeTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.beforeTime, other.beforeTime);
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
    lastComparison = java.lang.Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetEmployeesRequest(");
    boolean first = true;

    sb.append("beforeTime:");
    sb.append(this.beforeTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("businessId:");
    if (this.businessId == null) {
      sb.append("null");
    } else {
      sb.append(this.businessId);
    }
    first = false;
    if (isSetLimit()) {
      if (!first) sb.append(", ");
      sb.append("limit:");
      sb.append(this.limit);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetBeforeTime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'beforeTime' is unset! Struct:" + toString());
    }

    if (!isSetBusinessId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'businessId' is unset! Struct:" + toString());
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

  private static class TGetEmployeesRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetEmployeesRequestStandardScheme getScheme() {
      return new TGetEmployeesRequestStandardScheme();
    }
  }

  private static class TGetEmployeesRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetEmployeesRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetEmployeesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BEFORE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.beforeTime = iprot.readI64();
              struct.setBeforeTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUSINESS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.businessId = iprot.readString();
              struct.setBusinessIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.limit = iprot.readI32();
              struct.setLimitIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetEmployeesRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BEFORE_TIME_FIELD_DESC);
      oprot.writeI64(struct.beforeTime);
      oprot.writeFieldEnd();
      if (struct.businessId != null) {
        oprot.writeFieldBegin(BUSINESS_ID_FIELD_DESC);
        oprot.writeString(struct.businessId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLimit()) {
        oprot.writeFieldBegin(LIMIT_FIELD_DESC);
        oprot.writeI32(struct.limit);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetEmployeesRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetEmployeesRequestTupleScheme getScheme() {
      return new TGetEmployeesRequestTupleScheme();
    }
  }

  private static class TGetEmployeesRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetEmployeesRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetEmployeesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.beforeTime);
      oprot.writeString(struct.businessId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLimit()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLimit()) {
        oprot.writeI32(struct.limit);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetEmployeesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.beforeTime = iprot.readI64();
      struct.setBeforeTimeIsSet(true);
      struct.businessId = iprot.readString();
      struct.setBusinessIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.limit = iprot.readI32();
        struct.setLimitIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

