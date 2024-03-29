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
 * YamlDiffRecordDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class YamlDiffRecordDTO {
  @SerializedName("oldYaml")
  private String oldYaml = null;

  @SerializedName("newYaml")
  private String newYaml = null;

  public YamlDiffRecordDTO oldYaml(String oldYaml) {
    this.oldYaml = oldYaml;
    return this;
  }

   /**
   * Get oldYaml
   * @return oldYaml
  **/
  @Schema(description = "")
  public String getOldYaml() {
    return oldYaml;
  }

  public void setOldYaml(String oldYaml) {
    this.oldYaml = oldYaml;
  }

  public YamlDiffRecordDTO newYaml(String newYaml) {
    this.newYaml = newYaml;
    return this;
  }

   /**
   * Get newYaml
   * @return newYaml
  **/
  @Schema(description = "")
  public String getNewYaml() {
    return newYaml;
  }

  public void setNewYaml(String newYaml) {
    this.newYaml = newYaml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YamlDiffRecordDTO yamlDiffRecordDTO = (YamlDiffRecordDTO) o;
    return Objects.equals(this.oldYaml, yamlDiffRecordDTO.oldYaml) &&
        Objects.equals(this.newYaml, yamlDiffRecordDTO.newYaml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldYaml, newYaml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YamlDiffRecordDTO {\n");
    
    sb.append("    oldYaml: ").append(toIndentedString(oldYaml)).append("\n");
    sb.append("    newYaml: ").append(toIndentedString(newYaml)).append("\n");
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
