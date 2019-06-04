/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-05-22")
public class TState implements org.apache.thrift.TBase<TState, TState._Fields>, java.io.Serializable, Cloneable, Comparable<TState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TState");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COUNTRY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("countryName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IS_PACKAGE_SEARCHABLE_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("isPackageSearchableState", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField IS_MICE_SEARCHABLE_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("isMiceSearchableState", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TStateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TStateTupleSchemeFactory();

  private java.lang.String id; // required
  private java.lang.String name; // required
  private java.lang.String countryName; // required
  private boolean isPackageSearchableState; // required
  private boolean isMiceSearchableState; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    COUNTRY_NAME((short)3, "countryName"),
    IS_PACKAGE_SEARCHABLE_STATE((short)4, "isPackageSearchableState"),
    IS_MICE_SEARCHABLE_STATE((short)5, "isMiceSearchableState");

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
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // COUNTRY_NAME
          return COUNTRY_NAME;
        case 4: // IS_PACKAGE_SEARCHABLE_STATE
          return IS_PACKAGE_SEARCHABLE_STATE;
        case 5: // IS_MICE_SEARCHABLE_STATE
          return IS_MICE_SEARCHABLE_STATE;
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
  private static final int __ISPACKAGESEARCHABLESTATE_ISSET_ID = 0;
  private static final int __ISMICESEARCHABLESTATE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY_NAME, new org.apache.thrift.meta_data.FieldMetaData("countryName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_PACKAGE_SEARCHABLE_STATE, new org.apache.thrift.meta_data.FieldMetaData("isPackageSearchableState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_MICE_SEARCHABLE_STATE, new org.apache.thrift.meta_data.FieldMetaData("isMiceSearchableState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TState.class, metaDataMap);
  }

  public TState() {
  }

  public TState(
    java.lang.String id,
    java.lang.String name,
    java.lang.String countryName,
    boolean isPackageSearchableState,
    boolean isMiceSearchableState)
  {
    this();
    this.id = id;
    this.name = name;
    this.countryName = countryName;
    this.isPackageSearchableState = isPackageSearchableState;
    setIsPackageSearchableStateIsSet(true);
    this.isMiceSearchableState = isMiceSearchableState;
    setIsMiceSearchableStateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TState(TState other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetCountryName()) {
      this.countryName = other.countryName;
    }
    this.isPackageSearchableState = other.isPackageSearchableState;
    this.isMiceSearchableState = other.isMiceSearchableState;
  }

  public TState deepCopy() {
    return new TState(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.name = null;
    this.countryName = null;
    setIsPackageSearchableStateIsSet(false);
    this.isPackageSearchableState = false;
    setIsMiceSearchableStateIsSet(false);
    this.isMiceSearchableState = false;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getCountryName() {
    return this.countryName;
  }

  public void setCountryName(java.lang.String countryName) {
    this.countryName = countryName;
  }

  public void unsetCountryName() {
    this.countryName = null;
  }

  /** Returns true if field countryName is set (has been assigned a value) and false otherwise */
  public boolean isSetCountryName() {
    return this.countryName != null;
  }

  public void setCountryNameIsSet(boolean value) {
    if (!value) {
      this.countryName = null;
    }
  }

  public boolean isIsPackageSearchableState() {
    return this.isPackageSearchableState;
  }

  public void setIsPackageSearchableState(boolean isPackageSearchableState) {
    this.isPackageSearchableState = isPackageSearchableState;
    setIsPackageSearchableStateIsSet(true);
  }

  public void unsetIsPackageSearchableState() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISPACKAGESEARCHABLESTATE_ISSET_ID);
  }

  /** Returns true if field isPackageSearchableState is set (has been assigned a value) and false otherwise */
  public boolean isSetIsPackageSearchableState() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISPACKAGESEARCHABLESTATE_ISSET_ID);
  }

  public void setIsPackageSearchableStateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISPACKAGESEARCHABLESTATE_ISSET_ID, value);
  }

  public boolean isIsMiceSearchableState() {
    return this.isMiceSearchableState;
  }

  public void setIsMiceSearchableState(boolean isMiceSearchableState) {
    this.isMiceSearchableState = isMiceSearchableState;
    setIsMiceSearchableStateIsSet(true);
  }

  public void unsetIsMiceSearchableState() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISMICESEARCHABLESTATE_ISSET_ID);
  }

  /** Returns true if field isMiceSearchableState is set (has been assigned a value) and false otherwise */
  public boolean isSetIsMiceSearchableState() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISMICESEARCHABLESTATE_ISSET_ID);
  }

  public void setIsMiceSearchableStateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISMICESEARCHABLESTATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case COUNTRY_NAME:
      if (value == null) {
        unsetCountryName();
      } else {
        setCountryName((java.lang.String)value);
      }
      break;

    case IS_PACKAGE_SEARCHABLE_STATE:
      if (value == null) {
        unsetIsPackageSearchableState();
      } else {
        setIsPackageSearchableState((java.lang.Boolean)value);
      }
      break;

    case IS_MICE_SEARCHABLE_STATE:
      if (value == null) {
        unsetIsMiceSearchableState();
      } else {
        setIsMiceSearchableState((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case COUNTRY_NAME:
      return getCountryName();

    case IS_PACKAGE_SEARCHABLE_STATE:
      return isIsPackageSearchableState();

    case IS_MICE_SEARCHABLE_STATE:
      return isIsMiceSearchableState();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case COUNTRY_NAME:
      return isSetCountryName();
    case IS_PACKAGE_SEARCHABLE_STATE:
      return isSetIsPackageSearchableState();
    case IS_MICE_SEARCHABLE_STATE:
      return isSetIsMiceSearchableState();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TState)
      return this.equals((TState)that);
    return false;
  }

  public boolean equals(TState that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_countryName = true && this.isSetCountryName();
    boolean that_present_countryName = true && that.isSetCountryName();
    if (this_present_countryName || that_present_countryName) {
      if (!(this_present_countryName && that_present_countryName))
        return false;
      if (!this.countryName.equals(that.countryName))
        return false;
    }

    boolean this_present_isPackageSearchableState = true;
    boolean that_present_isPackageSearchableState = true;
    if (this_present_isPackageSearchableState || that_present_isPackageSearchableState) {
      if (!(this_present_isPackageSearchableState && that_present_isPackageSearchableState))
        return false;
      if (this.isPackageSearchableState != that.isPackageSearchableState)
        return false;
    }

    boolean this_present_isMiceSearchableState = true;
    boolean that_present_isMiceSearchableState = true;
    if (this_present_isMiceSearchableState || that_present_isMiceSearchableState) {
      if (!(this_present_isMiceSearchableState && that_present_isMiceSearchableState))
        return false;
      if (this.isMiceSearchableState != that.isMiceSearchableState)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetCountryName()) ? 131071 : 524287);
    if (isSetCountryName())
      hashCode = hashCode * 8191 + countryName.hashCode();

    hashCode = hashCode * 8191 + ((isPackageSearchableState) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isMiceSearchableState) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCountryName()).compareTo(other.isSetCountryName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountryName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.countryName, other.countryName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsPackageSearchableState()).compareTo(other.isSetIsPackageSearchableState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsPackageSearchableState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isPackageSearchableState, other.isPackageSearchableState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsMiceSearchableState()).compareTo(other.isSetIsMiceSearchableState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsMiceSearchableState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isMiceSearchableState, other.isMiceSearchableState);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TState(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("countryName:");
    if (this.countryName == null) {
      sb.append("null");
    } else {
      sb.append(this.countryName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isPackageSearchableState:");
    sb.append(this.isPackageSearchableState);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isMiceSearchableState:");
    sb.append(this.isMiceSearchableState);
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

  private static class TStateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TStateStandardScheme getScheme() {
      return new TStateStandardScheme();
    }
  }

  private static class TStateStandardScheme extends org.apache.thrift.scheme.StandardScheme<TState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNTRY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.countryName = iprot.readString();
              struct.setCountryNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_PACKAGE_SEARCHABLE_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isPackageSearchableState = iprot.readBool();
              struct.setIsPackageSearchableStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_MICE_SEARCHABLE_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isMiceSearchableState = iprot.readBool();
              struct.setIsMiceSearchableStateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.countryName != null) {
        oprot.writeFieldBegin(COUNTRY_NAME_FIELD_DESC);
        oprot.writeString(struct.countryName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_PACKAGE_SEARCHABLE_STATE_FIELD_DESC);
      oprot.writeBool(struct.isPackageSearchableState);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_MICE_SEARCHABLE_STATE_FIELD_DESC);
      oprot.writeBool(struct.isMiceSearchableState);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TStateTupleScheme getScheme() {
      return new TStateTupleScheme();
    }
  }

  private static class TStateTupleScheme extends org.apache.thrift.scheme.TupleScheme<TState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetCountryName()) {
        optionals.set(2);
      }
      if (struct.isSetIsPackageSearchableState()) {
        optionals.set(3);
      }
      if (struct.isSetIsMiceSearchableState()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetCountryName()) {
        oprot.writeString(struct.countryName);
      }
      if (struct.isSetIsPackageSearchableState()) {
        oprot.writeBool(struct.isPackageSearchableState);
      }
      if (struct.isSetIsMiceSearchableState()) {
        oprot.writeBool(struct.isMiceSearchableState);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.countryName = iprot.readString();
        struct.setCountryNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isPackageSearchableState = iprot.readBool();
        struct.setIsPackageSearchableStateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isMiceSearchableState = iprot.readBool();
        struct.setIsMiceSearchableStateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
