/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.mm.channel.accountmanagement;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-11")
public class TGetBillingAddressesResponse implements org.apache.thrift.TBase<TGetBillingAddressesResponse, TGetBillingAddressesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TGetBillingAddressesResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetBillingAddressesResponse");

  private static final org.apache.thrift.protocol.TField TOTAL_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalCount", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField BILLING_ADDRESS_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("billingAddressObjects", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetBillingAddressesResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetBillingAddressesResponseTupleSchemeFactory();

  private long totalCount; // required
  private java.util.List<TBillingAddressObject> billingAddressObjects; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL_COUNT((short)1, "totalCount"),
    BILLING_ADDRESS_OBJECTS((short)2, "billingAddressObjects");

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
        case 1: // TOTAL_COUNT
          return TOTAL_COUNT;
        case 2: // BILLING_ADDRESS_OBJECTS
          return BILLING_ADDRESS_OBJECTS;
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
  private static final int __TOTALCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalCount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BILLING_ADDRESS_OBJECTS, new org.apache.thrift.meta_data.FieldMetaData("billingAddressObjects", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBillingAddressObject.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetBillingAddressesResponse.class, metaDataMap);
  }

  public TGetBillingAddressesResponse() {
  }

  public TGetBillingAddressesResponse(
    long totalCount,
    java.util.List<TBillingAddressObject> billingAddressObjects)
  {
    this();
    this.totalCount = totalCount;
    setTotalCountIsSet(true);
    this.billingAddressObjects = billingAddressObjects;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetBillingAddressesResponse(TGetBillingAddressesResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.totalCount = other.totalCount;
    if (other.isSetBillingAddressObjects()) {
      java.util.List<TBillingAddressObject> __this__billingAddressObjects = new java.util.ArrayList<TBillingAddressObject>(other.billingAddressObjects.size());
      for (TBillingAddressObject other_element : other.billingAddressObjects) {
        __this__billingAddressObjects.add(new TBillingAddressObject(other_element));
      }
      this.billingAddressObjects = __this__billingAddressObjects;
    }
  }

  public TGetBillingAddressesResponse deepCopy() {
    return new TGetBillingAddressesResponse(this);
  }

  @Override
  public void clear() {
    setTotalCountIsSet(false);
    this.totalCount = 0;
    this.billingAddressObjects = null;
  }

  public long getTotalCount() {
    return this.totalCount;
  }

  public void setTotalCount(long totalCount) {
    this.totalCount = totalCount;
    setTotalCountIsSet(true);
  }

  public void unsetTotalCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  /** Returns true if field totalCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID);
  }

  public void setTotalCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALCOUNT_ISSET_ID, value);
  }

  public int getBillingAddressObjectsSize() {
    return (this.billingAddressObjects == null) ? 0 : this.billingAddressObjects.size();
  }

  public java.util.Iterator<TBillingAddressObject> getBillingAddressObjectsIterator() {
    return (this.billingAddressObjects == null) ? null : this.billingAddressObjects.iterator();
  }

  public void addToBillingAddressObjects(TBillingAddressObject elem) {
    if (this.billingAddressObjects == null) {
      this.billingAddressObjects = new java.util.ArrayList<TBillingAddressObject>();
    }
    this.billingAddressObjects.add(elem);
  }

  public java.util.List<TBillingAddressObject> getBillingAddressObjects() {
    return this.billingAddressObjects;
  }

  public void setBillingAddressObjects(java.util.List<TBillingAddressObject> billingAddressObjects) {
    this.billingAddressObjects = billingAddressObjects;
  }

  public void unsetBillingAddressObjects() {
    this.billingAddressObjects = null;
  }

  /** Returns true if field billingAddressObjects is set (has been assigned a value) and false otherwise */
  public boolean isSetBillingAddressObjects() {
    return this.billingAddressObjects != null;
  }

  public void setBillingAddressObjectsIsSet(boolean value) {
    if (!value) {
      this.billingAddressObjects = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOTAL_COUNT:
      if (value == null) {
        unsetTotalCount();
      } else {
        setTotalCount((java.lang.Long)value);
      }
      break;

    case BILLING_ADDRESS_OBJECTS:
      if (value == null) {
        unsetBillingAddressObjects();
      } else {
        setBillingAddressObjects((java.util.List<TBillingAddressObject>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_COUNT:
      return getTotalCount();

    case BILLING_ADDRESS_OBJECTS:
      return getBillingAddressObjects();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_COUNT:
      return isSetTotalCount();
    case BILLING_ADDRESS_OBJECTS:
      return isSetBillingAddressObjects();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetBillingAddressesResponse)
      return this.equals((TGetBillingAddressesResponse)that);
    return false;
  }

  public boolean equals(TGetBillingAddressesResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_totalCount = true;
    boolean that_present_totalCount = true;
    if (this_present_totalCount || that_present_totalCount) {
      if (!(this_present_totalCount && that_present_totalCount))
        return false;
      if (this.totalCount != that.totalCount)
        return false;
    }

    boolean this_present_billingAddressObjects = true && this.isSetBillingAddressObjects();
    boolean that_present_billingAddressObjects = true && that.isSetBillingAddressObjects();
    if (this_present_billingAddressObjects || that_present_billingAddressObjects) {
      if (!(this_present_billingAddressObjects && that_present_billingAddressObjects))
        return false;
      if (!this.billingAddressObjects.equals(that.billingAddressObjects))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(totalCount);

    hashCode = hashCode * 8191 + ((isSetBillingAddressObjects()) ? 131071 : 524287);
    if (isSetBillingAddressObjects())
      hashCode = hashCode * 8191 + billingAddressObjects.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetBillingAddressesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTotalCount()).compareTo(other.isSetTotalCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalCount, other.totalCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBillingAddressObjects()).compareTo(other.isSetBillingAddressObjects());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBillingAddressObjects()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.billingAddressObjects, other.billingAddressObjects);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetBillingAddressesResponse(");
    boolean first = true;

    sb.append("totalCount:");
    sb.append(this.totalCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("billingAddressObjects:");
    if (this.billingAddressObjects == null) {
      sb.append("null");
    } else {
      sb.append(this.billingAddressObjects);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTotalCount()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'totalCount' is unset! Struct:" + toString());
    }

    if (!isSetBillingAddressObjects()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'billingAddressObjects' is unset! Struct:" + toString());
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

  private static class TGetBillingAddressesResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetBillingAddressesResponseStandardScheme getScheme() {
      return new TGetBillingAddressesResponseStandardScheme();
    }
  }

  private static class TGetBillingAddressesResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetBillingAddressesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetBillingAddressesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.totalCount = iprot.readI64();
              struct.setTotalCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BILLING_ADDRESS_OBJECTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list120 = iprot.readListBegin();
                struct.billingAddressObjects = new java.util.ArrayList<TBillingAddressObject>(_list120.size);
                TBillingAddressObject _elem121;
                for (int _i122 = 0; _i122 < _list120.size; ++_i122)
                {
                  _elem121 = new TBillingAddressObject();
                  _elem121.read(iprot);
                  struct.billingAddressObjects.add(_elem121);
                }
                iprot.readListEnd();
              }
              struct.setBillingAddressObjectsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetBillingAddressesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOTAL_COUNT_FIELD_DESC);
      oprot.writeI64(struct.totalCount);
      oprot.writeFieldEnd();
      if (struct.billingAddressObjects != null) {
        oprot.writeFieldBegin(BILLING_ADDRESS_OBJECTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.billingAddressObjects.size()));
          for (TBillingAddressObject _iter123 : struct.billingAddressObjects)
          {
            _iter123.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetBillingAddressesResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetBillingAddressesResponseTupleScheme getScheme() {
      return new TGetBillingAddressesResponseTupleScheme();
    }
  }

  private static class TGetBillingAddressesResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetBillingAddressesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetBillingAddressesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.totalCount);
      {
        oprot.writeI32(struct.billingAddressObjects.size());
        for (TBillingAddressObject _iter124 : struct.billingAddressObjects)
        {
          _iter124.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetBillingAddressesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.totalCount = iprot.readI64();
      struct.setTotalCountIsSet(true);
      {
        org.apache.thrift.protocol.TList _list125 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.billingAddressObjects = new java.util.ArrayList<TBillingAddressObject>(_list125.size);
        TBillingAddressObject _elem126;
        for (int _i127 = 0; _i127 < _list125.size; ++_i127)
        {
          _elem126 = new TBillingAddressObject();
          _elem126.read(iprot);
          struct.billingAddressObjects.add(_elem126);
        }
      }
      struct.setBillingAddressObjectsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

