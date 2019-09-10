package com.cpr.testretrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Application {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("package")
    @Expose
    private String packageName;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("bg_start_color")
    @Expose
    private String backGroundStart;
    @SerializedName("bg_end_color")
    @Expose
    private String backGroundEndColor;
    @SerializedName("btn_unclicked_color")
    @Expose
    private String bgButtonUnclicked;
    @SerializedName("btn_clicked_color")
    @Expose
    private String bgButtonClicked;
    @SerializedName("text_title_color")
    @Expose
    private String bgTextTitleColor;
    @SerializedName("text_intall_color")
    @Expose
    private String bgButtonInstall;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBackGroundStart() {
        return backGroundStart;
    }

    public void setBackGroundStart(String backGroundStart) {
        this.backGroundStart = backGroundStart;
    }

    public String getBackGroundEndColor() {
        return backGroundEndColor;
    }

    public void setBackGroundEndColor(String backGroundEndColor) {
        this.backGroundEndColor = backGroundEndColor;
    }

    public String getBgButtonUnclicked() {
        return bgButtonUnclicked;
    }

    public void setBgButtonUnclicked(String bgButtonUnclicked) {
        this.bgButtonUnclicked = bgButtonUnclicked;
    }

    public String getBgButtonClicked() {
        return bgButtonClicked;
    }

    public void setBgButtonClicked(String bgButtonClicked) {
        this.bgButtonClicked = bgButtonClicked;
    }

    public String getBgTextTitleColor() {
        return bgTextTitleColor;
    }

    public void setBgTextTitleColor(String bgTextTitleColor) {
        this.bgTextTitleColor = bgTextTitleColor;
    }

    public String getBgButtonInstall() {
        return bgButtonInstall;
    }

    public void setBgButtonInstall(String bgButtonInstall) {
        this.bgButtonInstall = bgButtonInstall;
    }

    public Application(int id, String name, String packageName, String logo, String backGroundStart, String backGroundEndColor, String bgButtonUnclicked, String bgButtonClicked, String bgTextTitleColor, String bgButtonInstall) {
        this.id = id;
        this.name = name;
        this.packageName = packageName;
        this.logo = logo;
        this.backGroundStart = backGroundStart;
        this.backGroundEndColor = backGroundEndColor;
        this.bgButtonUnclicked = bgButtonUnclicked;
        this.bgButtonClicked = bgButtonClicked;
        this.bgTextTitleColor = bgTextTitleColor;
        this.bgButtonInstall = bgButtonInstall;
    }
}
