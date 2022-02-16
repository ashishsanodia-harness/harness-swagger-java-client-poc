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
 * This is the view of the PasswordChange entity defined in Harness
 */
@Schema(description = "This is the view of the PasswordChange entity defined in Harness")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PasswordChange {
  @SerializedName("currentPassword")
  private String currentPassword = null;

  @SerializedName("newPassword")
  private String newPassword = null;

  public PasswordChange currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

   /**
   * Get currentPassword
   * @return currentPassword
  **/
  @Schema(description = "")
  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public PasswordChange newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * Get newPassword
   * @return newPassword
  **/
  @Schema(description = "")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChange passwordChange = (PasswordChange) o;
    return Objects.equals(this.currentPassword, passwordChange.currentPassword) &&
        Objects.equals(this.newPassword, passwordChange.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChange {\n");
    
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
