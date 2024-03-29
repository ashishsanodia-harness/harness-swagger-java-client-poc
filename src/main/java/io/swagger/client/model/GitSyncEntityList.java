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
import io.swagger.client.model.GitSyncEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This contains list of Entities based on Entity Type
 */
@Schema(description = "This contains list of Entities based on Entity Type")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GitSyncEntityList {
  /**
   * Entity Type
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    PROJECTS("Projects"),
    PIPELINES("Pipelines"),
    PIPELINESTEPS("PipelineSteps"),
    HTTP("Http"),
    JIRACREATE("JiraCreate"),
    JIRAUPDATE("JiraUpdate"),
    JIRAAPPROVAL("JiraApproval"),
    HARNESSAPPROVAL("HarnessApproval"),
    BARRIER("Barrier"),
    SHELLSCRIPT("ShellScript"),
    K8SCANARYDEPLOY("K8sCanaryDeploy"),
    CONNECTORS("Connectors"),
    SECRETS("Secrets"),
    SERVICE("Service"),
    ENVIRONMENT("Environment"),
    INPUTSETS("InputSets"),
    CVCONFIG("CvConfig"),
    VERIFY("Verify"),
    DELEGATES("Delegates"),
    DELEGATECONFIGURATIONS("DelegateConfigurations"),
    CVVERIFICATIONJOB("CvVerificationJob"),
    INTEGRATIONSTAGE("IntegrationStage"),
    INTEGRATIONSTEPS("IntegrationSteps"),
    CVKUBERNETESACTIVITYSOURCE("CvKubernetesActivitySource"),
    DEPLOYMENTSTEPS("DeploymentSteps"),
    DEPLOYMENTSTAGE("DeploymentStage"),
    APPROVALSTAGE("ApprovalStage"),
    FEATUREFLAGSTAGE("FeatureFlagStage"),
    TEMPLATE("Template"),
    TRIGGERS("Triggers"),
    MONITOREDSERVICE("MonitoredService"),
    GITREPOSITORIES("GitRepositories"),
    FEATUREFLAGS("FeatureFlags"),
    SERVICENOWAPPROVAL("ServiceNowApproval");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EntityTypeEnum fromValue(String input) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EntityTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("entityType")
  private EntityTypeEnum entityType = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("gitSyncEntities")
  private List<GitSyncEntity> gitSyncEntities = null;

  public GitSyncEntityList entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Entity Type
   * @return entityType
  **/
  @Schema(description = "Entity Type")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public GitSyncEntityList count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * This is the number of Git Sync entities corresponding to a given entity type
   * @return count
  **/
  @Schema(description = "This is the number of Git Sync entities corresponding to a given entity type")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public GitSyncEntityList gitSyncEntities(List<GitSyncEntity> gitSyncEntities) {
    this.gitSyncEntities = gitSyncEntities;
    return this;
  }

  public GitSyncEntityList addGitSyncEntitiesItem(GitSyncEntity gitSyncEntitiesItem) {
    if (this.gitSyncEntities == null) {
      this.gitSyncEntities = new ArrayList<GitSyncEntity>();
    }
    this.gitSyncEntities.add(gitSyncEntitiesItem);
    return this;
  }

   /**
   * This is the list of all the Git Sync entities corresponding to a given entity type
   * @return gitSyncEntities
  **/
  @Schema(description = "This is the list of all the Git Sync entities corresponding to a given entity type")
  public List<GitSyncEntity> getGitSyncEntities() {
    return gitSyncEntities;
  }

  public void setGitSyncEntities(List<GitSyncEntity> gitSyncEntities) {
    this.gitSyncEntities = gitSyncEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitSyncEntityList gitSyncEntityList = (GitSyncEntityList) o;
    return Objects.equals(this.entityType, gitSyncEntityList.entityType) &&
        Objects.equals(this.count, gitSyncEntityList.count) &&
        Objects.equals(this.gitSyncEntities, gitSyncEntityList.gitSyncEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, count, gitSyncEntities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitSyncEntityList {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    gitSyncEntities: ").append(toIndentedString(gitSyncEntities)).append("\n");
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
