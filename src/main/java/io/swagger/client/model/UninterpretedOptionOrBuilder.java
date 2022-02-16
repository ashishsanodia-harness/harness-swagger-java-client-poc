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
import io.swagger.client.model.NamePart;
import io.swagger.client.model.NamePartOrBuilder;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * UninterpretedOptionOrBuilder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class UninterpretedOptionOrBuilder {
  @SerializedName("stringValue")
  private ByteString stringValue = null;

  @SerializedName("doubleValue")
  private Double doubleValue = null;

  @SerializedName("nameList")
  private List<NamePart> nameList = null;

  @SerializedName("nameOrBuilderList")
  private List<NamePartOrBuilder> nameOrBuilderList = null;

  @SerializedName("identifierValue")
  private String identifierValue = null;

  @SerializedName("identifierValueBytes")
  private ByteString identifierValueBytes = null;

  @SerializedName("positiveIntValue")
  private Long positiveIntValue = null;

  @SerializedName("negativeIntValue")
  private Long negativeIntValue = null;

  @SerializedName("aggregateValue")
  private String aggregateValue = null;

  @SerializedName("aggregateValueBytes")
  private ByteString aggregateValueBytes = null;

  @SerializedName("nameCount")
  private Integer nameCount = null;

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

  public UninterpretedOptionOrBuilder stringValue(ByteString stringValue) {
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Get stringValue
   * @return stringValue
  **/
  @Schema(description = "")
  public ByteString getStringValue() {
    return stringValue;
  }

  public void setStringValue(ByteString stringValue) {
    this.stringValue = stringValue;
  }

  public UninterpretedOptionOrBuilder doubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

   /**
   * Get doubleValue
   * @return doubleValue
  **/
  @Schema(description = "")
  public Double getDoubleValue() {
    return doubleValue;
  }

  public void setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
  }

  public UninterpretedOptionOrBuilder nameList(List<NamePart> nameList) {
    this.nameList = nameList;
    return this;
  }

  public UninterpretedOptionOrBuilder addNameListItem(NamePart nameListItem) {
    if (this.nameList == null) {
      this.nameList = new ArrayList<NamePart>();
    }
    this.nameList.add(nameListItem);
    return this;
  }

   /**
   * Get nameList
   * @return nameList
  **/
  @Schema(description = "")
  public List<NamePart> getNameList() {
    return nameList;
  }

  public void setNameList(List<NamePart> nameList) {
    this.nameList = nameList;
  }

  public UninterpretedOptionOrBuilder nameOrBuilderList(List<NamePartOrBuilder> nameOrBuilderList) {
    this.nameOrBuilderList = nameOrBuilderList;
    return this;
  }

  public UninterpretedOptionOrBuilder addNameOrBuilderListItem(NamePartOrBuilder nameOrBuilderListItem) {
    if (this.nameOrBuilderList == null) {
      this.nameOrBuilderList = new ArrayList<NamePartOrBuilder>();
    }
    this.nameOrBuilderList.add(nameOrBuilderListItem);
    return this;
  }

   /**
   * Get nameOrBuilderList
   * @return nameOrBuilderList
  **/
  @Schema(description = "")
  public List<NamePartOrBuilder> getNameOrBuilderList() {
    return nameOrBuilderList;
  }

  public void setNameOrBuilderList(List<NamePartOrBuilder> nameOrBuilderList) {
    this.nameOrBuilderList = nameOrBuilderList;
  }

  public UninterpretedOptionOrBuilder identifierValue(String identifierValue) {
    this.identifierValue = identifierValue;
    return this;
  }

   /**
   * Get identifierValue
   * @return identifierValue
  **/
  @Schema(description = "")
  public String getIdentifierValue() {
    return identifierValue;
  }

  public void setIdentifierValue(String identifierValue) {
    this.identifierValue = identifierValue;
  }

  public UninterpretedOptionOrBuilder identifierValueBytes(ByteString identifierValueBytes) {
    this.identifierValueBytes = identifierValueBytes;
    return this;
  }

   /**
   * Get identifierValueBytes
   * @return identifierValueBytes
  **/
  @Schema(description = "")
  public ByteString getIdentifierValueBytes() {
    return identifierValueBytes;
  }

  public void setIdentifierValueBytes(ByteString identifierValueBytes) {
    this.identifierValueBytes = identifierValueBytes;
  }

  public UninterpretedOptionOrBuilder positiveIntValue(Long positiveIntValue) {
    this.positiveIntValue = positiveIntValue;
    return this;
  }

   /**
   * Get positiveIntValue
   * @return positiveIntValue
  **/
  @Schema(description = "")
  public Long getPositiveIntValue() {
    return positiveIntValue;
  }

  public void setPositiveIntValue(Long positiveIntValue) {
    this.positiveIntValue = positiveIntValue;
  }

  public UninterpretedOptionOrBuilder negativeIntValue(Long negativeIntValue) {
    this.negativeIntValue = negativeIntValue;
    return this;
  }

   /**
   * Get negativeIntValue
   * @return negativeIntValue
  **/
  @Schema(description = "")
  public Long getNegativeIntValue() {
    return negativeIntValue;
  }

  public void setNegativeIntValue(Long negativeIntValue) {
    this.negativeIntValue = negativeIntValue;
  }

  public UninterpretedOptionOrBuilder aggregateValue(String aggregateValue) {
    this.aggregateValue = aggregateValue;
    return this;
  }

   /**
   * Get aggregateValue
   * @return aggregateValue
  **/
  @Schema(description = "")
  public String getAggregateValue() {
    return aggregateValue;
  }

  public void setAggregateValue(String aggregateValue) {
    this.aggregateValue = aggregateValue;
  }

  public UninterpretedOptionOrBuilder aggregateValueBytes(ByteString aggregateValueBytes) {
    this.aggregateValueBytes = aggregateValueBytes;
    return this;
  }

   /**
   * Get aggregateValueBytes
   * @return aggregateValueBytes
  **/
  @Schema(description = "")
  public ByteString getAggregateValueBytes() {
    return aggregateValueBytes;
  }

  public void setAggregateValueBytes(ByteString aggregateValueBytes) {
    this.aggregateValueBytes = aggregateValueBytes;
  }

  public UninterpretedOptionOrBuilder nameCount(Integer nameCount) {
    this.nameCount = nameCount;
    return this;
  }

   /**
   * Get nameCount
   * @return nameCount
  **/
  @Schema(description = "")
  public Integer getNameCount() {
    return nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public UninterpretedOptionOrBuilder allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public UninterpretedOptionOrBuilder putAllFieldsItem(String key, Object allFieldsItem) {
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

  public UninterpretedOptionOrBuilder initializationErrorString(String initializationErrorString) {
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

  public UninterpretedOptionOrBuilder descriptorForType(Descriptor descriptorForType) {
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

  public UninterpretedOptionOrBuilder defaultInstanceForType(Message defaultInstanceForType) {
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

  public UninterpretedOptionOrBuilder unknownFields(UnknownFieldSet unknownFields) {
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

  public UninterpretedOptionOrBuilder initialized(Boolean initialized) {
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
    UninterpretedOptionOrBuilder uninterpretedOptionOrBuilder = (UninterpretedOptionOrBuilder) o;
    return Objects.equals(this.stringValue, uninterpretedOptionOrBuilder.stringValue) &&
        Objects.equals(this.doubleValue, uninterpretedOptionOrBuilder.doubleValue) &&
        Objects.equals(this.nameList, uninterpretedOptionOrBuilder.nameList) &&
        Objects.equals(this.nameOrBuilderList, uninterpretedOptionOrBuilder.nameOrBuilderList) &&
        Objects.equals(this.identifierValue, uninterpretedOptionOrBuilder.identifierValue) &&
        Objects.equals(this.identifierValueBytes, uninterpretedOptionOrBuilder.identifierValueBytes) &&
        Objects.equals(this.positiveIntValue, uninterpretedOptionOrBuilder.positiveIntValue) &&
        Objects.equals(this.negativeIntValue, uninterpretedOptionOrBuilder.negativeIntValue) &&
        Objects.equals(this.aggregateValue, uninterpretedOptionOrBuilder.aggregateValue) &&
        Objects.equals(this.aggregateValueBytes, uninterpretedOptionOrBuilder.aggregateValueBytes) &&
        Objects.equals(this.nameCount, uninterpretedOptionOrBuilder.nameCount) &&
        Objects.equals(this.allFields, uninterpretedOptionOrBuilder.allFields) &&
        Objects.equals(this.initializationErrorString, uninterpretedOptionOrBuilder.initializationErrorString) &&
        Objects.equals(this.descriptorForType, uninterpretedOptionOrBuilder.descriptorForType) &&
        Objects.equals(this.defaultInstanceForType, uninterpretedOptionOrBuilder.defaultInstanceForType) &&
        Objects.equals(this.unknownFields, uninterpretedOptionOrBuilder.unknownFields) &&
        Objects.equals(this.initialized, uninterpretedOptionOrBuilder.initialized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringValue, doubleValue, nameList, nameOrBuilderList, identifierValue, identifierValueBytes, positiveIntValue, negativeIntValue, aggregateValue, aggregateValueBytes, nameCount, allFields, initializationErrorString, descriptorForType, defaultInstanceForType, unknownFields, initialized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UninterpretedOptionOrBuilder {\n");
    
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    nameList: ").append(toIndentedString(nameList)).append("\n");
    sb.append("    nameOrBuilderList: ").append(toIndentedString(nameOrBuilderList)).append("\n");
    sb.append("    identifierValue: ").append(toIndentedString(identifierValue)).append("\n");
    sb.append("    identifierValueBytes: ").append(toIndentedString(identifierValueBytes)).append("\n");
    sb.append("    positiveIntValue: ").append(toIndentedString(positiveIntValue)).append("\n");
    sb.append("    negativeIntValue: ").append(toIndentedString(negativeIntValue)).append("\n");
    sb.append("    aggregateValue: ").append(toIndentedString(aggregateValue)).append("\n");
    sb.append("    aggregateValueBytes: ").append(toIndentedString(aggregateValueBytes)).append("\n");
    sb.append("    nameCount: ").append(toIndentedString(nameCount)).append("\n");
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
