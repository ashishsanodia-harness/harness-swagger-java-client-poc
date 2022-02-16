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
 * InputSetErrorDTOPMS
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class InputSetErrorDTOPMS {
  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("identifierOfErrorSource")
  private String identifierOfErrorSource = null;

  public InputSetErrorDTOPMS fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @Schema(description = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public InputSetErrorDTOPMS message(String message) {
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

  public InputSetErrorDTOPMS identifierOfErrorSource(String identifierOfErrorSource) {
    this.identifierOfErrorSource = identifierOfErrorSource;
    return this;
  }

   /**
   * Get identifierOfErrorSource
   * @return identifierOfErrorSource
  **/
  @Schema(description = "")
  public String getIdentifierOfErrorSource() {
    return identifierOfErrorSource;
  }

  public void setIdentifierOfErrorSource(String identifierOfErrorSource) {
    this.identifierOfErrorSource = identifierOfErrorSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputSetErrorDTOPMS inputSetErrorDTOPMS = (InputSetErrorDTOPMS) o;
    return Objects.equals(this.fieldName, inputSetErrorDTOPMS.fieldName) &&
        Objects.equals(this.message, inputSetErrorDTOPMS.message) &&
        Objects.equals(this.identifierOfErrorSource, inputSetErrorDTOPMS.identifierOfErrorSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, message, identifierOfErrorSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputSetErrorDTOPMS {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    identifierOfErrorSource: ").append(toIndentedString(identifierOfErrorSource)).append("\n");
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