CREATE TABLE `jingdonginfo` (
  `item_id` varchar(50) NOT NULL COMMENT '产品id',
  `item_name` varchar(200) DEFAULT NULL COMMENT '产品名称',
  `item_price` varchar(100) DEFAULT NULL COMMENT '产品价格',
  `comment_number` varchar(100) DEFAULT NULL COMMENT '评价数量',
  `item_url` varchar(100) DEFAULT NULL COMMENT '产品对应的地址',
  `shop_name` varchar(100) DEFAULT NULL COMMENT '产品所属的店铺名称',
  `shop_url` varchar(100) DEFAULT NULL COMMENT '店铺地址',
  `crawl_time` datetime DEFAULT NULL COMMENT '爬取时间',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;