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
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.Message;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ChildrenExecutableResponseOrBuilder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ChildrenExecutableResponseOrBuilder {
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

  @SerializedName("defaultInstanceForType")
  private Message defaultInstanceForType = null;

  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  public ChildrenExecutableResponseOrBuilder childrenList(List<Child> childrenList) {
    this.childrenList = childrenList;
    return this;
  }

  public ChildrenExecutableResponseOrBuilder addChildrenListItem(Child childrenListItem) {
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

  public ChildrenExecutableResponseOrBuilder childrenOrBuilderList(List<ChildOrBuilder> childrenOrBuilderList) {
    this.childrenOrBuilderList = childrenOrBuilderList;
    return this;
  }

  public ChildrenExecutableResponseOrBuilder addChildrenOrBuilderListItem(ChildOrBuilder childrenOrBuilderListItem) {
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

  public ChildrenExecutableResponseOrBuilder childrenCount(Integer childrenCount) {
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

  public ChildrenExecutableResponseOrBuilder allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ChildrenExecutableResponseOrBuilder putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ChildrenExecutableResponseOrBuilder initializationErrorString(String initializationErrorString) {
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

  public ChildrenExecutableResponseOrBuilder descriptorForType(Descriptor descriptorForType) {
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

  public ChildrenExecutableResponseOrBuilder defaultInstanceForType(Message defaultInstanceForType) {
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

  public ChildrenExecutableResponseOrBuilder unknownFields(UnknownFieldSet unknownFields) {
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

  public ChildrenExecutableResponseOrBuilder initialized(Boolean initialized) {
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
    ChildrenExecutableResponseOrBuilder childrenExecutableResponseOrBuilder = (ChildrenExecutableResponseOrBuilder) o;
    return Objects.equals(this.childrenList, childrenExecutableResponseOrBuilder.childrenList) &&
        Objects.equals(this.childrenOrBuilderList, childrenExecutableResponseOrBuilder.childrenOrBuilderList) &&
        Objects.equals(this.childrenCount, childrenExecutableResponseOrBuilder.childrenCount) &&
        Objects.equals(this.allFields, childrenExecutableResponseOrBuilder.allFields) &&
        Objects.equals(this.initializationErrorString, childrenExecutableResponseOrBuilder.initializationErrorString) &&
        Objects.equals(this.descriptorForType, childrenExecutableResponseOrBuilder.descriptorForType) &&
        Objects.equals(this.defaultInstanceForType, childrenExecutableResponseOrBuilder.defaultInstanceForType) &&
        Objects.equals(this.unknownFields, childrenExecutableResponseOrBuilder.unknownFields) &&
        Objects.equals(this.initialized, childrenExecutableResponseOrBuilder.initialized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childrenList, childrenOrBuilderList, childrenCount, allFields, initializationErrorString, descriptorForType, defaultInstanceForType, unknownFields, initialized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildrenExecutableResponseOrBuilder {\n");
    
    sb.append("    childrenList: ").append(toIndentedString(childrenList)).append("\n");
    sb.append("    childrenOrBuilderList: ").append(toIndentedString(childrenOrBuilderList)).append("\n");
    sb.append("    childrenCount: ").append(toIndentedString(childrenCount)).append("\n");
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
