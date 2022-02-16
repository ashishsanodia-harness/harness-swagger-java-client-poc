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
import io.swagger.client.model.ParserTriggeredBy;
import io.swagger.client.model.TriggeredBy;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * TriggeredBy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class TriggeredBy {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("extraInfoCount")
  private Integer extraInfoCount = null;

  @SerializedName("extraInfoMap")
  private Map<String, String> extraInfoMap = null;

  @SerializedName("uuidBytes")
  private ByteString uuidBytes = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("identifierBytes")
  private ByteString identifierBytes = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserTriggeredBy parserForType = null;

  @SerializedName("defaultInstanceForType")
  private TriggeredBy defaultInstanceForType = null;

  @SerializedName("extraInfo")
  private Map<String, String> extraInfo = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public TriggeredBy unknownFields(UnknownFieldSet unknownFields) {
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

  public TriggeredBy identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public TriggeredBy initialized(Boolean initialized) {
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

  public TriggeredBy extraInfoCount(Integer extraInfoCount) {
    this.extraInfoCount = extraInfoCount;
    return this;
  }

   /**
   * Get extraInfoCount
   * @return extraInfoCount
  **/
  @Schema(description = "")
  public Integer getExtraInfoCount() {
    return extraInfoCount;
  }

  public void setExtraInfoCount(Integer extraInfoCount) {
    this.extraInfoCount = extraInfoCount;
  }

  public TriggeredBy extraInfoMap(Map<String, String> extraInfoMap) {
    this.extraInfoMap = extraInfoMap;
    return this;
  }

  public TriggeredBy putExtraInfoMapItem(String key, String extraInfoMapItem) {
    if (this.extraInfoMap == null) {
      this.extraInfoMap = new HashMap<String, String>();
    }
    this.extraInfoMap.put(key, extraInfoMapItem);
    return this;
  }

   /**
   * Get extraInfoMap
   * @return extraInfoMap
  **/
  @Schema(description = "")
  public Map<String, String> getExtraInfoMap() {
    return extraInfoMap;
  }

  public void setExtraInfoMap(Map<String, String> extraInfoMap) {
    this.extraInfoMap = extraInfoMap;
  }

  public TriggeredBy uuidBytes(ByteString uuidBytes) {
    this.uuidBytes = uuidBytes;
    return this;
  }

   /**
   * Get uuidBytes
   * @return uuidBytes
  **/
  @Schema(description = "")
  public ByteString getUuidBytes() {
    return uuidBytes;
  }

  public void setUuidBytes(ByteString uuidBytes) {
    this.uuidBytes = uuidBytes;
  }

  public TriggeredBy uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TriggeredBy identifierBytes(ByteString identifierBytes) {
    this.identifierBytes = identifierBytes;
    return this;
  }

   /**
   * Get identifierBytes
   * @return identifierBytes
  **/
  @Schema(description = "")
  public ByteString getIdentifierBytes() {
    return identifierBytes;
  }

  public void setIdentifierBytes(ByteString identifierBytes) {
    this.identifierBytes = identifierBytes;
  }

  public TriggeredBy serializedSize(Integer serializedSize) {
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

  public TriggeredBy parserForType(ParserTriggeredBy parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserTriggeredBy getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserTriggeredBy parserForType) {
    this.parserForType = parserForType;
  }

  public TriggeredBy defaultInstanceForType(TriggeredBy defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public TriggeredBy getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(TriggeredBy defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public TriggeredBy extraInfo(Map<String, String> extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  public TriggeredBy putExtraInfoItem(String key, String extraInfoItem) {
    if (this.extraInfo == null) {
      this.extraInfo = new HashMap<String, String>();
    }
    this.extraInfo.put(key, extraInfoItem);
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @Schema(description = "")
  public Map<String, String> getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(Map<String, String> extraInfo) {
    this.extraInfo = extraInfo;
  }

  public TriggeredBy allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public TriggeredBy putAllFieldsItem(String key, Object allFieldsItem) {
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

  public TriggeredBy initializationErrorString(String initializationErrorString) {
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

  public TriggeredBy descriptorForType(Descriptor descriptorForType) {
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

  public TriggeredBy memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    TriggeredBy triggeredBy = (TriggeredBy) o;
    return Objects.equals(this.unknownFields, triggeredBy.unknownFields) &&
        Objects.equals(this.identifier, triggeredBy.identifier) &&
        Objects.equals(this.initialized, triggeredBy.initialized) &&
        Objects.equals(this.extraInfoCount, triggeredBy.extraInfoCount) &&
        Objects.equals(this.extraInfoMap, triggeredBy.extraInfoMap) &&
        Objects.equals(this.uuidBytes, triggeredBy.uuidBytes) &&
        Objects.equals(this.uuid, triggeredBy.uuid) &&
        Objects.equals(this.identifierBytes, triggeredBy.identifierBytes) &&
        Objects.equals(this.serializedSize, triggeredBy.serializedSize) &&
        Objects.equals(this.parserForType, triggeredBy.parserForType) &&
        Objects.equals(this.defaultInstanceForType, triggeredBy.defaultInstanceForType) &&
        Objects.equals(this.extraInfo, triggeredBy.extraInfo) &&
        Objects.equals(this.allFields, triggeredBy.allFields) &&
        Objects.equals(this.initializationErrorString, triggeredBy.initializationErrorString) &&
        Objects.equals(this.descriptorForType, triggeredBy.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, triggeredBy.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, identifier, initialized, extraInfoCount, extraInfoMap, uuidBytes, uuid, identifierBytes, serializedSize, parserForType, defaultInstanceForType, extraInfo, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggeredBy {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    extraInfoCount: ").append(toIndentedString(extraInfoCount)).append("\n");
    sb.append("    extraInfoMap: ").append(toIndentedString(extraInfoMap)).append("\n");
    sb.append("    uuidBytes: ").append(toIndentedString(uuidBytes)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    identifierBytes: ").append(toIndentedString(identifierBytes)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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