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
import io.swagger.client.model.AwsSecretManagerCredential;
import io.swagger.client.model.ConnectorConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Returns AWS Secret Manager configuration details.
 */
@Schema(description = "Returns AWS Secret Manager configuration details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AwsSecretManager extends ConnectorConfig {
  @SerializedName("credential")
  private AwsSecretManagerCredential credential = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("secretNamePrefix")
  private String secretNamePrefix = null;

  @SerializedName("delegateSelectors")
  private List<String> delegateSelectors = null;

  @SerializedName("default")
  private Boolean _default = null;

  public AwsSecretManager credential(AwsSecretManagerCredential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @Schema(required = true, description = "")
  public AwsSecretManagerCredential getCredential() {
    return credential;
  }

  public void setCredential(AwsSecretManagerCredential credential) {
    this.credential = credential;
  }

  public AwsSecretManager region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region for AWS Secret Manager.
   * @return region
  **/
  @Schema(required = true, description = "Region for AWS Secret Manager.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public AwsSecretManager secretNamePrefix(String secretNamePrefix) {
    this.secretNamePrefix = secretNamePrefix;
    return this;
  }

   /**
   * Text that is appended to the Secret as a prefix.
   * @return secretNamePrefix
  **/
  @Schema(description = "Text that is appended to the Secret as a prefix.")
  public String getSecretNamePrefix() {
    return secretNamePrefix;
  }

  public void setSecretNamePrefix(String secretNamePrefix) {
    this.secretNamePrefix = secretNamePrefix;
  }

  public AwsSecretManager delegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
    return this;
  }

  public AwsSecretManager addDelegateSelectorsItem(String delegateSelectorsItem) {
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

  public AwsSecretManager _default(Boolean _default) {
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
    AwsSecretManager awsSecretManager = (AwsSecretManager) o;
    return Objects.equals(this.credential, awsSecretManager.credential) &&
        Objects.equals(this.region, awsSecretManager.region) &&
        Objects.equals(this.secretNamePrefix, awsSecretManager.secretNamePrefix) &&
        Objects.equals(this.delegateSelectors, awsSecretManager.delegateSelectors) &&
        Objects.equals(this._default, awsSecretManager._default) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, region, secretNamePrefix, delegateSelectors, _default, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsSecretManager {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretNamePrefix: ").append(toIndentedString(secretNamePrefix)).append("\n");
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
