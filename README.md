# Java Business Project Template

### 多模块管理

* 按照结构拆分
```md
- project
  - project-service
  - project-controller
  - project-dao
  ...
```
* 按照业务拆分
```md
- project
  - project-order
  - project-account
  - project-pay
  ...
```

然后拆分为 `子模块名字` 和 `子模块名字-api`，前者是类的具体实现，后者是interface。 一般都有一个`common`模块，供其他所有子模块调用。`pom.xml`子模块之间只包含`子模块名字-api`定义的接口，不包含`子模块名字`具体的实现方式。

# Folder

```md
➜  JavaBizProjectTemplate git:(main) tree src/main/
src/main/
├── java
│   └── com
│       └── project
│           └── demo
│               ├── Application.java
│               ├── Main.java
│               ├── TemplateCode.java
│               ├── annotation
│               ├── api
│               │   └── DOC.md
│               ├── aspect
│               ├── config
│               │   └── DOC.md
│               ├── constant
│               │   ├── DOC.md
│               │   ├── consist
│               │   └── enums
│               ├── controller
│               ├── dao
│               │   ├── FunctionalDao.java
│               │   └── impl
│               │       └── FunctionalDaoImpl.java
│               ├── entity
│               ├── enums
│               ├── event
│               ├── exception
│               ├── filter
│               ├── mapper
│               ├── model
│               │   ├── dto
│               │   ├── entity
│               │   └── vo
│               ├── param
│               ├── service
│               │   ├── impl
│               │   └── intf
│               └── utils
│                   └── DOC.md
└── resources
    ├── META-INF
    │   ├── autoconf
    │   │   └── auto-config.xml
    │   └── services
    ├── application-dev.yml
    ├── application-prod.yml
    ├── application-test.yml
    ├── application.properties
    ├── application.yml
    ├── mapper
    │   └── mybatis-config.xml
    ├── static
    │   ├── css
    │   ├── font
    │   ├── img
    │   └── js
    └── template
        ├── bottom
        ├── header
        └── sidebar

43 directories, 16 files
```
