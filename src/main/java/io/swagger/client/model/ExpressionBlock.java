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
import io.swagger.client.model.ByteString;
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.ExpressionBlock;
import io.swagger.client.model.ParserExpressionBlock;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ExpressionBlock
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ExpressionBlock {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("expressionBytes")
  private ByteString expressionBytes = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserExpressionBlock parserForType = null;

  @SerializedName("defaultInstanceForType")
  private ExpressionBlock defaultInstanceForType = null;

  @SerializedName("expressionValue")
  private String expressionValue = null;

  @SerializedName("expressionValueBytes")
  private ByteString expressionValueBytes = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public ExpressionBlock unknownFields(UnknownFieldSet unknownFields) {
    this.unknownFields = unknownFields;
    return this;
  }

   /**
   * Get unknownFields
   * @return unknownFields
  **/
  @Schema(description = "")
  public UnknownFieldSet getUnknownFields() {
    return unknownFields;
  }

  public void setUnknownFields(UnknownFieldSet unknownFields) {
    this.unknownFields = unknownFields;
  }

  public ExpressionBlock count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ExpressionBlock initialized(Boolean initialized) {
    this.initialized = initialized;
    return this;
  }

   /**
   * Get initialized
   * @return initialized
  **/
  @Schema(description = "")
  public Boolean isInitialized() {
    return initialized;
  }

  public void setInitialized(Boolean initialized) {
    this.initialized = initialized;
  }

  public ExpressionBlock expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @Schema(description = "")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public ExpressionBlock expressionBytes(ByteString expressionBytes) {
    this.expressionBytes = expressionBytes;
    return this;
  }

   /**
   * Get expressionBytes
   * @return expressionBytes
  **/
  @Schema(description = "")
  public ByteString getExpressionBytes() {
    return expressionBytes;
  }

  public void setExpressionBytes(ByteString expressionBytes) {
    this.expressionBytes = expressionBytes;
  }

  public ExpressionBlock serializedSize(Integer serializedSize) {
    this.serializedSize = serializedSize;
    return this;
  }

   /**
   * Get serializedSize
   * @return serializedSize
  **/
  @Schema(description = "")
  public Integer getSerializedSize() {
    return serializedSize;
  }

  public void setSerializedSize(Integer serializedSize) {
    this.serializedSize = serializedSize;
  }

  public ExpressionBlock parserForType(ParserExpressionBlock parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserExpressionBlock getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserExpressionBlock parserForType) {
    this.parserForType = parserForType;
  }

  public ExpressionBlock defaultInstanceForType(ExpressionBlock defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public ExpressionBlock getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(ExpressionBlock defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public ExpressionBlock expressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
    return this;
  }

   /**
   * Get expressionValue
   * @return expressionValue
  **/
  @Schema(description = "")
  public String getExpressionValue() {
    return expressionValue;
  }

  public void setExpressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
  }

  public ExpressionBlock expressionValueBytes(ByteString expressionValueBytes) {
    this.expressionValueBytes = expressionValueBytes;
    return this;
  }

   /**
   * Get expressionValueBytes
   * @return expressionValueBytes
  **/
  @Schema(description = "")
  public ByteString getExpressionValueBytes() {
    return expressionValueBytes;
  }

  public void setExpressionValueBytes(ByteString expressionValueBytes) {
    this.expressionValueBytes = expressionValueBytes;
  }

  public ExpressionBlock allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ExpressionBlock putAllFieldsItem(String key, Object allFieldsItem) {
    if (this.allFields == null) {
      this.allFields = new HashMap<String, Object>();
    }
    this.allFields.put(key, allFieldsItem);
    return this;
  }

   /**
   * Get allFields
   * @return allFields
  **/
  @Schema(description = "")
  public Map<String, Object> getAllFields() {
    return allFields;
  }

  public void setAllFields(Map<String, Object> allFields) {
    this.allFields = allFields;
  }

  public ExpressionBlock initializationErrorString(String initializationErrorString) {
    this.initializationErrorString = initializationErrorString;
    return this;
  }

   /**
   * Get initializationErrorString
   * @return initializationErrorString
  **/
  @Schema(description = "")
  public String getInitializationErrorString() {
    return initializationErrorString;
  }

  public void setInitializationErrorString(String initializationErrorString) {
    this.initializationErrorString = initializationErrorString;
  }

  public ExpressionBlock descriptorForType(Descriptor descriptorForType) {
    this.descriptorForType = descriptorForType;
    return this;
  }

   /**
   * Get descriptorForType
   * @return descriptorForType
  **/
  @Schema(description = "")
  public Descriptor getDescriptorForType() {
    return descriptorForType;
  }

  public void setDescriptorForType(Descriptor descriptorForType) {
    this.descriptorForType = descriptorForType;
  }

  public ExpressionBlock memoizedSerializedSize(Integer memoizedSerializedSize) {
    this.memoizedSerializedSize = memoizedSerializedSize;
    return this;
  }

   /**
   * Get memoizedSerializedSize
   * @return memoizedSerializedSize
  **/
  @Schema(description = "")
  public Integer getMemoizedSerializedSize() {
    return memoizedSerializedSize;
  }

  public void setMemoizedSerializedSize(Integer memoizedSerializedSize) {
    this.memoizedSerializedSize = memoizedSerializedSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressionBlock expressionBlock = (ExpressionBlock) o;
    return Objects.equals(this.unknownFields, expressionBlock.unknownFields) &&
        Objects.equals(this.count, expressionBlock.count) &&
        Objects.equals(this.initialized, expressionBlock.initialized) &&
        Objects.equals(this.expression, expressionBlock.expression) &&
        Objects.equals(this.expressionBytes, expressionBlock.expressionBytes) &&
        Objects.equals(this.serializedSize, expressionBlock.serializedSize) &&
        Objects.equals(this.parserForType, expressionBlock.parserForType) &&
        Objects.equals(this.defaultInstanceForType, expressionBlock.defaultInstanceForType) &&
        Objects.equals(this.expressionValue, expressionBlock.expressionValue) &&
        Objects.equals(this.expressionValueBytes, expressionBlock.expressionValueBytes) &&
        Objects.equals(this.allFields, expressionBlock.allFields) &&
        Objects.equals(this.initializationErrorString, expressionBlock.initializationErrorString) &&
        Objects.equals(this.descriptorForType, expressionBlock.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, expressionBlock.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, count, initialized, expression, expressionBytes, serializedSize, parserForType, defaultInstanceForType, expressionValue, expressionValueBytes, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressionBlock {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    expressionBytes: ").append(toIndentedString(expressionBytes)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    expressionValue: ").append(toIndentedString(expressionValue)).append("\n");
    sb.append("    expressionValueBytes: ").append(toIndentedString(expressionValueBytes)).append("\n");
    sb.append("    allFields: ").append(toIndentedString(allFields)).append("\n");
    sb.append("    initializationErrorString: ").append(toIndentedString(initializationErrorString)).append("\n");
    sb.append("    descriptorForType: ").append(toIndentedString(descriptorForType)).append("\n");
    sb.append("    memoizedSerializedSize: ").append(toIndentedString(memoizedSerializedSize)).append("\n");
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
