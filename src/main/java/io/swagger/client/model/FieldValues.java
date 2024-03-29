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
 * FieldValues
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class FieldValues {
  @SerializedName("fieldValues")
  private Map<String, List<String>> fieldValues = null;

  public FieldValues fieldValues(Map<String, List<String>> fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

  public FieldValues putFieldValuesItem(String key, List<String> fieldValuesItem) {
    if (this.fieldValues == null) {
      this.fieldValues = new HashMap<String, List<String>>();
    }
    this.fieldValues.put(key, fieldValuesItem);
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @Schema(description = "")
  public Map<String, List<String>> getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(Map<String, List<String>> fieldValues) {
    this.fieldValues = fieldValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldValues fieldValues = (FieldValues) o;
    return Objects.equals(this.fieldValues, fieldValues.fieldValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValues {\n");
    
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
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
