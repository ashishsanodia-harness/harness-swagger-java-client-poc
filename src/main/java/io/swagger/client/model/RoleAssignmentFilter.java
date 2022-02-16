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
import io.swagger.client.model.Principal;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RoleAssignmentFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class RoleAssignmentFilter {
  @SerializedName("resourceGroupFilter")
  private List<String> resourceGroupFilter = null;

  @SerializedName("roleFilter")
  private List<String> roleFilter = null;

  /**
   * Filter role assignments based on principal type
   */
  @JsonAdapter(PrincipalTypeFilterEnum.Adapter.class)
  public enum PrincipalTypeFilterEnum {
    USER("USER"),
    USER_GROUP("USER_GROUP"),
    SERVICE("SERVICE"),
    API_KEY("API_KEY"),
    SERVICE_ACCOUNT("SERVICE_ACCOUNT");

    private String value;

    PrincipalTypeFilterEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PrincipalTypeFilterEnum fromValue(String input) {
      for (PrincipalTypeFilterEnum b : PrincipalTypeFilterEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PrincipalTypeFilterEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrincipalTypeFilterEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PrincipalTypeFilterEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PrincipalTypeFilterEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("principalTypeFilter")
  private List<PrincipalTypeFilterEnum> principalTypeFilter = null;

  @SerializedName("principalFilter")
  private List<Principal> principalFilter = null;

  @SerializedName("harnessManagedFilter")
  private List<Boolean> harnessManagedFilter = null;

  @SerializedName("disabledFilter")
  private List<Boolean> disabledFilter = null;

  public RoleAssignmentFilter resourceGroupFilter(List<String> resourceGroupFilter) {
    this.resourceGroupFilter = resourceGroupFilter;
    return this;
  }

  public RoleAssignmentFilter addResourceGroupFilterItem(String resourceGroupFilterItem) {
    if (this.resourceGroupFilter == null) {
      this.resourceGroupFilter = new ArrayList<String>();
    }
    this.resourceGroupFilter.add(resourceGroupFilterItem);
    return this;
  }

   /**
   * Filter role assignments based on resource group identifiers
   * @return resourceGroupFilter
  **/
  @Schema(description = "Filter role assignments based on resource group identifiers")
  public List<String> getResourceGroupFilter() {
    return resourceGroupFilter;
  }

  public void setResourceGroupFilter(List<String> resourceGroupFilter) {
    this.resourceGroupFilter = resourceGroupFilter;
  }

  public RoleAssignmentFilter roleFilter(List<String> roleFilter) {
    this.roleFilter = roleFilter;
    return this;
  }

  public RoleAssignmentFilter addRoleFilterItem(String roleFilterItem) {
    if (this.roleFilter == null) {
      this.roleFilter = new ArrayList<String>();
    }
    this.roleFilter.add(roleFilterItem);
    return this;
  }

   /**
   * Filter role assignments based on role identifiers
   * @return roleFilter
  **/
  @Schema(description = "Filter role assignments based on role identifiers")
  public List<String> getRoleFilter() {
    return roleFilter;
  }

  public void setRoleFilter(List<String> roleFilter) {
    this.roleFilter = roleFilter;
  }

  public RoleAssignmentFilter principalTypeFilter(List<PrincipalTypeFilterEnum> principalTypeFilter) {
    this.principalTypeFilter = principalTypeFilter;
    return this;
  }

  public RoleAssignmentFilter addPrincipalTypeFilterItem(PrincipalTypeFilterEnum principalTypeFilterItem) {
    if (this.principalTypeFilter == null) {
      this.principalTypeFilter = new ArrayList<PrincipalTypeFilterEnum>();
    }
    this.principalTypeFilter.add(principalTypeFilterItem);
    return this;
  }

   /**
   * Filter role assignments based on principal type
   * @return principalTypeFilter
  **/
  @Schema(description = "Filter role assignments based on principal type")
  public List<PrincipalTypeFilterEnum> getPrincipalTypeFilter() {
    return principalTypeFilter;
  }

  public void setPrincipalTypeFilter(List<PrincipalTypeFilterEnum> principalTypeFilter) {
    this.principalTypeFilter = principalTypeFilter;
  }

  public RoleAssignmentFilter principalFilter(List<Principal> principalFilter) {
    this.principalFilter = principalFilter;
    return this;
  }

  public RoleAssignmentFilter addPrincipalFilterItem(Principal principalFilterItem) {
    if (this.principalFilter == null) {
      this.principalFilter = new ArrayList<Principal>();
    }
    this.principalFilter.add(principalFilterItem);
    return this;
  }

   /**
   * Filter role assignments based on principals
   * @return principalFilter
  **/
  @Schema(description = "Filter role assignments based on principals")
  public List<Principal> getPrincipalFilter() {
    return principalFilter;
  }

  public void setPrincipalFilter(List<Principal> principalFilter) {
    this.principalFilter = principalFilter;
  }

  public RoleAssignmentFilter harnessManagedFilter(List<Boolean> harnessManagedFilter) {
    this.harnessManagedFilter = harnessManagedFilter;
    return this;
  }

  public RoleAssignmentFilter addHarnessManagedFilterItem(Boolean harnessManagedFilterItem) {
    if (this.harnessManagedFilter == null) {
      this.harnessManagedFilter = new ArrayList<Boolean>();
    }
    this.harnessManagedFilter.add(harnessManagedFilterItem);
    return this;
  }

   /**
   * Filter role assignments based on role assignments being harness managed
   * @return harnessManagedFilter
  **/
  @Schema(description = "Filter role assignments based on role assignments being harness managed")
  public List<Boolean> getHarnessManagedFilter() {
    return harnessManagedFilter;
  }

  public void setHarnessManagedFilter(List<Boolean> harnessManagedFilter) {
    this.harnessManagedFilter = harnessManagedFilter;
  }

  public RoleAssignmentFilter disabledFilter(List<Boolean> disabledFilter) {
    this.disabledFilter = disabledFilter;
    return this;
  }

  public RoleAssignmentFilter addDisabledFilterItem(Boolean disabledFilterItem) {
    if (this.disabledFilter == null) {
      this.disabledFilter = new ArrayList<Boolean>();
    }
    this.disabledFilter.add(disabledFilterItem);
    return this;
  }

   /**
   * Filter role assignments based on whether they are enabled or disabled
   * @return disabledFilter
  **/
  @Schema(description = "Filter role assignments based on whether they are enabled or disabled")
  public List<Boolean> getDisabledFilter() {
    return disabledFilter;
  }

  public void setDisabledFilter(List<Boolean> disabledFilter) {
    this.disabledFilter = disabledFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAssignmentFilter roleAssignmentFilter = (RoleAssignmentFilter) o;
    return Objects.equals(this.resourceGroupFilter, roleAssignmentFilter.resourceGroupFilter) &&
        Objects.equals(this.roleFilter, roleAssignmentFilter.roleFilter) &&
        Objects.equals(this.principalTypeFilter, roleAssignmentFilter.principalTypeFilter) &&
        Objects.equals(this.principalFilter, roleAssignmentFilter.principalFilter) &&
        Objects.equals(this.harnessManagedFilter, roleAssignmentFilter.harnessManagedFilter) &&
        Objects.equals(this.disabledFilter, roleAssignmentFilter.disabledFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceGroupFilter, roleFilter, principalTypeFilter, principalFilter, harnessManagedFilter, disabledFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAssignmentFilter {\n");
    
    sb.append("    resourceGroupFilter: ").append(toIndentedString(resourceGroupFilter)).append("\n");
    sb.append("    roleFilter: ").append(toIndentedString(roleFilter)).append("\n");
    sb.append("    principalTypeFilter: ").append(toIndentedString(principalTypeFilter)).append("\n");
    sb.append("    principalFilter: ").append(toIndentedString(principalFilter)).append("\n");
    sb.append("    harnessManagedFilter: ").append(toIndentedString(harnessManagedFilter)).append("\n");
    sb.append("    disabledFilter: ").append(toIndentedString(disabledFilter)).append("\n");
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