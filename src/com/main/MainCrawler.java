package com.main;

import com.db.MYSQLControl;
import com.model.JdModel;
import com.parse.JDParse;
import com.util.HttpRequest;

import java.util.List;

public class MainCrawler {

  public static void main(String[] args) throws Exception{
    //设置关键词
    String keyword = "手机";
    //输入价格区间,页面上是整型，所以这里也要是整型
    int firstprice = 2000;
    int endprive = 5000;
    //输入爬取的总页数
    int sumpagenumber = 100;
    for (int i = 1; i < sumpagenumber; i++) {
        //请求网页内容
        String html = HttpRequest.getRawHtml(keyword, i, firstprice, endprive);
        //解析网页内容
        List<JdModel> dataslist = JDParse.getData(html,keyword);
        //将抓取的数据插入数据库,插入数据库前，需要建表
        MYSQLControl.executeInsert(dataslist);
    }
  }
}