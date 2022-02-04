package org.example.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("Error")
    @Expose
    private String error;
    @SerializedName("Total")
    @Expose
    private Integer total;
    @SerializedName("Query")
    @Expose
    private Query query;
    @SerializedName("Language")
    @Expose
    private String language;
    @SerializedName("TakeAction")
    @Expose
    private String takeAction;
    @SerializedName("AboutTheseResults")
    @Expose
    private String aboutTheseResults;
    @SerializedName("MyHFHeading")
    @Expose
    private String myHFHeading;
    @SerializedName("Resources")
    @Expose
    private Resources resources;

    public Result() {
    }

    public Result(String error, Integer total, Query query, String language, String takeAction, String aboutTheseResults, String myHFHeading, Resources resources) {
        super();
        this.error = error;
        this.total = total;
        this.query = query;
        this.language = language;
        this.takeAction = takeAction;
        this.aboutTheseResults = aboutTheseResults;
        this.myHFHeading = myHFHeading;
        this.resources = resources;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Result withError(String error) {
        this.error = error;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Result withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Result withQuery(Query query) {
        this.query = query;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Result withLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getTakeAction() {
        return takeAction;
    }

    public void setTakeAction(String takeAction) {
        this.takeAction = takeAction;
    }

    public Result withTakeAction(String takeAction) {
        this.takeAction = takeAction;
        return this;
    }

    public String getAboutTheseResults() {
        return aboutTheseResults;
    }

    public void setAboutTheseResults(String aboutTheseResults) {
        this.aboutTheseResults = aboutTheseResults;
    }

    public Result withAboutTheseResults(String aboutTheseResults) {
        this.aboutTheseResults = aboutTheseResults;
        return this;
    }

    public String getMyHFHeading() {
        return myHFHeading;
    }

    public void setMyHFHeading(String myHFHeading) {
        this.myHFHeading = myHFHeading;
    }

    public Result withMyHFHeading(String myHFHeading) {
        this.myHFHeading = myHFHeading;
        return this;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Result withResources(Resources resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("takeAction");
        sb.append('=');
        sb.append(((this.takeAction == null)?"<null>":this.takeAction));
        sb.append(',');
        sb.append("aboutTheseResults");
        sb.append('=');
        sb.append(((this.aboutTheseResults == null)?"<null>":this.aboutTheseResults));
        sb.append(',');
        sb.append("myHFHeading");
        sb.append('=');
        sb.append(((this.myHFHeading == null)?"<null>":this.myHFHeading));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
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
        result = ((result* 31)+((this.myHFHeading == null)? 0 :this.myHFHeading.hashCode()));
        result = ((result* 31)+((this.takeAction == null)? 0 :this.takeAction.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.aboutTheseResults == null)? 0 :this.aboutTheseResults.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return (((((((((this.myHFHeading == rhs.myHFHeading)||((this.myHFHeading!= null)&&this.myHFHeading.equals(rhs.myHFHeading)))&&((this.takeAction == rhs.takeAction)||((this.takeAction!= null)&&this.takeAction.equals(rhs.takeAction))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query))))&&((this.aboutTheseResults == rhs.aboutTheseResults)||((this.aboutTheseResults!= null)&&this.aboutTheseResults.equals(rhs.aboutTheseResults))))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))));
    }

}
