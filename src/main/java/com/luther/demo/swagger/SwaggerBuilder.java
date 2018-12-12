package com.luther.demo.swagger;

import springfox.documentation.spring.web.plugins.Docket;

/**
 * Author: lvpeng
 * CreateTime: 2018/12/12 10:30
 * ProjectName: demo
 * PackageName: com.luther.demo.swagger
 * TODO:
 */
public class SwaggerBuilder {
    private String basePackage = "com.luther.demo";
    private String version = "1.0.0";

    private String title = "API 接口文档";
    private String description = "API 文档说明";
    private String docLinkName = "Swagger";
    private String docLinkUrl = "https://swagger.io/irc/";
    private String docLinkEmail = "maseratipp@gmail.com";
    private String license = "https://swagger.io/irc/";

    public SwaggerBuilder basePackage(String basePackage) {
        this.basePackage = basePackage;
        return this;
    }

    public SwaggerBuilder version(String version) {
        this.version = version;
        return this;
    }

    public SwaggerBuilder title(String title) {
        this.title = title;
        return this;
    }

    public SwaggerBuilder description(String description) {
        this.description = description;
        return this;
    }

    public SwaggerBuilder docLinkName(String docLinkName) {
        this.docLinkName = docLinkName;
        return this;
    }

    public SwaggerBuilder docLinkUrl(String docLinkUrl) {
        this.docLinkUrl = docLinkUrl;
        return this;
    }

    public SwaggerBuilder docLinkEmail(String docLinkEmail) {
        this.docLinkEmail = docLinkEmail;
        return this;
    }

    public SwaggerBuilder license(String license) {
        this.license = license;
        return this;
    }

    public Docket build() {
        return new Swagger(basePackage, version, title, description, docLinkName, docLinkUrl, docLinkEmail, license).createRestApi();
    }

}
