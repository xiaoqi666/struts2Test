package com.xiaoqi.d_api;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 方式1:创建一个类,可以是POJO(典型的普通java类,不继承类,也不需要实现任何接口)
 * 是Struts2框架的侵入性更低
 * 方式2:实现一个接口Action(import com.opensymphony.xwork2.Action;)
 * Action接口预置了一些字符串(Demo3Action.SUCCESS)
 * 重点:常用方式3
 * 方式3:继承一个类ActionSupport(import com.opensymphony.xwork2.ActionSupport;)
 * 帮我们实现了Action, Validateable, ValidationAware, TextProvider, LocaleProvider, Serializable接口
 */
public class Demo3Action extends ActionSupport {

}
