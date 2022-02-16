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
import io.swagger.client.model.InterruptConfig;
import io.swagger.client.model.IssuedBy;
import io.swagger.client.model.IssuedByOrBuilder;
import io.swagger.client.model.ParserInterruptConfig;
import io.swagger.client.model.RetryInterruptConfig;
import io.swagger.client.model.RetryInterruptConfigOrBuilder;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * InterruptConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class InterruptConfig {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  /**
   * Gets or Sets configCase
   */
  @JsonAdapter(ConfigCaseEnum.Adapter.class)
  public enum ConfigCaseEnum {
    RETRYINTERRUPTCONFIG("RETRYINTERRUPTCONFIG"),
    CONFIG_NOT_SET("CONFIG_NOT_SET");

    private String value;

    ConfigCaseEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConfigCaseEnum fromValue(String input) {
      for (ConfigCaseEnum b : ConfigCaseEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConfigCaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigCaseEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ConfigCaseEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ConfigCaseEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("configCase")
  private ConfigCaseEnum configCase = null;

  @SerializedName("issuedBy")
  private IssuedBy issuedBy = null;

  @SerializedName("issuedByOrBuilder")
  private IssuedByOrBuilder issuedByOrBuilder = null;

  @SerializedName("retryInterruptConfig")
  private RetryInterruptConfig retryInterruptConfig = null;

  @SerializedName("retryInterruptConfigOrBuilder")
  private RetryInterruptConfigOrBuilder retryInterruptConfigOrBuilder = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserInterruptConfig parserForType = null;

  @SerializedName("defaultInstanceForType")
  private InterruptConfig defaultInstanceForType = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public InterruptConfig unknownFields(UnknownFieldSet unknownFields) {
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

  public InterruptConfig initialized(Boolean initialized) {
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

  public InterruptConfig configCase(ConfigCaseEnum configCase) {
    this.configCase = configCase;
    return this;
  }

   /**
   * Get configCase
   * @return configCase
  **/
  @Schema(description = "")
  public ConfigCaseEnum getConfigCase() {
    return configCase;
  }

  public void setConfigCase(ConfigCaseEnum configCase) {
    this.configCase = configCase;
  }

  public InterruptConfig issuedBy(IssuedBy issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * Get issuedBy
   * @return issuedBy
  **/
  @Schema(description = "")
  public IssuedBy getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(IssuedBy issuedBy) {
    this.issuedBy = issuedBy;
  }

  public InterruptConfig issuedByOrBuilder(IssuedByOrBuilder issuedByOrBuilder) {
    this.issuedByOrBuilder = issuedByOrBuilder;
    return this;
  }

   /**
   * Get issuedByOrBuilder
   * @return issuedByOrBuilder
  **/
  @Schema(description = "")
  public IssuedByOrBuilder getIssuedByOrBuilder() {
    return issuedByOrBuilder;
  }

  public void setIssuedByOrBuilder(IssuedByOrBuilder issuedByOrBuilder) {
    this.issuedByOrBuilder = issuedByOrBuilder;
  }

  public InterruptConfig retryInterruptConfig(RetryInterruptConfig retryInterruptConfig) {
    this.retryInterruptConfig = retryInterruptConfig;
    return this;
  }

   /**
   * Get retryInterruptConfig
   * @return retryInterruptConfig
  **/
  @Schema(description = "")
  public RetryInterruptConfig getRetryInterruptConfig() {
    return retryInterruptConfig;
  }

  public void setRetryInterruptConfig(RetryInterruptConfig retryInterruptConfig) {
    this.retryInterruptConfig = retryInterruptConfig;
  }

  public InterruptConfig retryInterruptConfigOrBuilder(RetryInterruptConfigOrBuilder retryInterruptConfigOrBuilder) {
    this.retryInterruptConfigOrBuilder = retryInterruptConfigOrBuilder;
    return this;
  }

   /**
   * Get retryInterruptConfigOrBuilder
   * @return retryInterruptConfigOrBuilder
  **/
  @Schema(description = "")
  public RetryInterruptConfigOrBuilder getRetryInterruptConfigOrBuilder() {
    return retryInterruptConfigOrBuilder;
  }

  public void setRetryInterruptConfigOrBuilder(RetryInterruptConfigOrBuilder retryInterruptConfigOrBuilder) {
    this.retryInterruptConfigOrBuilder = retryInterruptConfigOrBuilder;
  }

  public InterruptConfig serializedSize(Integer serializedSize) {
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

  public InterruptConfig parserForType(ParserInterruptConfig parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserInterruptConfig getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserInterruptConfig parserForType) {
    this.parserForType = parserForType;
  }

  public InterruptConfig defaultInstanceForType(InterruptConfig defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public InterruptConfig getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(InterruptConfig defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public InterruptConfig allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public InterruptConfig putAllFieldsItem(String key, Object allFieldsItem) {
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

  public InterruptConfig initializationErrorString(String initializationErrorString) {
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

  public InterruptConfig descriptorForType(Descriptor descriptorForType) {
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

  public InterruptConfig memoizedSerializedSize(Integer memoizedSerializedSize) {
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
    InterruptConfig interruptConfig = (InterruptConfig) o;
    return Objects.equals(this.unknownFields, interruptConfig.unknownFields) &&
        Objects.equals(this.initialized, interruptConfig.initialized) &&
        Objects.equals(this.configCase, interruptConfig.configCase) &&
        Objects.equals(this.issuedBy, interruptConfig.issuedBy) &&
        Objects.equals(this.issuedByOrBuilder, interruptConfig.issuedByOrBuilder) &&
        Objects.equals(this.retryInterruptConfig, interruptConfig.retryInterruptConfig) &&
        Objects.equals(this.retryInterruptConfigOrBuilder, interruptConfig.retryInterruptConfigOrBuilder) &&
        Objects.equals(this.serializedSize, interruptConfig.serializedSize) &&
        Objects.equals(this.parserForType, interruptConfig.parserForType) &&
        Objects.equals(this.defaultInstanceForType, interruptConfig.defaultInstanceForType) &&
        Objects.equals(this.allFields, interruptConfig.allFields) &&
        Objects.equals(this.initializationErrorString, interruptConfig.initializationErrorString) &&
        Objects.equals(this.descriptorForType, interruptConfig.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, interruptConfig.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, initialized, configCase, issuedBy, issuedByOrBuilder, retryInterruptConfig, retryInterruptConfigOrBuilder, serializedSize, parserForType, defaultInstanceForType, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterruptConfig {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    configCase: ").append(toIndentedString(configCase)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
    sb.append("    issuedByOrBuilder: ").append(toIndentedString(issuedByOrBuilder)).append("\n");
    sb.append("    retryInterruptConfig: ").append(toIndentedString(retryInterruptConfig)).append("\n");
    sb.append("    retryInterruptConfigOrBuilder: ").append(toIndentedString(retryInterruptConfigOrBuilder)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
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