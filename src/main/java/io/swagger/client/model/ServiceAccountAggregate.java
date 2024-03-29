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
import io.swagger.client.model.RoleAssignmentMetadata;
import io.swagger.client.model.ServiceAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This contains the Service Account details and its metadata.
 */
@Schema(description = "This contains the Service Account details and its metadata.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ServiceAccountAggregate {
  @SerializedName("serviceAccount")
  private ServiceAccount serviceAccount = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("lastModifiedAt")
  private Long lastModifiedAt = null;

  @SerializedName("tokensCount")
  private Integer tokensCount = null;

  @SerializedName("roleAssignmentsMetadataDTO")
  private List<RoleAssignmentMetadata> roleAssignmentsMetadataDTO = null;

  public ServiceAccountAggregate serviceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * Get serviceAccount
   * @return serviceAccount
  **/
  @Schema(required = true, description = "")
  public ServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public ServiceAccountAggregate createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * This is the time at which Service Account was created.
   * @return createdAt
  **/
  @Schema(required = true, description = "This is the time at which Service Account was created.")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public ServiceAccountAggregate lastModifiedAt(Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

   /**
   * This is the time at which Service Account was last modified.
   * @return lastModifiedAt
  **/
  @Schema(required = true, description = "This is the time at which Service Account was last modified.")
  public Long getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }

  public ServiceAccountAggregate tokensCount(Integer tokensCount) {
    this.tokensCount = tokensCount;
    return this;
  }

   /**
   * This is the total number of tokens in a Service Account.
   * @return tokensCount
  **/
  @Schema(description = "This is the total number of tokens in a Service Account.")
  public Integer getTokensCount() {
    return tokensCount;
  }

  public void setTokensCount(Integer tokensCount) {
    this.tokensCount = tokensCount;
  }

  public ServiceAccountAggregate roleAssignmentsMetadataDTO(List<RoleAssignmentMetadata> roleAssignmentsMetadataDTO) {
    this.roleAssignmentsMetadataDTO = roleAssignmentsMetadataDTO;
    return this;
  }

  public ServiceAccountAggregate addRoleAssignmentsMetadataDTOItem(RoleAssignmentMetadata roleAssignmentsMetadataDTOItem) {
    if (this.roleAssignmentsMetadataDTO == null) {
      this.roleAssignmentsMetadataDTO = new ArrayList<RoleAssignmentMetadata>();
    }
    this.roleAssignmentsMetadataDTO.add(roleAssignmentsMetadataDTOItem);
    return this;
  }

   /**
   * This is the list of Role Assignments for the Service Account.
   * @return roleAssignmentsMetadataDTO
  **/
  @Schema(description = "This is the list of Role Assignments for the Service Account.")
  public List<RoleAssignmentMetadata> getRoleAssignmentsMetadataDTO() {
    return roleAssignmentsMetadataDTO;
  }

  public void setRoleAssignmentsMetadataDTO(List<RoleAssignmentMetadata> roleAssignmentsMetadataDTO) {
    this.roleAssignmentsMetadataDTO = roleAssignmentsMetadataDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountAggregate serviceAccountAggregate = (ServiceAccountAggregate) o;
    return Objects.equals(this.serviceAccount, serviceAccountAggregate.serviceAccount) &&
        Objects.equals(this.createdAt, serviceAccountAggregate.createdAt) &&
        Objects.equals(this.lastModifiedAt, serviceAccountAggregate.lastModifiedAt) &&
        Objects.equals(this.tokensCount, serviceAccountAggregate.tokensCount) &&
        Objects.equals(this.roleAssignmentsMetadataDTO, serviceAccountAggregate.roleAssignmentsMetadataDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccount, createdAt, lastModifiedAt, tokensCount, roleAssignmentsMetadataDTO);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountAggregate {\n");
    
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    tokensCount: ").append(toIndentedString(tokensCount)).append("\n");
    sb.append("    roleAssignmentsMetadataDTO: ").append(toIndentedString(roleAssignmentsMetadataDTO)).append("\n");
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
