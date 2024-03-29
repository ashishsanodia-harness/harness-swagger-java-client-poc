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
 * This contains PR Id
 */
@Schema(description = "This contains PR Id")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PRDetails {
  @SerializedName("prNumber")
  private Integer prNumber = null;

  public PRDetails prNumber(Integer prNumber) {
    this.prNumber = prNumber;
    return this;
  }

   /**
   * PR Id
   * @return prNumber
  **/
  @Schema(description = "PR Id")
  public Integer getPrNumber() {
    return prNumber;
  }

  public void setPrNumber(Integer prNumber) {
    this.prNumber = prNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PRDetails prDetails = (PRDetails) o;
    return Objects.equals(this.prNumber, prDetails.prNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PRDetails {\n");
    
    sb.append("    prNumber: ").append(toIndentedString(prNumber)).append("\n");
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
