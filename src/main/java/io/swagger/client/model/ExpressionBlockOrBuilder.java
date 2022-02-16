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
import io.swagger.client.model.Message;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ExpressionBlockOrBuilder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ExpressionBlockOrBuilder {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("expressionBytes")
  private ByteString expressionBytes = null;

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

  @SerializedName("defaultInstanceForType")
  private Message defaultInstanceForType = null;

  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  public ExpressionBlockOrBuilder count(Integer count) {
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

  public ExpressionBlockOrBuilder expression(String expression) {
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

  public ExpressionBlockOrBuilder expressionBytes(ByteString expressionBytes) {
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

  public ExpressionBlockOrBuilder expressionValue(String expressionValue) {
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

  public ExpressionBlockOrBuilder expressionValueBytes(ByteString expressionValueBytes) {
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

  public ExpressionBlockOrBuilder allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ExpressionBlockOrBuilder putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ExpressionBlockOrBuilder initializationErrorString(String initializationErrorString) {
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

  public ExpressionBlockOrBuilder descriptorForType(Descriptor descriptorForType) {
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

  public ExpressionBlockOrBuilder defaultInstanceForType(Message defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public Message getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(Message defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public ExpressionBlockOrBuilder unknownFields(UnknownFieldSet unknownFields) {
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

  public ExpressionBlockOrBuilder initialized(Boolean initialized) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressionBlockOrBuilder expressionBlockOrBuilder = (ExpressionBlockOrBuilder) o;
    return Objects.equals(this.count, expressionBlockOrBuilder.count) &&
        Objects.equals(this.expression, expressionBlockOrBuilder.expression) &&
        Objects.equals(this.expressionBytes, expressionBlockOrBuilder.expressionBytes) &&
        Objects.equals(this.expressionValue, expressionBlockOrBuilder.expressionValue) &&
        Objects.equals(this.expressionValueBytes, expressionBlockOrBuilder.expressionValueBytes) &&
        Objects.equals(this.allFields, expressionBlockOrBuilder.allFields) &&
        Objects.equals(this.initializationErrorString, expressionBlockOrBuilder.initializationErrorString) &&
        Objects.equals(this.descriptorForType, expressionBlockOrBuilder.descriptorForType) &&
        Objects.equals(this.defaultInstanceForType, expressionBlockOrBuilder.defaultInstanceForType) &&
        Objects.equals(this.unknownFields, expressionBlockOrBuilder.unknownFields) &&
        Objects.equals(this.initialized, expressionBlockOrBuilder.initialized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, expression, expressionBytes, expressionValue, expressionValueBytes, allFields, initializationErrorString, descriptorForType, defaultInstanceForType, unknownFields, initialized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressionBlockOrBuilder {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    expressionBytes: ").append(toIndentedString(expressionBytes)).append("\n");
    sb.append("    expressionValue: ").append(toIndentedString(expressionValue)).append("\n");
    sb.append("    expressionValueBytes: ").append(toIndentedString(expressionValueBytes)).append("\n");
    sb.append("    allFields: ").append(toIndentedString(allFields)).append("\n");
    sb.append("    initializationErrorString: ").append(toIndentedString(initializationErrorString)).append("\n");
    sb.append("    descriptorForType: ").append(toIndentedString(descriptorForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
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