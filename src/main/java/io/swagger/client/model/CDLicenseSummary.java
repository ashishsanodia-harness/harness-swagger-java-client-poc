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
import io.swagger.client.model.LicensesWithSummary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains details of the Continuous Delivery License Summary in Harness
 */
@Schema(description = "This contains details of the Continuous Delivery License Summary in Harness")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class CDLicenseSummary extends LicensesWithSummary {
  @SerializedName("totalWorkload")
  private Integer totalWorkload = null;

  @SerializedName("totalServiceInstances")
  private Integer totalServiceInstances = null;

  public CDLicenseSummary totalWorkload(Integer totalWorkload) {
    this.totalWorkload = totalWorkload;
    return this;
  }

   /**
   * Get totalWorkload
   * @return totalWorkload
  **/
  @Schema(description = "")
  public Integer getTotalWorkload() {
    return totalWorkload;
  }

  public void setTotalWorkload(Integer totalWorkload) {
    this.totalWorkload = totalWorkload;
  }

  public CDLicenseSummary totalServiceInstances(Integer totalServiceInstances) {
    this.totalServiceInstances = totalServiceInstances;
    return this;
  }

   /**
   * Get totalServiceInstances
   * @return totalServiceInstances
  **/
  @Schema(description = "")
  public Integer getTotalServiceInstances() {
    return totalServiceInstances;
  }

  public void setTotalServiceInstances(Integer totalServiceInstances) {
    this.totalServiceInstances = totalServiceInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CDLicenseSummary cdLicenseSummary = (CDLicenseSummary) o;
    return Objects.equals(this.totalWorkload, cdLicenseSummary.totalWorkload) &&
        Objects.equals(this.totalServiceInstances, cdLicenseSummary.totalServiceInstances) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalWorkload, totalServiceInstances, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CDLicenseSummary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    totalWorkload: ").append(toIndentedString(totalWorkload)).append("\n");
    sb.append("    totalServiceInstances: ").append(toIndentedString(totalServiceInstances)).append("\n");
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
