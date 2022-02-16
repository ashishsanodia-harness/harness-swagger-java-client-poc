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
 * This contains Git Details of the Entity
 */
@Schema(description = "This contains Git Details of the Entity")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PipelineEntityGitDetails {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("repoIdentifier")
  private String repoIdentifier = null;

  @SerializedName("rootFolder")
  private String rootFolder = null;

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("repoName")
  private String repoName = null;

  public PipelineEntityGitDetails objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Object Id of the Entity
   * @return objectId
  **/
  @Schema(description = "Object Id of the Entity")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public PipelineEntityGitDetails branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Branch Name
   * @return branch
  **/
  @Schema(description = "Branch Name")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public PipelineEntityGitDetails repoIdentifier(String repoIdentifier) {
    this.repoIdentifier = repoIdentifier;
    return this;
  }

   /**
   * Git Sync Config Id
   * @return repoIdentifier
  **/
  @Schema(description = "Git Sync Config Id")
  public String getRepoIdentifier() {
    return repoIdentifier;
  }

  public void setRepoIdentifier(String repoIdentifier) {
    this.repoIdentifier = repoIdentifier;
  }

  public PipelineEntityGitDetails rootFolder(String rootFolder) {
    this.rootFolder = rootFolder;
    return this;
  }

   /**
   * Root Folder Path of the Entity
   * @return rootFolder
  **/
  @Schema(description = "Root Folder Path of the Entity")
  public String getRootFolder() {
    return rootFolder;
  }

  public void setRootFolder(String rootFolder) {
    this.rootFolder = rootFolder;
  }

  public PipelineEntityGitDetails filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * File Path of the Entity
   * @return filePath
  **/
  @Schema(description = "File Path of the Entity")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public PipelineEntityGitDetails repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Name of the repo
   * @return repoName
  **/
  @Schema(description = "Name of the repo")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineEntityGitDetails pipelineEntityGitDetails = (PipelineEntityGitDetails) o;
    return Objects.equals(this.objectId, pipelineEntityGitDetails.objectId) &&
        Objects.equals(this.branch, pipelineEntityGitDetails.branch) &&
        Objects.equals(this.repoIdentifier, pipelineEntityGitDetails.repoIdentifier) &&
        Objects.equals(this.rootFolder, pipelineEntityGitDetails.rootFolder) &&
        Objects.equals(this.filePath, pipelineEntityGitDetails.filePath) &&
        Objects.equals(this.repoName, pipelineEntityGitDetails.repoName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, branch, repoIdentifier, rootFolder, filePath, repoName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineEntityGitDetails {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    repoIdentifier: ").append(toIndentedString(repoIdentifier)).append("\n");
    sb.append("    rootFolder: ").append(toIndentedString(rootFolder)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
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