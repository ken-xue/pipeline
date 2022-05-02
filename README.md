# pipeline


<p align="center">
  <a href="https://github.com/ken-xue/pipeline/blob/master/LICENSE">
    <img src="https://img.shields.io/static/v1?label=license&message=MIT&color=green">
  </a>
  <a href="https://www.oracle.com/java">
    <img src="https://img.shields.io/static/v1?label=JDK&message=1.8&color=red">
  </a>
</p>
<p align="center">
<a title="GitHub Watchers" target="_blank" href="https://github.com/ken-xue/pipeline/watchers"><img alt="GitHub Watchers" src="https://img.shields.io/github/watchers/ken-xue/pipeline.svg?label=Watchers&style=social"></a>  
  <a title="GitHub Stars" target="_blank" href="https://github.com/ken-xue/pipeline/stargazers"><img alt="GitHub Stars" src="https://img.shields.io/github/stars/ken-xue/pipeline.svg?label=Stars&style=social"></a>  
  <a title="GitHub Forks" target="_blank" href="https://github.com/ken-xue/pipeline/network/members"><img alt="GitHub Forks" src="https://img.shields.io/github/forks/ken-xue/pipeline.svg?label=Forks&style=social"></a>
</p>

<p align="center"> 中文简体  |  <a title="Englist" href="README_en.md"> English</a></p>

## 简介

> 轻量级的流程编排执行引擎,支持从代码、XML和数据库加载流程进行执行。

## 快速开始

1.安装到本地
```java
git clone https://github.com/ken-xue/pipeline.git
cd pipeline
mvn clean install
```
2.导入依赖
```xml
<dependency>
    <groupId>io.kenxue.pipeline</groupId>
    <artifactId>pipeline</artifactId>
    <version>1.0.0</version>
</dependency>
```
3.添加Bean扫描路径

```java
@SpringBootApplication(scanBasePackages = { "io.kenxue.pipeline"})
```

## 许可证

MIT see [LICENSE](./LICENSE).

## 类图

![img](pipeline.png)
