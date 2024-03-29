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
import io.swagger.client.model.PipelineEntityGitDetails;
import io.swagger.client.model.PlanExecution;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains info about the Pipeline Execution
 */
@Schema(description = "This contains info about the Pipeline Execution")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PlanExecutionResponse {
  @SerializedName("planExecution")
  private PlanExecution planExecution = null;

  @SerializedName("gitDetails")
  private PipelineEntityGitDetails gitDetails = null;

  public PlanExecutionResponse planExecution(PlanExecution planExecution) {
    this.planExecution = planExecution;
    return this;
  }

   /**
   * Get planExecution
   * @return planExecution
  **/
  @Schema(description = "")
  public PlanExecution getPlanExecution() {
    return planExecution;
  }

  public void setPlanExecution(PlanExecution planExecution) {
    this.planExecution = planExecution;
  }

  public PlanExecutionResponse gitDetails(PipelineEntityGitDetails gitDetails) {
    this.gitDetails = gitDetails;
    return this;
  }

   /**
   * Get gitDetails
   * @return gitDetails
  **/
  @Schema(description = "")
  public PipelineEntityGitDetails getGitDetails() {
    return gitDetails;
  }

  public void setGitDetails(PipelineEntityGitDetails gitDetails) {
    this.gitDetails = gitDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanExecutionResponse planExecutionResponse = (PlanExecutionResponse) o;
    return Objects.equals(this.planExecution, planExecutionResponse.planExecution) &&
        Objects.equals(this.gitDetails, planExecutionResponse.gitDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planExecution, gitDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanExecutionResponse {\n");
    
    sb.append("    planExecution: ").append(toIndentedString(planExecution)).append("\n");
    sb.append("    gitDetails: ").append(toIndentedString(gitDetails)).append("\n");
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
