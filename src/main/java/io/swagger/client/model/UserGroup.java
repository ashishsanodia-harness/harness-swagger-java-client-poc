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
import io.swagger.client.model.NotificationSettingConfigDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This is the view of the UserGroup entity defined in Harness
 */
@Schema(description = "This is the view of the UserGroup entity defined in Harness")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class UserGroup {
  @SerializedName("accountIdentifier")
  private String accountIdentifier = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("users")
  private List<String> users = null;

  @SerializedName("notificationConfigs")
  private List<NotificationSettingConfigDTO> notificationConfigs = null;

  @SerializedName("isSsoLinked")
  private Boolean isSsoLinked = null;

  @SerializedName("linkedSsoId")
  private String linkedSsoId = null;

  @SerializedName("linkedSsoDisplayName")
  private String linkedSsoDisplayName = null;

  @SerializedName("ssoGroupId")
  private String ssoGroupId = null;

  @SerializedName("ssoGroupName")
  private String ssoGroupName = null;

  @SerializedName("externallyManaged")
  private Boolean externallyManaged = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("ssoLinked")
  private Boolean ssoLinked = null;

  public UserGroup accountIdentifier(String accountIdentifier) {
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

  public UserGroup orgIdentifier(String orgIdentifier) {
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

  public UserGroup projectIdentifier(String projectIdentifier) {
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

  public UserGroup identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(required = true, description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public UserGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserGroup users(List<String> users) {
    this.users = users;
    return this;
  }

  public UserGroup addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public UserGroup notificationConfigs(List<NotificationSettingConfigDTO> notificationConfigs) {
    this.notificationConfigs = notificationConfigs;
    return this;
  }

  public UserGroup addNotificationConfigsItem(NotificationSettingConfigDTO notificationConfigsItem) {
    if (this.notificationConfigs == null) {
      this.notificationConfigs = new ArrayList<NotificationSettingConfigDTO>();
    }
    this.notificationConfigs.add(notificationConfigsItem);
    return this;
  }

   /**
   * Get notificationConfigs
   * @return notificationConfigs
  **/
  @Schema(description = "")
  public List<NotificationSettingConfigDTO> getNotificationConfigs() {
    return notificationConfigs;
  }

  public void setNotificationConfigs(List<NotificationSettingConfigDTO> notificationConfigs) {
    this.notificationConfigs = notificationConfigs;
  }

  public UserGroup isSsoLinked(Boolean isSsoLinked) {
    this.isSsoLinked = isSsoLinked;
    return this;
  }

   /**
   * Get isSsoLinked
   * @return isSsoLinked
  **/
  @Schema(description = "")
  public Boolean isIsSsoLinked() {
    return isSsoLinked;
  }

  public void setIsSsoLinked(Boolean isSsoLinked) {
    this.isSsoLinked = isSsoLinked;
  }

  public UserGroup linkedSsoId(String linkedSsoId) {
    this.linkedSsoId = linkedSsoId;
    return this;
  }

   /**
   * Get linkedSsoId
   * @return linkedSsoId
  **/
  @Schema(description = "")
  public String getLinkedSsoId() {
    return linkedSsoId;
  }

  public void setLinkedSsoId(String linkedSsoId) {
    this.linkedSsoId = linkedSsoId;
  }

  public UserGroup linkedSsoDisplayName(String linkedSsoDisplayName) {
    this.linkedSsoDisplayName = linkedSsoDisplayName;
    return this;
  }

   /**
   * Get linkedSsoDisplayName
   * @return linkedSsoDisplayName
  **/
  @Schema(description = "")
  public String getLinkedSsoDisplayName() {
    return linkedSsoDisplayName;
  }

  public void setLinkedSsoDisplayName(String linkedSsoDisplayName) {
    this.linkedSsoDisplayName = linkedSsoDisplayName;
  }

  public UserGroup ssoGroupId(String ssoGroupId) {
    this.ssoGroupId = ssoGroupId;
    return this;
  }

   /**
   * Get ssoGroupId
   * @return ssoGroupId
  **/
  @Schema(description = "")
  public String getSsoGroupId() {
    return ssoGroupId;
  }

  public void setSsoGroupId(String ssoGroupId) {
    this.ssoGroupId = ssoGroupId;
  }

  public UserGroup ssoGroupName(String ssoGroupName) {
    this.ssoGroupName = ssoGroupName;
    return this;
  }

   /**
   * Get ssoGroupName
   * @return ssoGroupName
  **/
  @Schema(description = "")
  public String getSsoGroupName() {
    return ssoGroupName;
  }

  public void setSsoGroupName(String ssoGroupName) {
    this.ssoGroupName = ssoGroupName;
  }

  public UserGroup externallyManaged(Boolean externallyManaged) {
    this.externallyManaged = externallyManaged;
    return this;
  }

   /**
   * Get externallyManaged
   * @return externallyManaged
  **/
  @Schema(description = "")
  public Boolean isExternallyManaged() {
    return externallyManaged;
  }

  public void setExternallyManaged(Boolean externallyManaged) {
    this.externallyManaged = externallyManaged;
  }

  public UserGroup description(String description) {
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

  public UserGroup tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public UserGroup putTagsItem(String key, String tagsItem) {
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

  public UserGroup ssoLinked(Boolean ssoLinked) {
    this.ssoLinked = ssoLinked;
    return this;
  }

   /**
   * Get ssoLinked
   * @return ssoLinked
  **/
  @Schema(description = "")
  public Boolean isSsoLinked() {
    return ssoLinked;
  }

  public void setSsoLinked(Boolean ssoLinked) {
    this.ssoLinked = ssoLinked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroup userGroup = (UserGroup) o;
    return Objects.equals(this.accountIdentifier, userGroup.accountIdentifier) &&
        Objects.equals(this.orgIdentifier, userGroup.orgIdentifier) &&
        Objects.equals(this.projectIdentifier, userGroup.projectIdentifier) &&
        Objects.equals(this.identifier, userGroup.identifier) &&
        Objects.equals(this.name, userGroup.name) &&
        Objects.equals(this.users, userGroup.users) &&
        Objects.equals(this.notificationConfigs, userGroup.notificationConfigs) &&
        Objects.equals(this.isSsoLinked, userGroup.isSsoLinked) &&
        Objects.equals(this.linkedSsoId, userGroup.linkedSsoId) &&
        Objects.equals(this.linkedSsoDisplayName, userGroup.linkedSsoDisplayName) &&
        Objects.equals(this.ssoGroupId, userGroup.ssoGroupId) &&
        Objects.equals(this.ssoGroupName, userGroup.ssoGroupName) &&
        Objects.equals(this.externallyManaged, userGroup.externallyManaged) &&
        Objects.equals(this.description, userGroup.description) &&
        Objects.equals(this.tags, userGroup.tags) &&
        Objects.equals(this.ssoLinked, userGroup.ssoLinked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, orgIdentifier, projectIdentifier, identifier, name, users, notificationConfigs, isSsoLinked, linkedSsoId, linkedSsoDisplayName, ssoGroupId, ssoGroupName, externallyManaged, description, tags, ssoLinked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroup {\n");
    
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    notificationConfigs: ").append(toIndentedString(notificationConfigs)).append("\n");
    sb.append("    isSsoLinked: ").append(toIndentedString(isSsoLinked)).append("\n");
    sb.append("    linkedSsoId: ").append(toIndentedString(linkedSsoId)).append("\n");
    sb.append("    linkedSsoDisplayName: ").append(toIndentedString(linkedSsoDisplayName)).append("\n");
    sb.append("    ssoGroupId: ").append(toIndentedString(ssoGroupId)).append("\n");
    sb.append("    ssoGroupName: ").append(toIndentedString(ssoGroupName)).append("\n");
    sb.append("    externallyManaged: ").append(toIndentedString(externallyManaged)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ssoLinked: ").append(toIndentedString(ssoLinked)).append("\n");
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
