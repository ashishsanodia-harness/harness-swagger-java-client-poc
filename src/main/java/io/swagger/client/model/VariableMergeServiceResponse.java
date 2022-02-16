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
import io.swagger.client.model.ServiceExpressionProperties;
import io.swagger.client.model.VariableResponseMapValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This contains Pipeline YAML with the version.
 */
@Schema(description = "This contains Pipeline YAML with the version.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class VariableMergeServiceResponse {
  @SerializedName("yaml")
  private String yaml = null;

  @SerializedName("metadataMap")
  private Map<String, VariableResponseMapValue> metadataMap = null;

  @SerializedName("errorResponses")
  private List<String> errorResponses = null;

  @SerializedName("serviceExpressionPropertiesList")
  private List<ServiceExpressionProperties> serviceExpressionPropertiesList = null;

  public VariableMergeServiceResponse yaml(String yaml) {
    this.yaml = yaml;
    return this;
  }

   /**
   * Get yaml
   * @return yaml
  **/
  @Schema(description = "")
  public String getYaml() {
    return yaml;
  }

  public void setYaml(String yaml) {
    this.yaml = yaml;
  }

  public VariableMergeServiceResponse metadataMap(Map<String, VariableResponseMapValue> metadataMap) {
    this.metadataMap = metadataMap;
    return this;
  }

  public VariableMergeServiceResponse putMetadataMapItem(String key, VariableResponseMapValue metadataMapItem) {
    if (this.metadataMap == null) {
      this.metadataMap = new HashMap<String, VariableResponseMapValue>();
    }
    this.metadataMap.put(key, metadataMapItem);
    return this;
  }

   /**
   * Get metadataMap
   * @return metadataMap
  **/
  @Schema(description = "")
  public Map<String, VariableResponseMapValue> getMetadataMap() {
    return metadataMap;
  }

  public void setMetadataMap(Map<String, VariableResponseMapValue> metadataMap) {
    this.metadataMap = metadataMap;
  }

  public VariableMergeServiceResponse errorResponses(List<String> errorResponses) {
    this.errorResponses = errorResponses;
    return this;
  }

  public VariableMergeServiceResponse addErrorResponsesItem(String errorResponsesItem) {
    if (this.errorResponses == null) {
      this.errorResponses = new ArrayList<String>();
    }
    this.errorResponses.add(errorResponsesItem);
    return this;
  }

   /**
   * Get errorResponses
   * @return errorResponses
  **/
  @Schema(description = "")
  public List<String> getErrorResponses() {
    return errorResponses;
  }

  public void setErrorResponses(List<String> errorResponses) {
    this.errorResponses = errorResponses;
  }

  public VariableMergeServiceResponse serviceExpressionPropertiesList(List<ServiceExpressionProperties> serviceExpressionPropertiesList) {
    this.serviceExpressionPropertiesList = serviceExpressionPropertiesList;
    return this;
  }

  public VariableMergeServiceResponse addServiceExpressionPropertiesListItem(ServiceExpressionProperties serviceExpressionPropertiesListItem) {
    if (this.serviceExpressionPropertiesList == null) {
      this.serviceExpressionPropertiesList = new ArrayList<ServiceExpressionProperties>();
    }
    this.serviceExpressionPropertiesList.add(serviceExpressionPropertiesListItem);
    return this;
  }

   /**
   * Get serviceExpressionPropertiesList
   * @return serviceExpressionPropertiesList
  **/
  @Schema(description = "")
  public List<ServiceExpressionProperties> getServiceExpressionPropertiesList() {
    return serviceExpressionPropertiesList;
  }

  public void setServiceExpressionPropertiesList(List<ServiceExpressionProperties> serviceExpressionPropertiesList) {
    this.serviceExpressionPropertiesList = serviceExpressionPropertiesList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableMergeServiceResponse variableMergeServiceResponse = (VariableMergeServiceResponse) o;
    return Objects.equals(this.yaml, variableMergeServiceResponse.yaml) &&
        Objects.equals(this.metadataMap, variableMergeServiceResponse.metadataMap) &&
        Objects.equals(this.errorResponses, variableMergeServiceResponse.errorResponses) &&
        Objects.equals(this.serviceExpressionPropertiesList, variableMergeServiceResponse.serviceExpressionPropertiesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yaml, metadataMap, errorResponses, serviceExpressionPropertiesList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableMergeServiceResponse {\n");
    
    sb.append("    yaml: ").append(toIndentedString(yaml)).append("\n");
    sb.append("    metadataMap: ").append(toIndentedString(metadataMap)).append("\n");
    sb.append("    errorResponses: ").append(toIndentedString(errorResponses)).append("\n");
    sb.append("    serviceExpressionPropertiesList: ").append(toIndentedString(serviceExpressionPropertiesList)).append("\n");
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
