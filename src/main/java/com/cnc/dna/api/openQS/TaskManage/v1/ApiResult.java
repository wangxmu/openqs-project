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

public class ApiResult implements com.cnc.dna.platform.thrift.TBase<ApiResult, ApiResult._Fields>, java.io.Serializable, Cloneable {
  private static final com.cnc.dna.platform.thrift.protocol.TStruct STRUCT_DESC = new com.cnc.dna.platform.thrift.protocol.TStruct("ApiResult");

  private static final com.cnc.dna.platform.thrift.protocol.TField RET_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("ret", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)1);
  private static final com.cnc.dna.platform.thrift.protocol.TField MSG_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("msg", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)2);
  private static final com.cnc.dna.platform.thrift.protocol.TField RESULT_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("result", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ApiResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ApiResultTupleSchemeFactory());
  }

  private String ret; // required
  private String msg; // required
  private String result; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.cnc.dna.platform.thrift.TFieldIdEnum {
    RET((short)1, "ret"),
    MSG((short)2, "msg"),
    RESULT((short)3, "result");

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
        case 1: // RET
          return RET;
        case 2: // MSG
          return MSG;
        case 3: // RESULT
          return RESULT;
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
  public static final Map<_Fields, com.cnc.dna.platform.thrift.meta_data.FieldMetaData> metaDataMap;
  public static final List<_Fields> fieldList = new ArrayList();
  static {
    Map<_Fields, com.cnc.dna.platform.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, com.cnc.dna.platform.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RET, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("ret", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.RET);
    tmpMap.put(_Fields.MSG, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("msg", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.MSG);
    tmpMap.put(_Fields.RESULT, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("result", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.RESULT);
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    com.cnc.dna.platform.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ApiResult.class, metaDataMap);
  }

  public _Fields getFieldByIndex(int index) {
  	if ((!fieldList.isEmpty()) && index >= 0 && index < fieldList.size()) {
		return fieldList.get(index);
	}
	else {
		return null;
	}
}
  public ApiResult() {
  }

  public ApiResult(
    String ret,
    String msg,
    String result)
  {
    this();
    this.ret = ret;
    this.msg = msg;
    this.result = result;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ApiResult(ApiResult other) {
    if (other.isSetRet()) {
      this.ret = other.ret;
    }
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    if (other.isSetResult()) {
      this.result = other.result;
    }
  }

  public ApiResult deepCopy() {
    return new ApiResult(this);
  }

  @Override
  public void clear() {
    this.ret = null;
    this.msg = null;
    this.result = null;
  }

  public String getRet() {
    return this.ret;
  }

  public void setRet(String ret) {
    this.ret = ret;
  }

  public void unsetRet() {
    this.ret = null;
  }

  /** Returns true if field ret is set (has been assigned a value) and false otherwise */
  public boolean isSetRet() {
    return this.ret != null;
  }

  public void setRetIsSet(boolean value) {
    if (!value) {
      this.ret = null;
    }
  }

  public String getMsg() {
    return this.msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public String getResult() {
    return this.result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RET:
      if (value == null) {
        unsetRet();
      } else {
        setRet((String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RET:
      return getRet();

    case MSG:
      return getMsg();

    case RESULT:
      return getResult();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RET:
      return isSetRet();
    case MSG:
      return isSetMsg();
    case RESULT:
      return isSetResult();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ApiResult)
      return this.equals((ApiResult)that);
    return false;
  }

  public boolean equals(ApiResult that) {
    if (that == null)
      return false;

    boolean this_present_ret = true && this.isSetRet();
    boolean that_present_ret = true && that.isSetRet();
    if (this_present_ret || that_present_ret) {
      if (!(this_present_ret && that_present_ret))
        return false;
      if (!this.ret.equals(that.ret))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ApiResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ApiResult typedOther = (ApiResult)other;

    lastComparison = Boolean.valueOf(isSetRet()).compareTo(typedOther.isSetRet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRet()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.ret, typedOther.ret);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(typedOther.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.msg, typedOther.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.result, typedOther.result);
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
    StringBuilder sb = new StringBuilder("ApiResult(");
    boolean first = true;

    sb.append("ret:");
    if (this.ret == null) {
      sb.append("null");
    } else {
      sb.append(this.ret);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
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
      read(new com.cnc.dna.platform.thrift.protocol.TCompactProtocol(new com.cnc.dna.platform.thrift.transport.TIOStreamTransport(in)));
    } catch (com.cnc.dna.platform.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ApiResultStandardSchemeFactory implements SchemeFactory {
    public ApiResultStandardScheme getScheme() {
      return new ApiResultStandardScheme();
    }
  }

  private static class ApiResultStandardScheme extends StandardScheme<ApiResult> {

    public void read(com.cnc.dna.platform.thrift.protocol.TProtocol iprot, ApiResult struct)  {
      com.cnc.dna.platform.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RET
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.ret = iprot.readString();
              struct.setRetIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MSG
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULT
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.result = iprot.readString();
              struct.setResultIsSet(true);
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

    public void write(com.cnc.dna.platform.thrift.protocol.TProtocol oprot, ApiResult struct)  {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ret != null) {
        oprot.writeFieldBegin(RET_FIELD_DESC);
        oprot.writeString(struct.ret);
        oprot.writeFieldEnd();
      }
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        oprot.writeString(struct.msg);
        oprot.writeFieldEnd();
      }
      if (struct.result != null) {
        oprot.writeFieldBegin(RESULT_FIELD_DESC);
        oprot.writeString(struct.result);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ApiResultTupleSchemeFactory implements SchemeFactory {
    public ApiResultTupleScheme getScheme() {
      return new ApiResultTupleScheme();
    }
  }

  private static class ApiResultTupleScheme extends TupleScheme<ApiResult> {

    @Override
    public void write(com.cnc.dna.platform.thrift.protocol.TProtocol prot, ApiResult struct)  {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRet()) {
        optionals.set(0);
      }
      if (struct.isSetMsg()) {
        optionals.set(1);
      }
      if (struct.isSetResult()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRet()) {
        oprot.writeString(struct.ret);
      }
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetResult()) {
        oprot.writeString(struct.result);
      }
    }

    @Override
    public void read(com.cnc.dna.platform.thrift.protocol.TProtocol prot, ApiResult struct)  {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.ret = iprot.readString();
        struct.setRetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.result = iprot.readString();
        struct.setResultIsSet(true);
      }
    }
  }

}

