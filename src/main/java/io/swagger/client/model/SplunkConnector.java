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
 * This contains the Splunk Connector configuration
 */
@Schema(description = "This contains the Splunk Connector configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SplunkConnector extends ConnectorConfig {
  @SerializedName("splunkUrl")
  private String splunkUrl = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("delegateSelectors")
  private List<String> delegateSelectors = null;

  @SerializedName("passwordRef")
  private String passwordRef = null;

  public SplunkConnector splunkUrl(String splunkUrl) {
    this.splunkUrl = splunkUrl;
    return this;
  }

   /**
   * Get splunkUrl
   * @return splunkUrl
  **/
  @Schema(required = true, description = "")
  public String getSplunkUrl() {
    return splunkUrl;
  }

  public void setSplunkUrl(String splunkUrl) {
    this.splunkUrl = splunkUrl;
  }

  public SplunkConnector username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SplunkConnector accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(required = true, description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SplunkConnector delegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
    return this;
  }

  public SplunkConnector addDelegateSelectorsItem(String delegateSelectorsItem) {
    if (this.delegateSelectors == null) {
      this.delegateSelectors = new ArrayList<String>();
    }
    this.delegateSelectors.add(delegateSelectorsItem);
    return this;
  }

   /**
   * Get delegateSelectors
   * @return delegateSelectors
  **/
  @Schema(description = "")
  public List<String> getDelegateSelectors() {
    return delegateSelectors;
  }

  public void setDelegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
  }

  public SplunkConnector passwordRef(String passwordRef) {
    this.passwordRef = passwordRef;
    return this;
  }

   /**
   * Get passwordRef
   * @return passwordRef
  **/
  @Schema(required = true, description = "")
  public String getPasswordRef() {
    return passwordRef;
  }

  public void setPasswordRef(String passwordRef) {
    this.passwordRef = passwordRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplunkConnector splunkConnector = (SplunkConnector) o;
    return Objects.equals(this.splunkUrl, splunkConnector.splunkUrl) &&
        Objects.equals(this.username, splunkConnector.username) &&
        Objects.equals(this.accountId, splunkConnector.accountId) &&
        Objects.equals(this.delegateSelectors, splunkConnector.delegateSelectors) &&
        Objects.equals(this.passwordRef, splunkConnector.passwordRef) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splunkUrl, username, accountId, delegateSelectors, passwordRef, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplunkConnector {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    splunkUrl: ").append(toIndentedString(splunkUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    delegateSelectors: ").append(toIndentedString(delegateSelectors)).append("\n");
    sb.append("    passwordRef: ").append(toIndentedString(passwordRef)).append("\n");
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