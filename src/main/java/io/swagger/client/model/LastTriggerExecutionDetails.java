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
 * LastTriggerExecutionDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class LastTriggerExecutionDetails {
  @SerializedName("lastExecutionTime")
  private Long lastExecutionTime = null;

  @SerializedName("lastExecutionSuccessful")
  private Boolean lastExecutionSuccessful = null;

  @SerializedName("lastExecutionStatus")
  private String lastExecutionStatus = null;

  @SerializedName("planExecutionId")
  private String planExecutionId = null;

  @SerializedName("message")
  private String message = null;

  public LastTriggerExecutionDetails lastExecutionTime(Long lastExecutionTime) {
    this.lastExecutionTime = lastExecutionTime;
    return this;
  }

   /**
   * Get lastExecutionTime
   * @return lastExecutionTime
  **/
  @Schema(description = "")
  public Long getLastExecutionTime() {
    return lastExecutionTime;
  }

  public void setLastExecutionTime(Long lastExecutionTime) {
    this.lastExecutionTime = lastExecutionTime;
  }

  public LastTriggerExecutionDetails lastExecutionSuccessful(Boolean lastExecutionSuccessful) {
    this.lastExecutionSuccessful = lastExecutionSuccessful;
    return this;
  }

   /**
   * Get lastExecutionSuccessful
   * @return lastExecutionSuccessful
  **/
  @Schema(description = "")
  public Boolean isLastExecutionSuccessful() {
    return lastExecutionSuccessful;
  }

  public void setLastExecutionSuccessful(Boolean lastExecutionSuccessful) {
    this.lastExecutionSuccessful = lastExecutionSuccessful;
  }

  public LastTriggerExecutionDetails lastExecutionStatus(String lastExecutionStatus) {
    this.lastExecutionStatus = lastExecutionStatus;
    return this;
  }

   /**
   * Get lastExecutionStatus
   * @return lastExecutionStatus
  **/
  @Schema(description = "")
  public String getLastExecutionStatus() {
    return lastExecutionStatus;
  }

  public void setLastExecutionStatus(String lastExecutionStatus) {
    this.lastExecutionStatus = lastExecutionStatus;
  }

  public LastTriggerExecutionDetails planExecutionId(String planExecutionId) {
    this.planExecutionId = planExecutionId;
    return this;
  }

   /**
   * Get planExecutionId
   * @return planExecutionId
  **/
  @Schema(description = "")
  public String getPlanExecutionId() {
    return planExecutionId;
  }

  public void setPlanExecutionId(String planExecutionId) {
    this.planExecutionId = planExecutionId;
  }

  public LastTriggerExecutionDetails message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastTriggerExecutionDetails lastTriggerExecutionDetails = (LastTriggerExecutionDetails) o;
    return Objects.equals(this.lastExecutionTime, lastTriggerExecutionDetails.lastExecutionTime) &&
        Objects.equals(this.lastExecutionSuccessful, lastTriggerExecutionDetails.lastExecutionSuccessful) &&
        Objects.equals(this.lastExecutionStatus, lastTriggerExecutionDetails.lastExecutionStatus) &&
        Objects.equals(this.planExecutionId, lastTriggerExecutionDetails.planExecutionId) &&
        Objects.equals(this.message, lastTriggerExecutionDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastExecutionTime, lastExecutionSuccessful, lastExecutionStatus, planExecutionId, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastTriggerExecutionDetails {\n");
    
    sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
    sb.append("    lastExecutionSuccessful: ").append(toIndentedString(lastExecutionSuccessful)).append("\n");
    sb.append("    lastExecutionStatus: ").append(toIndentedString(lastExecutionStatus)).append("\n");
    sb.append("    planExecutionId: ").append(toIndentedString(planExecutionId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
