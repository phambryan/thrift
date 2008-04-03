/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.facebook.thrift.reflection.limited;

import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class Method implements java.io.Serializable {
  public String name;
  public ThriftType return_type;
  public ArrayList<Argument> arguments;

  public final Isset __isset = new Isset();
  public static final class Isset {
    public boolean name = false;
    public boolean return_type = false;
    public boolean arguments = false;
  }

  public Method() {
  }

  public Method(
    String name,
    ThriftType return_type,
    ArrayList<Argument> arguments)
  {
    this();
    this.name = name;
    this.__isset.name = true;
    this.return_type = return_type;
    this.__isset.return_type = true;
    this.arguments = arguments;
    this.__isset.arguments = true;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id)
      {
        case 1:
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
            this.__isset.name = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2:
          if (field.type == TType.STRUCT) {
            this.return_type = new ThriftType();
            this.return_type.read(iprot);
            this.__isset.return_type = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3:
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.arguments = new ArrayList<Argument>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                Argument _elem2 = new Argument();
                _elem2 = new Argument();
                _elem2.read(iprot);
                this.arguments.add(_elem2);
              }
              iprot.readListEnd();
            }
            this.__isset.arguments = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  public void write(TProtocol oprot) throws TException {
    TStruct struct = new TStruct("Method");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.name != null) {
      field.name = "name";
      field.type = TType.STRING;
      field.id = 1;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.return_type != null) {
      field.name = "return_type";
      field.type = TType.STRUCT;
      field.id = 2;
      oprot.writeFieldBegin(field);
      this.return_type.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.arguments != null) {
      field.name = "arguments";
      field.type = TType.LIST;
      field.id = 3;
      oprot.writeFieldBegin(field);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.arguments.size()));
        for (Argument _iter3 : this.arguments)        {
          _iter3.write(oprot);
          oprot.writeListEnd();
        }
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("Method(");
    sb.append("name:");
    sb.append(this.name);
    sb.append(",return_type:");
    sb.append(this.return_type.toString());
    sb.append(",arguments:");
    sb.append(this.arguments);
    sb.append(")");
    return sb.toString();
  }

}
