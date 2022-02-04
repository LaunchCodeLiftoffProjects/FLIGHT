package org.example.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Query {

    @SerializedName("ApiVersion")
    @Expose
    private String apiVersion;
    @SerializedName("ApiType")
    @Expose
    private String apiType;
    @SerializedName("TopicId")
    @Expose
    private Object topicId;
    @SerializedName("ToolId")
    @Expose
    private Object toolId;
    @SerializedName("CategoryId")
    @Expose
    private Object categoryId;
    @SerializedName("PopulationId")
    @Expose
    private Object populationId;
    @SerializedName("Keyword")
    @Expose
    private Object keyword;
    @SerializedName("Who")
    @Expose
    private Object who;
    @SerializedName("Age")
    @Expose
    private String age;
    @SerializedName("Sex")
    @Expose
    private String sex;
    @SerializedName("Pregnant")
    @Expose
    private Object pregnant;
    @SerializedName("TobaccoUse")
    @Expose
    private Object tobaccoUse;
    @SerializedName("SexuallyActive")
    @Expose
    private Object sexuallyActive;
    @SerializedName("Category")
    @Expose
    private Object category;
    @SerializedName("Lang")
    @Expose
    private String lang;
    @SerializedName("Type")
    @Expose
    private Object type;
    @SerializedName("ReturnType")
    @Expose
    private String returnType;
    @SerializedName("Callback")
    @Expose
    private Object callback;
    @SerializedName("HealthfinderPage")
    @Expose
    private Object healthfinderPage;

    public Query() {
    }

    public Query(String apiVersion, String apiType, Object topicId, Object toolId, Object categoryId, Object populationId, Object keyword, Object who, String age, String sex, Object pregnant, Object tobaccoUse, Object sexuallyActive, Object category, String lang, Object type, String returnType, Object callback, Object healthfinderPage) {
        super();
        this.apiVersion = apiVersion;
        this.apiType = apiType;
        this.topicId = topicId;
        this.toolId = toolId;
        this.categoryId = categoryId;
        this.populationId = populationId;
        this.keyword = keyword;
        this.who = who;
        this.age = age;
        this.sex = sex;
        this.pregnant = pregnant;
        this.tobaccoUse = tobaccoUse;
        this.sexuallyActive = sexuallyActive;
        this.category = category;
        this.lang = lang;
        this.type = type;
        this.returnType = returnType;
        this.callback = callback;
        this.healthfinderPage = healthfinderPage;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Query withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public Query withApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }

    public Object getTopicId() {
        return topicId;
    }

    public void setTopicId(Object topicId) {
        this.topicId = topicId;
    }

    public Query withTopicId(Object topicId) {
        this.topicId = topicId;
        return this;
    }

    public Object getToolId() {
        return toolId;
    }

    public void setToolId(Object toolId) {
        this.toolId = toolId;
    }

    public Query withToolId(Object toolId) {
        this.toolId = toolId;
        return this;
    }

    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public Query withCategoryId(Object categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Object getPopulationId() {
        return populationId;
    }

    public void setPopulationId(Object populationId) {
        this.populationId = populationId;
    }

    public Query withPopulationId(Object populationId) {
        this.populationId = populationId;
        return this;
    }

    public Object getKeyword() {
        return keyword;
    }

    public void setKeyword(Object keyword) {
        this.keyword = keyword;
    }

    public Query withKeyword(Object keyword) {
        this.keyword = keyword;
        return this;
    }

    public Object getWho() {
        return who;
    }

    public void setWho(Object who) {
        this.who = who;
    }

    public Query withWho(Object who) {
        this.who = who;
        return this;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Query withAge(String age) {
        this.age = age;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Query withSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Object getPregnant() {
        return pregnant;
    }

    public void setPregnant(Object pregnant) {
        this.pregnant = pregnant;
    }

    public Query withPregnant(Object pregnant) {
        this.pregnant = pregnant;
        return this;
    }

    public Object getTobaccoUse() {
        return tobaccoUse;
    }

    public void setTobaccoUse(Object tobaccoUse) {
        this.tobaccoUse = tobaccoUse;
    }

    public Query withTobaccoUse(Object tobaccoUse) {
        this.tobaccoUse = tobaccoUse;
        return this;
    }

    public Object getSexuallyActive() {
        return sexuallyActive;
    }

    public void setSexuallyActive(Object sexuallyActive) {
        this.sexuallyActive = sexuallyActive;
    }

    public Query withSexuallyActive(Object sexuallyActive) {
        this.sexuallyActive = sexuallyActive;
        return this;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public Query withCategory(Object category) {
        this.category = category;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Query withLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Query withType(Object type) {
        this.type = type;
        return this;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public Query withReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }

    public Object getCallback() {
        return callback;
    }

    public void setCallback(Object callback) {
        this.callback = callback;
    }

    public Query withCallback(Object callback) {
        this.callback = callback;
        return this;
    }

    public Object getHealthfinderPage() {
        return healthfinderPage;
    }

    public void setHealthfinderPage(Object healthfinderPage) {
        this.healthfinderPage = healthfinderPage;
    }

    public Query withHealthfinderPage(Object healthfinderPage) {
        this.healthfinderPage = healthfinderPage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Query.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("apiType");
        sb.append('=');
        sb.append(((this.apiType == null)?"<null>":this.apiType));
        sb.append(',');
        sb.append("topicId");
        sb.append('=');
        sb.append(((this.topicId == null)?"<null>":this.topicId));
        sb.append(',');
        sb.append("toolId");
        sb.append('=');
        sb.append(((this.toolId == null)?"<null>":this.toolId));
        sb.append(',');
        sb.append("categoryId");
        sb.append('=');
        sb.append(((this.categoryId == null)?"<null>":this.categoryId));
        sb.append(',');
        sb.append("populationId");
        sb.append('=');
        sb.append(((this.populationId == null)?"<null>":this.populationId));
        sb.append(',');
        sb.append("keyword");
        sb.append('=');
        sb.append(((this.keyword == null)?"<null>":this.keyword));
        sb.append(',');
        sb.append("who");
        sb.append('=');
        sb.append(((this.who == null)?"<null>":this.who));
        sb.append(',');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("pregnant");
        sb.append('=');
        sb.append(((this.pregnant == null)?"<null>":this.pregnant));
        sb.append(',');
        sb.append("tobaccoUse");
        sb.append('=');
        sb.append(((this.tobaccoUse == null)?"<null>":this.tobaccoUse));
        sb.append(',');
        sb.append("sexuallyActive");
        sb.append('=');
        sb.append(((this.sexuallyActive == null)?"<null>":this.sexuallyActive));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("returnType");
        sb.append('=');
        sb.append(((this.returnType == null)?"<null>":this.returnType));
        sb.append(',');
        sb.append("callback");
        sb.append('=');
        sb.append(((this.callback == null)?"<null>":this.callback));
        sb.append(',');
        sb.append("healthfinderPage");
        sb.append('=');
        sb.append(((this.healthfinderPage == null)?"<null>":this.healthfinderPage));
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
        result = ((result* 31)+((this.healthfinderPage == null)? 0 :this.healthfinderPage.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this.tobaccoUse == null)? 0 :this.tobaccoUse.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.toolId == null)? 0 :this.toolId.hashCode()));
        result = ((result* 31)+((this.topicId == null)? 0 :this.topicId.hashCode()));
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.callback == null)? 0 :this.callback.hashCode()));
        result = ((result* 31)+((this.populationId == null)? 0 :this.populationId.hashCode()));
        result = ((result* 31)+((this.sexuallyActive == null)? 0 :this.sexuallyActive.hashCode()));
        result = ((result* 31)+((this.keyword == null)? 0 :this.keyword.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.apiType == null)? 0 :this.apiType.hashCode()));
        result = ((result* 31)+((this.categoryId == null)? 0 :this.categoryId.hashCode()));
        result = ((result* 31)+((this.age == null)? 0 :this.age.hashCode()));
        result = ((result* 31)+((this.returnType == null)? 0 :this.returnType.hashCode()));
        result = ((result* 31)+((this.who == null)? 0 :this.who.hashCode()));
        result = ((result* 31)+((this.pregnant == null)? 0 :this.pregnant.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Query) == false) {
            return false;
        }
        Query rhs = ((Query) other);
        return ((((((((((((((((((((this.healthfinderPage == rhs.healthfinderPage)||((this.healthfinderPage!= null)&&this.healthfinderPage.equals(rhs.healthfinderPage)))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this.tobaccoUse == rhs.tobaccoUse)||((this.tobaccoUse!= null)&&this.tobaccoUse.equals(rhs.tobaccoUse))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.toolId == rhs.toolId)||((this.toolId!= null)&&this.toolId.equals(rhs.toolId))))&&((this.topicId == rhs.topicId)||((this.topicId!= null)&&this.topicId.equals(rhs.topicId))))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))))&&((this.callback == rhs.callback)||((this.callback!= null)&&this.callback.equals(rhs.callback))))&&((this.populationId == rhs.populationId)||((this.populationId!= null)&&this.populationId.equals(rhs.populationId))))&&((this.sexuallyActive == rhs.sexuallyActive)||((this.sexuallyActive!= null)&&this.sexuallyActive.equals(rhs.sexuallyActive))))&&((this.keyword == rhs.keyword)||((this.keyword!= null)&&this.keyword.equals(rhs.keyword))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.apiType == rhs.apiType)||((this.apiType!= null)&&this.apiType.equals(rhs.apiType))))&&((this.categoryId == rhs.categoryId)||((this.categoryId!= null)&&this.categoryId.equals(rhs.categoryId))))&&((this.age == rhs.age)||((this.age!= null)&&this.age.equals(rhs.age))))&&((this.returnType == rhs.returnType)||((this.returnType!= null)&&this.returnType.equals(rhs.returnType))))&&((this.who == rhs.who)||((this.who!= null)&&this.who.equals(rhs.who))))&&((this.pregnant == rhs.pregnant)||((this.pregnant!= null)&&this.pregnant.equals(rhs.pregnant))));
    }

}
