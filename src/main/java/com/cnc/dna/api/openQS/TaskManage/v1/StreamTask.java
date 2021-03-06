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

public class StreamTask implements com.cnc.dna.platform.thrift.TBase<StreamTask, StreamTask._Fields>, java.io.Serializable, Cloneable {
  private static final com.cnc.dna.platform.thrift.protocol.TStruct STRUCT_DESC = new com.cnc.dna.platform.thrift.protocol.TStruct("StreamTask");

  private static final com.cnc.dna.platform.thrift.protocol.TField ID_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("id", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)1);
  private static final com.cnc.dna.platform.thrift.protocol.TField NAME_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("name", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)2);
  private static final com.cnc.dna.platform.thrift.protocol.TField LIVE_STREAM_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("liveStream", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)3);
  private static final com.cnc.dna.platform.thrift.protocol.TField URL_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("url", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)4);
  private static final com.cnc.dna.platform.thrift.protocol.TField STATUS_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("status", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)5);
  private static final com.cnc.dna.platform.thrift.protocol.TField IP_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("ip", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)6);
  private static final com.cnc.dna.platform.thrift.protocol.TField TYPE_FIELD_DESC = new com.cnc.dna.platform.thrift.protocol.TField("type", com.cnc.dna.platform.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StreamTaskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StreamTaskTupleSchemeFactory());
  }

  private String id; // required
  private String name; // required
  private String liveStream; // required
  private String url; // required
  private String status; // required
  private String ip; // required
  private String type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.cnc.dna.platform.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    LIVE_STREAM((short)3, "liveStream"),
    URL((short)4, "url"),
    STATUS((short)5, "status"),
    IP((short)6, "ip"),
    TYPE((short)7, "type");

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
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // LIVE_STREAM
          return LIVE_STREAM;
        case 4: // URL
          return URL;
        case 5: // STATUS
          return STATUS;
        case 6: // IP
          return IP;
        case 7: // TYPE
          return TYPE;
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
    tmpMap.put(_Fields.ID, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("id", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.ID);
    tmpMap.put(_Fields.NAME, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("name", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.NAME);
    tmpMap.put(_Fields.LIVE_STREAM, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("liveStream", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.LIVE_STREAM);
    tmpMap.put(_Fields.URL, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("url", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.URL);
    tmpMap.put(_Fields.STATUS, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("status", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.STATUS);
    tmpMap.put(_Fields.IP, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("ip", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.IP);
    tmpMap.put(_Fields.TYPE, new com.cnc.dna.platform.thrift.meta_data.FieldMetaData("type", com.cnc.dna.platform.thrift.TFieldRequirementType.DEFAULT, 
        new com.cnc.dna.platform.thrift.meta_data.FieldValueMetaData(com.cnc.dna.platform.thrift.protocol.TType.STRING)));
    fieldList.add(_Fields.TYPE);
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    com.cnc.dna.platform.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StreamTask.class, metaDataMap);
  }

  public _Fields getFieldByIndex(int index) {
  	if ((!fieldList.isEmpty()) && index >= 0 && index < fieldList.size()) {
		return fieldList.get(index);
	}
	else {
		return null;
	}
}
  public StreamTask() {
    this.status = "0";

  }

  public StreamTask(
    String id,
    String name,
    String liveStream,
    String url,
    String status,
    String ip,
    String type)
  {
    this();
    this.id = id;
    this.name = name;
    this.liveStream = liveStream;
    this.url = url;
    this.status = status;
    this.ip = ip;
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StreamTask(StreamTask other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetLiveStream()) {
      this.liveStream = other.liveStream;
    }
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetIp()) {
      this.ip = other.ip;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
  }

  public StreamTask deepCopy() {
    return new StreamTask(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.name = null;
    this.liveStream = null;
    this.url = null;
    this.status = "0";

    this.ip = null;
    this.type = null;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
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

  public String getLiveStream() {
    return this.liveStream;
  }

  public void setLiveStream(String liveStream) {
    this.liveStream = liveStream;
  }

  public void unsetLiveStream() {
    this.liveStream = null;
  }

  /** Returns true if field liveStream is set (has been assigned a value) and false otherwise */
  public boolean isSetLiveStream() {
    return this.liveStream != null;
  }

  public void setLiveStreamIsSet(boolean value) {
    if (!value) {
      this.liveStream = null;
    }
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been assigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public void unsetIp() {
    this.ip = null;
  }

  /** Returns true if field ip is set (has been assigned a value) and false otherwise */
  public boolean isSetIp() {
    return this.ip != null;
  }

  public void setIpIsSet(boolean value) {
    if (!value) {
      this.ip = null;
    }
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case LIVE_STREAM:
      if (value == null) {
        unsetLiveStream();
      } else {
        setLiveStream((String)value);
      }
      break;

    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((String)value);
      }
      break;

    case IP:
      if (value == null) {
        unsetIp();
      } else {
        setIp((String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case LIVE_STREAM:
      return getLiveStream();

    case URL:
      return getUrl();

    case STATUS:
      return getStatus();

    case IP:
      return getIp();

    case TYPE:
      return getType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case LIVE_STREAM:
      return isSetLiveStream();
    case URL:
      return isSetUrl();
    case STATUS:
      return isSetStatus();
    case IP:
      return isSetIp();
    case TYPE:
      return isSetType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StreamTask)
      return this.equals((StreamTask)that);
    return false;
  }

  public boolean equals(StreamTask that) {
    if (that == null)
      return false;

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

    boolean this_present_liveStream = true && this.isSetLiveStream();
    boolean that_present_liveStream = true && that.isSetLiveStream();
    if (this_present_liveStream || that_present_liveStream) {
      if (!(this_present_liveStream && that_present_liveStream))
        return false;
      if (!this.liveStream.equals(that.liveStream))
        return false;
    }

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_ip = true && this.isSetIp();
    boolean that_present_ip = true && that.isSetIp();
    if (this_present_ip || that_present_ip) {
      if (!(this_present_ip && that_present_ip))
        return false;
      if (!this.ip.equals(that.ip))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(StreamTask other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StreamTask typedOther = (StreamTask)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLiveStream()).compareTo(typedOther.isSetLiveStream());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLiveStream()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.liveStream, typedOther.liveStream);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUrl()).compareTo(typedOther.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.url, typedOther.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIp()).compareTo(typedOther.isSetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIp()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.ip, typedOther.ip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = com.cnc.dna.platform.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
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
    StringBuilder sb = new StringBuilder("StreamTask(");
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
    sb.append("liveStream:");
    if (this.liveStream == null) {
      sb.append("null");
    } else {
      sb.append(this.liveStream);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("url:");
    if (this.url == null) {
      sb.append("null");
    } else {
      sb.append(this.url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ip:");
    if (this.ip == null) {
      sb.append("null");
    } else {
      sb.append(this.ip);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
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

  private static class StreamTaskStandardSchemeFactory implements SchemeFactory {
    public StreamTaskStandardScheme getScheme() {
      return new StreamTaskStandardScheme();
    }
  }

  private static class StreamTaskStandardScheme extends StandardScheme<StreamTask> {

    public void read(com.cnc.dna.platform.thrift.protocol.TProtocol iprot, StreamTask struct)  {
      com.cnc.dna.platform.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LIVE_STREAM
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.liveStream = iprot.readString();
              struct.setLiveStreamIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // URL
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.url = iprot.readString();
              struct.setUrlIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.status = iprot.readString();
              struct.setStatusIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IP
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.ip = iprot.readString();
              struct.setIpIsSet(true);
            } else { 
              com.cnc.dna.platform.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TYPE
            if (schemeField.type == com.cnc.dna.platform.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
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

    public void write(com.cnc.dna.platform.thrift.protocol.TProtocol oprot, StreamTask struct)  {
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
      if (struct.liveStream != null) {
        oprot.writeFieldBegin(LIVE_STREAM_FIELD_DESC);
        oprot.writeString(struct.liveStream);
        oprot.writeFieldEnd();
      }
      if (struct.url != null) {
        oprot.writeFieldBegin(URL_FIELD_DESC);
        oprot.writeString(struct.url);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeString(struct.status);
        oprot.writeFieldEnd();
      }
      if (struct.ip != null) {
        oprot.writeFieldBegin(IP_FIELD_DESC);
        oprot.writeString(struct.ip);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StreamTaskTupleSchemeFactory implements SchemeFactory {
    public StreamTaskTupleScheme getScheme() {
      return new StreamTaskTupleScheme();
    }
  }

  private static class StreamTaskTupleScheme extends TupleScheme<StreamTask> {

    @Override
    public void write(com.cnc.dna.platform.thrift.protocol.TProtocol prot, StreamTask struct)  {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetLiveStream()) {
        optionals.set(2);
      }
      if (struct.isSetUrl()) {
        optionals.set(3);
      }
      if (struct.isSetStatus()) {
        optionals.set(4);
      }
      if (struct.isSetIp()) {
        optionals.set(5);
      }
      if (struct.isSetType()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetLiveStream()) {
        oprot.writeString(struct.liveStream);
      }
      if (struct.isSetUrl()) {
        oprot.writeString(struct.url);
      }
      if (struct.isSetStatus()) {
        oprot.writeString(struct.status);
      }
      if (struct.isSetIp()) {
        oprot.writeString(struct.ip);
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
    }

    @Override
    public void read(com.cnc.dna.platform.thrift.protocol.TProtocol prot, StreamTask struct)  {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.liveStream = iprot.readString();
        struct.setLiveStreamIsSet(true);
      }
      if (incoming.get(3)) {
        struct.url = iprot.readString();
        struct.setUrlIsSet(true);
      }
      if (incoming.get(4)) {
        struct.status = iprot.readString();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(5)) {
        struct.ip = iprot.readString();
        struct.setIpIsSet(true);
      }
      if (incoming.get(6)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
    }
  }

}

