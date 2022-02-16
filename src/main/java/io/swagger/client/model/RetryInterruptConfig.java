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
import io.swagger.client.model.ParserRetryInterruptConfig;
import io.swagger.client.model.RetryInterruptConfig;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * RetryInterruptConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class RetryInterruptConfig {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserRetryInterruptConfig parserForType = null;

  @SerializedName("defaultInstanceForType")
  private RetryInterruptConfig defaultInstanceForType = null;

  @SerializedName("retryId")
  private String retryId = null;

  @SerializedName("retryIdBytes")
  private ByteString retryIdBytes = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public RetryInterruptConfig unknownFields(UnknownFieldSet unknownFields) {
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

  public RetryInterruptConfig initialized(Boolean initialized) {
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

  public RetryInterruptConfig serializedSize(Integer serializedSize) {
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

  public RetryInterruptConfig parserForType(ParserRetryInterruptConfig parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserRetryInterruptConfig getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserRetryInterruptConfig parserForType) {
    this.parserForType = parserForType;
  }

  public RetryInterruptConfig defaultInstanceForType(RetryInterruptConfig defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public RetryInterruptConfig getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(RetryInterruptConfig defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public RetryInterruptConfig retryId(String retryId) {
    this.retryId = retryId;
    return this;
  }

   /**
   * Get retryId
   * @return retryId
  **/
  @Schema(description = "")
  public String getRetryId() {
    return retryId;
  }

  public void setRetryId(String retryId) {
    this.retryId = retryId;
  }

  public RetryInterruptConfig retryIdBytes(ByteString retryIdBytes) {
    this.retryIdBytes = retryIdBytes;
    return this;
  }

   /**
   * Get retryIdBytes
   * @return retryIdBytes
  **/
  @Schema(description = "")
  public ByteString getRetryIdBytes() {
    return retryIdBytes;
  }

  public void setRetryIdBytes(ByteString retryIdBytes) {
    this.retryIdBytes = retryIdBytes;
  }

  public RetryInterruptConfig allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public RetryInterruptConfig putAllFieldsItem(String key, Object allFieldsItem) {
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

  public RetryInterruptConfig initializationErrorString(String initializationErrorString) {
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

  public RetryInterruptConfig descriptorForType(Descriptor descriptorForType) {
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

  public RetryInterruptConfig memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    RetryInterruptConfig retryInterruptConfig = (RetryInterruptConfig) o;
    return Objects.equals(this.unknownFields, retryInterruptConfig.unknownFields) &&
        Objects.equals(this.initialized, retryInterruptConfig.initialized) &&
        Objects.equals(this.serializedSize, retryInterruptConfig.serializedSize) &&
        Objects.equals(this.parserForType, retryInterruptConfig.parserForType) &&
        Objects.equals(this.defaultInstanceForType, retryInterruptConfig.defaultInstanceForType) &&
        Objects.equals(this.retryId, retryInterruptConfig.retryId) &&
        Objects.equals(this.retryIdBytes, retryInterruptConfig.retryIdBytes) &&
        Objects.equals(this.allFields, retryInterruptConfig.allFields) &&
        Objects.equals(this.initializationErrorString, retryInterruptConfig.initializationErrorString) &&
        Objects.equals(this.descriptorForType, retryInterruptConfig.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, retryInterruptConfig.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, serializedSize, parserForType, defaultInstanceForType, retryId, retryIdBytes, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryInterruptConfig {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    retryId: ").append(toIndentedString(retryId)).append("\n");
    sb.append("    retryIdBytes: ").append(toIndentedString(retryIdBytes)).append("\n");
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
