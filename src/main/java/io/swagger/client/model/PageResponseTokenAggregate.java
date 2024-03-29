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
import io.swagger.client.model.TokenAggregate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PageResponseTokenAggregate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class PageResponseTokenAggregate {
  @SerializedName("totalPages")
  private Long totalPages = null;

  @SerializedName("totalItems")
  private Long totalItems = null;

  @SerializedName("pageItemCount")
  private Long pageItemCount = null;

  @SerializedName("pageSize")
  private Long pageSize = null;

  @SerializedName("content")
  private List<TokenAggregate> content = null;

  @SerializedName("pageIndex")
  private Long pageIndex = null;

  @SerializedName("empty")
  private Boolean empty = null;

  public PageResponseTokenAggregate totalPages(Long totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @Schema(description = "")
  public Long getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }

  public PageResponseTokenAggregate totalItems(Long totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @Schema(description = "")
  public Long getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Long totalItems) {
    this.totalItems = totalItems;
  }

  public PageResponseTokenAggregate pageItemCount(Long pageItemCount) {
    this.pageItemCount = pageItemCount;
    return this;
  }

   /**
   * Get pageItemCount
   * @return pageItemCount
  **/
  @Schema(description = "")
  public Long getPageItemCount() {
    return pageItemCount;
  }

  public void setPageItemCount(Long pageItemCount) {
    this.pageItemCount = pageItemCount;
  }

  public PageResponseTokenAggregate pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public PageResponseTokenAggregate content(List<TokenAggregate> content) {
    this.content = content;
    return this;
  }

  public PageResponseTokenAggregate addContentItem(TokenAggregate contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<TokenAggregate>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public List<TokenAggregate> getContent() {
    return content;
  }

  public void setContent(List<TokenAggregate> content) {
    this.content = content;
  }

  public PageResponseTokenAggregate pageIndex(Long pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @Schema(description = "")
  public Long getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Long pageIndex) {
    this.pageIndex = pageIndex;
  }

  public PageResponseTokenAggregate empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @Schema(description = "")
  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageResponseTokenAggregate pageResponseTokenAggregate = (PageResponseTokenAggregate) o;
    return Objects.equals(this.totalPages, pageResponseTokenAggregate.totalPages) &&
        Objects.equals(this.totalItems, pageResponseTokenAggregate.totalItems) &&
        Objects.equals(this.pageItemCount, pageResponseTokenAggregate.pageItemCount) &&
        Objects.equals(this.pageSize, pageResponseTokenAggregate.pageSize) &&
        Objects.equals(this.content, pageResponseTokenAggregate.content) &&
        Objects.equals(this.pageIndex, pageResponseTokenAggregate.pageIndex) &&
        Objects.equals(this.empty, pageResponseTokenAggregate.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalItems, pageItemCount, pageSize, content, pageIndex, empty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResponseTokenAggregate {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    pageItemCount: ").append(toIndentedString(pageItemCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
