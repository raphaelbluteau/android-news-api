package raphaelbluteau.github.newsapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by raphael on 05/11/16.
 * Model for news source
 */

public class Source {

    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("url")
    private String url;
    @SerializedName("category")
    private String category;
    @SerializedName("language")
    private String language;
    @SerializedName("country")
    private String country;
    @SerializedName("urlsToLogos")
    private Logo urlsToLogos;

    public Source(String name, String description, String url, String category, String language,
                  String country, Logo urlsToLogos) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.category = category;
        this.language = language;
        this.country = country;
        this.urlsToLogos = urlsToLogos;
    }

    public Source() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Logo getUrlsToLogos() {
        return urlsToLogos;
    }

    public void setUrlsToLogos(Logo urlsToLogos) {
        this.urlsToLogos = urlsToLogos;
    }
}
