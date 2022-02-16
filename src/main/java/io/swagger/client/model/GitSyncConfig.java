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
import io.swagger.client.model.GitSyncFolderConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This contains details of Git Sync Config
 */
@Schema(description = "This contains details of Git Sync Config")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GitSyncConfig {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  @SerializedName("gitConnectorRef")
  private String gitConnectorRef = null;

  @SerializedName("repo")
  private String repo = null;

  @SerializedName("branch")
  private String branch = null;

  /**
   * Connector Type
   */
  @JsonAdapter(GitConnectorTypeEnum.Adapter.class)
  public enum GitConnectorTypeEnum {
    K8SCLUSTER("K8sCluster"),
    GIT("Git"),
    SPLUNK("Splunk"),
    APPDYNAMICS("AppDynamics"),
    PROMETHEUS("Prometheus"),
    DYNATRACE("Dynatrace"),
    VAULT("Vault"),
    AZUREKEYVAULT("AzureKeyVault"),
    DOCKERREGISTRY("DockerRegistry"),
    LOCAL("Local"),
    AWSKMS("AwsKms"),
    GCPKMS("GcpKms"),
    AWSSECRETMANAGER("AwsSecretManager"),
    GCP("Gcp"),
    AWS("Aws"),
    ARTIFACTORY("Artifactory"),
    JIRA("Jira"),
    NEXUS("Nexus"),
    GITHUB("Github"),
    GITLAB("Gitlab"),
    BITBUCKET("Bitbucket"),
    CODECOMMIT("Codecommit"),
    CEAWS("CEAws"),
    CEAZURE("CEAzure"),
    GCPCLOUDCOST("GcpCloudCost"),
    CEK8SCLUSTER("CEK8sCluster"),
    HTTPHELMREPO("HttpHelmRepo"),
    NEWRELIC("NewRelic"),
    DATADOG("Datadog"),
    SUMOLOGIC("SumoLogic"),
    PAGERDUTY("PagerDuty"),
    CUSTOMHEALTH("CustomHealth"),
    SERVICENOW("ServiceNow"),
    ERRORTRACKING("ErrorTracking");

    private String value;

    GitConnectorTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GitConnectorTypeEnum fromValue(String input) {
      for (GitConnectorTypeEnum b : GitConnectorTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GitConnectorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GitConnectorTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public GitConnectorTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return GitConnectorTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("gitConnectorType")
  private GitConnectorTypeEnum gitConnectorType = null;

  @SerializedName("gitSyncFolderConfigDTOs")
  private List<GitSyncFolderConfig> gitSyncFolderConfigDTOs = null;

  public GitSyncConfig identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Git Sync Config Id
   * @return identifier
  **/
  @Schema(description = "Git Sync Config Id")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public GitSyncConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Repo Name
   * @return name
  **/
  @Schema(description = "Repo Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GitSyncConfig projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

   /**
   * Project Identifier for the Entity
   * @return projectIdentifier
  **/
  @Schema(description = "Project Identifier for the Entity")
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public GitSyncConfig orgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

   /**
   * Organization Identifier for the Entity
   * @return orgIdentifier
  **/
  @Schema(description = "Organization Identifier for the Entity")
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }

  public GitSyncConfig gitConnectorRef(String gitConnectorRef) {
    this.gitConnectorRef = gitConnectorRef;
    return this;
  }

   /**
   * Id of the Connector referenced in Git
   * @return gitConnectorRef
  **/
  @Schema(description = "Id of the Connector referenced in Git")
  public String getGitConnectorRef() {
    return gitConnectorRef;
  }

  public void setGitConnectorRef(String gitConnectorRef) {
    this.gitConnectorRef = gitConnectorRef;
  }

  public GitSyncConfig repo(String repo) {
    this.repo = repo;
    return this;
  }

   /**
   * Repo URL
   * @return repo
  **/
  @Schema(description = "Repo URL")
  public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public GitSyncConfig branch(String branch) {
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

  public GitSyncConfig gitConnectorType(GitConnectorTypeEnum gitConnectorType) {
    this.gitConnectorType = gitConnectorType;
    return this;
  }

   /**
   * Connector Type
   * @return gitConnectorType
  **/
  @Schema(required = true, description = "Connector Type")
  public GitConnectorTypeEnum getGitConnectorType() {
    return gitConnectorType;
  }

  public void setGitConnectorType(GitConnectorTypeEnum gitConnectorType) {
    this.gitConnectorType = gitConnectorType;
  }

  public GitSyncConfig gitSyncFolderConfigDTOs(List<GitSyncFolderConfig> gitSyncFolderConfigDTOs) {
    this.gitSyncFolderConfigDTOs = gitSyncFolderConfigDTOs;
    return this;
  }

  public GitSyncConfig addGitSyncFolderConfigDTOsItem(GitSyncFolderConfig gitSyncFolderConfigDTOsItem) {
    if (this.gitSyncFolderConfigDTOs == null) {
      this.gitSyncFolderConfigDTOs = new ArrayList<GitSyncFolderConfig>();
    }
    this.gitSyncFolderConfigDTOs.add(gitSyncFolderConfigDTOsItem);
    return this;
  }

   /**
   * List of all Root Folder Details
   * @return gitSyncFolderConfigDTOs
  **/
  @Schema(description = "List of all Root Folder Details")
  public List<GitSyncFolderConfig> getGitSyncFolderConfigDTOs() {
    return gitSyncFolderConfigDTOs;
  }

  public void setGitSyncFolderConfigDTOs(List<GitSyncFolderConfig> gitSyncFolderConfigDTOs) {
    this.gitSyncFolderConfigDTOs = gitSyncFolderConfigDTOs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitSyncConfig gitSyncConfig = (GitSyncConfig) o;
    return Objects.equals(this.identifier, gitSyncConfig.identifier) &&
        Objects.equals(this.name, gitSyncConfig.name) &&
        Objects.equals(this.projectIdentifier, gitSyncConfig.projectIdentifier) &&
        Objects.equals(this.orgIdentifier, gitSyncConfig.orgIdentifier) &&
        Objects.equals(this.gitConnectorRef, gitSyncConfig.gitConnectorRef) &&
        Objects.equals(this.repo, gitSyncConfig.repo) &&
        Objects.equals(this.branch, gitSyncConfig.branch) &&
        Objects.equals(this.gitConnectorType, gitSyncConfig.gitConnectorType) &&
        Objects.equals(this.gitSyncFolderConfigDTOs, gitSyncConfig.gitSyncFolderConfigDTOs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, projectIdentifier, orgIdentifier, gitConnectorRef, repo, branch, gitConnectorType, gitSyncFolderConfigDTOs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitSyncConfig {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    gitConnectorRef: ").append(toIndentedString(gitConnectorRef)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    gitConnectorType: ").append(toIndentedString(gitConnectorType)).append("\n");
    sb.append("    gitSyncFolderConfigDTOs: ").append(toIndentedString(gitSyncFolderConfigDTOs)).append("\n");
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
