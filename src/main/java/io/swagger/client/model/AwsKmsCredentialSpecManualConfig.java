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
import io.swagger.client.model.AwsKmsCredentialSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains the AWS KMS Secret Manager&#x27;s secret reference access key and secret key.
 */
@Schema(description = "This contains the AWS KMS Secret Manager's secret reference access key and secret key.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AwsKmsCredentialSpecManualConfig extends AwsKmsCredentialSpec {
  @SerializedName("accessKey")
  private String accessKey = null;

  @SerializedName("secretKey")
  private String secretKey = null;

  public AwsKmsCredentialSpecManualConfig accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(required = true, description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public AwsKmsCredentialSpecManualConfig secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @Schema(required = true, description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsKmsCredentialSpecManualConfig awsKmsCredentialSpecManualConfig = (AwsKmsCredentialSpecManualConfig) o;
    return Objects.equals(this.accessKey, awsKmsCredentialSpecManualConfig.accessKey) &&
        Objects.equals(this.secretKey, awsKmsCredentialSpecManualConfig.secretKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsKmsCredentialSpecManualConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
