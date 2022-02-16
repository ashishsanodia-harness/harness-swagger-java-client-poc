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
import io.swagger.client.model.AuditEventData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserMembershipAuditEventData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class UserMembershipAuditEventData extends AuditEventData {
  @SerializedName("mechanism")
  private String mechanism = null;

  public UserMembershipAuditEventData mechanism(String mechanism) {
    this.mechanism = mechanism;
    return this;
  }

   /**
   * Get mechanism
   * @return mechanism
  **/
  @Schema(description = "")
  public String getMechanism() {
    return mechanism;
  }

  public void setMechanism(String mechanism) {
    this.mechanism = mechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMembershipAuditEventData userMembershipAuditEventData = (UserMembershipAuditEventData) o;
    return Objects.equals(this.mechanism, userMembershipAuditEventData.mechanism) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanism, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMembershipAuditEventData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
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
