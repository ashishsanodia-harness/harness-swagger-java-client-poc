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
import io.swagger.client.model.FormDataContentDisposition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AuthenticationsettingsSamlmetadatauploadBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AuthenticationsettingsSamlmetadatauploadBody {
  @SerializedName("file")
  private Object file = null;

  @SerializedName("fileMetadata")
  private FormDataContentDisposition fileMetadata = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("groupMembershipAttr")
  private String groupMembershipAttr = null;

  @SerializedName("authorizationEnabled")
  private Boolean authorizationEnabled = null;

  @SerializedName("logoutUrl")
  private String logoutUrl = null;

  @SerializedName("entityIdentifier")
  private String entityIdentifier = null;

  @SerializedName("samlProviderType")
  private String samlProviderType = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  public AuthenticationsettingsSamlmetadatauploadBody file(Object file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(description = "")
  public Object getFile() {
    return file;
  }

  public void setFile(Object file) {
    this.file = file;
  }

  public AuthenticationsettingsSamlmetadatauploadBody fileMetadata(FormDataContentDisposition fileMetadata) {
    this.fileMetadata = fileMetadata;
    return this;
  }

   /**
   * Get fileMetadata
   * @return fileMetadata
  **/
  @Schema(description = "")
  public FormDataContentDisposition getFileMetadata() {
    return fileMetadata;
  }

  public void setFileMetadata(FormDataContentDisposition fileMetadata) {
    this.fileMetadata = fileMetadata;
  }

  public AuthenticationsettingsSamlmetadatauploadBody displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AuthenticationsettingsSamlmetadatauploadBody groupMembershipAttr(String groupMembershipAttr) {
    this.groupMembershipAttr = groupMembershipAttr;
    return this;
  }

   /**
   * Get groupMembershipAttr
   * @return groupMembershipAttr
  **/
  @Schema(description = "")
  public String getGroupMembershipAttr() {
    return groupMembershipAttr;
  }

  public void setGroupMembershipAttr(String groupMembershipAttr) {
    this.groupMembershipAttr = groupMembershipAttr;
  }

  public AuthenticationsettingsSamlmetadatauploadBody authorizationEnabled(Boolean authorizationEnabled) {
    this.authorizationEnabled = authorizationEnabled;
    return this;
  }

   /**
   * Get authorizationEnabled
   * @return authorizationEnabled
  **/
  @Schema(description = "")
  public Boolean isAuthorizationEnabled() {
    return authorizationEnabled;
  }

  public void setAuthorizationEnabled(Boolean authorizationEnabled) {
    this.authorizationEnabled = authorizationEnabled;
  }

  public AuthenticationsettingsSamlmetadatauploadBody logoutUrl(String logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

   /**
   * Get logoutUrl
   * @return logoutUrl
  **/
  @Schema(description = "")
  public String getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(String logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public AuthenticationsettingsSamlmetadatauploadBody entityIdentifier(String entityIdentifier) {
    this.entityIdentifier = entityIdentifier;
    return this;
  }

   /**
   * Get entityIdentifier
   * @return entityIdentifier
  **/
  @Schema(description = "")
  public String getEntityIdentifier() {
    return entityIdentifier;
  }

  public void setEntityIdentifier(String entityIdentifier) {
    this.entityIdentifier = entityIdentifier;
  }

  public AuthenticationsettingsSamlmetadatauploadBody samlProviderType(String samlProviderType) {
    this.samlProviderType = samlProviderType;
    return this;
  }

   /**
   * Get samlProviderType
   * @return samlProviderType
  **/
  @Schema(description = "")
  public String getSamlProviderType() {
    return samlProviderType;
  }

  public void setSamlProviderType(String samlProviderType) {
    this.samlProviderType = samlProviderType;
  }

  public AuthenticationsettingsSamlmetadatauploadBody clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AuthenticationsettingsSamlmetadatauploadBody clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @Schema(description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationsettingsSamlmetadatauploadBody authenticationsettingsSamlmetadatauploadBody = (AuthenticationsettingsSamlmetadatauploadBody) o;
    return Objects.equals(this.file, authenticationsettingsSamlmetadatauploadBody.file) &&
        Objects.equals(this.fileMetadata, authenticationsettingsSamlmetadatauploadBody.fileMetadata) &&
        Objects.equals(this.displayName, authenticationsettingsSamlmetadatauploadBody.displayName) &&
        Objects.equals(this.groupMembershipAttr, authenticationsettingsSamlmetadatauploadBody.groupMembershipAttr) &&
        Objects.equals(this.authorizationEnabled, authenticationsettingsSamlmetadatauploadBody.authorizationEnabled) &&
        Objects.equals(this.logoutUrl, authenticationsettingsSamlmetadatauploadBody.logoutUrl) &&
        Objects.equals(this.entityIdentifier, authenticationsettingsSamlmetadatauploadBody.entityIdentifier) &&
        Objects.equals(this.samlProviderType, authenticationsettingsSamlmetadatauploadBody.samlProviderType) &&
        Objects.equals(this.clientId, authenticationsettingsSamlmetadatauploadBody.clientId) &&
        Objects.equals(this.clientSecret, authenticationsettingsSamlmetadatauploadBody.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, fileMetadata, displayName, groupMembershipAttr, authorizationEnabled, logoutUrl, entityIdentifier, samlProviderType, clientId, clientSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationsettingsSamlmetadatauploadBody {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    fileMetadata: ").append(toIndentedString(fileMetadata)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    groupMembershipAttr: ").append(toIndentedString(groupMembershipAttr)).append("\n");
    sb.append("    authorizationEnabled: ").append(toIndentedString(authorizationEnabled)).append("\n");
    sb.append("    logoutUrl: ").append(toIndentedString(logoutUrl)).append("\n");
    sb.append("    entityIdentifier: ").append(toIndentedString(entityIdentifier)).append("\n");
    sb.append("    samlProviderType: ").append(toIndentedString(samlProviderType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
