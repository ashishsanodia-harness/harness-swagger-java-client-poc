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
import io.swagger.client.model.Child;
import io.swagger.client.model.ChildOrBuilder;
import io.swagger.client.model.ChildrenExecutableResponse;
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.ParserChildrenExecutableResponse;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ChildrenExecutableResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ChildrenExecutableResponse {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserChildrenExecutableResponse parserForType = null;

  @SerializedName("defaultInstanceForType")
  private ChildrenExecutableResponse defaultInstanceForType = null;

  @SerializedName("childrenList")
  private List<Child> childrenList = null;

  @SerializedName("childrenOrBuilderList")
  private List<ChildOrBuilder> childrenOrBuilderList = null;

  @SerializedName("childrenCount")
  private Integer childrenCount = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public ChildrenExecutableResponse unknownFields(UnknownFieldSet unknownFields) {
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

  public ChildrenExecutableResponse initialized(Boolean initialized) {
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

  public ChildrenExecutableResponse serializedSize(Integer serializedSize) {
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

  public ChildrenExecutableResponse parserForType(ParserChildrenExecutableResponse parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserChildrenExecutableResponse getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserChildrenExecutableResponse parserForType) {
    this.parserForType = parserForType;
  }

  public ChildrenExecutableResponse defaultInstanceForType(ChildrenExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public ChildrenExecutableResponse getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(ChildrenExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public ChildrenExecutableResponse childrenList(List<Child> childrenList) {
    this.childrenList = childrenList;
    return this;
  }

  public ChildrenExecutableResponse addChildrenListItem(Child childrenListItem) {
    if (this.childrenList == null) {
      this.childrenList = new ArrayList<Child>();
    }
    this.childrenList.add(childrenListItem);
    return this;
  }

   /**
   * Get childrenList
   * @return childrenList
  **/
  @Schema(description = "")
  public List<Child> getChildrenList() {
    return childrenList;
  }

  public void setChildrenList(List<Child> childrenList) {
    this.childrenList = childrenList;
  }

  public ChildrenExecutableResponse childrenOrBuilderList(List<ChildOrBuilder> childrenOrBuilderList) {
    this.childrenOrBuilderList = childrenOrBuilderList;
    return this;
  }

  public ChildrenExecutableResponse addChildrenOrBuilderListItem(ChildOrBuilder childrenOrBuilderListItem) {
    if (this.childrenOrBuilderList == null) {
      this.childrenOrBuilderList = new ArrayList<ChildOrBuilder>();
    }
    this.childrenOrBuilderList.add(childrenOrBuilderListItem);
    return this;
  }

   /**
   * Get childrenOrBuilderList
   * @return childrenOrBuilderList
  **/
  @Schema(description = "")
  public List<ChildOrBuilder> getChildrenOrBuilderList() {
    return childrenOrBuilderList;
  }

  public void setChildrenOrBuilderList(List<ChildOrBuilder> childrenOrBuilderList) {
    this.childrenOrBuilderList = childrenOrBuilderList;
  }

  public ChildrenExecutableResponse childrenCount(Integer childrenCount) {
    this.childrenCount = childrenCount;
    return this;
  }

   /**
   * Get childrenCount
   * @return childrenCount
  **/
  @Schema(description = "")
  public Integer getChildrenCount() {
    return childrenCount;
  }

  public void setChildrenCount(Integer childrenCount) {
    this.childrenCount = childrenCount;
  }

  public ChildrenExecutableResponse allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ChildrenExecutableResponse putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ChildrenExecutableResponse initializationErrorString(String initializationErrorString) {
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

  public ChildrenExecutableResponse descriptorForType(Descriptor descriptorForType) {
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

  public ChildrenExecutableResponse memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    ChildrenExecutableResponse childrenExecutableResponse = (ChildrenExecutableResponse) o;
    return Objects.equals(this.unknownFields, childrenExecutableResponse.unknownFields) &&
        Objects.equals(this.initialized, childrenExecutableResponse.initialized) &&
        Objects.equals(this.serializedSize, childrenExecutableResponse.serializedSize) &&
        Objects.equals(this.parserForType, childrenExecutableResponse.parserForType) &&
        Objects.equals(this.defaultInstanceForType, childrenExecutableResponse.defaultInstanceForType) &&
        Objects.equals(this.childrenList, childrenExecutableResponse.childrenList) &&
        Objects.equals(this.childrenOrBuilderList, childrenExecutableResponse.childrenOrBuilderList) &&
        Objects.equals(this.childrenCount, childrenExecutableResponse.childrenCount) &&
        Objects.equals(this.allFields, childrenExecutableResponse.allFields) &&
        Objects.equals(this.initializationErrorString, childrenExecutableResponse.initializationErrorString) &&
        Objects.equals(this.descriptorForType, childrenExecutableResponse.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, childrenExecutableResponse.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, serializedSize, parserForType, defaultInstanceForType, childrenList, childrenOrBuilderList, childrenCount, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildrenExecutableResponse {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    childrenList: ").append(toIndentedString(childrenList)).append("\n");
    sb.append("    childrenOrBuilderList: ").append(toIndentedString(childrenOrBuilderList)).append("\n");
    sb.append("    childrenCount: ").append(toIndentedString(childrenCount)).append("\n");
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
