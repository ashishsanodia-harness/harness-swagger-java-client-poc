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
import io.swagger.client.model.GitlabCredentials;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains details of the Gitlab credentials used via SSH connections
 */
@Schema(description = "This contains details of the Gitlab credentials used via SSH connections")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GitlabSshCredentials extends GitlabCredentials {
  @SerializedName("sshKeyRef")
  private String sshKeyRef = null;

  public GitlabSshCredentials sshKeyRef(String sshKeyRef) {
    this.sshKeyRef = sshKeyRef;
    return this;
  }

   /**
   * Get sshKeyRef
   * @return sshKeyRef
  **/
  @Schema(required = true, description = "")
  public String getSshKeyRef() {
    return sshKeyRef;
  }

  public void setSshKeyRef(String sshKeyRef) {
    this.sshKeyRef = sshKeyRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabSshCredentials gitlabSshCredentials = (GitlabSshCredentials) o;
    return Objects.equals(this.sshKeyRef, gitlabSshCredentials.sshKeyRef) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sshKeyRef, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabSshCredentials {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sshKeyRef: ").append(toIndentedString(sshKeyRef)).append("\n");
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