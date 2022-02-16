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
import io.swagger.client.model.EnumValueOptions;
import io.swagger.client.model.ParserEnumValueOptions;
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
 * EnumValueOptions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class EnumValueOptions {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("deprecated")
  private Boolean deprecated = null;

  @SerializedName("uninterpretedOptionList")
  private List<UninterpretedOption> uninterpretedOptionList = null;

  @SerializedName("uninterpretedOptionCount")
  private Integer uninterpretedOptionCount = null;

  @SerializedName("uninterpretedOptionOrBuilderList")
  private List<UninterpretedOptionOrBuilder> uninterpretedOptionOrBuilderList = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserEnumValueOptions parserForType = null;

  @SerializedName("defaultInstanceForType")
  private EnumValueOptions defaultInstanceForType = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("allFieldsRaw")
  private Map<String, Object> allFieldsRaw = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public EnumValueOptions unknownFields(UnknownFieldSet unknownFields) {
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

  public EnumValueOptions initialized(Boolean initialized) {
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

  public EnumValueOptions deprecated(Boolean deprecated) {
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

  public EnumValueOptions uninterpretedOptionList(List<UninterpretedOption> uninterpretedOptionList) {
    this.uninterpretedOptionList = uninterpretedOptionList;
    return this;
  }

  public EnumValueOptions addUninterpretedOptionListItem(UninterpretedOption uninterpretedOptionListItem) {
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

  public EnumValueOptions uninterpretedOptionCount(Integer uninterpretedOptionCount) {
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

  public EnumValueOptions uninterpretedOptionOrBuilderList(List<UninterpretedOptionOrBuilder> uninterpretedOptionOrBuilderList) {
    this.uninterpretedOptionOrBuilderList = uninterpretedOptionOrBuilderList;
    return this;
  }

  public EnumValueOptions addUninterpretedOptionOrBuilderListItem(UninterpretedOptionOrBuilder uninterpretedOptionOrBuilderListItem) {
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

  public EnumValueOptions serializedSize(Integer serializedSize) {
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

  public EnumValueOptions parserForType(ParserEnumValueOptions parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserEnumValueOptions getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserEnumValueOptions parserForType) {
    this.parserForType = parserForType;
  }

  public EnumValueOptions defaultInstanceForType(EnumValueOptions defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public EnumValueOptions getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(EnumValueOptions defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public EnumValueOptions allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public EnumValueOptions putAllFieldsItem(String key, Object allFieldsItem) {
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

  public EnumValueOptions initializationErrorString(String initializationErrorString) {
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

  public EnumValueOptions descriptorForType(Descriptor descriptorForType) {
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

  public EnumValueOptions allFieldsRaw(Map<String, Object> allFieldsRaw) {
    this.allFieldsRaw = allFieldsRaw;
    return this;
  }

  public EnumValueOptions putAllFieldsRawItem(String key, Object allFieldsRawItem) {
    if (this.allFieldsRaw == null) {
      this.allFieldsRaw = new HashMap<String, Object>();
    }
    this.allFieldsRaw.put(key, allFieldsRawItem);
    return this;
  }

   /**
   * Get allFieldsRaw
   * @return allFieldsRaw
  **/
  @Schema(description = "")
  public Map<String, Object> getAllFieldsRaw() {
    return allFieldsRaw;
  }

  public void setAllFieldsRaw(Map<String, Object> allFieldsRaw) {
    this.allFieldsRaw = allFieldsRaw;
  }

  public EnumValueOptions memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    EnumValueOptions enumValueOptions = (EnumValueOptions) o;
    return Objects.equals(this.unknownFields, enumValueOptions.unknownFields) &&
        Objects.equals(this.initialized, enumValueOptions.initialized) &&
        Objects.equals(this.deprecated, enumValueOptions.deprecated) &&
        Objects.equals(this.uninterpretedOptionList, enumValueOptions.uninterpretedOptionList) &&
        Objects.equals(this.uninterpretedOptionCount, enumValueOptions.uninterpretedOptionCount) &&
        Objects.equals(this.uninterpretedOptionOrBuilderList, enumValueOptions.uninterpretedOptionOrBuilderList) &&
        Objects.equals(this.serializedSize, enumValueOptions.serializedSize) &&
        Objects.equals(this.parserForType, enumValueOptions.parserForType) &&
        Objects.equals(this.defaultInstanceForType, enumValueOptions.defaultInstanceForType) &&
        Objects.equals(this.allFields, enumValueOptions.allFields) &&
        Objects.equals(this.initializationErrorString, enumValueOptions.initializationErrorString) &&
        Objects.equals(this.descriptorForType, enumValueOptions.descriptorForType) &&
        Objects.equals(this.allFieldsRaw, enumValueOptions.allFieldsRaw) &&
        Objects.equals(this.memoizedSerializedSize, enumValueOptions.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, deprecated, uninterpretedOptionList, uninterpretedOptionCount, uninterpretedOptionOrBuilderList, serializedSize, parserForType, defaultInstanceForType, allFields, initializationErrorString, descriptorForType, allFieldsRaw, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumValueOptions {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    uninterpretedOptionList: ").append(toIndentedString(uninterpretedOptionList)).append("\n");
    sb.append("    uninterpretedOptionCount: ").append(toIndentedString(uninterpretedOptionCount)).append("\n");
    sb.append("    uninterpretedOptionOrBuilderList: ").append(toIndentedString(uninterpretedOptionOrBuilderList)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    allFields: ").append(toIndentedString(allFields)).append("\n");
    sb.append("    initializationErrorString: ").append(toIndentedString(initializationErrorString)).append("\n");
    sb.append("    descriptorForType: ").append(toIndentedString(descriptorForType)).append("\n");
    sb.append("    allFieldsRaw: ").append(toIndentedString(allFieldsRaw)).append("\n");
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