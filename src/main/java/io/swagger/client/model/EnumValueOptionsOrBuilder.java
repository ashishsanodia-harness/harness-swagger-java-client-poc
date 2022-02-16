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
import io.swagger.client.model.Message;
import io.swagger.client.model.UninterpretedOption;
import io.swagger.client.model.UninterpretedOptionOrBuilder;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * EnumValueOptionsOrBuilder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class EnumValueOptionsOrBuilder {
  @SerializedName("deprecated")
  private Boolean deprecated = null;

  @SerializedName("uninterpretedOptionList")
  private List<UninterpretedOption> uninterpretedOptionList = null;

  @SerializedName("uninterpretedOptionCount")
  private Integer uninterpretedOptionCount = null;

  @SerializedName("uninterpretedOptionOrBuilderList")
  private List<UninterpretedOptionOrBuilder> uninterpretedOptionOrBuilderList = null;

  @SerializedName("defaultInstanceForType")
  private Message defaultInstanceForType = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  public EnumValueOptionsOrBuilder deprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Get deprecated
   * @return deprecated
  **/
  @Schema(description = "")
  public Boolean isDeprecated() {
    return deprecated;
  }

  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }

  public EnumValueOptionsOrBuilder uninterpretedOptionList(List<UninterpretedOption> uninterpretedOptionList) {
    this.uninterpretedOptionList = uninterpretedOptionList;
    return this;
  }

  public EnumValueOptionsOrBuilder addUninterpretedOptionListItem(UninterpretedOption uninterpretedOptionListItem) {
    if (this.uninterpretedOptionList == null) {
      this.uninterpretedOptionList = new ArrayList<UninterpretedOption>();
    }
    this.uninterpretedOptionList.add(uninterpretedOptionListItem);
    return this;
  }

   /**
   * Get uninterpretedOptionList
   * @return uninterpretedOptionList
  **/
  @Schema(description = "")
  public List<UninterpretedOption> getUninterpretedOptionList() {
    return uninterpretedOptionList;
  }

  public void setUninterpretedOptionList(List<UninterpretedOption> uninterpretedOptionList) {
    this.uninterpretedOptionList = uninterpretedOptionList;
  }

  public EnumValueOptionsOrBuilder uninterpretedOptionCount(Integer uninterpretedOptionCount) {
    this.uninterpretedOptionCount = uninterpretedOptionCount;
    return this;
  }

   /**
   * Get uninterpretedOptionCount
   * @return uninterpretedOptionCount
  **/
  @Schema(description = "")
  public Integer getUninterpretedOptionCount() {
    return uninterpretedOptionCount;
  }

  public void setUninterpretedOptionCount(Integer uninterpretedOptionCount) {
    this.uninterpretedOptionCount = uninterpretedOptionCount;
  }

  public EnumValueOptionsOrBuilder uninterpretedOptionOrBuilderList(List<UninterpretedOptionOrBuilder> uninterpretedOptionOrBuilderList) {
    this.uninterpretedOptionOrBuilderList = uninterpretedOptionOrBuilderList;
    return this;
  }

  public EnumValueOptionsOrBuilder addUninterpretedOptionOrBuilderListItem(UninterpretedOptionOrBuilder uninterpretedOptionOrBuilderListItem) {
    if (this.uninterpretedOptionOrBuilderList == null) {
      this.uninterpretedOptionOrBuilderList = new ArrayList<UninterpretedOptionOrBuilder>();
    }
    this.uninterpretedOptionOrBuilderList.add(uninterpretedOptionOrBuilderListItem);
    return this;
  }

   /**
   * Get uninterpretedOptionOrBuilderList
   * @return uninterpretedOptionOrBuilderList
  **/
  @Schema(description = "")
  public List<UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
    return uninterpretedOptionOrBuilderList;
  }

  public void setUninterpretedOptionOrBuilderList(List<UninterpretedOptionOrBuilder> uninterpretedOptionOrBuilderList) {
    this.uninterpretedOptionOrBuilderList = uninterpretedOptionOrBuilderList;
  }

  public EnumValueOptionsOrBuilder defaultInstanceForType(Message defaultInstanceForType) {
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

  public EnumValueOptionsOrBuilder allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public EnumValueOptionsOrBuilder putAllFieldsItem(String key, Object allFieldsItem) {
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

  public EnumValueOptionsOrBuilder initializationErrorString(String initializationErrorString) {
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

  public EnumValueOptionsOrBuilder descriptorForType(Descriptor descriptorForType) {
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

  public EnumValueOptionsOrBuilder unknownFields(UnknownFieldSet unknownFields) {
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

  public EnumValueOptionsOrBuilder initialized(Boolean initialized) {
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
    EnumValueOptionsOrBuilder enumValueOptionsOrBuilder = (EnumValueOptionsOrBuilder) o;
    return Objects.equals(this.deprecated, enumValueOptionsOrBuilder.deprecated) &&
        Objects.equals(this.uninterpretedOptionList, enumValueOptionsOrBuilder.uninterpretedOptionList) &&
        Objects.equals(this.uninterpretedOptionCount, enumValueOptionsOrBuilder.uninterpretedOptionCount) &&
        Objects.equals(this.uninterpretedOptionOrBuilderList, enumValueOptionsOrBuilder.uninterpretedOptionOrBuilderList) &&
        Objects.equals(this.defaultInstanceForType, enumValueOptionsOrBuilder.defaultInstanceForType) &&
        Objects.equals(this.allFields, enumValueOptionsOrBuilder.allFields) &&
        Objects.equals(this.initializationErrorString, enumValueOptionsOrBuilder.initializationErrorString) &&
        Objects.equals(this.descriptorForType, enumValueOptionsOrBuilder.descriptorForType) &&
        Objects.equals(this.unknownFields, enumValueOptionsOrBuilder.unknownFields) &&
        Objects.equals(this.initialized, enumValueOptionsOrBuilder.initialized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecated, uninterpretedOptionList, uninterpretedOptionCount, uninterpretedOptionOrBuilderList, defaultInstanceForType, allFields, initializationErrorString, descriptorForType, unknownFields, initialized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumValueOptionsOrBuilder {\n");
    
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    uninterpretedOptionList: ").append(toIndentedString(uninterpretedOptionList)).append("\n");
    sb.append("    uninterpretedOptionCount: ").append(toIndentedString(uninterpretedOptionCount)).append("\n");
    sb.append("    uninterpretedOptionOrBuilderList: ").append(toIndentedString(uninterpretedOptionOrBuilderList)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    allFields: ").append(toIndentedString(allFields)).append("\n");
    sb.append("    initializationErrorString: ").append(toIndentedString(initializationErrorString)).append("\n");
    sb.append("    descriptorForType: ").append(toIndentedString(descriptorForType)).append("\n");
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