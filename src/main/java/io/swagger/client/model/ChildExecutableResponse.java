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
import io.swagger.client.model.ChildExecutableResponse;
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.ParserChildExecutableResponse;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ChildExecutableResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ChildExecutableResponse {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("childNodeId")
  private String childNodeId = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserChildExecutableResponse parserForType = null;

  @SerializedName("defaultInstanceForType")
  private ChildExecutableResponse defaultInstanceForType = null;

  @SerializedName("logKeysList")
  private List<String> logKeysList = null;

  @SerializedName("logKeysCount")
  private Integer logKeysCount = null;

  @SerializedName("unitsList")
  private List<String> unitsList = null;

  @SerializedName("unitsCount")
  private Integer unitsCount = null;

  @SerializedName("childNodeIdBytes")
  private ByteString childNodeIdBytes = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public ChildExecutableResponse unknownFields(UnknownFieldSet unknownFields) {
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

  public ChildExecutableResponse initialized(Boolean initialized) {
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

  public ChildExecutableResponse childNodeId(String childNodeId) {
    this.childNodeId = childNodeId;
    return this;
  }

   /**
   * Get childNodeId
   * @return childNodeId
  **/
  @Schema(description = "")
  public String getChildNodeId() {
    return childNodeId;
  }

  public void setChildNodeId(String childNodeId) {
    this.childNodeId = childNodeId;
  }

  public ChildExecutableResponse serializedSize(Integer serializedSize) {
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

  public ChildExecutableResponse parserForType(ParserChildExecutableResponse parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserChildExecutableResponse getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserChildExecutableResponse parserForType) {
    this.parserForType = parserForType;
  }

  public ChildExecutableResponse defaultInstanceForType(ChildExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public ChildExecutableResponse getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(ChildExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public ChildExecutableResponse logKeysList(List<String> logKeysList) {
    this.logKeysList = logKeysList;
    return this;
  }

  public ChildExecutableResponse addLogKeysListItem(String logKeysListItem) {
    if (this.logKeysList == null) {
      this.logKeysList = new ArrayList<String>();
    }
    this.logKeysList.add(logKeysListItem);
    return this;
  }

   /**
   * Get logKeysList
   * @return logKeysList
  **/
  @Schema(description = "")
  public List<String> getLogKeysList() {
    return logKeysList;
  }

  public void setLogKeysList(List<String> logKeysList) {
    this.logKeysList = logKeysList;
  }

  public ChildExecutableResponse logKeysCount(Integer logKeysCount) {
    this.logKeysCount = logKeysCount;
    return this;
  }

   /**
   * Get logKeysCount
   * @return logKeysCount
  **/
  @Schema(description = "")
  public Integer getLogKeysCount() {
    return logKeysCount;
  }

  public void setLogKeysCount(Integer logKeysCount) {
    this.logKeysCount = logKeysCount;
  }

  public ChildExecutableResponse unitsList(List<String> unitsList) {
    this.unitsList = unitsList;
    return this;
  }

  public ChildExecutableResponse addUnitsListItem(String unitsListItem) {
    if (this.unitsList == null) {
      this.unitsList = new ArrayList<String>();
    }
    this.unitsList.add(unitsListItem);
    return this;
  }

   /**
   * Get unitsList
   * @return unitsList
  **/
  @Schema(description = "")
  public List<String> getUnitsList() {
    return unitsList;
  }

  public void setUnitsList(List<String> unitsList) {
    this.unitsList = unitsList;
  }

  public ChildExecutableResponse unitsCount(Integer unitsCount) {
    this.unitsCount = unitsCount;
    return this;
  }

   /**
   * Get unitsCount
   * @return unitsCount
  **/
  @Schema(description = "")
  public Integer getUnitsCount() {
    return unitsCount;
  }

  public void setUnitsCount(Integer unitsCount) {
    this.unitsCount = unitsCount;
  }

  public ChildExecutableResponse childNodeIdBytes(ByteString childNodeIdBytes) {
    this.childNodeIdBytes = childNodeIdBytes;
    return this;
  }

   /**
   * Get childNodeIdBytes
   * @return childNodeIdBytes
  **/
  @Schema(description = "")
  public ByteString getChildNodeIdBytes() {
    return childNodeIdBytes;
  }

  public void setChildNodeIdBytes(ByteString childNodeIdBytes) {
    this.childNodeIdBytes = childNodeIdBytes;
  }

  public ChildExecutableResponse allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ChildExecutableResponse putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ChildExecutableResponse initializationErrorString(String initializationErrorString) {
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

  public ChildExecutableResponse descriptorForType(Descriptor descriptorForType) {
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

  public ChildExecutableResponse memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    ChildExecutableResponse childExecutableResponse = (ChildExecutableResponse) o;
    return Objects.equals(this.unknownFields, childExecutableResponse.unknownFields) &&
        Objects.equals(this.initialized, childExecutableResponse.initialized) &&
        Objects.equals(this.childNodeId, childExecutableResponse.childNodeId) &&
        Objects.equals(this.serializedSize, childExecutableResponse.serializedSize) &&
        Objects.equals(this.parserForType, childExecutableResponse.parserForType) &&
        Objects.equals(this.defaultInstanceForType, childExecutableResponse.defaultInstanceForType) &&
        Objects.equals(this.logKeysList, childExecutableResponse.logKeysList) &&
        Objects.equals(this.logKeysCount, childExecutableResponse.logKeysCount) &&
        Objects.equals(this.unitsList, childExecutableResponse.unitsList) &&
        Objects.equals(this.unitsCount, childExecutableResponse.unitsCount) &&
        Objects.equals(this.childNodeIdBytes, childExecutableResponse.childNodeIdBytes) &&
        Objects.equals(this.allFields, childExecutableResponse.allFields) &&
        Objects.equals(this.initializationErrorString, childExecutableResponse.initializationErrorString) &&
        Objects.equals(this.descriptorForType, childExecutableResponse.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, childExecutableResponse.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, childNodeId, serializedSize, parserForType, defaultInstanceForType, logKeysList, logKeysCount, unitsList, unitsCount, childNodeIdBytes, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildExecutableResponse {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    childNodeId: ").append(toIndentedString(childNodeId)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    logKeysList: ").append(toIndentedString(logKeysList)).append("\n");
    sb.append("    logKeysCount: ").append(toIndentedString(logKeysCount)).append("\n");
    sb.append("    unitsList: ").append(toIndentedString(unitsList)).append("\n");
    sb.append("    unitsCount: ").append(toIndentedString(unitsCount)).append("\n");
    sb.append("    childNodeIdBytes: ").append(toIndentedString(childNodeIdBytes)).append("\n");
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
