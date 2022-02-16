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
 * The scope in which the Budget was created
 */
@Schema(description = "The scope in which the Budget was created")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")

public class BudgetScope {
  @SerializedName("budgetScopeType")
  private String budgetScopeType = null;

  @SerializedName("entityIds")
  private List<String> entityIds = null;

  @SerializedName("entityNames")
  private List<String> entityNames = null;

  @SerializedName("type")
  private String type = null;

  public BudgetScope() {
    this.type = this.getClass().getSimpleName();
  }
  public BudgetScope budgetScopeType(String budgetScopeType) {
    this.budgetScopeType = budgetScopeType;
    return this;
  }

   /**
   * Get budgetScopeType
   * @return budgetScopeType
  **/
  @Schema(description = "")
  public String getBudgetScopeType() {
    return budgetScopeType;
  }

  public void setBudgetScopeType(String budgetScopeType) {
    this.budgetScopeType = budgetScopeType;
  }

  public BudgetScope entityIds(List<String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public BudgetScope addEntityIdsItem(String entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<String>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * Get entityIds
   * @return entityIds
  **/
  @Schema(description = "")
  public List<String> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }

  public BudgetScope entityNames(List<String> entityNames) {
    this.entityNames = entityNames;
    return this;
  }

  public BudgetScope addEntityNamesItem(String entityNamesItem) {
    if (this.entityNames == null) {
      this.entityNames = new ArrayList<String>();
    }
    this.entityNames.add(entityNamesItem);
    return this;
  }

   /**
   * Get entityNames
   * @return entityNames
  **/
  @Schema(description = "")
  public List<String> getEntityNames() {
    return entityNames;
  }

  public void setEntityNames(List<String> entityNames) {
    this.entityNames = entityNames;
  }

  public BudgetScope type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetScope budgetScope = (BudgetScope) o;
    return Objects.equals(this.budgetScopeType, budgetScope.budgetScopeType) &&
        Objects.equals(this.entityIds, budgetScope.entityIds) &&
        Objects.equals(this.entityNames, budgetScope.entityNames) &&
        Objects.equals(this.type, budgetScope.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetScopeType, entityIds, entityNames, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetScope {\n");
    
    sb.append("    budgetScopeType: ").append(toIndentedString(budgetScopeType)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    entityNames: ").append(toIndentedString(entityNames)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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