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
import io.swagger.client.model.RestrictionMetadata;
import io.swagger.client.model.TimeUnit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains metadata of the Rate Limit Restriction in Harness
 */
@Schema(description = "This contains metadata of the Rate Limit Restriction in Harness")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class RateLimitRestrictionMetadata extends RestrictionMetadata {
  @SerializedName("limit")
  private Long limit = null;

  @SerializedName("timeUnit")
  private TimeUnit timeUnit = null;

  @SerializedName("allowedIfEqual")
  private Boolean allowedIfEqual = null;

  public RateLimitRestrictionMetadata limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public RateLimitRestrictionMetadata timeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @Schema(description = "")
  public TimeUnit getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }

  public RateLimitRestrictionMetadata allowedIfEqual(Boolean allowedIfEqual) {
    this.allowedIfEqual = allowedIfEqual;
    return this;
  }

   /**
   * Get allowedIfEqual
   * @return allowedIfEqual
  **/
  @Schema(description = "")
  public Boolean isAllowedIfEqual() {
    return allowedIfEqual;
  }

  public void setAllowedIfEqual(Boolean allowedIfEqual) {
    this.allowedIfEqual = allowedIfEqual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimitRestrictionMetadata rateLimitRestrictionMetadata = (RateLimitRestrictionMetadata) o;
    return Objects.equals(this.limit, rateLimitRestrictionMetadata.limit) &&
        Objects.equals(this.timeUnit, rateLimitRestrictionMetadata.timeUnit) &&
        Objects.equals(this.allowedIfEqual, rateLimitRestrictionMetadata.allowedIfEqual) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, timeUnit, allowedIfEqual, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimitRestrictionMetadata {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    allowedIfEqual: ").append(toIndentedString(allowedIfEqual)).append("\n");
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
