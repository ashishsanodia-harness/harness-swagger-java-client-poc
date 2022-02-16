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
import io.swagger.client.model.ExtensionRangeOptions;
import io.swagger.client.model.ParserExtensionRangeOptions;
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
 * ExtensionRangeOptions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ExtensionRangeOptions {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("uninterpretedOptionList")
  private List<UninterpretedOption> uninterpretedOptionList = null;

  @SerializedName("uninterpretedOptionCount")
  private Integer uninterpretedOptionCount = null;

  @SerializedName("uninterpretedOptionOrBuilderList")
  private List<UninterpretedOptionOrBuilder> uninterpretedOptionOrBuilderList = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserExtensionRangeOptions parserForType = null;

  @SerializedName("defaultInstanceForType")
  private ExtensionRangeOptions defaultInstanceForType = null;

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

  public ExtensionRangeOptions unknownFields(UnknownFieldSet unknownFields) {
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

  public ExtensionRangeOptions initialized(Boolean initialized) {
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

  public ExtensionRangeOptions uninterpretedOptionList(List<UninterpretedOption> uninterpretedOptionList) {
    this.uninterpretedOptionList = uninterpretedOptionList;
    return this;
  }

  public ExtensionRangeOptions addUninterpretedOptionListItem(UninterpretedOption uninterpretedOptionListItem) {
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

  public ExtensionRangeOptions uninterpretedOptionCount(Integer uninterpretedOptionCount) {
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

  public ExtensionRangeOptions uninterpretedOptionOrBuilderList(List<UninterpretedOptionOrBuilder> uninterpretedOptionOrBuilderList) {
    this.uninterpretedOptionOrBuilderList = uninterpretedOptionOrBuilderList;
    return this;
  }

  public ExtensionRangeOptions addUninterpretedOptionOrBuilderListItem(UninterpretedOptionOrBuilder uninterpretedOptionOrBuilderListItem) {
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

  public ExtensionRangeOptions serializedSize(Integer serializedSize) {
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

  public ExtensionRangeOptions parserForType(ParserExtensionRangeOptions parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserExtensionRangeOptions getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserExtensionRangeOptions parserForType) {
    this.parserForType = parserForType;
  }

  public ExtensionRangeOptions defaultInstanceForType(ExtensionRangeOptions defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public ExtensionRangeOptions getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(ExtensionRangeOptions defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public ExtensionRangeOptions allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ExtensionRangeOptions putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ExtensionRangeOptions initializationErrorString(String initializationErrorString) {
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

  public ExtensionRangeOptions descriptorForType(Descriptor descriptorForType) {
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

  public ExtensionRangeOptions allFieldsRaw(Map<String, Object> allFieldsRaw) {
    this.allFieldsRaw = allFieldsRaw;
    return this;
  }

  public ExtensionRangeOptions putAllFieldsRawItem(String key, Object allFieldsRawItem) {
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

  public ExtensionRangeOptions memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    ExtensionRangeOptions extensionRangeOptions = (ExtensionRangeOptions) o;
    return Objects.equals(this.unknownFields, extensionRangeOptions.unknownFields) &&
        Objects.equals(this.initialized, extensionRangeOptions.initialized) &&
        Objects.equals(this.uninterpretedOptionList, extensionRangeOptions.uninterpretedOptionList) &&
        Objects.equals(this.uninterpretedOptionCount, extensionRangeOptions.uninterpretedOptionCount) &&
        Objects.equals(this.uninterpretedOptionOrBuilderList, extensionRangeOptions.uninterpretedOptionOrBuilderList) &&
        Objects.equals(this.serializedSize, extensionRangeOptions.serializedSize) &&
        Objects.equals(this.parserForType, extensionRangeOptions.parserForType) &&
        Objects.equals(this.defaultInstanceForType, extensionRangeOptions.defaultInstanceForType) &&
        Objects.equals(this.allFields, extensionRangeOptions.allFields) &&
        Objects.equals(this.initializationErrorString, extensionRangeOptions.initializationErrorString) &&
        Objects.equals(this.descriptorForType, extensionRangeOptions.descriptorForType) &&
        Objects.equals(this.allFieldsRaw, extensionRangeOptions.allFieldsRaw) &&
        Objects.equals(this.memoizedSerializedSize, extensionRangeOptions.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, uninterpretedOptionList, uninterpretedOptionCount, uninterpretedOptionOrBuilderList, serializedSize, parserForType, defaultInstanceForType, allFields, initializationErrorString, descriptorForType, allFieldsRaw, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionRangeOptions {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
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
