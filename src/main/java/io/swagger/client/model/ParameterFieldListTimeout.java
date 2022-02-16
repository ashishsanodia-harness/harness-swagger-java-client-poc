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
import io.swagger.client.model.InputSetValidator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ParameterFieldListTimeout
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ParameterFieldListTimeout {
  @SerializedName("expressionValue")
  private String expressionValue = null;

  @SerializedName("expression")
  private Boolean expression = null;

  @SerializedName("value")
  private List<String> value = null;

  @SerializedName("typeString")
  private Boolean typeString = null;

  @SerializedName("inputSetValidator")
  private InputSetValidator inputSetValidator = null;

  @SerializedName("jsonResponseField")
  private Boolean jsonResponseField = null;

  @SerializedName("responseField")
  private String responseField = null;

  public ParameterFieldListTimeout expressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
    return this;
  }

   /**
   * Get expressionValue
   * @return expressionValue
  **/
  @Schema(description = "")
  public String getExpressionValue() {
    return expressionValue;
  }

  public void setExpressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
  }

  public ParameterFieldListTimeout expression(Boolean expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @Schema(description = "")
  public Boolean isExpression() {
    return expression;
  }

  public void setExpression(Boolean expression) {
    this.expression = expression;
  }

  public ParameterFieldListTimeout value(List<String> value) {
    this.value = value;
    return this;
  }

  public ParameterFieldListTimeout addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<String>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }

  public ParameterFieldListTimeout typeString(Boolean typeString) {
    this.typeString = typeString;
    return this;
  }

   /**
   * Get typeString
   * @return typeString
  **/
  @Schema(description = "")
  public Boolean isTypeString() {
    return typeString;
  }

  public void setTypeString(Boolean typeString) {
    this.typeString = typeString;
  }

  public ParameterFieldListTimeout inputSetValidator(InputSetValidator inputSetValidator) {
    this.inputSetValidator = inputSetValidator;
    return this;
  }

   /**
   * Get inputSetValidator
   * @return inputSetValidator
  **/
  @Schema(description = "")
  public InputSetValidator getInputSetValidator() {
    return inputSetValidator;
  }

  public void setInputSetValidator(InputSetValidator inputSetValidator) {
    this.inputSetValidator = inputSetValidator;
  }

  public ParameterFieldListTimeout jsonResponseField(Boolean jsonResponseField) {
    this.jsonResponseField = jsonResponseField;
    return this;
  }

   /**
   * Get jsonResponseField
   * @return jsonResponseField
  **/
  @Schema(description = "")
  public Boolean isJsonResponseField() {
    return jsonResponseField;
  }

  public void setJsonResponseField(Boolean jsonResponseField) {
    this.jsonResponseField = jsonResponseField;
  }

  public ParameterFieldListTimeout responseField(String responseField) {
    this.responseField = responseField;
    return this;
  }

   /**
   * Get responseField
   * @return responseField
  **/
  @Schema(description = "")
  public String getResponseField() {
    return responseField;
  }

  public void setResponseField(String responseField) {
    this.responseField = responseField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterFieldListTimeout parameterFieldListTimeout = (ParameterFieldListTimeout) o;
    return Objects.equals(this.expressionValue, parameterFieldListTimeout.expressionValue) &&
        Objects.equals(this.expression, parameterFieldListTimeout.expression) &&
        Objects.equals(this.value, parameterFieldListTimeout.value) &&
        Objects.equals(this.typeString, parameterFieldListTimeout.typeString) &&
        Objects.equals(this.inputSetValidator, parameterFieldListTimeout.inputSetValidator) &&
        Objects.equals(this.jsonResponseField, parameterFieldListTimeout.jsonResponseField) &&
        Objects.equals(this.responseField, parameterFieldListTimeout.responseField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionValue, expression, value, typeString, inputSetValidator, jsonResponseField, responseField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterFieldListTimeout {\n");
    
    sb.append("    expressionValue: ").append(toIndentedString(expressionValue)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    typeString: ").append(toIndentedString(typeString)).append("\n");
    sb.append("    inputSetValidator: ").append(toIndentedString(inputSetValidator)).append("\n");
    sb.append("    jsonResponseField: ").append(toIndentedString(jsonResponseField)).append("\n");
    sb.append("    responseField: ").append(toIndentedString(responseField)).append("\n");
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
