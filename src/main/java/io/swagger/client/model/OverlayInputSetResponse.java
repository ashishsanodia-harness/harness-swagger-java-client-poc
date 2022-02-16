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
import io.swagger.client.model.PipelineEntityGitDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This contains Overlay Input Set details.
 */
@Schema(description = "This contains Overlay Input Set details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class OverlayInputSetResponse {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("pipelineIdentifier")
  private String pipelineIdentifier = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("inputSetReferences")
  private List<String> inputSetReferences = null;

  @SerializedName("overlayInputSetYaml")
  private String overlayInputSetYaml = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("isOutdated")
  private Boolean isOutdated = null;

  @SerializedName("isErrorResponse")
  private Boolean isErrorResponse = null;

  @SerializedName("invalidInputSetReferences")
  private Map<String, String> invalidInputSetReferences = null;

  @SerializedName("version")
  private Long version = null;

  @SerializedName("gitDetails")
  private PipelineEntityGitDetails gitDetails = null;

  @SerializedName("entityValidityDetails")
  private PipelineEntityGitDetails entityValidityDetails = null;

  @SerializedName("errorResponse")
  private Boolean errorResponse = null;

  @SerializedName("outdated")
  private Boolean outdated = null;

  public OverlayInputSetResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OverlayInputSetResponse orgIdentifier(String orgIdentifier) {
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

  public OverlayInputSetResponse projectIdentifier(String projectIdentifier) {
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

  public OverlayInputSetResponse pipelineIdentifier(String pipelineIdentifier) {
    this.pipelineIdentifier = pipelineIdentifier;
    return this;
  }

   /**
   * Get pipelineIdentifier
   * @return pipelineIdentifier
  **/
  @Schema(description = "")
  public String getPipelineIdentifier() {
    return pipelineIdentifier;
  }

  public void setPipelineIdentifier(String pipelineIdentifier) {
    this.pipelineIdentifier = pipelineIdentifier;
  }

  public OverlayInputSetResponse identifier(String identifier) {
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

  public OverlayInputSetResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OverlayInputSetResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OverlayInputSetResponse inputSetReferences(List<String> inputSetReferences) {
    this.inputSetReferences = inputSetReferences;
    return this;
  }

  public OverlayInputSetResponse addInputSetReferencesItem(String inputSetReferencesItem) {
    if (this.inputSetReferences == null) {
      this.inputSetReferences = new ArrayList<String>();
    }
    this.inputSetReferences.add(inputSetReferencesItem);
    return this;
  }

   /**
   * Get inputSetReferences
   * @return inputSetReferences
  **/
  @Schema(description = "")
  public List<String> getInputSetReferences() {
    return inputSetReferences;
  }

  public void setInputSetReferences(List<String> inputSetReferences) {
    this.inputSetReferences = inputSetReferences;
  }

  public OverlayInputSetResponse overlayInputSetYaml(String overlayInputSetYaml) {
    this.overlayInputSetYaml = overlayInputSetYaml;
    return this;
  }

   /**
   * Get overlayInputSetYaml
   * @return overlayInputSetYaml
  **/
  @Schema(description = "")
  public String getOverlayInputSetYaml() {
    return overlayInputSetYaml;
  }

  public void setOverlayInputSetYaml(String overlayInputSetYaml) {
    this.overlayInputSetYaml = overlayInputSetYaml;
  }

  public OverlayInputSetResponse tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public OverlayInputSetResponse putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public OverlayInputSetResponse isOutdated(Boolean isOutdated) {
    this.isOutdated = isOutdated;
    return this;
  }

   /**
   * Get isOutdated
   * @return isOutdated
  **/
  @Schema(description = "")
  public Boolean isIsOutdated() {
    return isOutdated;
  }

  public void setIsOutdated(Boolean isOutdated) {
    this.isOutdated = isOutdated;
  }

  public OverlayInputSetResponse isErrorResponse(Boolean isErrorResponse) {
    this.isErrorResponse = isErrorResponse;
    return this;
  }

   /**
   * Get isErrorResponse
   * @return isErrorResponse
  **/
  @Schema(description = "")
  public Boolean isIsErrorResponse() {
    return isErrorResponse;
  }

  public void setIsErrorResponse(Boolean isErrorResponse) {
    this.isErrorResponse = isErrorResponse;
  }

  public OverlayInputSetResponse invalidInputSetReferences(Map<String, String> invalidInputSetReferences) {
    this.invalidInputSetReferences = invalidInputSetReferences;
    return this;
  }

  public OverlayInputSetResponse putInvalidInputSetReferencesItem(String key, String invalidInputSetReferencesItem) {
    if (this.invalidInputSetReferences == null) {
      this.invalidInputSetReferences = new HashMap<String, String>();
    }
    this.invalidInputSetReferences.put(key, invalidInputSetReferencesItem);
    return this;
  }

   /**
   * Get invalidInputSetReferences
   * @return invalidInputSetReferences
  **/
  @Schema(description = "")
  public Map<String, String> getInvalidInputSetReferences() {
    return invalidInputSetReferences;
  }

  public void setInvalidInputSetReferences(Map<String, String> invalidInputSetReferences) {
    this.invalidInputSetReferences = invalidInputSetReferences;
  }

  public OverlayInputSetResponse version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public OverlayInputSetResponse gitDetails(PipelineEntityGitDetails gitDetails) {
    this.gitDetails = gitDetails;
    return this;
  }

   /**
   * Get gitDetails
   * @return gitDetails
  **/
  @Schema(description = "")
  public PipelineEntityGitDetails getGitDetails() {
    return gitDetails;
  }

  public void setGitDetails(PipelineEntityGitDetails gitDetails) {
    this.gitDetails = gitDetails;
  }

  public OverlayInputSetResponse entityValidityDetails(PipelineEntityGitDetails entityValidityDetails) {
    this.entityValidityDetails = entityValidityDetails;
    return this;
  }

   /**
   * Get entityValidityDetails
   * @return entityValidityDetails
  **/
  @Schema(description = "")
  public PipelineEntityGitDetails getEntityValidityDetails() {
    return entityValidityDetails;
  }

  public void setEntityValidityDetails(PipelineEntityGitDetails entityValidityDetails) {
    this.entityValidityDetails = entityValidityDetails;
  }

  public OverlayInputSetResponse errorResponse(Boolean errorResponse) {
    this.errorResponse = errorResponse;
    return this;
  }

   /**
   * Get errorResponse
   * @return errorResponse
  **/
  @Schema(description = "")
  public Boolean isErrorResponse() {
    return errorResponse;
  }

  public void setErrorResponse(Boolean errorResponse) {
    this.errorResponse = errorResponse;
  }

  public OverlayInputSetResponse outdated(Boolean outdated) {
    this.outdated = outdated;
    return this;
  }

   /**
   * Get outdated
   * @return outdated
  **/
  @Schema(description = "")
  public Boolean isOutdated() {
    return outdated;
  }

  public void setOutdated(Boolean outdated) {
    this.outdated = outdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverlayInputSetResponse overlayInputSetResponse = (OverlayInputSetResponse) o;
    return Objects.equals(this.accountId, overlayInputSetResponse.accountId) &&
        Objects.equals(this.orgIdentifier, overlayInputSetResponse.orgIdentifier) &&
        Objects.equals(this.projectIdentifier, overlayInputSetResponse.projectIdentifier) &&
        Objects.equals(this.pipelineIdentifier, overlayInputSetResponse.pipelineIdentifier) &&
        Objects.equals(this.identifier, overlayInputSetResponse.identifier) &&
        Objects.equals(this.name, overlayInputSetResponse.name) &&
        Objects.equals(this.description, overlayInputSetResponse.description) &&
        Objects.equals(this.inputSetReferences, overlayInputSetResponse.inputSetReferences) &&
        Objects.equals(this.overlayInputSetYaml, overlayInputSetResponse.overlayInputSetYaml) &&
        Objects.equals(this.tags, overlayInputSetResponse.tags) &&
        Objects.equals(this.isOutdated, overlayInputSetResponse.isOutdated) &&
        Objects.equals(this.isErrorResponse, overlayInputSetResponse.isErrorResponse) &&
        Objects.equals(this.invalidInputSetReferences, overlayInputSetResponse.invalidInputSetReferences) &&
        Objects.equals(this.version, overlayInputSetResponse.version) &&
        Objects.equals(this.gitDetails, overlayInputSetResponse.gitDetails) &&
        Objects.equals(this.entityValidityDetails, overlayInputSetResponse.entityValidityDetails) &&
        Objects.equals(this.errorResponse, overlayInputSetResponse.errorResponse) &&
        Objects.equals(this.outdated, overlayInputSetResponse.outdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, orgIdentifier, projectIdentifier, pipelineIdentifier, identifier, name, description, inputSetReferences, overlayInputSetYaml, tags, isOutdated, isErrorResponse, invalidInputSetReferences, version, gitDetails, entityValidityDetails, errorResponse, outdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverlayInputSetResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    pipelineIdentifier: ").append(toIndentedString(pipelineIdentifier)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputSetReferences: ").append(toIndentedString(inputSetReferences)).append("\n");
    sb.append("    overlayInputSetYaml: ").append(toIndentedString(overlayInputSetYaml)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    isOutdated: ").append(toIndentedString(isOutdated)).append("\n");
    sb.append("    isErrorResponse: ").append(toIndentedString(isErrorResponse)).append("\n");
    sb.append("    invalidInputSetReferences: ").append(toIndentedString(invalidInputSetReferences)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    gitDetails: ").append(toIndentedString(gitDetails)).append("\n");
    sb.append("    entityValidityDetails: ").append(toIndentedString(entityValidityDetails)).append("\n");
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
    sb.append("    outdated: ").append(toIndentedString(outdated)).append("\n");
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