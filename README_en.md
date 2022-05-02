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

<p align="center"><a title="Chinese" href="README.md"> 中文简体</a>  |  English</p>

## Introduction

> Lightweight process orchestration execution engine that supports loading processes from code and databases for execution.

## QuickStart

1.install
```java
git clone https://github.com/ken-xue/pipeline.git
cd pipeline
mvn clean install
```
2.import
```xml
<dependency>
    <groupId>io.kenxue.pipeline</groupId>
    <artifactId>pipeline</artifactId>
    <version>1.0.0</version>
</dependency>
```
3.add bean scan package

```java
@SpringBootApplication(scanBasePackages = { "io.kenxue.pipeline"})
```

## License

MIT see [LICENSE](./LICENSE).

## Class Graph

![img](pipeline.png)
