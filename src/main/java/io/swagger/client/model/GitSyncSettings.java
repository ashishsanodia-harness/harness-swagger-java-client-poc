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
 * This contains details of Git Sync Settings
 */
@Schema(description = "This contains details of Git Sync Settings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GitSyncSettings {
  @SerializedName("accountIdentifier")
  private String accountIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("organizationIdentifier")
  private String organizationIdentifier = null;

  @SerializedName("executeOnDelegate")
  private Boolean executeOnDelegate = null;

  public GitSyncSettings accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

   /**
   * Account Identifier for the Entity
   * @return accountIdentifier
  **/
  @Schema(required = true, description = "Account Identifier for the Entity")
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public GitSyncSettings projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

   /**
   * Project Identifier for the Entity
   * @return projectIdentifier
  **/
  @Schema(required = true, description = "Project Identifier for the Entity")
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public GitSyncSettings organizationIdentifier(String organizationIdentifier) {
    this.organizationIdentifier = organizationIdentifier;
    return this;
  }

   /**
   * Organization Identifier for the Entity
   * @return organizationIdentifier
  **/
  @Schema(required = true, description = "Organization Identifier for the Entity")
  public String getOrganizationIdentifier() {
    return organizationIdentifier;
  }

  public void setOrganizationIdentifier(String organizationIdentifier) {
    this.organizationIdentifier = organizationIdentifier;
  }

  public GitSyncSettings executeOnDelegate(Boolean executeOnDelegate) {
    this.executeOnDelegate = executeOnDelegate;
    return this;
  }

   /**
   * Specifies Connectivity Mode for Git Sync. If True, executes through Delegate, else executes through Platform. The default value is True
   * @return executeOnDelegate
  **/
  @Schema(required = true, description = "Specifies Connectivity Mode for Git Sync. If True, executes through Delegate, else executes through Platform. The default value is True")
  public Boolean isExecuteOnDelegate() {
    return executeOnDelegate;
  }

  public void setExecuteOnDelegate(Boolean executeOnDelegate) {
    this.executeOnDelegate = executeOnDelegate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitSyncSettings gitSyncSettings = (GitSyncSettings) o;
    return Objects.equals(this.accountIdentifier, gitSyncSettings.accountIdentifier) &&
        Objects.equals(this.projectIdentifier, gitSyncSettings.projectIdentifier) &&
        Objects.equals(this.organizationIdentifier, gitSyncSettings.organizationIdentifier) &&
        Objects.equals(this.executeOnDelegate, gitSyncSettings.executeOnDelegate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, projectIdentifier, organizationIdentifier, executeOnDelegate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitSyncSettings {\n");
    
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    organizationIdentifier: ").append(toIndentedString(organizationIdentifier)).append("\n");
    sb.append("    executeOnDelegate: ").append(toIndentedString(executeOnDelegate)).append("\n");
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
