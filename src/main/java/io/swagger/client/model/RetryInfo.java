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
import io.swagger.client.model.RetryGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This is the view of the Stages from where the User can resume a Failed Pipeline.
 */
@Schema(description = "This is the view of the Stages from where the User can resume a Failed Pipeline.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class RetryInfo {
  @SerializedName("isResumable")
  private Boolean isResumable = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("groups")
  private List<RetryGroup> groups = null;

  @SerializedName("resumable")
  private Boolean resumable = null;

  public RetryInfo isResumable(Boolean isResumable) {
    this.isResumable = isResumable;
    return this;
  }

   /**
   * Get isResumable
   * @return isResumable
  **/
  @Schema(description = "")
  public Boolean isIsResumable() {
    return isResumable;
  }

  public void setIsResumable(Boolean isResumable) {
    this.isResumable = isResumable;
  }

  public RetryInfo errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @Schema(description = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public RetryInfo groups(List<RetryGroup> groups) {
    this.groups = groups;
    return this;
  }

  public RetryInfo addGroupsItem(RetryGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<RetryGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<RetryGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<RetryGroup> groups) {
    this.groups = groups;
  }

  public RetryInfo resumable(Boolean resumable) {
    this.resumable = resumable;
    return this;
  }

   /**
   * Get resumable
   * @return resumable
  **/
  @Schema(description = "")
  public Boolean isResumable() {
    return resumable;
  }

  public void setResumable(Boolean resumable) {
    this.resumable = resumable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryInfo retryInfo = (RetryInfo) o;
    return Objects.equals(this.isResumable, retryInfo.isResumable) &&
        Objects.equals(this.errorMessage, retryInfo.errorMessage) &&
        Objects.equals(this.groups, retryInfo.groups) &&
        Objects.equals(this.resumable, retryInfo.resumable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isResumable, errorMessage, groups, resumable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryInfo {\n");
    
    sb.append("    isResumable: ").append(toIndentedString(isResumable)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    resumable: ").append(toIndentedString(resumable)).append("\n");
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