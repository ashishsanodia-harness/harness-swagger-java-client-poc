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
 * This is the view of the successful  count of Executions for given Time Interval
 */
@Schema(description = "This is the view of the successful  count of Executions for given Time Interval")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SuccessHealth {
  @SerializedName("percent")
  private Double percent = null;

  @SerializedName("rate")
  private Double rate = null;

  public SuccessHealth percent(Double percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @Schema(description = "")
  public Double getPercent() {
    return percent;
  }

  public void setPercent(Double percent) {
    this.percent = percent;
  }

  public SuccessHealth rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @Schema(description = "")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessHealth successHealth = (SuccessHealth) o;
    return Objects.equals(this.percent, successHealth.percent) &&
        Objects.equals(this.rate, successHealth.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessHealth {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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