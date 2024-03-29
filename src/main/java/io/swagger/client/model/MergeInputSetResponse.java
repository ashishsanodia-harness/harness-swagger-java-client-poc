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
import io.swagger.client.model.InputSetErrorWrapperDTOPMS;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * View of the Response of Merging of Input Sets of a Pipeline
 */
@Schema(description = "View of the Response of Merging of Input Sets of a Pipeline")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class MergeInputSetResponse {
  @SerializedName("pipelineYaml")
  private String pipelineYaml = null;

  @SerializedName("completePipelineYaml")
  private String completePipelineYaml = null;

  @SerializedName("isErrorResponse")
  private Boolean isErrorResponse = null;

  @SerializedName("inputSetErrorWrapper")
  private InputSetErrorWrapperDTOPMS inputSetErrorWrapper = null;

  @SerializedName("errorResponse")
  private Boolean errorResponse = null;

  public MergeInputSetResponse pipelineYaml(String pipelineYaml) {
    this.pipelineYaml = pipelineYaml;
    return this;
  }

   /**
   * Get pipelineYaml
   * @return pipelineYaml
  **/
  @Schema(description = "")
  public String getPipelineYaml() {
    return pipelineYaml;
  }

  public void setPipelineYaml(String pipelineYaml) {
    this.pipelineYaml = pipelineYaml;
  }

  public MergeInputSetResponse completePipelineYaml(String completePipelineYaml) {
    this.completePipelineYaml = completePipelineYaml;
    return this;
  }

   /**
   * Get completePipelineYaml
   * @return completePipelineYaml
  **/
  @Schema(description = "")
  public String getCompletePipelineYaml() {
    return completePipelineYaml;
  }

  public void setCompletePipelineYaml(String completePipelineYaml) {
    this.completePipelineYaml = completePipelineYaml;
  }

  public MergeInputSetResponse isErrorResponse(Boolean isErrorResponse) {
    this.isErrorResponse = isErrorResponse;
    return this;
  }

   /**
   * Get isErrorResponse
   * @return isErrorResponse
  **/
  @Schema(description = "")
  public Boolean isIsErrorResponse() {
    return isErrorResponse;
  }

  public void setIsErrorResponse(Boolean isErrorResponse) {
    this.isErrorResponse = isErrorResponse;
  }

  public MergeInputSetResponse inputSetErrorWrapper(InputSetErrorWrapperDTOPMS inputSetErrorWrapper) {
    this.inputSetErrorWrapper = inputSetErrorWrapper;
    return this;
  }

   /**
   * Get inputSetErrorWrapper
   * @return inputSetErrorWrapper
  **/
  @Schema(description = "")
  public InputSetErrorWrapperDTOPMS getInputSetErrorWrapper() {
    return inputSetErrorWrapper;
  }

  public void setInputSetErrorWrapper(InputSetErrorWrapperDTOPMS inputSetErrorWrapper) {
    this.inputSetErrorWrapper = inputSetErrorWrapper;
  }

  public MergeInputSetResponse errorResponse(Boolean errorResponse) {
    this.errorResponse = errorResponse;
    return this;
  }

   /**
   * Get errorResponse
   * @return errorResponse
  **/
  @Schema(description = "")
  public Boolean isErrorResponse() {
    return errorResponse;
  }

  public void setErrorResponse(Boolean errorResponse) {
    this.errorResponse = errorResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeInputSetResponse mergeInputSetResponse = (MergeInputSetResponse) o;
    return Objects.equals(this.pipelineYaml, mergeInputSetResponse.pipelineYaml) &&
        Objects.equals(this.completePipelineYaml, mergeInputSetResponse.completePipelineYaml) &&
        Objects.equals(this.isErrorResponse, mergeInputSetResponse.isErrorResponse) &&
        Objects.equals(this.inputSetErrorWrapper, mergeInputSetResponse.inputSetErrorWrapper) &&
        Objects.equals(this.errorResponse, mergeInputSetResponse.errorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineYaml, completePipelineYaml, isErrorResponse, inputSetErrorWrapper, errorResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeInputSetResponse {\n");
    
    sb.append("    pipelineYaml: ").append(toIndentedString(pipelineYaml)).append("\n");
    sb.append("    completePipelineYaml: ").append(toIndentedString(completePipelineYaml)).append("\n");
    sb.append("    isErrorResponse: ").append(toIndentedString(isErrorResponse)).append("\n");
    sb.append("    inputSetErrorWrapper: ").append(toIndentedString(inputSetErrorWrapper)).append("\n");
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
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
