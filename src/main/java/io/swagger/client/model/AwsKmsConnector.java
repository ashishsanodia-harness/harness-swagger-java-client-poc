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
import io.swagger.client.model.AwsKmsConnectorCredential;
import io.swagger.client.model.ConnectorConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This has configuration details for the AWS KMS Secret Manager.
 */
@Schema(description = "This has configuration details for the AWS KMS Secret Manager.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AwsKmsConnector extends ConnectorConfig {
  @SerializedName("credential")
  private AwsKmsConnectorCredential credential = null;

  @SerializedName("kmsArn")
  private String kmsArn = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("delegateSelectors")
  private List<String> delegateSelectors = null;

  @SerializedName("default")
  private Boolean _default = null;

  public AwsKmsConnector credential(AwsKmsConnectorCredential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @Schema(description = "")
  public AwsKmsConnectorCredential getCredential() {
    return credential;
  }

  public void setCredential(AwsKmsConnectorCredential credential) {
    this.credential = credential;
  }

  public AwsKmsConnector kmsArn(String kmsArn) {
    this.kmsArn = kmsArn;
    return this;
  }

   /**
   * Get kmsArn
   * @return kmsArn
  **/
  @Schema(required = true, description = "")
  public String getKmsArn() {
    return kmsArn;
  }

  public void setKmsArn(String kmsArn) {
    this.kmsArn = kmsArn;
  }

  public AwsKmsConnector region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region for AWS KMS.
   * @return region
  **/
  @Schema(description = "Region for AWS KMS.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public AwsKmsConnector delegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
    return this;
  }

  public AwsKmsConnector addDelegateSelectorsItem(String delegateSelectorsItem) {
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

  public AwsKmsConnector _default(Boolean _default) {
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
    AwsKmsConnector awsKmsConnector = (AwsKmsConnector) o;
    return Objects.equals(this.credential, awsKmsConnector.credential) &&
        Objects.equals(this.kmsArn, awsKmsConnector.kmsArn) &&
        Objects.equals(this.region, awsKmsConnector.region) &&
        Objects.equals(this.delegateSelectors, awsKmsConnector.delegateSelectors) &&
        Objects.equals(this._default, awsKmsConnector._default) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, kmsArn, region, delegateSelectors, _default, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsKmsConnector {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    kmsArn: ").append(toIndentedString(kmsArn)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
