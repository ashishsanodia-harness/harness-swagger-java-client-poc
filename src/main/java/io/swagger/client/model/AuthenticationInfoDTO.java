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
import io.swagger.client.model.ResourcegroupPrincipal;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AuthenticationInfoDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AuthenticationInfoDTO {
  @SerializedName("principal")
  private ResourcegroupPrincipal principal = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public AuthenticationInfoDTO principal(ResourcegroupPrincipal principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @Schema(required = true, description = "")
  public ResourcegroupPrincipal getPrincipal() {
    return principal;
  }

  public void setPrincipal(ResourcegroupPrincipal principal) {
    this.principal = principal;
  }

  public AuthenticationInfoDTO labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public AuthenticationInfoDTO putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(description = "")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationInfoDTO authenticationInfoDTO = (AuthenticationInfoDTO) o;
    return Objects.equals(this.principal, authenticationInfoDTO.principal) &&
        Objects.equals(this.labels, authenticationInfoDTO.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationInfoDTO {\n");
    
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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