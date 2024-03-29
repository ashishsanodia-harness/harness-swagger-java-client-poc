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
import io.swagger.client.model.ResourceScope;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AccessControl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AccessControl {
  @SerializedName("permission")
  private String permission = null;

  @SerializedName("resourceScope")
  private ResourceScope resourceScope = null;

  @SerializedName("resourceType")
  private String resourceType = null;

  @SerializedName("resourceIdentifier")
  private String resourceIdentifier = null;

  @SerializedName("permitted")
  private Boolean permitted = null;

  public AccessControl permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @Schema(description = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public AccessControl resourceScope(ResourceScope resourceScope) {
    this.resourceScope = resourceScope;
    return this;
  }

   /**
   * Get resourceScope
   * @return resourceScope
  **/
  @Schema(description = "")
  public ResourceScope getResourceScope() {
    return resourceScope;
  }

  public void setResourceScope(ResourceScope resourceScope) {
    this.resourceScope = resourceScope;
  }

  public AccessControl resourceType(String resourceType) {
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

  public AccessControl resourceIdentifier(String resourceIdentifier) {
    this.resourceIdentifier = resourceIdentifier;
    return this;
  }

   /**
   * Get resourceIdentifier
   * @return resourceIdentifier
  **/
  @Schema(description = "")
  public String getResourceIdentifier() {
    return resourceIdentifier;
  }

  public void setResourceIdentifier(String resourceIdentifier) {
    this.resourceIdentifier = resourceIdentifier;
  }

  public AccessControl permitted(Boolean permitted) {
    this.permitted = permitted;
    return this;
  }

   /**
   * Get permitted
   * @return permitted
  **/
  @Schema(description = "")
  public Boolean isPermitted() {
    return permitted;
  }

  public void setPermitted(Boolean permitted) {
    this.permitted = permitted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessControl accessControl = (AccessControl) o;
    return Objects.equals(this.permission, accessControl.permission) &&
        Objects.equals(this.resourceScope, accessControl.resourceScope) &&
        Objects.equals(this.resourceType, accessControl.resourceType) &&
        Objects.equals(this.resourceIdentifier, accessControl.resourceIdentifier) &&
        Objects.equals(this.permitted, accessControl.permitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, resourceScope, resourceType, resourceIdentifier, permitted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControl {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    resourceScope: ").append(toIndentedString(resourceScope)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceIdentifier: ").append(toIndentedString(resourceIdentifier)).append("\n");
    sb.append("    permitted: ").append(toIndentedString(permitted)).append("\n");
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
