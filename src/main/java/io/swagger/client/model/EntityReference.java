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
/**
 * This contains details about the Entity’s Scope and its Identifier
 */
@Schema(description = "This contains details about the Entity’s Scope and its Identifier")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class EntityReference {
  @SerializedName("branch")
  private String branch = null;

  @SerializedName("repoIdentifier")
  private String repoIdentifier = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("accountIdentifier")
  private String accountIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  public EntityReference branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @Schema(description = "")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public EntityReference repoIdentifier(String repoIdentifier) {
    this.repoIdentifier = repoIdentifier;
    return this;
  }

   /**
   * Get repoIdentifier
   * @return repoIdentifier
  **/
  @Schema(description = "")
  public String getRepoIdentifier() {
    return repoIdentifier;
  }

  public void setRepoIdentifier(String repoIdentifier) {
    this.repoIdentifier = repoIdentifier;
  }

  public EntityReference isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @Schema(description = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public EntityReference _default(Boolean _default) {
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

  public EntityReference identifier(String identifier) {
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

  public EntityReference accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

   /**
   * Get accountIdentifier
   * @return accountIdentifier
  **/
  @Schema(description = "")
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public EntityReference projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

   /**
   * Get projectIdentifier
   * @return projectIdentifier
  **/
  @Schema(description = "")
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public EntityReference orgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

   /**
   * Get orgIdentifier
   * @return orgIdentifier
  **/
  @Schema(description = "")
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityReference entityReference = (EntityReference) o;
    return Objects.equals(this.branch, entityReference.branch) &&
        Objects.equals(this.repoIdentifier, entityReference.repoIdentifier) &&
        Objects.equals(this.isDefault, entityReference.isDefault) &&
        Objects.equals(this._default, entityReference._default) &&
        Objects.equals(this.identifier, entityReference.identifier) &&
        Objects.equals(this.accountIdentifier, entityReference.accountIdentifier) &&
        Objects.equals(this.projectIdentifier, entityReference.projectIdentifier) &&
        Objects.equals(this.orgIdentifier, entityReference.orgIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, repoIdentifier, isDefault, _default, identifier, accountIdentifier, projectIdentifier, orgIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityReference {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    repoIdentifier: ").append(toIndentedString(repoIdentifier)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
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