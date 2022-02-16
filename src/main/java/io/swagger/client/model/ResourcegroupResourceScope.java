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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This has scope details for the resource defined in Harness.
 */
@Schema(description = "This has scope details for the resource defined in Harness.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ResourcegroupResourceScope {
  @SerializedName("accountIdentifier")
  private String accountIdentifier = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public ResourcegroupResourceScope accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

   /**
   * Identifier of Account
   * @return accountIdentifier
  **/
  @Schema(description = "Identifier of Account")
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public ResourcegroupResourceScope orgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

   /**
   * Identifier of Organization
   * @return orgIdentifier
  **/
  @Schema(description = "Identifier of Organization")
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }

  public ResourcegroupResourceScope projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

   /**
   * Identifier of Project
   * @return projectIdentifier
  **/
  @Schema(description = "Identifier of Project")
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public ResourcegroupResourceScope labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ResourcegroupResourceScope putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Additional information about the Resource Scope
   * @return labels
  **/
  @Schema(description = "Additional information about the Resource Scope")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcegroupResourceScope resourcegroupResourceScope = (ResourcegroupResourceScope) o;
    return Objects.equals(this.accountIdentifier, resourcegroupResourceScope.accountIdentifier) &&
        Objects.equals(this.orgIdentifier, resourcegroupResourceScope.orgIdentifier) &&
        Objects.equals(this.projectIdentifier, resourcegroupResourceScope.projectIdentifier) &&
        Objects.equals(this.labels, resourcegroupResourceScope.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, orgIdentifier, projectIdentifier, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcegroupResourceScope {\n");
    
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
