# jmeter-function-plugins

#### 介绍
jmeter函数插件

#### 软件架构
软件架构说明
<pre>
jmeter-function-plugins
├─src
│  └─main
│     ├─java
│     └─resources
├─pom.xml
</pre>

#### 开发说明
- 1、Jmeter插件必须在包含```.functions```包下
- 2、创建一个类，继承```org.apache.jmeter.functions.AbstractFunction```，重写下面方法：
```java
/** 函数执行逻辑，并返回值 */
public String execute(SampleResult sampleResult, Sampler sampler);
/** 接受处理入参 */
public void setParameters(Collection<CompoundVariable> collection);
/** 定义返回函数名称 */
public String getReferenceKey();
/** 定义函数入参说明 */
public List<String> getArgumentDesc();
```

#### 安装教程

- 1、clone到本地
```bash
git clone https://gitee.com/lin_bo/jmeter-function-plugins.git
```

- 2、编译打包
```bash
cd jmeter-function-plugins
mvn clean install
```

- 3、拷贝jar到Jmeter中

复制 ```jmeter-function-plugins/target/jmeter-function-plugins-1.0-SNAPSHOT.jar```到```%JMETER_HOME%/lib/ext```目录下，并重启Jmeter

#### 使用说明

| 函数名 | 使用例子 | 解释说明 | 
| ---- | ---- | ---- |
| __RandomChineseName | ```${__RandomChineseName}```| 生成随机中国姓名 |
| __RandomMobile | ```${__RandomMobile}```| 生成随机手机号码 |
| __RandomIdCardNo | ```${__RandomIdCardNo}```| 生成随机身份证件号 |
| __RandomEmail | ```${__RandomEmail}```| 生成随机电子邮箱 |
| __RandomIP | ```${__RandomIP}```| 生成随机IPv4地址 |

