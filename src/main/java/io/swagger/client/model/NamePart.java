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
import io.swagger.client.model.NamePart;
import io.swagger.client.model.ParserNamePart;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * NamePart
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class NamePart {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserNamePart parserForType = null;

  @SerializedName("defaultInstanceForType")
  private NamePart defaultInstanceForType = null;

  @SerializedName("namePart")
  private String namePart = null;

  @SerializedName("namePartBytes")
  private ByteString namePartBytes = null;

  @SerializedName("isExtension")
  private Boolean isExtension = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public NamePart unknownFields(UnknownFieldSet unknownFields) {
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

  public NamePart initialized(Boolean initialized) {
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

  public NamePart serializedSize(Integer serializedSize) {
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

  public NamePart parserForType(ParserNamePart parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserNamePart getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserNamePart parserForType) {
    this.parserForType = parserForType;
  }

  public NamePart defaultInstanceForType(NamePart defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public NamePart getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(NamePart defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public NamePart namePart(String namePart) {
    this.namePart = namePart;
    return this;
  }

   /**
   * Get namePart
   * @return namePart
  **/
  @Schema(description = "")
  public String getNamePart() {
    return namePart;
  }

  public void setNamePart(String namePart) {
    this.namePart = namePart;
  }

  public NamePart namePartBytes(ByteString namePartBytes) {
    this.namePartBytes = namePartBytes;
    return this;
  }

   /**
   * Get namePartBytes
   * @return namePartBytes
  **/
  @Schema(description = "")
  public ByteString getNamePartBytes() {
    return namePartBytes;
  }

  public void setNamePartBytes(ByteString namePartBytes) {
    this.namePartBytes = namePartBytes;
  }

  public NamePart isExtension(Boolean isExtension) {
    this.isExtension = isExtension;
    return this;
  }

   /**
   * Get isExtension
   * @return isExtension
  **/
  @Schema(description = "")
  public Boolean isIsExtension() {
    return isExtension;
  }

  public void setIsExtension(Boolean isExtension) {
    this.isExtension = isExtension;
  }

  public NamePart allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public NamePart putAllFieldsItem(String key, Object allFieldsItem) {
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

  public NamePart initializationErrorString(String initializationErrorString) {
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

  public NamePart descriptorForType(Descriptor descriptorForType) {
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

  public NamePart memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    NamePart namePart = (NamePart) o;
    return Objects.equals(this.unknownFields, namePart.unknownFields) &&
        Objects.equals(this.initialized, namePart.initialized) &&
        Objects.equals(this.serializedSize, namePart.serializedSize) &&
        Objects.equals(this.parserForType, namePart.parserForType) &&
        Objects.equals(this.defaultInstanceForType, namePart.defaultInstanceForType) &&
        Objects.equals(this.namePart, namePart.namePart) &&
        Objects.equals(this.namePartBytes, namePart.namePartBytes) &&
        Objects.equals(this.isExtension, namePart.isExtension) &&
        Objects.equals(this.allFields, namePart.allFields) &&
        Objects.equals(this.initializationErrorString, namePart.initializationErrorString) &&
        Objects.equals(this.descriptorForType, namePart.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, namePart.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, serializedSize, parserForType, defaultInstanceForType, namePart, namePartBytes, isExtension, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamePart {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    namePart: ").append(toIndentedString(namePart)).append("\n");
    sb.append("    namePartBytes: ").append(toIndentedString(namePartBytes)).append("\n");
    sb.append("    isExtension: ").append(toIndentedString(isExtension)).append("\n");
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
