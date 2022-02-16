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
/**
 * This is the view of the Pipeline Execution Count Info for a particular Date
 */
@Schema(description = "This is the view of the Pipeline Execution Count Info for a particular Date")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PipelineCount {
  @SerializedName("total")
  private Long total = null;

  @SerializedName("success")
  private Long success = null;

  @SerializedName("failure")
  private Long failure = null;

  public PipelineCount total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PipelineCount success(Long success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Long getSuccess() {
    return success;
  }

  public void setSuccess(Long success) {
    this.success = success;
  }

  public PipelineCount failure(Long failure) {
    this.failure = failure;
    return this;
  }

   /**
   * Get failure
   * @return failure
  **/
  @Schema(description = "")
  public Long getFailure() {
    return failure;
  }

  public void setFailure(Long failure) {
    this.failure = failure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineCount pipelineCount = (PipelineCount) o;
    return Objects.equals(this.total, pipelineCount.total) &&
        Objects.equals(this.success, pipelineCount.success) &&
        Objects.equals(this.failure, pipelineCount.failure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, success, failure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineCount {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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
