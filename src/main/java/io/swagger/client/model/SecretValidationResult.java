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
 * This has validation details for the Secret defined in Harness.
 */
@Schema(description = "This has validation details for the Secret defined in Harness.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SecretValidationResult {
  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("message")
  private String message = null;

  public SecretValidationResult success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * This has the validation status for a secret. It is Success, if validation is successful, else the status is Failed.
   * @return success
  **/
  @Schema(description = "This has the validation status for a secret. It is Success, if validation is successful, else the status is Failed.")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public SecretValidationResult message(String message) {
    this.message = message;
    return this;
  }

   /**
   * This is the error message when validation for secret fails.
   * @return message
  **/
  @Schema(description = "This is the error message when validation for secret fails.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretValidationResult secretValidationResult = (SecretValidationResult) o;
    return Objects.equals(this.success, secretValidationResult.success) &&
        Objects.equals(this.message, secretValidationResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretValidationResult {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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