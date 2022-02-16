/*
 * CD NextGen API Reference
 * This is the Open Api Spec 3 for the NextGen Manager. This is under active development. Beware of the breaking change with respect to the generated code stub  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 3.0
 * Contact: contact@harness.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * JsonNode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class JsonNode {
  @SerializedName("float")
  private Boolean _float = null;

  /**
   * Gets or Sets nodeType
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    ARRAY("ARRAY"),
    BINARY("BINARY"),
    BOOLEAN("BOOLEAN"),
    MISSING("MISSING"),
    NULL("NULL"),
    NUMBER("NUMBER"),
    OBJECT("OBJECT"),
    POJO("POJO"),
    STRING("STRING");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeTypeEnum fromValue(String input) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("nodeType")
  private NodeTypeEnum nodeType = null;

  @SerializedName("number")
  private Boolean number = null;

  @SerializedName("binary")
  private Boolean binary = null;

  @SerializedName("object")
  private Boolean object = null;

  @SerializedName("valueNode")
  private Boolean valueNode = null;

  @SerializedName("containerNode")
  private Boolean containerNode = null;

  @SerializedName("missingNode")
  private Boolean missingNode = null;

  @SerializedName("pojo")
  private Boolean pojo = null;

  @SerializedName("integralNumber")
  private Boolean integralNumber = null;

  @SerializedName("floatingPointNumber")
  private Boolean floatingPointNumber = null;

  @SerializedName("short")
  private Boolean _short = null;

  @SerializedName("int")
  private Boolean _int = null;

  @SerializedName("long")
  private Boolean _long = null;

  @SerializedName("double")
  private Boolean _double = null;

  @SerializedName("bigDecimal")
  private Boolean bigDecimal = null;

  @SerializedName("bigInteger")
  private Boolean bigInteger = null;

  @SerializedName("textual")
  private Boolean textual = null;

  @SerializedName("boolean")
  private Boolean _boolean = null;

  @SerializedName("array")
  private Boolean array = null;

  @SerializedName("null")
  private Boolean _null = null;

  public JsonNode _float(Boolean _float) {
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * @return _float
  **/
  @Schema(description = "")
  public Boolean isFloat() {
    return _float;
  }

  public void setFloat(Boolean _float) {
    this._float = _float;
  }

  public JsonNode nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  public JsonNode number(Boolean number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public Boolean isNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public JsonNode binary(Boolean binary) {
    this.binary = binary;
    return this;
  }

   /**
   * Get binary
   * @return binary
  **/
  @Schema(description = "")
  public Boolean isBinary() {
    return binary;
  }

  public void setBinary(Boolean binary) {
    this.binary = binary;
  }

  public JsonNode object(Boolean object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(description = "")
  public Boolean isObject() {
    return object;
  }

  public void setObject(Boolean object) {
    this.object = object;
  }

  public JsonNode valueNode(Boolean valueNode) {
    this.valueNode = valueNode;
    return this;
  }

   /**
   * Get valueNode
   * @return valueNode
  **/
  @Schema(description = "")
  public Boolean isValueNode() {
    return valueNode;
  }

  public void setValueNode(Boolean valueNode) {
    this.valueNode = valueNode;
  }

  public JsonNode containerNode(Boolean containerNode) {
    this.containerNode = containerNode;
    return this;
  }

   /**
   * Get containerNode
   * @return containerNode
  **/
  @Schema(description = "")
  public Boolean isContainerNode() {
    return containerNode;
  }

  public void setContainerNode(Boolean containerNode) {
    this.containerNode = containerNode;
  }

  public JsonNode missingNode(Boolean missingNode) {
    this.missingNode = missingNode;
    return this;
  }

   /**
   * Get missingNode
   * @return missingNode
  **/
  @Schema(description = "")
  public Boolean isMissingNode() {
    return missingNode;
  }

  public void setMissingNode(Boolean missingNode) {
    this.missingNode = missingNode;
  }

  public JsonNode pojo(Boolean pojo) {
    this.pojo = pojo;
    return this;
  }

   /**
   * Get pojo
   * @return pojo
  **/
  @Schema(description = "")
  public Boolean isPojo() {
    return pojo;
  }

  public void setPojo(Boolean pojo) {
    this.pojo = pojo;
  }

  public JsonNode integralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
    return this;
  }

   /**
   * Get integralNumber
   * @return integralNumber
  **/
  @Schema(description = "")
  public Boolean isIntegralNumber() {
    return integralNumber;
  }

  public void setIntegralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }

  public JsonNode floatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
    return this;
  }

   /**
   * Get floatingPointNumber
   * @return floatingPointNumber
  **/
  @Schema(description = "")
  public Boolean isFloatingPointNumber() {
    return floatingPointNumber;
  }

  public void setFloatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }

  public JsonNode _short(Boolean _short) {
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/
  @Schema(description = "")
  public Boolean isShort() {
    return _short;
  }

  public void setShort(Boolean _short) {
    this._short = _short;
  }

  public JsonNode _int(Boolean _int) {
    this._int = _int;
    return this;
  }

   /**
   * Get _int
   * @return _int
  **/
  @Schema(description = "")
  public Boolean isInt() {
    return _int;
  }

  public void setInt(Boolean _int) {
    this._int = _int;
  }

  public JsonNode _long(Boolean _long) {
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @Schema(description = "")
  public Boolean isLong() {
    return _long;
  }

  public void setLong(Boolean _long) {
    this._long = _long;
  }

  public JsonNode _double(Boolean _double) {
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * @return _double
  **/
  @Schema(description = "")
  public Boolean isDouble() {
    return _double;
  }

  public void setDouble(Boolean _double) {
    this._double = _double;
  }

  public JsonNode bigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
    return this;
  }

   /**
   * Get bigDecimal
   * @return bigDecimal
  **/
  @Schema(description = "")
  public Boolean isBigDecimal() {
    return bigDecimal;
  }

  public void setBigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }

  public JsonNode bigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
    return this;
  }

   /**
   * Get bigInteger
   * @return bigInteger
  **/
  @Schema(description = "")
  public Boolean isBigInteger() {
    return bigInteger;
  }

  public void setBigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }

  public JsonNode textual(Boolean textual) {
    this.textual = textual;
    return this;
  }

   /**
   * Get textual
   * @return textual
  **/
  @Schema(description = "")
  public Boolean isTextual() {
    return textual;
  }

  public void setTextual(Boolean textual) {
    this.textual = textual;
  }

  public JsonNode _boolean(Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }

   /**
   * Get _boolean
   * @return _boolean
  **/
  @Schema(description = "")
  public Boolean isBoolean() {
    return _boolean;
  }

  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }

  public JsonNode array(Boolean array) {
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @Schema(description = "")
  public Boolean isArray() {
    return array;
  }

  public void setArray(Boolean array) {
    this.array = array;
  }

  public JsonNode _null(Boolean _null) {
    this._null = _null;
    return this;
  }

   /**
   * Get _null
   * @return _null
  **/
  @Schema(description = "")
  public Boolean isNull() {
    return _null;
  }

  public void setNull(Boolean _null) {
    this._null = _null;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNode jsonNode = (JsonNode) o;
    return Objects.equals(this._float, jsonNode._float) &&
        Objects.equals(this.nodeType, jsonNode.nodeType) &&
        Objects.equals(this.number, jsonNode.number) &&
        Objects.equals(this.binary, jsonNode.binary) &&
        Objects.equals(this.object, jsonNode.object) &&
        Objects.equals(this.valueNode, jsonNode.valueNode) &&
        Objects.equals(this.containerNode, jsonNode.containerNode) &&
        Objects.equals(this.missingNode, jsonNode.missingNode) &&
        Objects.equals(this.pojo, jsonNode.pojo) &&
        Objects.equals(this.integralNumber, jsonNode.integralNumber) &&
        Objects.equals(this.floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(this._short, jsonNode._short) &&
        Objects.equals(this._int, jsonNode._int) &&
        Objects.equals(this._long, jsonNode._long) &&
        Objects.equals(this._double, jsonNode._double) &&
        Objects.equals(this.bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(this.bigInteger, jsonNode.bigInteger) &&
        Objects.equals(this.textual, jsonNode.textual) &&
        Objects.equals(this._boolean, jsonNode._boolean) &&
        Objects.equals(this.array, jsonNode.array) &&
        Objects.equals(this._null, jsonNode._null);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_float, nodeType, number, binary, object, valueNode, containerNode, missingNode, pojo, integralNumber, floatingPointNumber, _short, _int, _long, _double, bigDecimal, bigInteger, textual, _boolean, array, _null);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNode {\n");
    
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}