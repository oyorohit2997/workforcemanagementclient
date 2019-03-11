/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-11")
public class TCabCategoryDetails implements org.apache.thrift.TBase<TCabCategoryDetails, TCabCategoryDetails._Fields>, java.io.Serializable, Cloneable, Comparable<TCabCategoryDetails> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCabCategoryDetails");

  private static final org.apache.thrift.protocol.TField CATEGORY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("categoryName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SITTING_CAPACITY_FIELD_DESC = new org.apache.thrift.protocol.TField("sittingCapacity", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCabCategoryDetailsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCabCategoryDetailsTupleSchemeFactory();

  private java.lang.String categoryName; // required
  private int sittingCapacity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATEGORY_NAME((short)1, "categoryName"),
    SITTING_CAPACITY((short)2, "sittingCapacity");

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
        case 1: // CATEGORY_NAME
          return CATEGORY_NAME;
        case 2: // SITTING_CAPACITY
          return SITTING_CAPACITY;
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
  private static final int __SITTINGCAPACITY_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATEGORY_NAME, new org.apache.thrift.meta_data.FieldMetaData("categoryName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SITTING_CAPACITY, new org.apache.thrift.meta_data.FieldMetaData("sittingCapacity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCabCategoryDetails.class, metaDataMap);
  }

  public TCabCategoryDetails() {
  }

  public TCabCategoryDetails(
    java.lang.String categoryName,
    int sittingCapacity)
  {
    this();
    this.categoryName = categoryName;
    this.sittingCapacity = sittingCapacity;
    setSittingCapacityIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCabCategoryDetails(TCabCategoryDetails other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCategoryName()) {
      this.categoryName = other.categoryName;
    }
    this.sittingCapacity = other.sittingCapacity;
  }

  public TCabCategoryDetails deepCopy() {
    return new TCabCategoryDetails(this);
  }

  @Override
  public void clear() {
    this.categoryName = null;
    setSittingCapacityIsSet(false);
    this.sittingCapacity = 0;
  }

  public java.lang.String getCategoryName() {
    return this.categoryName;
  }

  public void setCategoryName(java.lang.String categoryName) {
    this.categoryName = categoryName;
  }

  public void unsetCategoryName() {
    this.categoryName = null;
  }

  /** Returns true if field categoryName is set (has been assigned a value) and false otherwise */
  public boolean isSetCategoryName() {
    return this.categoryName != null;
  }

  public void setCategoryNameIsSet(boolean value) {
    if (!value) {
      this.categoryName = null;
    }
  }

  public int getSittingCapacity() {
    return this.sittingCapacity;
  }

  public void setSittingCapacity(int sittingCapacity) {
    this.sittingCapacity = sittingCapacity;
    setSittingCapacityIsSet(true);
  }

  public void unsetSittingCapacity() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SITTINGCAPACITY_ISSET_ID);
  }

  /** Returns true if field sittingCapacity is set (has been assigned a value) and false otherwise */
  public boolean isSetSittingCapacity() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SITTINGCAPACITY_ISSET_ID);
  }

  public void setSittingCapacityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SITTINGCAPACITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CATEGORY_NAME:
      if (value == null) {
        unsetCategoryName();
      } else {
        setCategoryName((java.lang.String)value);
      }
      break;

    case SITTING_CAPACITY:
      if (value == null) {
        unsetSittingCapacity();
      } else {
        setSittingCapacity((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CATEGORY_NAME:
      return getCategoryName();

    case SITTING_CAPACITY:
      return getSittingCapacity();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CATEGORY_NAME:
      return isSetCategoryName();
    case SITTING_CAPACITY:
      return isSetSittingCapacity();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCabCategoryDetails)
      return this.equals((TCabCategoryDetails)that);
    return false;
  }

  public boolean equals(TCabCategoryDetails that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_categoryName = true && this.isSetCategoryName();
    boolean that_present_categoryName = true && that.isSetCategoryName();
    if (this_present_categoryName || that_present_categoryName) {
      if (!(this_present_categoryName && that_present_categoryName))
        return false;
      if (!this.categoryName.equals(that.categoryName))
        return false;
    }

    boolean this_present_sittingCapacity = true;
    boolean that_present_sittingCapacity = true;
    if (this_present_sittingCapacity || that_present_sittingCapacity) {
      if (!(this_present_sittingCapacity && that_present_sittingCapacity))
        return false;
      if (this.sittingCapacity != that.sittingCapacity)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCategoryName()) ? 131071 : 524287);
    if (isSetCategoryName())
      hashCode = hashCode * 8191 + categoryName.hashCode();

    hashCode = hashCode * 8191 + sittingCapacity;

    return hashCode;
  }

  @Override
  public int compareTo(TCabCategoryDetails other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCategoryName()).compareTo(other.isSetCategoryName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategoryName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.categoryName, other.categoryName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSittingCapacity()).compareTo(other.isSetSittingCapacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSittingCapacity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sittingCapacity, other.sittingCapacity);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCabCategoryDetails(");
    boolean first = true;

    sb.append("categoryName:");
    if (this.categoryName == null) {
      sb.append("null");
    } else {
      sb.append(this.categoryName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sittingCapacity:");
    sb.append(this.sittingCapacity);
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

  private static class TCabCategoryDetailsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCabCategoryDetailsStandardScheme getScheme() {
      return new TCabCategoryDetailsStandardScheme();
    }
  }

  private static class TCabCategoryDetailsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCabCategoryDetails> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCabCategoryDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATEGORY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.categoryName = iprot.readString();
              struct.setCategoryNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SITTING_CAPACITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sittingCapacity = iprot.readI32();
              struct.setSittingCapacityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCabCategoryDetails struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.categoryName != null) {
        oprot.writeFieldBegin(CATEGORY_NAME_FIELD_DESC);
        oprot.writeString(struct.categoryName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SITTING_CAPACITY_FIELD_DESC);
      oprot.writeI32(struct.sittingCapacity);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCabCategoryDetailsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCabCategoryDetailsTupleScheme getScheme() {
      return new TCabCategoryDetailsTupleScheme();
    }
  }

  private static class TCabCategoryDetailsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCabCategoryDetails> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCabCategoryDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCategoryName()) {
        optionals.set(0);
      }
      if (struct.isSetSittingCapacity()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCategoryName()) {
        oprot.writeString(struct.categoryName);
      }
      if (struct.isSetSittingCapacity()) {
        oprot.writeI32(struct.sittingCapacity);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCabCategoryDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.categoryName = iprot.readString();
        struct.setCategoryNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sittingCapacity = iprot.readI32();
        struct.setSittingCapacityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

