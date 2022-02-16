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
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.Location;
import io.swagger.client.model.LocationOrBuilder;
import io.swagger.client.model.ParserSourceCodeInfo;
import io.swagger.client.model.SourceCodeInfo;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * SourceCodeInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SourceCodeInfo {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("locationList")
  private List<Location> locationList = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserSourceCodeInfo parserForType = null;

  @SerializedName("defaultInstanceForType")
  private SourceCodeInfo defaultInstanceForType = null;

  @SerializedName("locationCount")
  private Integer locationCount = null;

  @SerializedName("locationOrBuilderList")
  private List<LocationOrBuilder> locationOrBuilderList = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public SourceCodeInfo unknownFields(UnknownFieldSet unknownFields) {
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

  public SourceCodeInfo initialized(Boolean initialized) {
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

  public SourceCodeInfo locationList(List<Location> locationList) {
    this.locationList = locationList;
    return this;
  }

  public SourceCodeInfo addLocationListItem(Location locationListItem) {
    if (this.locationList == null) {
      this.locationList = new ArrayList<Location>();
    }
    this.locationList.add(locationListItem);
    return this;
  }

   /**
   * Get locationList
   * @return locationList
  **/
  @Schema(description = "")
  public List<Location> getLocationList() {
    return locationList;
  }

  public void setLocationList(List<Location> locationList) {
    this.locationList = locationList;
  }

  public SourceCodeInfo serializedSize(Integer serializedSize) {
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

  public SourceCodeInfo parserForType(ParserSourceCodeInfo parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserSourceCodeInfo getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserSourceCodeInfo parserForType) {
    this.parserForType = parserForType;
  }

  public SourceCodeInfo defaultInstanceForType(SourceCodeInfo defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public SourceCodeInfo getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(SourceCodeInfo defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public SourceCodeInfo locationCount(Integer locationCount) {
    this.locationCount = locationCount;
    return this;
  }

   /**
   * Get locationCount
   * @return locationCount
  **/
  @Schema(description = "")
  public Integer getLocationCount() {
    return locationCount;
  }

  public void setLocationCount(Integer locationCount) {
    this.locationCount = locationCount;
  }

  public SourceCodeInfo locationOrBuilderList(List<LocationOrBuilder> locationOrBuilderList) {
    this.locationOrBuilderList = locationOrBuilderList;
    return this;
  }

  public SourceCodeInfo addLocationOrBuilderListItem(LocationOrBuilder locationOrBuilderListItem) {
    if (this.locationOrBuilderList == null) {
      this.locationOrBuilderList = new ArrayList<LocationOrBuilder>();
    }
    this.locationOrBuilderList.add(locationOrBuilderListItem);
    return this;
  }

   /**
   * Get locationOrBuilderList
   * @return locationOrBuilderList
  **/
  @Schema(description = "")
  public List<LocationOrBuilder> getLocationOrBuilderList() {
    return locationOrBuilderList;
  }

  public void setLocationOrBuilderList(List<LocationOrBuilder> locationOrBuilderList) {
    this.locationOrBuilderList = locationOrBuilderList;
  }

  public SourceCodeInfo allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public SourceCodeInfo putAllFieldsItem(String key, Object allFieldsItem) {
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

  public SourceCodeInfo initializationErrorString(String initializationErrorString) {
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

  public SourceCodeInfo descriptorForType(Descriptor descriptorForType) {
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

  public SourceCodeInfo memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    SourceCodeInfo sourceCodeInfo = (SourceCodeInfo) o;
    return Objects.equals(this.unknownFields, sourceCodeInfo.unknownFields) &&
        Objects.equals(this.initialized, sourceCodeInfo.initialized) &&
        Objects.equals(this.locationList, sourceCodeInfo.locationList) &&
        Objects.equals(this.serializedSize, sourceCodeInfo.serializedSize) &&
        Objects.equals(this.parserForType, sourceCodeInfo.parserForType) &&
        Objects.equals(this.defaultInstanceForType, sourceCodeInfo.defaultInstanceForType) &&
        Objects.equals(this.locationCount, sourceCodeInfo.locationCount) &&
        Objects.equals(this.locationOrBuilderList, sourceCodeInfo.locationOrBuilderList) &&
        Objects.equals(this.allFields, sourceCodeInfo.allFields) &&
        Objects.equals(this.initializationErrorString, sourceCodeInfo.initializationErrorString) &&
        Objects.equals(this.descriptorForType, sourceCodeInfo.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, sourceCodeInfo.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, locationList, serializedSize, parserForType, defaultInstanceForType, locationCount, locationOrBuilderList, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCodeInfo {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    locationList: ").append(toIndentedString(locationList)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    locationCount: ").append(toIndentedString(locationCount)).append("\n");
    sb.append("    locationOrBuilderList: ").append(toIndentedString(locationOrBuilderList)).append("\n");
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
