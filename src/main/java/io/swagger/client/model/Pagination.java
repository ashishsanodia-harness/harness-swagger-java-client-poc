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
 * Pagination
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class Pagination {
  @SerializedName("itemCount")
  private Integer itemCount = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("version")
  private Integer version = null;

  public Pagination itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * The total number of items
   * @return itemCount
  **/
  @Schema(example = "1", required = true, description = "The total number of items")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public Pagination pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The total number of pages
   * @return pageCount
  **/
  @Schema(example = "100", required = true, description = "The total number of pages")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public Pagination pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * The current page
   * @return pageIndex
  **/
  @Schema(example = "0", required = true, description = "The current page")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Pagination pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of items per page
   * @return pageSize
  **/
  @Schema(example = "1", required = true, description = "The number of items per page")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Pagination version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The version of this object.  The version will be incremented each time the object is modified
   * @return version
  **/
  @Schema(example = "5", description = "The version of this object.  The version will be incremented each time the object is modified")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.itemCount, pagination.itemCount) &&
        Objects.equals(this.pageCount, pagination.pageCount) &&
        Objects.equals(this.pageIndex, pagination.pageIndex) &&
        Objects.equals(this.pageSize, pagination.pageSize) &&
        Objects.equals(this.version, pagination.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCount, pageCount, pageIndex, pageSize, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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