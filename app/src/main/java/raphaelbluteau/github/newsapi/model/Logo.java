package raphaelbluteau.github.newsapi.model;

import com.google.gson.annotations.SerializedName;

import java.net.URL;

/**
 * Created by raphael on 05/11/16.
 */

public class Logo {

    @SerializedName("small")
    private URL small;
    @SerializedName("medium")
    private URL medium;
    @SerializedName("large")
    private URL large;

    public Logo(URL small, URL medium, URL large) {
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public Logo() {
    }

    public URL getSmall() {
        return small;
    }

    public void setSmall(URL small) {
        this.small = small;
    }

    public URL getMedium() {
        return medium;
    }

    public void setMedium(URL medium) {
        this.medium = medium;
    }

    public URL getLarge() {
        return large;
    }

    public void setLarge(URL large) {
        this.large = large;
    }
}
