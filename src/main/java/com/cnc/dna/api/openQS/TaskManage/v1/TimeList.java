/**
 * Autogenerated by Thrift Compiler (DNA Version, Base 0.90.0)
 *
 *  @CDN Department. ChinaNetCenter 2014
 */
package com.cnc.dna.api.openQS.TaskManage.v1;

import com.cnc.dna.platform.thrift.scheme.IScheme;
import com.cnc.dna.platform.thrift.scheme.SchemeFactory;
import com.cnc.dna.platform.thrift.scheme.StandardScheme;

import com.cnc.dna.platform.thrift.scheme.TupleScheme;
import com.cnc.dna.platform.thrift.protocol.TTupleProtocol;
import com.cnc.dna.platform.thrift.protocol.TProtocolException;
import com.cnc.dna.platform.thrift.EncodingUtils;
import com.cnc.dna.platform.thrift.TException;
import com.cnc.dna.platform.rpc.spi.context.IdlInvocation;
import com.cnc.dna.platform.rpc.spi.context.IdlResult;
import com.cnc.dna.platform.rpc.Handler;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeList implements com.cnc.dna.platform.thrift.TBase<TimeList, TimeList._Fields>, java.io.Serializable, Cloneable {
  private static final com.cnc.dna.platform.thrift.protocol.TStruct STRUCT_DESC = new com.cnc.dna.platform.thrift.protocol.TStruct("TimeList");

  private static final com.cnc.dna.platform.thrift.protocol.TField BEGIN_TIME_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("beginTime", com.cnc.dna.platform.thrift.protocol.TType.I32, (short)1);
  private static final com.cnc.dna.platform.thrift.protocol.TField END_TIME_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("endTime", com.cnc.dna.platform.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimeListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimeListTupleSchemeFactory());
  }

  private int beginTime; // required
  private int endTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.cnc.dna.platform.thrift.TFieldIdEnum {
    BEGIN_TIME((short)1, "beginTime"),
    END_TIME((short)2, "endTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BEGIN_TIME
          return BEGIN_TIME;
        case 2: // END_TIME
          return END_TIME;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BEGINTIME_ISSET_ID = 0;
  private static final int __ENDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, com.cnc.dna.platform.thrift.meta_data.FieldMetaData> metaDataMap;
  public static final List<_Fields> fieldList = new ArrayList();
  static {
    Map<_Fields, com.cnc.dna.platform.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, com.cnc.dna.platform.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BEGIN_TIME, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("beginTime", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.I32)));
    fieldList.add(_Fields.BEGIN_TIME);
    tmpMap.put(_Fields.END_TIME, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("endTime", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.I32)));
    fieldList.add(_Fields.END_TIME);
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    com.cnc.dna.platform.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimeList.class, metaDataMap);
  }

  public _Fields getFieldByIndex(int index) {
  	if ((!fieldList.isEmpty()) && index >= 0 && index < fieldList.size()) {
		return fieldList.get(index);
	}
	else {
		return null;
	}
}
  public TimeList() {
    this.beginTime = 0;

    this.endTime = 23;

  }

  public TimeList(
    int beginTime,
    int endTime)
  {
    this();
    this.beginTime = beginTime;
    setBeginTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimeList(TimeList other) {
    __isset_bitfield = other.__isset_bitfield;
    this.beginTime = other.beginTime;
    this.endTime = other.endTime;
  }

  public TimeList deepCopy() {
    return new TimeList(this);
  }

  @Override
  public void clear() {
    this.beginTime = 0;

    this.endTime = 23;

  }

  public int getBeginTime() {
    return this.beginTime;
  }

  public void setBeginTime(int beginTime) {
    this.beginTime = beginTime;
    setBeginTimeIsSet(true);
  }

  public void unsetBeginTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BEGINTIME_ISSET_ID);
  }

  /** Returns true if field beginTime is set (has been assigned a value) and false otherwise */
  public boolean isSetBeginTime() {
    return EncodingUtils.testBit(__isset_bitfield, __BEGINTIME_ISSET_ID);
  }

  public void setBeginTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BEGINTIME_ISSET_ID, value);
  }

  public int getEndTime() {
    return this.endTime;
  }

  public void setEndTime(int endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
  }

  public void unsetEndTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BEGIN_TIME:
      if (value == null) {
        unsetBeginTime();
      } else {
        setBeginTime((Integer)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BEGIN_TIME:
      return Integer.valueOf(getBeginTime());

    case END_TIME:
      return Integer.valueOf(getEndTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BEGIN_TIME:
      return isSetBeginTime();
    case END_TIME:
      return isSetEndTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimeList)
      return this.equals((TimeList)that);
    return false;
  }

  public boolean equals(TimeList that) {
    if (that == null)
      return false;

    boolean this_present_beginTime = true;
    boolean that_present_beginTime = true;
    if (this_present_beginTime || that_present_beginTime) {
      if (!(this_present_beginTime && that_present_beginTime))
        return false;
      if (this.beginTime != that.beginTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TimeList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TimeList typedOther = (TimeList)other;

    lastComparison = Boolean.valueOf(isSetBeginTime()).compareTo(typedOther.isSetBeginTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeginTime()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.beginTime, typedOther.beginTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTime()).compareTo(typedOther.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.endTime, typedOther.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(com.cnc.dna.platform.thrift.protocol.TProtocol iprot)  {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(com.cnc.dna.platform.thrift.protocol.TProtocol oprot)  {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TimeList(");
    boolean first = true;

    sb.append("beginTime:");
    sb.append(this.beginTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate()  {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new com.cnc.dna.platform.thrift.protocol.TCompactProtocol(new com.cnc.dna.platform.thrift.transport.TIOStreamTransport(out)));
    } catch (com.cnc.dna.platform.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new com.cnc.dna.platform.thrift.protocol.TCompactProtocol(new com.cnc.dna.platform.thrift.transport.TIOStreamTransport(in)));
    } catch (com.cnc.dna.platform.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimeListStandardSchemeFactory implements SchemeFactory {
    public TimeListStandardScheme getScheme() {
      return new TimeListStandardScheme();
    }
  }

  private static class TimeListStandardScheme extends StandardScheme<TimeList> {

    public void read(com.cnc.dna.platform.thrift.protocol.TProtocol iprot, TimeList struct)  {
      com.cnc.dna.platform.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BEGIN_TIME
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.I32) {
              struct.beginTime = iprot.readI32();
              struct.setBeginTimeIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_TIME
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.I32) {
              struct.endTime = iprot.readI32();
              struct.setEndTimeIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(com.cnc.dna.platform.thrift.protocol.TProtocol oprot, TimeList struct)  {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BEGIN_TIME_FIELD_DESC);
      oprot.writeI32(struct.beginTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_TIME_FIELD_DESC);
      oprot.writeI32(struct.endTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimeListTupleSchemeFactory implements SchemeFactory {
    public TimeListTupleScheme getScheme() {
      return new TimeListTupleScheme();
    }
  }

  private static class TimeListTupleScheme extends TupleScheme<TimeList> {

    @Override
    public void write(com.cnc.dna.platform.thrift.protocol.TProtocol prot, TimeList struct)  {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBeginTime()) {
        optionals.set(0);
      }
      if (struct.isSetEndTime()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBeginTime()) {
        oprot.writeI32(struct.beginTime);
      }
      if (struct.isSetEndTime()) {
        oprot.writeI32(struct.endTime);
      }
    }

    @Override
    public void read(com.cnc.dna.platform.thrift.protocol.TProtocol prot, TimeList struct)  {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.beginTime = iprot.readI32();
        struct.setBeginTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endTime = iprot.readI32();
        struct.setEndTimeIsSet(true);
      }
    }
  }

}
