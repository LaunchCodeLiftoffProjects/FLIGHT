package org.example.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Resource {

    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("TranslationId")
    @Expose
    private String translationId;
    @SerializedName("TranslationTitle")
    @Expose
    private String translationTitle;
    @SerializedName("Categories")
    @Expose
    private String categories;
    @SerializedName("Populations")
    @Expose
    private String populations;
    @SerializedName("MyHFTitle")
    @Expose
    private String myHFTitle;
    @SerializedName("MyHFDescription")
    @Expose
    private String myHFDescription;
    @SerializedName("MyHFCategory")
    @Expose
    private String myHFCategory;
    @SerializedName("MyHFCategoryHeading")
    @Expose
    private String myHFCategoryHeading;
    @SerializedName("LastUpdate")
    @Expose
    private String lastUpdate;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("ImageAlt")
    @Expose
    private String imageAlt;
    @SerializedName("AccessibleVersion")
    @Expose
    private String accessibleVersion;
    @SerializedName("RelatedItems")
    @Expose
    private RelatedItems relatedItems;
    @SerializedName("Sections")
    @Expose
    private Sections sections;
    @SerializedName("MoreInfoItems")
    @Expose
    private Object moreInfoItems;
    @SerializedName("HealthfinderLogo")
    @Expose
    private String healthfinderLogo;
    @SerializedName("HealthfinderUrl")
    @Expose
    private String healthfinderUrl;

    public Resource() {
    }

    public Resource(String type, String id, String title, String translationId, String translationTitle, String categories, String populations, String myHFTitle, String myHFDescription, String myHFCategory, String myHFCategoryHeading, String lastUpdate, String imageUrl, String imageAlt, String accessibleVersion, RelatedItems relatedItems, Sections sections, Object moreInfoItems, String healthfinderLogo, String healthfinderUrl) {
        super();
        this.type = type;
        this.id = id;
        this.title = title;
        this.translationId = translationId;
        this.translationTitle = translationTitle;
        this.categories = categories;
        this.populations = populations;
        this.myHFTitle = myHFTitle;
        this.myHFDescription = myHFDescription;
        this.myHFCategory = myHFCategory;
        this.myHFCategoryHeading = myHFCategoryHeading;
        this.lastUpdate = lastUpdate;
        this.imageUrl = imageUrl;
        this.imageAlt = imageAlt;
        this.accessibleVersion = accessibleVersion;
        this.relatedItems = relatedItems;
        this.sections = sections;
        this.moreInfoItems = moreInfoItems;
        this.healthfinderLogo = healthfinderLogo;
        this.healthfinderUrl = healthfinderUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Resource withType(String type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Resource withId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Resource withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTranslationId() {
        return translationId;
    }

    public void setTranslationId(String translationId) {
        this.translationId = translationId;
    }

    public Resource withTranslationId(String translationId) {
        this.translationId = translationId;
        return this;
    }

    public String getTranslationTitle() {
        return translationTitle;
    }

    public void setTranslationTitle(String translationTitle) {
        this.translationTitle = translationTitle;
    }

    public Resource withTranslationTitle(String translationTitle) {
        this.translationTitle = translationTitle;
        return this;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Resource withCategories(String categories) {
        this.categories = categories;
        return this;
    }

    public String getPopulations() {
        return populations;
    }

    public void setPopulations(String populations) {
        this.populations = populations;
    }

    public Resource withPopulations(String populations) {
        this.populations = populations;
        return this;
    }

    public String getMyHFTitle() {
        return myHFTitle;
    }

    public void setMyHFTitle(String myHFTitle) {
        this.myHFTitle = myHFTitle;
    }

    public Resource withMyHFTitle(String myHFTitle) {
        this.myHFTitle = myHFTitle;
        return this;
    }

    public String getMyHFDescription() {
        return myHFDescription;
    }

    public void setMyHFDescription(String myHFDescription) {
        this.myHFDescription = myHFDescription;
    }

    public Resource withMyHFDescription(String myHFDescription) {
        this.myHFDescription = myHFDescription;
        return this;
    }

    public String getMyHFCategory() {
        return myHFCategory;
    }

    public void setMyHFCategory(String myHFCategory) {
        this.myHFCategory = myHFCategory;
    }

    public Resource withMyHFCategory(String myHFCategory) {
        this.myHFCategory = myHFCategory;
        return this;
    }

    public String getMyHFCategoryHeading() {
        return myHFCategoryHeading;
    }

    public void setMyHFCategoryHeading(String myHFCategoryHeading) {
        this.myHFCategoryHeading = myHFCategoryHeading;
    }

    public Resource withMyHFCategoryHeading(String myHFCategoryHeading) {
        this.myHFCategoryHeading = myHFCategoryHeading;
        return this;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Resource withLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Resource withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageAlt() {
        return imageAlt;
    }

    public void setImageAlt(String imageAlt) {
        this.imageAlt = imageAlt;
    }

    public Resource withImageAlt(String imageAlt) {
        this.imageAlt = imageAlt;
        return this;
    }

    public String getAccessibleVersion() {
        return accessibleVersion;
    }

    public void setAccessibleVersion(String accessibleVersion) {
        this.accessibleVersion = accessibleVersion;
    }

    public Resource withAccessibleVersion(String accessibleVersion) {
        this.accessibleVersion = accessibleVersion;
        return this;
    }

    public RelatedItems getRelatedItems() {
        return relatedItems;
    }

    public void setRelatedItems(RelatedItems relatedItems) {
        this.relatedItems = relatedItems;
    }

    public Resource withRelatedItems(RelatedItems relatedItems) {
        this.relatedItems = relatedItems;
        return this;
    }

    public Sections getSections() {
        return sections;
    }

    public void setSections(Sections sections) {
        this.sections = sections;
    }

    public Resource withSections(Sections sections) {
        this.sections = sections;
        return this;
    }

    public Object getMoreInfoItems() {
        return moreInfoItems;
    }

    public void setMoreInfoItems(Object moreInfoItems) {
        this.moreInfoItems = moreInfoItems;
    }

    public Resource withMoreInfoItems(Object moreInfoItems) {
        this.moreInfoItems = moreInfoItems;
        return this;
    }

    public String getHealthfinderLogo() {
        return healthfinderLogo;
    }

    public void setHealthfinderLogo(String healthfinderLogo) {
        this.healthfinderLogo = healthfinderLogo;
    }

    public Resource withHealthfinderLogo(String healthfinderLogo) {
        this.healthfinderLogo = healthfinderLogo;
        return this;
    }

    public String getHealthfinderUrl() {
        return healthfinderUrl;
    }

    public void setHealthfinderUrl(String healthfinderUrl) {
        this.healthfinderUrl = healthfinderUrl;
    }

    public Resource withHealthfinderUrl(String healthfinderUrl) {
        this.healthfinderUrl = healthfinderUrl;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("translationId");
        sb.append('=');
        sb.append(((this.translationId == null)?"<null>":this.translationId));
        sb.append(',');
        sb.append("translationTitle");
        sb.append('=');
        sb.append(((this.translationTitle == null)?"<null>":this.translationTitle));
        sb.append(',');
        sb.append("categories");
        sb.append('=');
        sb.append(((this.categories == null)?"<null>":this.categories));
        sb.append(',');
        sb.append("populations");
        sb.append('=');
        sb.append(((this.populations == null)?"<null>":this.populations));
        sb.append(',');
        sb.append("myHFTitle");
        sb.append('=');
        sb.append(((this.myHFTitle == null)?"<null>":this.myHFTitle));
        sb.append(',');
        sb.append("myHFDescription");
        sb.append('=');
        sb.append(((this.myHFDescription == null)?"<null>":this.myHFDescription));
        sb.append(',');
        sb.append("myHFCategory");
        sb.append('=');
        sb.append(((this.myHFCategory == null)?"<null>":this.myHFCategory));
        sb.append(',');
        sb.append("myHFCategoryHeading");
        sb.append('=');
        sb.append(((this.myHFCategoryHeading == null)?"<null>":this.myHFCategoryHeading));
        sb.append(',');
        sb.append("lastUpdate");
        sb.append('=');
        sb.append(((this.lastUpdate == null)?"<null>":this.lastUpdate));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("imageAlt");
        sb.append('=');
        sb.append(((this.imageAlt == null)?"<null>":this.imageAlt));
        sb.append(',');
        sb.append("accessibleVersion");
        sb.append('=');
        sb.append(((this.accessibleVersion == null)?"<null>":this.accessibleVersion));
        sb.append(',');
        sb.append("relatedItems");
        sb.append('=');
        sb.append(((this.relatedItems == null)?"<null>":this.relatedItems));
        sb.append(',');
        sb.append("sections");
        sb.append('=');
        sb.append(((this.sections == null)?"<null>":this.sections));
        sb.append(',');
        sb.append("moreInfoItems");
        sb.append('=');
        sb.append(((this.moreInfoItems == null)?"<null>":this.moreInfoItems));
        sb.append(',');
        sb.append("healthfinderLogo");
        sb.append('=');
        sb.append(((this.healthfinderLogo == null)?"<null>":this.healthfinderLogo));
        sb.append(',');
        sb.append("healthfinderUrl");
        sb.append('=');
        sb.append(((this.healthfinderUrl == null)?"<null>":this.healthfinderUrl));
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
        result = ((result* 31)+((this.healthfinderUrl == null)? 0 :this.healthfinderUrl.hashCode()));
        result = ((result* 31)+((this.relatedItems == null)? 0 :this.relatedItems.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.myHFCategoryHeading == null)? 0 :this.myHFCategoryHeading.hashCode()));
        result = ((result* 31)+((this.imageAlt == null)? 0 :this.imageAlt.hashCode()));
        result = ((result* 31)+((this.sections == null)? 0 :this.sections.hashCode()));
        result = ((result* 31)+((this.translationId == null)? 0 :this.translationId.hashCode()));
        result = ((result* 31)+((this.accessibleVersion == null)? 0 :this.accessibleVersion.hashCode()));
        result = ((result* 31)+((this.lastUpdate == null)? 0 :this.lastUpdate.hashCode()));
        result = ((result* 31)+((this.imageUrl == null)? 0 :this.imageUrl.hashCode()));
        result = ((result* 31)+((this.myHFTitle == null)? 0 :this.myHFTitle.hashCode()));
        result = ((result* 31)+((this.moreInfoItems == null)? 0 :this.moreInfoItems.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categories == null)? 0 :this.categories.hashCode()));
        result = ((result* 31)+((this.populations == null)? 0 :this.populations.hashCode()));
        result = ((result* 31)+((this.myHFDescription == null)? 0 :this.myHFDescription.hashCode()));
        result = ((result* 31)+((this.healthfinderLogo == null)? 0 :this.healthfinderLogo.hashCode()));
        result = ((result* 31)+((this.translationTitle == null)? 0 :this.translationTitle.hashCode()));
        result = ((result* 31)+((this.myHFCategory == null)? 0 :this.myHFCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return (((((((((((((((((((((this.healthfinderUrl == rhs.healthfinderUrl)||((this.healthfinderUrl!= null)&&this.healthfinderUrl.equals(rhs.healthfinderUrl)))&&((this.relatedItems == rhs.relatedItems)||((this.relatedItems!= null)&&this.relatedItems.equals(rhs.relatedItems))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.myHFCategoryHeading == rhs.myHFCategoryHeading)||((this.myHFCategoryHeading!= null)&&this.myHFCategoryHeading.equals(rhs.myHFCategoryHeading))))&&((this.imageAlt == rhs.imageAlt)||((this.imageAlt!= null)&&this.imageAlt.equals(rhs.imageAlt))))&&((this.sections == rhs.sections)||((this.sections!= null)&&this.sections.equals(rhs.sections))))&&((this.translationId == rhs.translationId)||((this.translationId!= null)&&this.translationId.equals(rhs.translationId))))&&((this.accessibleVersion == rhs.accessibleVersion)||((this.accessibleVersion!= null)&&this.accessibleVersion.equals(rhs.accessibleVersion))))&&((this.lastUpdate == rhs.lastUpdate)||((this.lastUpdate!= null)&&this.lastUpdate.equals(rhs.lastUpdate))))&&((this.imageUrl == rhs.imageUrl)||((this.imageUrl!= null)&&this.imageUrl.equals(rhs.imageUrl))))&&((this.myHFTitle == rhs.myHFTitle)||((this.myHFTitle!= null)&&this.myHFTitle.equals(rhs.myHFTitle))))&&((this.moreInfoItems == rhs.moreInfoItems)||((this.moreInfoItems!= null)&&this.moreInfoItems.equals(rhs.moreInfoItems))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categories == rhs.categories)||((this.categories!= null)&&this.categories.equals(rhs.categories))))&&((this.populations == rhs.populations)||((this.populations!= null)&&this.populations.equals(rhs.populations))))&&((this.myHFDescription == rhs.myHFDescription)||((this.myHFDescription!= null)&&this.myHFDescription.equals(rhs.myHFDescription))))&&((this.healthfinderLogo == rhs.healthfinderLogo)||((this.healthfinderLogo!= null)&&this.healthfinderLogo.equals(rhs.healthfinderLogo))))&&((this.translationTitle == rhs.translationTitle)||((this.translationTitle!= null)&&this.translationTitle.equals(rhs.translationTitle))))&&((this.myHFCategory == rhs.myHFCategory)||((this.myHFCategory!= null)&&this.myHFCategory.equals(rhs.myHFCategory))));
    }

}