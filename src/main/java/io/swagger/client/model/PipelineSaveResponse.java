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
import io.swagger.client.model.GovernanceMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Contains the Pipeline details for the given Pipeline ID
 */
@Schema(description = "Contains the Pipeline details for the given Pipeline ID")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PipelineSaveResponse {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("governanceMetadata")
  private GovernanceMetadata governanceMetadata = null;

  public PipelineSaveResponse identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public PipelineSaveResponse governanceMetadata(GovernanceMetadata governanceMetadata) {
    this.governanceMetadata = governanceMetadata;
    return this;
  }

   /**
   * Get governanceMetadata
   * @return governanceMetadata
  **/
  @Schema(description = "")
  public GovernanceMetadata getGovernanceMetadata() {
    return governanceMetadata;
  }

  public void setGovernanceMetadata(GovernanceMetadata governanceMetadata) {
    this.governanceMetadata = governanceMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineSaveResponse pipelineSaveResponse = (PipelineSaveResponse) o;
    return Objects.equals(this.identifier, pipelineSaveResponse.identifier) &&
        Objects.equals(this.governanceMetadata, pipelineSaveResponse.governanceMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, governanceMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineSaveResponse {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    governanceMetadata: ").append(toIndentedString(governanceMetadata)).append("\n");
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
