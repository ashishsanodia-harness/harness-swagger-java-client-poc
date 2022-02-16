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
 * TGTGenerationSpecDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")

public class TGTGenerationSpecDTO {
  @SerializedName("tgtGenerationMethod")
  private String tgtGenerationMethod = null;

  public TGTGenerationSpecDTO() {
    this.tgtGenerationMethod = this.getClass().getSimpleName();
  }
  public TGTGenerationSpecDTO tgtGenerationMethod(String tgtGenerationMethod) {
    this.tgtGenerationMethod = tgtGenerationMethod;
    return this;
  }

   /**
   * Get tgtGenerationMethod
   * @return tgtGenerationMethod
  **/
  @Schema(required = true, description = "")
  public String getTgtGenerationMethod() {
    return tgtGenerationMethod;
  }

  public void setTgtGenerationMethod(String tgtGenerationMethod) {
    this.tgtGenerationMethod = tgtGenerationMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TGTGenerationSpecDTO tgTGenerationSpecDTO = (TGTGenerationSpecDTO) o;
    return Objects.equals(this.tgtGenerationMethod, tgTGenerationSpecDTO.tgtGenerationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tgtGenerationMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TGTGenerationSpecDTO {\n");
    
    sb.append("    tgtGenerationMethod: ").append(toIndentedString(tgtGenerationMethod)).append("\n");
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