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
import io.swagger.client.model.ConnectorConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This contains GCP KMS SecretManager configuration.
 */
@Schema(description = "This contains GCP KMS SecretManager configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GcpKmsConnector extends ConnectorConfig {
  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("keyRing")
  private String keyRing = null;

  @SerializedName("keyName")
  private String keyName = null;

  @SerializedName("credentials")
  private String credentials = null;

  @SerializedName("delegateSelectors")
  private List<String> delegateSelectors = null;

  @SerializedName("default")
  private Boolean _default = null;

  public GcpKmsConnector projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * ID of the project on GCP.
   * @return projectId
  **/
  @Schema(description = "ID of the project on GCP.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public GcpKmsConnector region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region.
   * @return region
  **/
  @Schema(description = "Region.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public GcpKmsConnector keyRing(String keyRing) {
    this.keyRing = keyRing;
    return this;
  }

   /**
   * Name of the Key Ring where Google Cloud Symmetric Key is created.
   * @return keyRing
  **/
  @Schema(description = "Name of the Key Ring where Google Cloud Symmetric Key is created.")
  public String getKeyRing() {
    return keyRing;
  }

  public void setKeyRing(String keyRing) {
    this.keyRing = keyRing;
  }

  public GcpKmsConnector keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Name of the Google Cloud Symmetric Key.
   * @return keyName
  **/
  @Schema(description = "Name of the Google Cloud Symmetric Key.")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public GcpKmsConnector credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Schema(required = true, description = "")
  public String getCredentials() {
    return credentials;
  }

  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  public GcpKmsConnector delegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
    return this;
  }

  public GcpKmsConnector addDelegateSelectorsItem(String delegateSelectorsItem) {
    if (this.delegateSelectors == null) {
      this.delegateSelectors = new ArrayList<String>();
    }
    this.delegateSelectors.add(delegateSelectorsItem);
    return this;
  }

   /**
   * List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
   * @return delegateSelectors
  **/
  @Schema(description = "List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.")
  public List<String> getDelegateSelectors() {
    return delegateSelectors;
  }

  public void setDelegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
  }

  public GcpKmsConnector _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @Schema(description = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcpKmsConnector gcpKmsConnector = (GcpKmsConnector) o;
    return Objects.equals(this.projectId, gcpKmsConnector.projectId) &&
        Objects.equals(this.region, gcpKmsConnector.region) &&
        Objects.equals(this.keyRing, gcpKmsConnector.keyRing) &&
        Objects.equals(this.keyName, gcpKmsConnector.keyName) &&
        Objects.equals(this.credentials, gcpKmsConnector.credentials) &&
        Objects.equals(this.delegateSelectors, gcpKmsConnector.delegateSelectors) &&
        Objects.equals(this._default, gcpKmsConnector._default) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, region, keyRing, keyName, credentials, delegateSelectors, _default, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcpKmsConnector {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    keyRing: ").append(toIndentedString(keyRing)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    delegateSelectors: ").append(toIndentedString(delegateSelectors)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
