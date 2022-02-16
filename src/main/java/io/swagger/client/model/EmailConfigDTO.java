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
import io.swagger.client.model.NotificationSettingConfigDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmailConfigDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class EmailConfigDTO extends NotificationSettingConfigDTO {
  @SerializedName("groupEmail")
  private String groupEmail = null;

  public EmailConfigDTO groupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
    return this;
  }

   /**
   * Get groupEmail
   * @return groupEmail
  **/
  @Schema(required = true, description = "")
  public String getGroupEmail() {
    return groupEmail;
  }

  public void setGroupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailConfigDTO emailConfigDTO = (EmailConfigDTO) o;
    return Objects.equals(this.groupEmail, emailConfigDTO.groupEmail) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupEmail, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConfigDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groupEmail: ").append(toIndentedString(groupEmail)).append("\n");
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