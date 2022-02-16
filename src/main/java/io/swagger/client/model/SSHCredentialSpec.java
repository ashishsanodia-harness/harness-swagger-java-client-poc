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
 * This is the SSH credential specification defined in Harness.
 */
@Schema(description = "This is the SSH credential specification defined in Harness.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")

public class SSHCredentialSpec {
  @SerializedName("credentialType")
  private String credentialType = null;

  public SSHCredentialSpec() {
    this.credentialType = this.getClass().getSimpleName();
  }
  public SSHCredentialSpec credentialType(String credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * Get credentialType
   * @return credentialType
  **/
  @Schema(required = true, description = "")
  public String getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(String credentialType) {
    this.credentialType = credentialType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSHCredentialSpec ssHCredentialSpec = (SSHCredentialSpec) o;
    return Objects.equals(this.credentialType, ssHCredentialSpec.credentialType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSHCredentialSpec {\n");
    
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
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
