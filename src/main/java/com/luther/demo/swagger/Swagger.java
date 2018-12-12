package com.luther.demo.swagger;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Author: lvpeng
 * CreateTime: 2018/12/11 16:48
 * ProjectName: demo
 * PackageName: com.luther.demo.swagger
 * TODO:
 */
public class Swagger {

    private String basePackage;
    private String version;

    private String title;
    private String description;
    private String docLinkName;
    private String docLinkUrl;
    private String docLinkEmail;
    private String license;

    Swagger(String basePackage,
            String version,
            String title,
            String description,
            String docLinkName,
            String docLinkUrl,
            String docLinkEmail,
            String license) {
        this.basePackage = basePackage;
        this.version = version;
        this.title = title;
        this.description = description;
        this.docLinkName = docLinkName;
        this.docLinkEmail = docLinkEmail;
        this.docLinkUrl = docLinkUrl;
        this.license = license;
    }

    /**
     * API文档配置信息
     *
     * @return
     */
    Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))//api接口包扫描路径
                .paths(PathSelectors.any())//可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }

    /**
     * 文档的说明信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)//设置文档的标题
                .description(description)//设置文档的描述->1.Overview
                .version(version)//设置文档的版本信息-> 1.1 Version information
                .contact(new Contact(docLinkName, docLinkUrl, docLinkEmail))//设置文档的联系方式->1.2 Contact information
                .termsOfServiceUrl(license)//设置文档的License信息->1.3 License information
                .build();
    }

    Swagger setBasePackage(String basePackage) {
        this.basePackage = basePackage;
        return this;
    }

    void setVersion(String version) {
        this.version = version;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setDocLinkName(String docLinkName) {
        this.docLinkName = docLinkName;
    }

    void setDocLinkUrl(String docLinkUrl) {
        this.docLinkUrl = docLinkUrl;
    }

    void setDocLinkEmail(String docLinkEmail) {
        this.docLinkEmail = docLinkEmail;
    }

    void setLicense(String license) {
        this.license = license;
    }
}
