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
import io.swagger.client.model.AwsCredentialSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains AWS manual credentials connector spec
 */
@Schema(description = "This contains AWS manual credentials connector spec")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AwsManualConfigSpec extends AwsCredentialSpec {
  @SerializedName("accessKey")
  private String accessKey = null;

  @SerializedName("accessKeyRef")
  private String accessKeyRef = null;

  @SerializedName("secretKeyRef")
  private String secretKeyRef = null;

  public AwsManualConfigSpec accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public AwsManualConfigSpec accessKeyRef(String accessKeyRef) {
    this.accessKeyRef = accessKeyRef;
    return this;
  }

   /**
   * Get accessKeyRef
   * @return accessKeyRef
  **/
  @Schema(description = "")
  public String getAccessKeyRef() {
    return accessKeyRef;
  }

  public void setAccessKeyRef(String accessKeyRef) {
    this.accessKeyRef = accessKeyRef;
  }

  public AwsManualConfigSpec secretKeyRef(String secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @Schema(required = true, description = "")
  public String getSecretKeyRef() {
    return secretKeyRef;
  }

  public void setSecretKeyRef(String secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsManualConfigSpec awsManualConfigSpec = (AwsManualConfigSpec) o;
    return Objects.equals(this.accessKey, awsManualConfigSpec.accessKey) &&
        Objects.equals(this.accessKeyRef, awsManualConfigSpec.accessKeyRef) &&
        Objects.equals(this.secretKeyRef, awsManualConfigSpec.secretKeyRef) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, accessKeyRef, secretKeyRef, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsManualConfigSpec {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessKeyRef: ").append(toIndentedString(accessKeyRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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
