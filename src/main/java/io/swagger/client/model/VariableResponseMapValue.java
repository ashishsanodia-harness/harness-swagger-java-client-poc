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
import io.swagger.client.model.YamlOutputProperties;
import io.swagger.client.model.YamlProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VariableResponseMapValue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class VariableResponseMapValue {
  @SerializedName("yamlProperties")
  private YamlProperties yamlProperties = null;

  @SerializedName("yamlOutputProperties")
  private YamlOutputProperties yamlOutputProperties = null;

  public VariableResponseMapValue yamlProperties(YamlProperties yamlProperties) {
    this.yamlProperties = yamlProperties;
    return this;
  }

   /**
   * Get yamlProperties
   * @return yamlProperties
  **/
  @Schema(description = "")
  public YamlProperties getYamlProperties() {
    return yamlProperties;
  }

  public void setYamlProperties(YamlProperties yamlProperties) {
    this.yamlProperties = yamlProperties;
  }

  public VariableResponseMapValue yamlOutputProperties(YamlOutputProperties yamlOutputProperties) {
    this.yamlOutputProperties = yamlOutputProperties;
    return this;
  }

   /**
   * Get yamlOutputProperties
   * @return yamlOutputProperties
  **/
  @Schema(description = "")
  public YamlOutputProperties getYamlOutputProperties() {
    return yamlOutputProperties;
  }

  public void setYamlOutputProperties(YamlOutputProperties yamlOutputProperties) {
    this.yamlOutputProperties = yamlOutputProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableResponseMapValue variableResponseMapValue = (VariableResponseMapValue) o;
    return Objects.equals(this.yamlProperties, variableResponseMapValue.yamlProperties) &&
        Objects.equals(this.yamlOutputProperties, variableResponseMapValue.yamlOutputProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yamlProperties, yamlOutputProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableResponseMapValue {\n");
    
    sb.append("    yamlProperties: ").append(toIndentedString(yamlProperties)).append("\n");
    sb.append("    yamlOutputProperties: ").append(toIndentedString(yamlOutputProperties)).append("\n");
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
