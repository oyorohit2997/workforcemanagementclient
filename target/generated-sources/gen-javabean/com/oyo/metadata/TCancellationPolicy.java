/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.metadata;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-03-11")
public class TCancellationPolicy implements org.apache.thrift.TBase<TCancellationPolicy, TCancellationPolicy._Fields>, java.io.Serializable, Cloneable, Comparable<TCancellationPolicy> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCancellationPolicy");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField POLICY_RULE_FIELD_DESC = new org.apache.thrift.protocol.TField("policyRule", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCancellationPolicyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCancellationPolicyTupleSchemeFactory();

  private java.lang.String id; // required
  private java.lang.String description; // required
  private java.util.Map<java.lang.String,java.lang.String> policyRule; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    DESCRIPTION((short)2, "description"),
    POLICY_RULE((short)3, "policyRule");

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
        case 2: // DESCRIPTION
          return DESCRIPTION;
        case 3: // POLICY_RULE
          return POLICY_RULE;
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
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POLICY_RULE, new org.apache.thrift.meta_data.FieldMetaData("policyRule", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCancellationPolicy.class, metaDataMap);
  }

  public TCancellationPolicy() {
  }

  public TCancellationPolicy(
    java.lang.String id,
    java.lang.String description,
    java.util.Map<java.lang.String,java.lang.String> policyRule)
  {
    this();
    this.id = id;
    this.description = description;
    this.policyRule = policyRule;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCancellationPolicy(TCancellationPolicy other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetPolicyRule()) {
      java.util.Map<java.lang.String,java.lang.String> __this__policyRule = new java.util.HashMap<java.lang.String,java.lang.String>(other.policyRule);
      this.policyRule = __this__policyRule;
    }
  }

  public TCancellationPolicy deepCopy() {
    return new TCancellationPolicy(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.description = null;
    this.policyRule = null;
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

  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(java.lang.String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public int getPolicyRuleSize() {
    return (this.policyRule == null) ? 0 : this.policyRule.size();
  }

  public void putToPolicyRule(java.lang.String key, java.lang.String val) {
    if (this.policyRule == null) {
      this.policyRule = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.policyRule.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.String> getPolicyRule() {
    return this.policyRule;
  }

  public void setPolicyRule(java.util.Map<java.lang.String,java.lang.String> policyRule) {
    this.policyRule = policyRule;
  }

  public void unsetPolicyRule() {
    this.policyRule = null;
  }

  /** Returns true if field policyRule is set (has been assigned a value) and false otherwise */
  public boolean isSetPolicyRule() {
    return this.policyRule != null;
  }

  public void setPolicyRuleIsSet(boolean value) {
    if (!value) {
      this.policyRule = null;
    }
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

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    case POLICY_RULE:
      if (value == null) {
        unsetPolicyRule();
      } else {
        setPolicyRule((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case DESCRIPTION:
      return getDescription();

    case POLICY_RULE:
      return getPolicyRule();

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
    case DESCRIPTION:
      return isSetDescription();
    case POLICY_RULE:
      return isSetPolicyRule();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCancellationPolicy)
      return this.equals((TCancellationPolicy)that);
    return false;
  }

  public boolean equals(TCancellationPolicy that) {
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

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_policyRule = true && this.isSetPolicyRule();
    boolean that_present_policyRule = true && that.isSetPolicyRule();
    if (this_present_policyRule || that_present_policyRule) {
      if (!(this_present_policyRule && that_present_policyRule))
        return false;
      if (!this.policyRule.equals(that.policyRule))
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

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + description.hashCode();

    hashCode = hashCode * 8191 + ((isSetPolicyRule()) ? 131071 : 524287);
    if (isSetPolicyRule())
      hashCode = hashCode * 8191 + policyRule.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCancellationPolicy other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPolicyRule()).compareTo(other.isSetPolicyRule());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPolicyRule()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.policyRule, other.policyRule);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCancellationPolicy(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("policyRule:");
    if (this.policyRule == null) {
      sb.append("null");
    } else {
      sb.append(this.policyRule);
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

  private static class TCancellationPolicyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCancellationPolicyStandardScheme getScheme() {
      return new TCancellationPolicyStandardScheme();
    }
  }

  private static class TCancellationPolicyStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCancellationPolicy> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCancellationPolicy struct) throws org.apache.thrift.TException {
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
          case 2: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POLICY_RULE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.policyRule = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map10.size);
                java.lang.String _key11;
                java.lang.String _val12;
                for (int _i13 = 0; _i13 < _map10.size; ++_i13)
                {
                  _key11 = iprot.readString();
                  _val12 = iprot.readString();
                  struct.policyRule.put(_key11, _val12);
                }
                iprot.readMapEnd();
              }
              struct.setPolicyRuleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCancellationPolicy struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.description);
        oprot.writeFieldEnd();
      }
      if (struct.policyRule != null) {
        oprot.writeFieldBegin(POLICY_RULE_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.policyRule.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter14 : struct.policyRule.entrySet())
          {
            oprot.writeString(_iter14.getKey());
            oprot.writeString(_iter14.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCancellationPolicyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCancellationPolicyTupleScheme getScheme() {
      return new TCancellationPolicyTupleScheme();
    }
  }

  private static class TCancellationPolicyTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCancellationPolicy> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCancellationPolicy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetDescription()) {
        optionals.set(1);
      }
      if (struct.isSetPolicyRule()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetPolicyRule()) {
        {
          oprot.writeI32(struct.policyRule.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter15 : struct.policyRule.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            oprot.writeString(_iter15.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCancellationPolicy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.policyRule = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map16.size);
          java.lang.String _key17;
          java.lang.String _val18;
          for (int _i19 = 0; _i19 < _map16.size; ++_i19)
          {
            _key17 = iprot.readString();
            _val18 = iprot.readString();
            struct.policyRule.put(_key17, _val18);
          }
        }
        struct.setPolicyRuleIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

