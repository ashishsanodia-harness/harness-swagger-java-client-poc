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
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ManualIssuerOrBuilder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ManualIssuerOrBuilder {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("identifierBytes")
  private ByteString identifierBytes = null;

  @SerializedName("typeBytes")
  private ByteString typeBytes = null;

  @SerializedName("emailIdBytes")
  private ByteString emailIdBytes = null;

  @SerializedName("userIdBytes")
  private ByteString userIdBytes = null;

  @SerializedName("emailId")
  private String emailId = null;

  @SerializedName("type")
  private String type = null;

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

  public ManualIssuerOrBuilder identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ManualIssuerOrBuilder userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ManualIssuerOrBuilder identifierBytes(ByteString identifierBytes) {
    this.identifierBytes = identifierBytes;
    return this;
  }

   /**
   * Get identifierBytes
   * @return identifierBytes
  **/
  @Schema(description = "")
  public ByteString getIdentifierBytes() {
    return identifierBytes;
  }

  public void setIdentifierBytes(ByteString identifierBytes) {
    this.identifierBytes = identifierBytes;
  }

  public ManualIssuerOrBuilder typeBytes(ByteString typeBytes) {
    this.typeBytes = typeBytes;
    return this;
  }

   /**
   * Get typeBytes
   * @return typeBytes
  **/
  @Schema(description = "")
  public ByteString getTypeBytes() {
    return typeBytes;
  }

  public void setTypeBytes(ByteString typeBytes) {
    this.typeBytes = typeBytes;
  }

  public ManualIssuerOrBuilder emailIdBytes(ByteString emailIdBytes) {
    this.emailIdBytes = emailIdBytes;
    return this;
  }

   /**
   * Get emailIdBytes
   * @return emailIdBytes
  **/
  @Schema(description = "")
  public ByteString getEmailIdBytes() {
    return emailIdBytes;
  }

  public void setEmailIdBytes(ByteString emailIdBytes) {
    this.emailIdBytes = emailIdBytes;
  }

  public ManualIssuerOrBuilder userIdBytes(ByteString userIdBytes) {
    this.userIdBytes = userIdBytes;
    return this;
  }

   /**
   * Get userIdBytes
   * @return userIdBytes
  **/
  @Schema(description = "")
  public ByteString getUserIdBytes() {
    return userIdBytes;
  }

  public void setUserIdBytes(ByteString userIdBytes) {
    this.userIdBytes = userIdBytes;
  }

  public ManualIssuerOrBuilder emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

   /**
   * Get emailId
   * @return emailId
  **/
  @Schema(description = "")
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public ManualIssuerOrBuilder type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ManualIssuerOrBuilder allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ManualIssuerOrBuilder putAllFieldsItem(String key, Object allFieldsItem) {
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

  public ManualIssuerOrBuilder initializationErrorString(String initializationErrorString) {
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

  public ManualIssuerOrBuilder descriptorForType(Descriptor descriptorForType) {
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

  public ManualIssuerOrBuilder defaultInstanceForType(Message defaultInstanceForType) {
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

  public ManualIssuerOrBuilder unknownFields(UnknownFieldSet unknownFields) {
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

  public ManualIssuerOrBuilder initialized(Boolean initialized) {
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
    ManualIssuerOrBuilder manualIssuerOrBuilder = (ManualIssuerOrBuilder) o;
    return Objects.equals(this.identifier, manualIssuerOrBuilder.identifier) &&
        Objects.equals(this.userId, manualIssuerOrBuilder.userId) &&
        Objects.equals(this.identifierBytes, manualIssuerOrBuilder.identifierBytes) &&
        Objects.equals(this.typeBytes, manualIssuerOrBuilder.typeBytes) &&
        Objects.equals(this.emailIdBytes, manualIssuerOrBuilder.emailIdBytes) &&
        Objects.equals(this.userIdBytes, manualIssuerOrBuilder.userIdBytes) &&
        Objects.equals(this.emailId, manualIssuerOrBuilder.emailId) &&
        Objects.equals(this.type, manualIssuerOrBuilder.type) &&
        Objects.equals(this.allFields, manualIssuerOrBuilder.allFields) &&
        Objects.equals(this.initializationErrorString, manualIssuerOrBuilder.initializationErrorString) &&
        Objects.equals(this.descriptorForType, manualIssuerOrBuilder.descriptorForType) &&
        Objects.equals(this.defaultInstanceForType, manualIssuerOrBuilder.defaultInstanceForType) &&
        Objects.equals(this.unknownFields, manualIssuerOrBuilder.unknownFields) &&
        Objects.equals(this.initialized, manualIssuerOrBuilder.initialized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, userId, identifierBytes, typeBytes, emailIdBytes, userIdBytes, emailId, type, allFields, initializationErrorString, descriptorForType, defaultInstanceForType, unknownFields, initialized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualIssuerOrBuilder {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    identifierBytes: ").append(toIndentedString(identifierBytes)).append("\n");
    sb.append("    typeBytes: ").append(toIndentedString(typeBytes)).append("\n");
    sb.append("    emailIdBytes: ").append(toIndentedString(emailIdBytes)).append("\n");
    sb.append("    userIdBytes: ").append(toIndentedString(userIdBytes)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
