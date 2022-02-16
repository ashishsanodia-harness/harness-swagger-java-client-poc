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
import io.swagger.client.model.ResourceSelectorFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Contains information of filters for Resource Group
 */
@Schema(description = "Contains information of filters for Resource Group")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ResourceGroupFilter {
  @SerializedName("accountIdentifier")
  private String accountIdentifier = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("searchTerm")
  private String searchTerm = null;

  @SerializedName("identifierFilter")
  private List<String> identifierFilter = null;

  @SerializedName("resourceSelectorFilterList")
  private List<ResourceSelectorFilter> resourceSelectorFilterList = null;

  /**
   * Filter based on whether the resource group is Harness managed
   */
  @JsonAdapter(ManagedFilterEnum.Adapter.class)
  public enum ManagedFilterEnum {
    NO_FILTER("NO_FILTER"),
    ONLY_MANAGED("ONLY_MANAGED"),
    ONLY_CUSTOM("ONLY_CUSTOM");

    private String value;

    ManagedFilterEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ManagedFilterEnum fromValue(String input) {
      for (ManagedFilterEnum b : ManagedFilterEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ManagedFilterEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ManagedFilterEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ManagedFilterEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ManagedFilterEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("managedFilter")
  private ManagedFilterEnum managedFilter = null;

  public ResourceGroupFilter accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

   /**
   * Filter by account identifier
   * @return accountIdentifier
  **/
  @Schema(required = true, description = "Filter by account identifier")
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public ResourceGroupFilter orgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

   /**
   * Filter by organization identifier
   * @return orgIdentifier
  **/
  @Schema(description = "Filter by organization identifier")
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }

  public ResourceGroupFilter projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

   /**
   * Filter by project identifier
   * @return projectIdentifier
  **/
  @Schema(description = "Filter by project identifier")
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public ResourceGroupFilter searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }

   /**
   * Filter resource group matching by identifier/name
   * @return searchTerm
  **/
  @Schema(description = "Filter resource group matching by identifier/name")
  public String getSearchTerm() {
    return searchTerm;
  }

  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }

  public ResourceGroupFilter identifierFilter(List<String> identifierFilter) {
    this.identifierFilter = identifierFilter;
    return this;
  }

  public ResourceGroupFilter addIdentifierFilterItem(String identifierFilterItem) {
    if (this.identifierFilter == null) {
      this.identifierFilter = new ArrayList<String>();
    }
    this.identifierFilter.add(identifierFilterItem);
    return this;
  }

   /**
   * Filter by resource group identifiers
   * @return identifierFilter
  **/
  @Schema(description = "Filter by resource group identifiers")
  public List<String> getIdentifierFilter() {
    return identifierFilter;
  }

  public void setIdentifierFilter(List<String> identifierFilter) {
    this.identifierFilter = identifierFilter;
  }

  public ResourceGroupFilter resourceSelectorFilterList(List<ResourceSelectorFilter> resourceSelectorFilterList) {
    this.resourceSelectorFilterList = resourceSelectorFilterList;
    return this;
  }

  public ResourceGroupFilter addResourceSelectorFilterListItem(ResourceSelectorFilter resourceSelectorFilterListItem) {
    if (this.resourceSelectorFilterList == null) {
      this.resourceSelectorFilterList = new ArrayList<ResourceSelectorFilter>();
    }
    this.resourceSelectorFilterList.add(resourceSelectorFilterListItem);
    return this;
  }

   /**
   * Filter based on whether it has a particular resource
   * @return resourceSelectorFilterList
  **/
  @Schema(description = "Filter based on whether it has a particular resource")
  public List<ResourceSelectorFilter> getResourceSelectorFilterList() {
    return resourceSelectorFilterList;
  }

  public void setResourceSelectorFilterList(List<ResourceSelectorFilter> resourceSelectorFilterList) {
    this.resourceSelectorFilterList = resourceSelectorFilterList;
  }

  public ResourceGroupFilter managedFilter(ManagedFilterEnum managedFilter) {
    this.managedFilter = managedFilter;
    return this;
  }

   /**
   * Filter based on whether the resource group is Harness managed
   * @return managedFilter
  **/
  @Schema(description = "Filter based on whether the resource group is Harness managed")
  public ManagedFilterEnum getManagedFilter() {
    return managedFilter;
  }

  public void setManagedFilter(ManagedFilterEnum managedFilter) {
    this.managedFilter = managedFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceGroupFilter resourceGroupFilter = (ResourceGroupFilter) o;
    return Objects.equals(this.accountIdentifier, resourceGroupFilter.accountIdentifier) &&
        Objects.equals(this.orgIdentifier, resourceGroupFilter.orgIdentifier) &&
        Objects.equals(this.projectIdentifier, resourceGroupFilter.projectIdentifier) &&
        Objects.equals(this.searchTerm, resourceGroupFilter.searchTerm) &&
        Objects.equals(this.identifierFilter, resourceGroupFilter.identifierFilter) &&
        Objects.equals(this.resourceSelectorFilterList, resourceGroupFilter.resourceSelectorFilterList) &&
        Objects.equals(this.managedFilter, resourceGroupFilter.managedFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, identifierFilter, resourceSelectorFilterList, managedFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceGroupFilter {\n");
    
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
    sb.append("    identifierFilter: ").append(toIndentedString(identifierFilter)).append("\n");
    sb.append("    resourceSelectorFilterList: ").append(toIndentedString(resourceSelectorFilterList)).append("\n");
    sb.append("    managedFilter: ").append(toIndentedString(managedFilter)).append("\n");
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
