package org.example.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RelatedItems {

    @SerializedName("RelatedItem")
    @Expose
    private List<RelatedItem> relatedItem = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public RelatedItems() {
    }

    /**
     *
     * @param relatedItem
     */
    public RelatedItems(List<RelatedItem> relatedItem) {
        super();
        this.relatedItem = relatedItem;
    }

    public List<RelatedItem> getRelatedItem() {
        return relatedItem;
    }

    public void setRelatedItem(List<RelatedItem> relatedItem) {
        this.relatedItem = relatedItem;
    }

    public RelatedItems withRelatedItem(List<RelatedItem> relatedItem) {
        this.relatedItem = relatedItem;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RelatedItems.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("relatedItem");
        sb.append('=');
        sb.append(((this.relatedItem == null)?"<null>":this.relatedItem));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.relatedItem == null)? 0 :this.relatedItem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedItems) == false) {
            return false;
        }
        RelatedItems rhs = ((RelatedItems) other);
        return ((this.relatedItem == rhs.relatedItem)||((this.relatedItem!= null)&&this.relatedItem.equals(rhs.relatedItem)));
    }

}
