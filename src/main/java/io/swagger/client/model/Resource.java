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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This contains info about Resource saved as a part of Audit Event
 */
@Schema(description = "This contains info about Resource saved as a part of Audit Event")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class Resource {
  @SerializedName("type")
  private String type = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public Resource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Resource Type
   * @return type
  **/
  @Schema(required = true, description = "Resource Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Resource identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Resource Identifier
   * @return identifier
  **/
  @Schema(required = true, description = "Resource Identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Resource labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Resource putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Map of additional information about the Resource.
   * @return labels
  **/
  @Schema(description = "Map of additional information about the Resource.")
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
    Resource resource = (Resource) o;
    return Objects.equals(this.type, resource.type) &&
        Objects.equals(this.identifier, resource.identifier) &&
        Objects.equals(this.labels, resource.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, identifier, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
