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
import io.swagger.client.model.PatchInstruction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CfPatchOperation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class CfPatchOperation {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("executionTime")
  private Integer executionTime = null;

  @SerializedName("instructions")
  private PatchInstruction instructions = null;

  public CfPatchOperation comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * A comment explaining the reason for this patch operation
   * @return comment
  **/
  @Schema(example = "This is a comment string", description = "A comment explaining the reason for this patch operation")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public CfPatchOperation executionTime(Integer executionTime) {
    this.executionTime = executionTime;
    return this;
  }

   /**
   * Time of execution in unix epoch milliseconds when the scheduled changes will be applied
   * @return executionTime
  **/
  @Schema(description = "Time of execution in unix epoch milliseconds when the scheduled changes will be applied")
  public Integer getExecutionTime() {
    return executionTime;
  }

  public void setExecutionTime(Integer executionTime) {
    this.executionTime = executionTime;
  }

  public CfPatchOperation instructions(PatchInstruction instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @Schema(required = true, description = "")
  public PatchInstruction getInstructions() {
    return instructions;
  }

  public void setInstructions(PatchInstruction instructions) {
    this.instructions = instructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfPatchOperation cfPatchOperation = (CfPatchOperation) o;
    return Objects.equals(this.comment, cfPatchOperation.comment) &&
        Objects.equals(this.executionTime, cfPatchOperation.executionTime) &&
        Objects.equals(this.instructions, cfPatchOperation.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, executionTime, instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfPatchOperation {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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