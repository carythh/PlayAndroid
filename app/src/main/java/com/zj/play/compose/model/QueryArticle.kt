package com.zj.play.compose.model

/**
 * 版权：Zhujiang 个人版权
 *
 * @author zhujiang
 * 创建日期：2020/11/2
 * 描述：PlayAndroid
 *
 */


//data class QueryArticle(var page: Int, var cid: Int, var isRefresh: Boolean)

data class QueryArticle(
    var page: Int,
    var cid: Int = -1,
    var isRefresh: Boolean = false,
    var k: String = ""
)