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
 * This is the view of the UserGroupFilter entity defined in Harness
 */
@Schema(description = "This is the view of the UserGroupFilter entity defined in Harness")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class UserGroupFilter {
  @SerializedName("databaseIdFilter")
  private List<String> databaseIdFilter = null;

  @SerializedName("identifierFilter")
  private List<String> identifierFilter = null;

  @SerializedName("userIdentifierFilter")
  private List<String> userIdentifierFilter = null;

  @SerializedName("accountIdentifier")
  private String accountIdentifier = null;

  @SerializedName("orgIdentifier")
  private String orgIdentifier = null;

  @SerializedName("projectIdentifier")
  private String projectIdentifier = null;

  @SerializedName("searchTerm")
  private String searchTerm = null;

  public UserGroupFilter databaseIdFilter(List<String> databaseIdFilter) {
    this.databaseIdFilter = databaseIdFilter;
    return this;
  }

  public UserGroupFilter addDatabaseIdFilterItem(String databaseIdFilterItem) {
    if (this.databaseIdFilter == null) {
      this.databaseIdFilter = new ArrayList<String>();
    }
    this.databaseIdFilter.add(databaseIdFilterItem);
    return this;
  }

   /**
   * Filter by the internal database ids of user group
   * @return databaseIdFilter
  **/
  @Schema(description = "Filter by the internal database ids of user group")
  public List<String> getDatabaseIdFilter() {
    return databaseIdFilter;
  }

  public void setDatabaseIdFilter(List<String> databaseIdFilter) {
    this.databaseIdFilter = databaseIdFilter;
  }

  public UserGroupFilter identifierFilter(List<String> identifierFilter) {
    this.identifierFilter = identifierFilter;
    return this;
  }

  public UserGroupFilter addIdentifierFilterItem(String identifierFilterItem) {
    if (this.identifierFilter == null) {
      this.identifierFilter = new ArrayList<String>();
    }
    this.identifierFilter.add(identifierFilterItem);
    return this;
  }

   /**
   * Filter by the user group identifier
   * @return identifierFilter
  **/
  @Schema(description = "Filter by the user group identifier")
  public List<String> getIdentifierFilter() {
    return identifierFilter;
  }

  public void setIdentifierFilter(List<String> identifierFilter) {
    this.identifierFilter = identifierFilter;
  }

  public UserGroupFilter userIdentifierFilter(List<String> userIdentifierFilter) {
    this.userIdentifierFilter = userIdentifierFilter;
    return this;
  }

  public UserGroupFilter addUserIdentifierFilterItem(String userIdentifierFilterItem) {
    if (this.userIdentifierFilter == null) {
      this.userIdentifierFilter = new ArrayList<String>();
    }
    this.userIdentifierFilter.add(userIdentifierFilterItem);
    return this;
  }

   /**
   * Filter by the users present in the user group
   * @return userIdentifierFilter
  **/
  @Schema(description = "Filter by the users present in the user group")
  public List<String> getUserIdentifierFilter() {
    return userIdentifierFilter;
  }

  public void setUserIdentifierFilter(List<String> userIdentifierFilter) {
    this.userIdentifierFilter = userIdentifierFilter;
  }

  public UserGroupFilter accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

   /**
   * Filter by account using account identifier
   * @return accountIdentifier
  **/
  @Schema(required = true, description = "Filter by account using account identifier")
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public UserGroupFilter orgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
    return this;
  }

   /**
   * Filter by organization using account identifier
   * @return orgIdentifier
  **/
  @Schema(description = "Filter by organization using account identifier")
  public String getOrgIdentifier() {
    return orgIdentifier;
  }

  public void setOrgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }

  public UserGroupFilter projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

   /**
   * Filter by project using account identifier
   * @return projectIdentifier
  **/
  @Schema(description = "Filter by project using account identifier")
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public UserGroupFilter searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }

   /**
   * Filter by search term matching entities by name/identifier
   * @return searchTerm
  **/
  @Schema(description = "Filter by search term matching entities by name/identifier")
  public String getSearchTerm() {
    return searchTerm;
  }

  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupFilter userGroupFilter = (UserGroupFilter) o;
    return Objects.equals(this.databaseIdFilter, userGroupFilter.databaseIdFilter) &&
        Objects.equals(this.identifierFilter, userGroupFilter.identifierFilter) &&
        Objects.equals(this.userIdentifierFilter, userGroupFilter.userIdentifierFilter) &&
        Objects.equals(this.accountIdentifier, userGroupFilter.accountIdentifier) &&
        Objects.equals(this.orgIdentifier, userGroupFilter.orgIdentifier) &&
        Objects.equals(this.projectIdentifier, userGroupFilter.projectIdentifier) &&
        Objects.equals(this.searchTerm, userGroupFilter.searchTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseIdFilter, identifierFilter, userIdentifierFilter, accountIdentifier, orgIdentifier, projectIdentifier, searchTerm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupFilter {\n");
    
    sb.append("    databaseIdFilter: ").append(toIndentedString(databaseIdFilter)).append("\n");
    sb.append("    identifierFilter: ").append(toIndentedString(identifierFilter)).append("\n");
    sb.append("    userIdentifierFilter: ").append(toIndentedString(userIdentifierFilter)).append("\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
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
