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
 * ChildChainExecutableResponseOrBuilder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ChildChainExecutableResponseOrBuilder {
  @SerializedName("passThroughData")
  private ByteString passThroughData = null;

  @SerializedName("lastLink")
  private Boolean lastLink = null;

  @SerializedName("suspend")
  private Boolean suspend = null;

  @SerializedName("nextChildIdBytes")
  private ByteString nextChildIdBytes = null;

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

  @SerializedName("defaultInstanceForType")
  private Message defaultInstanceForType = null;

  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  public ChildChainExecutableResponseOrBuilder passThroughData(ByteString passThroughData) {
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

  public ChildChainExecutableResponseOrBuilder lastLink(Boolean lastLink) {
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

  public ChildChainExecutableResponseOrBuilder suspend(Boolean suspend) {
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

  public ChildChainExecutableResponseOrBuilder nextChildIdBytes(ByteString nextChildIdBytes) {
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

  public ChildChainExecutableResponseOrBuilder previousChildIdBytes(ByteString previousChildIdBytes) {
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

  public ChildChainExecutableResponseOrBuilder previousChildId(String previousChildId) {
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

  public ChildChainExecutableResponseOrBuilder nextChildId(String nextChildId) {
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

  public ChildChainExecutableResponseOrBuilder allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ChildChainExecutableResponseOrBuilder putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ChildChainExecutableResponseOrBuilder initializationErrorString(String initializationErrorString) {
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

  public ChildChainExecutableResponseOrBuilder descriptorForType(Descriptor descriptorForType) {
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

  public ChildChainExecutableResponseOrBuilder defaultInstanceForType(Message defaultInstanceForType) {
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

  public ChildChainExecutableResponseOrBuilder unknownFields(UnknownFieldSet unknownFields) {
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

  public ChildChainExecutableResponseOrBuilder initialized(Boolean initialized) {
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
    ChildChainExecutableResponseOrBuilder childChainExecutableResponseOrBuilder = (ChildChainExecutableResponseOrBuilder) o;
    return Objects.equals(this.passThroughData, childChainExecutableResponseOrBuilder.passThroughData) &&
        Objects.equals(this.lastLink, childChainExecutableResponseOrBuilder.lastLink) &&
        Objects.equals(this.suspend, childChainExecutableResponseOrBuilder.suspend) &&
        Objects.equals(this.nextChildIdBytes, childChainExecutableResponseOrBuilder.nextChildIdBytes) &&
        Objects.equals(this.previousChildIdBytes, childChainExecutableResponseOrBuilder.previousChildIdBytes) &&
        Objects.equals(this.previousChildId, childChainExecutableResponseOrBuilder.previousChildId) &&
        Objects.equals(this.nextChildId, childChainExecutableResponseOrBuilder.nextChildId) &&
        Objects.equals(this.allFields, childChainExecutableResponseOrBuilder.allFields) &&
        Objects.equals(this.initializationErrorString, childChainExecutableResponseOrBuilder.initializationErrorString) &&
        Objects.equals(this.descriptorForType, childChainExecutableResponseOrBuilder.descriptorForType) &&
        Objects.equals(this.defaultInstanceForType, childChainExecutableResponseOrBuilder.defaultInstanceForType) &&
        Objects.equals(this.unknownFields, childChainExecutableResponseOrBuilder.unknownFields) &&
        Objects.equals(this.initialized, childChainExecutableResponseOrBuilder.initialized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passThroughData, lastLink, suspend, nextChildIdBytes, previousChildIdBytes, previousChildId, nextChildId, allFields, initializationErrorString, descriptorForType, defaultInstanceForType, unknownFields, initialized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildChainExecutableResponseOrBuilder {\n");
    
    sb.append("    passThroughData: ").append(toIndentedString(passThroughData)).append("\n");
    sb.append("    lastLink: ").append(toIndentedString(lastLink)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    nextChildIdBytes: ").append(toIndentedString(nextChildIdBytes)).append("\n");
    sb.append("    previousChildIdBytes: ").append(toIndentedString(previousChildIdBytes)).append("\n");
    sb.append("    previousChildId: ").append(toIndentedString(previousChildId)).append("\n");
    sb.append("    nextChildId: ").append(toIndentedString(nextChildId)).append("\n");
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
