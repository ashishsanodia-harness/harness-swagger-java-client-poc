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
import io.swagger.client.model.Clause;
import io.swagger.client.model.Serve;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The rule used to determine what variation to serve to a target
 */
@Schema(description = "The rule used to determine what variation to serve to a target")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ServingRule {
  @SerializedName("clauses")
  private List<Clause> clauses = new ArrayList<Clause>();

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("ruleId")
  private String ruleId = null;

  @SerializedName("serve")
  private Serve serve = null;

  public ServingRule clauses(List<Clause> clauses) {
    this.clauses = clauses;
    return this;
  }

  public ServingRule addClausesItem(Clause clausesItem) {
    this.clauses.add(clausesItem);
    return this;
  }

   /**
   * A list of clauses to use in the rule
   * @return clauses
  **/
  @Schema(required = true, description = "A list of clauses to use in the rule")
  public List<Clause> getClauses() {
    return clauses;
  }

  public void setClauses(List<Clause> clauses) {
    this.clauses = clauses;
  }

  public ServingRule priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The rules priority relative to other rules.  The rules are evaluated in order with 1 being the highest
   * @return priority
  **/
  @Schema(example = "1", required = true, description = "The rules priority relative to other rules.  The rules are evaluated in order with 1 being the highest")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ServingRule ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The unique identifier for this rule
   * @return ruleId
  **/
  @Schema(required = true, description = "The unique identifier for this rule")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public ServingRule serve(Serve serve) {
    this.serve = serve;
    return this;
  }

   /**
   * Get serve
   * @return serve
  **/
  @Schema(required = true, description = "")
  public Serve getServe() {
    return serve;
  }

  public void setServe(Serve serve) {
    this.serve = serve;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServingRule servingRule = (ServingRule) o;
    return Objects.equals(this.clauses, servingRule.clauses) &&
        Objects.equals(this.priority, servingRule.priority) &&
        Objects.equals(this.ruleId, servingRule.ruleId) &&
        Objects.equals(this.serve, servingRule.serve);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauses, priority, ruleId, serve);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServingRule {\n");
    
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    serve: ").append(toIndentedString(serve)).append("\n");
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
