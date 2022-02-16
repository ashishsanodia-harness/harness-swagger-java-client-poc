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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Request Parameters needed to run specific Stages of a Pipeline
 */
@Schema(description = "Request Parameters needed to run specific Stages of a Pipeline")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class RunStageRequest {
  @SerializedName("runtimeInputYaml")
  private String runtimeInputYaml = null;

  @SerializedName("stageIdentifiers")
  private List<String> stageIdentifiers = null;

  @SerializedName("expressionValues")
  private Map<String, String> expressionValues = null;

  public RunStageRequest runtimeInputYaml(String runtimeInputYaml) {
    this.runtimeInputYaml = runtimeInputYaml;
    return this;
  }

   /**
   * Get runtimeInputYaml
   * @return runtimeInputYaml
  **/
  @Schema(description = "")
  public String getRuntimeInputYaml() {
    return runtimeInputYaml;
  }

  public void setRuntimeInputYaml(String runtimeInputYaml) {
    this.runtimeInputYaml = runtimeInputYaml;
  }

  public RunStageRequest stageIdentifiers(List<String> stageIdentifiers) {
    this.stageIdentifiers = stageIdentifiers;
    return this;
  }

  public RunStageRequest addStageIdentifiersItem(String stageIdentifiersItem) {
    if (this.stageIdentifiers == null) {
      this.stageIdentifiers = new ArrayList<String>();
    }
    this.stageIdentifiers.add(stageIdentifiersItem);
    return this;
  }

   /**
   * Get stageIdentifiers
   * @return stageIdentifiers
  **/
  @Schema(description = "")
  public List<String> getStageIdentifiers() {
    return stageIdentifiers;
  }

  public void setStageIdentifiers(List<String> stageIdentifiers) {
    this.stageIdentifiers = stageIdentifiers;
  }

  public RunStageRequest expressionValues(Map<String, String> expressionValues) {
    this.expressionValues = expressionValues;
    return this;
  }

  public RunStageRequest putExpressionValuesItem(String key, String expressionValuesItem) {
    if (this.expressionValues == null) {
      this.expressionValues = new HashMap<String, String>();
    }
    this.expressionValues.put(key, expressionValuesItem);
    return this;
  }

   /**
   * Get expressionValues
   * @return expressionValues
  **/
  @Schema(description = "")
  public Map<String, String> getExpressionValues() {
    return expressionValues;
  }

  public void setExpressionValues(Map<String, String> expressionValues) {
    this.expressionValues = expressionValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStageRequest runStageRequest = (RunStageRequest) o;
    return Objects.equals(this.runtimeInputYaml, runStageRequest.runtimeInputYaml) &&
        Objects.equals(this.stageIdentifiers, runStageRequest.stageIdentifiers) &&
        Objects.equals(this.expressionValues, runStageRequest.expressionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runtimeInputYaml, stageIdentifiers, expressionValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStageRequest {\n");
    
    sb.append("    runtimeInputYaml: ").append(toIndentedString(runtimeInputYaml)).append("\n");
    sb.append("    stageIdentifiers: ").append(toIndentedString(stageIdentifiers)).append("\n");
    sb.append("    expressionValues: ").append(toIndentedString(expressionValues)).append("\n");
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