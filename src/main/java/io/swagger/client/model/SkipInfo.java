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
import io.swagger.client.model.ParserSkipInfo;
import io.swagger.client.model.SkipInfo;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * SkipInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SkipInfo {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserSkipInfo parserForType = null;

  @SerializedName("defaultInstanceForType")
  private SkipInfo defaultInstanceForType = null;

  @SerializedName("skipCondition")
  private String skipCondition = null;

  @SerializedName("skipConditionBytes")
  private ByteString skipConditionBytes = null;

  @SerializedName("evaluatedCondition")
  private Boolean evaluatedCondition = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public SkipInfo unknownFields(UnknownFieldSet unknownFields) {
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

  public SkipInfo initialized(Boolean initialized) {
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

  public SkipInfo serializedSize(Integer serializedSize) {
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

  public SkipInfo parserForType(ParserSkipInfo parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserSkipInfo getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserSkipInfo parserForType) {
    this.parserForType = parserForType;
  }

  public SkipInfo defaultInstanceForType(SkipInfo defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public SkipInfo getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(SkipInfo defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public SkipInfo skipCondition(String skipCondition) {
    this.skipCondition = skipCondition;
    return this;
  }

   /**
   * Get skipCondition
   * @return skipCondition
  **/
  @Schema(description = "")
  public String getSkipCondition() {
    return skipCondition;
  }

  public void setSkipCondition(String skipCondition) {
    this.skipCondition = skipCondition;
  }

  public SkipInfo skipConditionBytes(ByteString skipConditionBytes) {
    this.skipConditionBytes = skipConditionBytes;
    return this;
  }

   /**
   * Get skipConditionBytes
   * @return skipConditionBytes
  **/
  @Schema(description = "")
  public ByteString getSkipConditionBytes() {
    return skipConditionBytes;
  }

  public void setSkipConditionBytes(ByteString skipConditionBytes) {
    this.skipConditionBytes = skipConditionBytes;
  }

  public SkipInfo evaluatedCondition(Boolean evaluatedCondition) {
    this.evaluatedCondition = evaluatedCondition;
    return this;
  }

   /**
   * Get evaluatedCondition
   * @return evaluatedCondition
  **/
  @Schema(description = "")
  public Boolean isEvaluatedCondition() {
    return evaluatedCondition;
  }

  public void setEvaluatedCondition(Boolean evaluatedCondition) {
    this.evaluatedCondition = evaluatedCondition;
  }

  public SkipInfo allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public SkipInfo putAllFieldsItem(String key, Object allFieldsItem) {
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

  public SkipInfo initializationErrorString(String initializationErrorString) {
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

  public SkipInfo descriptorForType(Descriptor descriptorForType) {
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

  public SkipInfo memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    SkipInfo skipInfo = (SkipInfo) o;
    return Objects.equals(this.unknownFields, skipInfo.unknownFields) &&
        Objects.equals(this.initialized, skipInfo.initialized) &&
        Objects.equals(this.serializedSize, skipInfo.serializedSize) &&
        Objects.equals(this.parserForType, skipInfo.parserForType) &&
        Objects.equals(this.defaultInstanceForType, skipInfo.defaultInstanceForType) &&
        Objects.equals(this.skipCondition, skipInfo.skipCondition) &&
        Objects.equals(this.skipConditionBytes, skipInfo.skipConditionBytes) &&
        Objects.equals(this.evaluatedCondition, skipInfo.evaluatedCondition) &&
        Objects.equals(this.allFields, skipInfo.allFields) &&
        Objects.equals(this.initializationErrorString, skipInfo.initializationErrorString) &&
        Objects.equals(this.descriptorForType, skipInfo.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, skipInfo.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, serializedSize, parserForType, defaultInstanceForType, skipCondition, skipConditionBytes, evaluatedCondition, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkipInfo {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    skipCondition: ").append(toIndentedString(skipCondition)).append("\n");
    sb.append("    skipConditionBytes: ").append(toIndentedString(skipConditionBytes)).append("\n");
    sb.append("    evaluatedCondition: ").append(toIndentedString(evaluatedCondition)).append("\n");
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
