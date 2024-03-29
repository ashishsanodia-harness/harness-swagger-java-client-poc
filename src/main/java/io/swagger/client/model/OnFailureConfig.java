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
import io.swagger.client.model.FailureStrategyActionConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * OnFailureConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class OnFailureConfig {
  /**
   * Gets or Sets errors
   */
  @JsonAdapter(ErrorsEnum.Adapter.class)
  public enum ErrorsEnum {
    UNKNOWN("UNKNOWN"),
    ALL_ERRORS("ALL_ERRORS"),
    AUTHENTICATION_ERROR("AUTHENTICATION_ERROR"),
    CONNECTIVITY_ERROR("CONNECTIVITY_ERROR"),
    TIMEOUT_ERROR("TIMEOUT_ERROR"),
    AUTHORIZATION_ERROR("AUTHORIZATION_ERROR"),
    VERIFICATION_ERROR("VERIFICATION_ERROR"),
    DELEGATE_PROVISIONING_ERROR("DELEGATE_PROVISIONING_ERROR");

    private String value;

    ErrorsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ErrorsEnum fromValue(String input) {
      for (ErrorsEnum b : ErrorsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ErrorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ErrorsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ErrorsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("errors")
  private List<ErrorsEnum> errors = new ArrayList<ErrorsEnum>();

  @SerializedName("action")
  private FailureStrategyActionConfig action = null;

  public OnFailureConfig errors(List<ErrorsEnum> errors) {
    this.errors = errors;
    return this;
  }

  public OnFailureConfig addErrorsItem(ErrorsEnum errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(required = true, description = "")
  public List<ErrorsEnum> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorsEnum> errors) {
    this.errors = errors;
  }

  public OnFailureConfig action(FailureStrategyActionConfig action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(required = true, description = "")
  public FailureStrategyActionConfig getAction() {
    return action;
  }

  public void setAction(FailureStrategyActionConfig action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnFailureConfig onFailureConfig = (OnFailureConfig) o;
    return Objects.equals(this.errors, onFailureConfig.errors) &&
        Objects.equals(this.action, onFailureConfig.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnFailureConfig {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
