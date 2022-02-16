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
import io.swagger.client.model.ChildChainExecutableResponse;
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.ParserChildChainExecutableResponse;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ChildChainExecutableResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ChildChainExecutableResponse {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("passThroughData")
  private ByteString passThroughData = null;

  @SerializedName("lastLink")
  private Boolean lastLink = null;

  @SerializedName("suspend")
  private Boolean suspend = null;

  @SerializedName("nextChildIdBytes")
  private ByteString nextChildIdBytes = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserChildChainExecutableResponse parserForType = null;

  @SerializedName("defaultInstanceForType")
  private ChildChainExecutableResponse defaultInstanceForType = null;

  @SerializedName("previousChildIdBytes")
  private ByteString previousChildIdBytes = null;

  @SerializedName("previousChildId")
  private String previousChildId = null;

  @SerializedName("nextChildId")
  private String nextChildId = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public ChildChainExecutableResponse unknownFields(UnknownFieldSet unknownFields) {
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

  public ChildChainExecutableResponse initialized(Boolean initialized) {
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

  public ChildChainExecutableResponse passThroughData(ByteString passThroughData) {
    this.passThroughData = passThroughData;
    return this;
  }

   /**
   * Get passThroughData
   * @return passThroughData
  **/
  @Schema(description = "")
  public ByteString getPassThroughData() {
    return passThroughData;
  }

  public void setPassThroughData(ByteString passThroughData) {
    this.passThroughData = passThroughData;
  }

  public ChildChainExecutableResponse lastLink(Boolean lastLink) {
    this.lastLink = lastLink;
    return this;
  }

   /**
   * Get lastLink
   * @return lastLink
  **/
  @Schema(description = "")
  public Boolean isLastLink() {
    return lastLink;
  }

  public void setLastLink(Boolean lastLink) {
    this.lastLink = lastLink;
  }

  public ChildChainExecutableResponse suspend(Boolean suspend) {
    this.suspend = suspend;
    return this;
  }

   /**
   * Get suspend
   * @return suspend
  **/
  @Schema(description = "")
  public Boolean isSuspend() {
    return suspend;
  }

  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }

  public ChildChainExecutableResponse nextChildIdBytes(ByteString nextChildIdBytes) {
    this.nextChildIdBytes = nextChildIdBytes;
    return this;
  }

   /**
   * Get nextChildIdBytes
   * @return nextChildIdBytes
  **/
  @Schema(description = "")
  public ByteString getNextChildIdBytes() {
    return nextChildIdBytes;
  }

  public void setNextChildIdBytes(ByteString nextChildIdBytes) {
    this.nextChildIdBytes = nextChildIdBytes;
  }

  public ChildChainExecutableResponse serializedSize(Integer serializedSize) {
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

  public ChildChainExecutableResponse parserForType(ParserChildChainExecutableResponse parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserChildChainExecutableResponse getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserChildChainExecutableResponse parserForType) {
    this.parserForType = parserForType;
  }

  public ChildChainExecutableResponse defaultInstanceForType(ChildChainExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public ChildChainExecutableResponse getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(ChildChainExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public ChildChainExecutableResponse previousChildIdBytes(ByteString previousChildIdBytes) {
    this.previousChildIdBytes = previousChildIdBytes;
    return this;
  }

   /**
   * Get previousChildIdBytes
   * @return previousChildIdBytes
  **/
  @Schema(description = "")
  public ByteString getPreviousChildIdBytes() {
    return previousChildIdBytes;
  }

  public void setPreviousChildIdBytes(ByteString previousChildIdBytes) {
    this.previousChildIdBytes = previousChildIdBytes;
  }

  public ChildChainExecutableResponse previousChildId(String previousChildId) {
    this.previousChildId = previousChildId;
    return this;
  }

   /**
   * Get previousChildId
   * @return previousChildId
  **/
  @Schema(description = "")
  public String getPreviousChildId() {
    return previousChildId;
  }

  public void setPreviousChildId(String previousChildId) {
    this.previousChildId = previousChildId;
  }

  public ChildChainExecutableResponse nextChildId(String nextChildId) {
    this.nextChildId = nextChildId;
    return this;
  }

   /**
   * Get nextChildId
   * @return nextChildId
  **/
  @Schema(description = "")
  public String getNextChildId() {
    return nextChildId;
  }

  public void setNextChildId(String nextChildId) {
    this.nextChildId = nextChildId;
  }

  public ChildChainExecutableResponse allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ChildChainExecutableResponse putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ChildChainExecutableResponse initializationErrorString(String initializationErrorString) {
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

  public ChildChainExecutableResponse descriptorForType(Descriptor descriptorForType) {
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

  public ChildChainExecutableResponse memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    ChildChainExecutableResponse childChainExecutableResponse = (ChildChainExecutableResponse) o;
    return Objects.equals(this.unknownFields, childChainExecutableResponse.unknownFields) &&
        Objects.equals(this.initialized, childChainExecutableResponse.initialized) &&
        Objects.equals(this.passThroughData, childChainExecutableResponse.passThroughData) &&
        Objects.equals(this.lastLink, childChainExecutableResponse.lastLink) &&
        Objects.equals(this.suspend, childChainExecutableResponse.suspend) &&
        Objects.equals(this.nextChildIdBytes, childChainExecutableResponse.nextChildIdBytes) &&
        Objects.equals(this.serializedSize, childChainExecutableResponse.serializedSize) &&
        Objects.equals(this.parserForType, childChainExecutableResponse.parserForType) &&
        Objects.equals(this.defaultInstanceForType, childChainExecutableResponse.defaultInstanceForType) &&
        Objects.equals(this.previousChildIdBytes, childChainExecutableResponse.previousChildIdBytes) &&
        Objects.equals(this.previousChildId, childChainExecutableResponse.previousChildId) &&
        Objects.equals(this.nextChildId, childChainExecutableResponse.nextChildId) &&
        Objects.equals(this.allFields, childChainExecutableResponse.allFields) &&
        Objects.equals(this.initializationErrorString, childChainExecutableResponse.initializationErrorString) &&
        Objects.equals(this.descriptorForType, childChainExecutableResponse.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, childChainExecutableResponse.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, passThroughData, lastLink, suspend, nextChildIdBytes, serializedSize, parserForType, defaultInstanceForType, previousChildIdBytes, previousChildId, nextChildId, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildChainExecutableResponse {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    passThroughData: ").append(toIndentedString(passThroughData)).append("\n");
    sb.append("    lastLink: ").append(toIndentedString(lastLink)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    nextChildIdBytes: ").append(toIndentedString(nextChildIdBytes)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    previousChildIdBytes: ").append(toIndentedString(previousChildIdBytes)).append("\n");
    sb.append("    previousChildId: ").append(toIndentedString(previousChildId)).append("\n");
    sb.append("    nextChildId: ").append(toIndentedString(nextChildId)).append("\n");
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