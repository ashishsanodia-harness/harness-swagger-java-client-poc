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
import java.util.ArrayList;
import java.util.List;
/**
 * Permission
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class Permission {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STAGING("STAGING"),
    EXPERIMENTAL("EXPERIMENTAL"),
    ACTIVE("ACTIVE"),
    DEPRECATED("DEPRECATED"),
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("includeInAllRoles")
  private Boolean includeInAllRoles = null;

  @SerializedName("allowedScopeLevels")
  private List<String> allowedScopeLevels = null;

  @SerializedName("resourceType")
  private String resourceType = null;

  @SerializedName("action")
  private String action = null;

  public Permission identifier(String identifier) {
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

  public Permission name(String name) {
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

  public Permission status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Permission includeInAllRoles(Boolean includeInAllRoles) {
    this.includeInAllRoles = includeInAllRoles;
    return this;
  }

   /**
   * Get includeInAllRoles
   * @return includeInAllRoles
  **/
  @Schema(description = "")
  public Boolean isIncludeInAllRoles() {
    return includeInAllRoles;
  }

  public void setIncludeInAllRoles(Boolean includeInAllRoles) {
    this.includeInAllRoles = includeInAllRoles;
  }

  public Permission allowedScopeLevels(List<String> allowedScopeLevels) {
    this.allowedScopeLevels = allowedScopeLevels;
    return this;
  }

  public Permission addAllowedScopeLevelsItem(String allowedScopeLevelsItem) {
    if (this.allowedScopeLevels == null) {
      this.allowedScopeLevels = new ArrayList<String>();
    }
    this.allowedScopeLevels.add(allowedScopeLevelsItem);
    return this;
  }

   /**
   * Get allowedScopeLevels
   * @return allowedScopeLevels
  **/
  @Schema(description = "")
  public List<String> getAllowedScopeLevels() {
    return allowedScopeLevels;
  }

  public void setAllowedScopeLevels(List<String> allowedScopeLevels) {
    this.allowedScopeLevels = allowedScopeLevels;
  }

  public Permission resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public Permission action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.identifier, permission.identifier) &&
        Objects.equals(this.name, permission.name) &&
        Objects.equals(this.status, permission.status) &&
        Objects.equals(this.includeInAllRoles, permission.includeInAllRoles) &&
        Objects.equals(this.allowedScopeLevels, permission.allowedScopeLevels) &&
        Objects.equals(this.resourceType, permission.resourceType) &&
        Objects.equals(this.action, permission.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, status, includeInAllRoles, allowedScopeLevels, resourceType, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    includeInAllRoles: ").append(toIndentedString(includeInAllRoles)).append("\n");
    sb.append("    allowedScopeLevels: ").append(toIndentedString(allowedScopeLevels)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
