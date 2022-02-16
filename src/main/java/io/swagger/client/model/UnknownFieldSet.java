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
import io.swagger.client.model.Parser;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UnknownFieldSet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class UnknownFieldSet {
  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("serializedSizeAsMessageSet")
  private Integer serializedSizeAsMessageSet = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private Parser parserForType = null;

  @SerializedName("defaultInstanceForType")
  private UnknownFieldSet defaultInstanceForType = null;

  public UnknownFieldSet initialized(Boolean initialized) {
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

  public UnknownFieldSet serializedSizeAsMessageSet(Integer serializedSizeAsMessageSet) {
    this.serializedSizeAsMessageSet = serializedSizeAsMessageSet;
    return this;
  }

   /**
   * Get serializedSizeAsMessageSet
   * @return serializedSizeAsMessageSet
  **/
  @Schema(description = "")
  public Integer getSerializedSizeAsMessageSet() {
    return serializedSizeAsMessageSet;
  }

  public void setSerializedSizeAsMessageSet(Integer serializedSizeAsMessageSet) {
    this.serializedSizeAsMessageSet = serializedSizeAsMessageSet;
  }

  public UnknownFieldSet serializedSize(Integer serializedSize) {
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

  public UnknownFieldSet parserForType(Parser parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public Parser getParserForType() {
    return parserForType;
  }

  public void setParserForType(Parser parserForType) {
    this.parserForType = parserForType;
  }

  public UnknownFieldSet defaultInstanceForType(UnknownFieldSet defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public UnknownFieldSet getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(UnknownFieldSet defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnknownFieldSet unknownFieldSet = (UnknownFieldSet) o;
    return Objects.equals(this.initialized, unknownFieldSet.initialized) &&
        Objects.equals(this.serializedSizeAsMessageSet, unknownFieldSet.serializedSizeAsMessageSet) &&
        Objects.equals(this.serializedSize, unknownFieldSet.serializedSize) &&
        Objects.equals(this.parserForType, unknownFieldSet.parserForType) &&
        Objects.equals(this.defaultInstanceForType, unknownFieldSet.defaultInstanceForType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialized, serializedSizeAsMessageSet, serializedSize, parserForType, defaultInstanceForType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnknownFieldSet {\n");
    
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    serializedSizeAsMessageSet: ").append(toIndentedString(serializedSizeAsMessageSet)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
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
