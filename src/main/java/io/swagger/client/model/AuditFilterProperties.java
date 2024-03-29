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
import io.swagger.client.model.Environment;
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourcegroupPrincipal;
import io.swagger.client.model.ResourcegroupResourceScope;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This contains the Audit Event filter information. This is used to filter Audit Events depending on the information provided.
 */
@Schema(description = "This contains the Audit Event filter information. This is used to filter Audit Events depending on the information provided.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AuditFilterProperties {
  @SerializedName("scopes")
  private List<ResourcegroupResourceScope> scopes = null;

  @SerializedName("resources")
  private List<Resource> resources = null;

  /**
   * List of Module Types
   */
  @JsonAdapter(ModulesEnum.Adapter.class)
  public enum ModulesEnum {
    CD("CD"),
    CI("CI"),
    CV("CV"),
    CF("CF"),
    CE("CE"),
    CORE("CORE"),
    PMS("PMS"),
    TEMPLATESERVICE("TEMPLATESERVICE");

    private String value;

    ModulesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModulesEnum fromValue(String input) {
      for (ModulesEnum b : ModulesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModulesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModulesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ModulesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ModulesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("modules")
  private List<ModulesEnum> modules = null;

  /**
   * List of Actions
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    RESTORE("RESTORE"),
    DELETE("DELETE"),
    UPSERT("UPSERT"),
    INVITE("INVITE"),
    RESEND_INVITE("RESEND_INVITE"),
    REVOKE_INVITE("REVOKE_INVITE"),
    ADD_COLLABORATOR("ADD_COLLABORATOR"),
    REMOVE_COLLABORATOR("REMOVE_COLLABORATOR"),
    REVOKE_TOKEN("REVOKE_TOKEN"),
    LOGIN("LOGIN"),
    LOGIN2FA("LOGIN2FA"),
    UNSUCCESSFUL_LOGIN("UNSUCCESSFUL_LOGIN"),
    ADD_MEMBERSHIP("ADD_MEMBERSHIP"),
    REMOVE_MEMBERSHIP("REMOVE_MEMBERSHIP");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionsEnum fromValue(String input) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ActionsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  @SerializedName("environments")
  private List<Environment> environments = null;

  @SerializedName("principals")
  private List<ResourcegroupPrincipal> principals = null;

  @SerializedName("startTime")
  private Long startTime = null;

  @SerializedName("endTime")
  private Long endTime = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  /**
   * This specifies the corresponding Entity of the filter.
   */
  @JsonAdapter(FilterTypeEnum.Adapter.class)
  public enum FilterTypeEnum {
    CONNECTOR("CONNECTOR"),
    DELEGATEPROFILE("DELEGATEPROFILE"),
    DELEGATE("DELEGATE"),
    PIPELINESETUP("PIPELINESETUP"),
    PIPELINEEXECUTION("PIPELINEEXECUTION"),
    DEPLOYMENT("DEPLOYMENT"),
    AUDIT("AUDIT"),
    TEMPLATE("TEMPLATE");

    private String value;

    FilterTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FilterTypeEnum fromValue(String input) {
      for (FilterTypeEnum b : FilterTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FilterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilterTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FilterTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FilterTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("filterType")
  private FilterTypeEnum filterType = null;

  public AuditFilterProperties scopes(List<ResourcegroupResourceScope> scopes) {
    this.scopes = scopes;
    return this;
  }

  public AuditFilterProperties addScopesItem(ResourcegroupResourceScope scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<ResourcegroupResourceScope>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * List of Resource Scopes
   * @return scopes
  **/
  @Schema(description = "List of Resource Scopes")
  public List<ResourcegroupResourceScope> getScopes() {
    return scopes;
  }

  public void setScopes(List<ResourcegroupResourceScope> scopes) {
    this.scopes = scopes;
  }

  public AuditFilterProperties resources(List<Resource> resources) {
    this.resources = resources;
    return this;
  }

  public AuditFilterProperties addResourcesItem(Resource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<Resource>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * List of Resources
   * @return resources
  **/
  @Schema(description = "List of Resources")
  public List<Resource> getResources() {
    return resources;
  }

  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  public AuditFilterProperties modules(List<ModulesEnum> modules) {
    this.modules = modules;
    return this;
  }

  public AuditFilterProperties addModulesItem(ModulesEnum modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<ModulesEnum>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * List of Module Types
   * @return modules
  **/
  @Schema(description = "List of Module Types")
  public List<ModulesEnum> getModules() {
    return modules;
  }

  public void setModules(List<ModulesEnum> modules) {
    this.modules = modules;
  }

  public AuditFilterProperties actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public AuditFilterProperties addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * List of Actions
   * @return actions
  **/
  @Schema(description = "List of Actions")
  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }

  public AuditFilterProperties environments(List<Environment> environments) {
    this.environments = environments;
    return this;
  }

  public AuditFilterProperties addEnvironmentsItem(Environment environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<Environment>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * List of Environments
   * @return environments
  **/
  @Schema(description = "List of Environments")
  public List<Environment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<Environment> environments) {
    this.environments = environments;
  }

  public AuditFilterProperties principals(List<ResourcegroupPrincipal> principals) {
    this.principals = principals;
    return this;
  }

  public AuditFilterProperties addPrincipalsItem(ResourcegroupPrincipal principalsItem) {
    if (this.principals == null) {
      this.principals = new ArrayList<ResourcegroupPrincipal>();
    }
    this.principals.add(principalsItem);
    return this;
  }

   /**
   * List of Principals
   * @return principals
  **/
  @Schema(description = "List of Principals")
  public List<ResourcegroupPrincipal> getPrincipals() {
    return principals;
  }

  public void setPrincipals(List<ResourcegroupPrincipal> principals) {
    this.principals = principals;
  }

  public AuditFilterProperties startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Used to specify a start time for retrieving Audit events that occurred at or after the time indicated.
   * @return startTime
  **/
  @Schema(description = "Used to specify a start time for retrieving Audit events that occurred at or after the time indicated.")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public AuditFilterProperties endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Used to specify the end time for retrieving Audit events that occurred at or before the time indicated.
   * @return endTime
  **/
  @Schema(description = "Used to specify the end time for retrieving Audit events that occurred at or before the time indicated.")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public AuditFilterProperties tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AuditFilterProperties putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Filter tags as a key-value pair.
   * @return tags
  **/
  @Schema(description = "Filter tags as a key-value pair.")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public AuditFilterProperties filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * This specifies the corresponding Entity of the filter.
   * @return filterType
  **/
  @Schema(description = "This specifies the corresponding Entity of the filter.")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }

  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditFilterProperties auditFilterProperties = (AuditFilterProperties) o;
    return Objects.equals(this.scopes, auditFilterProperties.scopes) &&
        Objects.equals(this.resources, auditFilterProperties.resources) &&
        Objects.equals(this.modules, auditFilterProperties.modules) &&
        Objects.equals(this.actions, auditFilterProperties.actions) &&
        Objects.equals(this.environments, auditFilterProperties.environments) &&
        Objects.equals(this.principals, auditFilterProperties.principals) &&
        Objects.equals(this.startTime, auditFilterProperties.startTime) &&
        Objects.equals(this.endTime, auditFilterProperties.endTime) &&
        Objects.equals(this.tags, auditFilterProperties.tags) &&
        Objects.equals(this.filterType, auditFilterProperties.filterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes, resources, modules, actions, environments, principals, startTime, endTime, tags, filterType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditFilterProperties {\n");
    
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
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
